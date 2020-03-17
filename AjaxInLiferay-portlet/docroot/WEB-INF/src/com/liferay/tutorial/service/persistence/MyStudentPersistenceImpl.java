/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.tutorial.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.tutorial.NoSuchMyStudentException;
import com.liferay.tutorial.model.MyStudent;
import com.liferay.tutorial.model.impl.MyStudentImpl;
import com.liferay.tutorial.model.impl.MyStudentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the my student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author annv
 * @see MyStudentPersistence
 * @see MyStudentUtil
 * @generated
 */
public class MyStudentPersistenceImpl extends BasePersistenceImpl<MyStudent>
	implements MyStudentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MyStudentUtil} to access the my student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MyStudentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
			MyStudentModelImpl.FINDER_CACHE_ENABLED, MyStudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
			MyStudentModelImpl.FINDER_CACHE_ENABLED, MyStudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
			MyStudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CODE = new FinderPath(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
			MyStudentModelImpl.FINDER_CACHE_ENABLED, MyStudentImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByCode",
			new String[] { String.class.getName() },
			MyStudentModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
			MyStudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the my student where code = &#63; or throws a {@link com.liferay.tutorial.NoSuchMyStudentException} if it could not be found.
	 *
	 * @param code the code
	 * @return the matching my student
	 * @throws com.liferay.tutorial.NoSuchMyStudentException if a matching my student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent findByCode(String code)
		throws NoSuchMyStudentException, SystemException {
		MyStudent myStudent = fetchByCode(code);

		if (myStudent == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMyStudentException(msg.toString());
		}

		return myStudent;
	}

	/**
	 * Returns the my student where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @return the matching my student, or <code>null</code> if a matching my student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent fetchByCode(String code) throws SystemException {
		return fetchByCode(code, true);
	}

	/**
	 * Returns the my student where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching my student, or <code>null</code> if a matching my student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent fetchByCode(String code, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODE,
					finderArgs, this);
		}

		if (result instanceof MyStudent) {
			MyStudent myStudent = (MyStudent)result;

			if (!Validator.equals(code, myStudent.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_MYSTUDENT_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				List<MyStudent> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MyStudentPersistenceImpl.fetchByCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MyStudent myStudent = list.get(0);

					result = myStudent;

					cacheResult(myStudent);

					if ((myStudent.getCode() == null) ||
							!myStudent.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
							finderArgs, myStudent);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MyStudent)result;
		}
	}

	/**
	 * Removes the my student where code = &#63; from the database.
	 *
	 * @param code the code
	 * @return the my student that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent removeByCode(String code)
		throws NoSuchMyStudentException, SystemException {
		MyStudent myStudent = findByCode(code);

		return remove(myStudent);
	}

	/**
	 * Returns the number of my students where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching my students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCode(String code) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODE;

		Object[] finderArgs = new Object[] { code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MYSTUDENT_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "myStudent.code IS NULL";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "myStudent.code = ?";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(myStudent.code IS NULL OR myStudent.code = '')";

	public MyStudentPersistenceImpl() {
		setModelClass(MyStudent.class);
	}

	/**
	 * Caches the my student in the entity cache if it is enabled.
	 *
	 * @param myStudent the my student
	 */
	@Override
	public void cacheResult(MyStudent myStudent) {
		EntityCacheUtil.putResult(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
			MyStudentImpl.class, myStudent.getPrimaryKey(), myStudent);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] { myStudent.getCode() }, myStudent);

		myStudent.resetOriginalValues();
	}

	/**
	 * Caches the my students in the entity cache if it is enabled.
	 *
	 * @param myStudents the my students
	 */
	@Override
	public void cacheResult(List<MyStudent> myStudents) {
		for (MyStudent myStudent : myStudents) {
			if (EntityCacheUtil.getResult(
						MyStudentModelImpl.ENTITY_CACHE_ENABLED,
						MyStudentImpl.class, myStudent.getPrimaryKey()) == null) {
				cacheResult(myStudent);
			}
			else {
				myStudent.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all my students.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MyStudentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MyStudentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the my student.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MyStudent myStudent) {
		EntityCacheUtil.removeResult(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
			MyStudentImpl.class, myStudent.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(myStudent);
	}

	@Override
	public void clearCache(List<MyStudent> myStudents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MyStudent myStudent : myStudents) {
			EntityCacheUtil.removeResult(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
				MyStudentImpl.class, myStudent.getPrimaryKey());

			clearUniqueFindersCache(myStudent);
		}
	}

	protected void cacheUniqueFindersCache(MyStudent myStudent) {
		if (myStudent.isNew()) {
			Object[] args = new Object[] { myStudent.getCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args, myStudent);
		}
		else {
			MyStudentModelImpl myStudentModelImpl = (MyStudentModelImpl)myStudent;

			if ((myStudentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { myStudent.getCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
					myStudent);
			}
		}
	}

	protected void clearUniqueFindersCache(MyStudent myStudent) {
		MyStudentModelImpl myStudentModelImpl = (MyStudentModelImpl)myStudent;

		Object[] args = new Object[] { myStudent.getCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);

		if ((myStudentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
			args = new Object[] { myStudentModelImpl.getOriginalCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);
		}
	}

	/**
	 * Creates a new my student with the primary key. Does not add the my student to the database.
	 *
	 * @param studentId the primary key for the new my student
	 * @return the new my student
	 */
	@Override
	public MyStudent create(long studentId) {
		MyStudent myStudent = new MyStudentImpl();

		myStudent.setNew(true);
		myStudent.setPrimaryKey(studentId);

		return myStudent;
	}

	/**
	 * Removes the my student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the my student
	 * @return the my student that was removed
	 * @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent remove(long studentId)
		throws NoSuchMyStudentException, SystemException {
		return remove((Serializable)studentId);
	}

	/**
	 * Removes the my student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the my student
	 * @return the my student that was removed
	 * @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent remove(Serializable primaryKey)
		throws NoSuchMyStudentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MyStudent myStudent = (MyStudent)session.get(MyStudentImpl.class,
					primaryKey);

			if (myStudent == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMyStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(myStudent);
		}
		catch (NoSuchMyStudentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MyStudent removeImpl(MyStudent myStudent)
		throws SystemException {
		myStudent = toUnwrappedModel(myStudent);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(myStudent)) {
				myStudent = (MyStudent)session.get(MyStudentImpl.class,
						myStudent.getPrimaryKeyObj());
			}

			if (myStudent != null) {
				session.delete(myStudent);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (myStudent != null) {
			clearCache(myStudent);
		}

		return myStudent;
	}

	@Override
	public MyStudent updateImpl(com.liferay.tutorial.model.MyStudent myStudent)
		throws SystemException {
		myStudent = toUnwrappedModel(myStudent);

		boolean isNew = myStudent.isNew();

		Session session = null;

		try {
			session = openSession();

			if (myStudent.isNew()) {
				session.save(myStudent);

				myStudent.setNew(false);
			}
			else {
				session.merge(myStudent);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MyStudentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
			MyStudentImpl.class, myStudent.getPrimaryKey(), myStudent);

		clearUniqueFindersCache(myStudent);
		cacheUniqueFindersCache(myStudent);

		return myStudent;
	}

	protected MyStudent toUnwrappedModel(MyStudent myStudent) {
		if (myStudent instanceof MyStudentImpl) {
			return myStudent;
		}

		MyStudentImpl myStudentImpl = new MyStudentImpl();

		myStudentImpl.setNew(myStudent.isNew());
		myStudentImpl.setPrimaryKey(myStudent.getPrimaryKey());

		myStudentImpl.setStudentId(myStudent.getStudentId());
		myStudentImpl.setCode(myStudent.getCode());
		myStudentImpl.setFullName(myStudent.getFullName());
		myStudentImpl.setBirthday(myStudent.getBirthday());
		myStudentImpl.setGender(myStudent.isGender());
		myStudentImpl.setAddress(myStudent.getAddress());

		return myStudentImpl;
	}

	/**
	 * Returns the my student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the my student
	 * @return the my student
	 * @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMyStudentException, SystemException {
		MyStudent myStudent = fetchByPrimaryKey(primaryKey);

		if (myStudent == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMyStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return myStudent;
	}

	/**
	 * Returns the my student with the primary key or throws a {@link com.liferay.tutorial.NoSuchMyStudentException} if it could not be found.
	 *
	 * @param studentId the primary key of the my student
	 * @return the my student
	 * @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent findByPrimaryKey(long studentId)
		throws NoSuchMyStudentException, SystemException {
		return findByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns the my student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the my student
	 * @return the my student, or <code>null</code> if a my student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MyStudent myStudent = (MyStudent)EntityCacheUtil.getResult(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
				MyStudentImpl.class, primaryKey);

		if (myStudent == _nullMyStudent) {
			return null;
		}

		if (myStudent == null) {
			Session session = null;

			try {
				session = openSession();

				myStudent = (MyStudent)session.get(MyStudentImpl.class,
						primaryKey);

				if (myStudent != null) {
					cacheResult(myStudent);
				}
				else {
					EntityCacheUtil.putResult(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
						MyStudentImpl.class, primaryKey, _nullMyStudent);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MyStudentModelImpl.ENTITY_CACHE_ENABLED,
					MyStudentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return myStudent;
	}

	/**
	 * Returns the my student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the my student
	 * @return the my student, or <code>null</code> if a my student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyStudent fetchByPrimaryKey(long studentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns all the my students.
	 *
	 * @return the my students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyStudent> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the my students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.MyStudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of my students
	 * @param end the upper bound of the range of my students (not inclusive)
	 * @return the range of my students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyStudent> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the my students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.MyStudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of my students
	 * @param end the upper bound of the range of my students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of my students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyStudent> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<MyStudent> list = (List<MyStudent>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MYSTUDENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MYSTUDENT;

				if (pagination) {
					sql = sql.concat(MyStudentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MyStudent>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MyStudent>(list);
				}
				else {
					list = (List<MyStudent>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the my students from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MyStudent myStudent : findAll()) {
			remove(myStudent);
		}
	}

	/**
	 * Returns the number of my students.
	 *
	 * @return the number of my students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MYSTUDENT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the my student persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.tutorial.model.MyStudent")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MyStudent>> listenersList = new ArrayList<ModelListener<MyStudent>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MyStudent>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MyStudentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MYSTUDENT = "SELECT myStudent FROM MyStudent myStudent";
	private static final String _SQL_SELECT_MYSTUDENT_WHERE = "SELECT myStudent FROM MyStudent myStudent WHERE ";
	private static final String _SQL_COUNT_MYSTUDENT = "SELECT COUNT(myStudent) FROM MyStudent myStudent";
	private static final String _SQL_COUNT_MYSTUDENT_WHERE = "SELECT COUNT(myStudent) FROM MyStudent myStudent WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "myStudent.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MyStudent exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MyStudent exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MyStudentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code", "fullName", "birthday", "gender", "address"
			});
	private static MyStudent _nullMyStudent = new MyStudentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MyStudent> toCacheModel() {
				return _nullMyStudentCacheModel;
			}
		};

	private static CacheModel<MyStudent> _nullMyStudentCacheModel = new CacheModel<MyStudent>() {
			@Override
			public MyStudent toEntityModel() {
				return _nullMyStudent;
			}
		};
}