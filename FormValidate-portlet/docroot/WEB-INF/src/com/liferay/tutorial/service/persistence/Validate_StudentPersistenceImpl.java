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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.tutorial.NoSuchValidate_StudentException;
import com.liferay.tutorial.model.Validate_Student;
import com.liferay.tutorial.model.impl.Validate_StudentImpl;
import com.liferay.tutorial.model.impl.Validate_StudentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the validate_ student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author annv
 * @see Validate_StudentPersistence
 * @see Validate_StudentUtil
 * @generated
 */
public class Validate_StudentPersistenceImpl extends BasePersistenceImpl<Validate_Student>
	implements Validate_StudentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Validate_StudentUtil} to access the validate_ student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Validate_StudentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentModelImpl.FINDER_CACHE_ENABLED,
			Validate_StudentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentModelImpl.FINDER_CACHE_ENABLED,
			Validate_StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BYGENDER = new FinderPath(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentModelImpl.FINDER_CACHE_ENABLED,
			Validate_StudentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBybyGender",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYGENDER =
		new FinderPath(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentModelImpl.FINDER_CACHE_ENABLED,
			Validate_StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybyGender",
			new String[] { Boolean.class.getName() },
			Validate_StudentModelImpl.GENDER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BYGENDER = new FinderPath(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybyGender",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the validate_ students where gender = &#63;.
	 *
	 * @param gender the gender
	 * @return the matching validate_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validate_Student> findBybyGender(boolean gender)
		throws SystemException {
		return findBybyGender(gender, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the validate_ students where gender = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validate_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gender the gender
	 * @param start the lower bound of the range of validate_ students
	 * @param end the upper bound of the range of validate_ students (not inclusive)
	 * @return the range of matching validate_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validate_Student> findBybyGender(boolean gender, int start,
		int end) throws SystemException {
		return findBybyGender(gender, start, end, null);
	}

	/**
	 * Returns an ordered range of all the validate_ students where gender = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validate_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gender the gender
	 * @param start the lower bound of the range of validate_ students
	 * @param end the upper bound of the range of validate_ students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching validate_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validate_Student> findBybyGender(boolean gender, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYGENDER;
			finderArgs = new Object[] { gender };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BYGENDER;
			finderArgs = new Object[] { gender, start, end, orderByComparator };
		}

		List<Validate_Student> list = (List<Validate_Student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Validate_Student validate_Student : list) {
				if ((gender != validate_Student.getGender())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VALIDATE_STUDENT_WHERE);

			query.append(_FINDER_COLUMN_BYGENDER_GENDER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Validate_StudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gender);

				if (!pagination) {
					list = (List<Validate_Student>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Validate_Student>(list);
				}
				else {
					list = (List<Validate_Student>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first validate_ student in the ordered set where gender = &#63;.
	 *
	 * @param gender the gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching validate_ student
	 * @throws com.liferay.tutorial.NoSuchValidate_StudentException if a matching validate_ student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student findBybyGender_First(boolean gender,
		OrderByComparator orderByComparator)
		throws NoSuchValidate_StudentException, SystemException {
		Validate_Student validate_Student = fetchBybyGender_First(gender,
				orderByComparator);

		if (validate_Student != null) {
			return validate_Student;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gender=");
		msg.append(gender);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchValidate_StudentException(msg.toString());
	}

	/**
	 * Returns the first validate_ student in the ordered set where gender = &#63;.
	 *
	 * @param gender the gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching validate_ student, or <code>null</code> if a matching validate_ student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student fetchBybyGender_First(boolean gender,
		OrderByComparator orderByComparator) throws SystemException {
		List<Validate_Student> list = findBybyGender(gender, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last validate_ student in the ordered set where gender = &#63;.
	 *
	 * @param gender the gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching validate_ student
	 * @throws com.liferay.tutorial.NoSuchValidate_StudentException if a matching validate_ student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student findBybyGender_Last(boolean gender,
		OrderByComparator orderByComparator)
		throws NoSuchValidate_StudentException, SystemException {
		Validate_Student validate_Student = fetchBybyGender_Last(gender,
				orderByComparator);

		if (validate_Student != null) {
			return validate_Student;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gender=");
		msg.append(gender);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchValidate_StudentException(msg.toString());
	}

	/**
	 * Returns the last validate_ student in the ordered set where gender = &#63;.
	 *
	 * @param gender the gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching validate_ student, or <code>null</code> if a matching validate_ student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student fetchBybyGender_Last(boolean gender,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBybyGender(gender);

		if (count == 0) {
			return null;
		}

		List<Validate_Student> list = findBybyGender(gender, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the validate_ students before and after the current validate_ student in the ordered set where gender = &#63;.
	 *
	 * @param studentId the primary key of the current validate_ student
	 * @param gender the gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next validate_ student
	 * @throws com.liferay.tutorial.NoSuchValidate_StudentException if a validate_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student[] findBybyGender_PrevAndNext(long studentId,
		boolean gender, OrderByComparator orderByComparator)
		throws NoSuchValidate_StudentException, SystemException {
		Validate_Student validate_Student = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			Validate_Student[] array = new Validate_StudentImpl[3];

			array[0] = getBybyGender_PrevAndNext(session, validate_Student,
					gender, orderByComparator, true);

			array[1] = validate_Student;

			array[2] = getBybyGender_PrevAndNext(session, validate_Student,
					gender, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Validate_Student getBybyGender_PrevAndNext(Session session,
		Validate_Student validate_Student, boolean gender,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VALIDATE_STUDENT_WHERE);

		query.append(_FINDER_COLUMN_BYGENDER_GENDER_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(Validate_StudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(gender);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(validate_Student);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Validate_Student> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the validate_ students where gender = &#63; from the database.
	 *
	 * @param gender the gender
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBybyGender(boolean gender) throws SystemException {
		for (Validate_Student validate_Student : findBybyGender(gender,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(validate_Student);
		}
	}

	/**
	 * Returns the number of validate_ students where gender = &#63;.
	 *
	 * @param gender the gender
	 * @return the number of matching validate_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBybyGender(boolean gender) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BYGENDER;

		Object[] finderArgs = new Object[] { gender };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VALIDATE_STUDENT_WHERE);

			query.append(_FINDER_COLUMN_BYGENDER_GENDER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gender);

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

	private static final String _FINDER_COLUMN_BYGENDER_GENDER_2 = "validate_Student.gender = ?";

	public Validate_StudentPersistenceImpl() {
		setModelClass(Validate_Student.class);
	}

	/**
	 * Caches the validate_ student in the entity cache if it is enabled.
	 *
	 * @param validate_Student the validate_ student
	 */
	@Override
	public void cacheResult(Validate_Student validate_Student) {
		EntityCacheUtil.putResult(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentImpl.class, validate_Student.getPrimaryKey(),
			validate_Student);

		validate_Student.resetOriginalValues();
	}

	/**
	 * Caches the validate_ students in the entity cache if it is enabled.
	 *
	 * @param validate_Students the validate_ students
	 */
	@Override
	public void cacheResult(List<Validate_Student> validate_Students) {
		for (Validate_Student validate_Student : validate_Students) {
			if (EntityCacheUtil.getResult(
						Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
						Validate_StudentImpl.class,
						validate_Student.getPrimaryKey()) == null) {
				cacheResult(validate_Student);
			}
			else {
				validate_Student.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all validate_ students.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Validate_StudentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Validate_StudentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the validate_ student.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Validate_Student validate_Student) {
		EntityCacheUtil.removeResult(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentImpl.class, validate_Student.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Validate_Student> validate_Students) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Validate_Student validate_Student : validate_Students) {
			EntityCacheUtil.removeResult(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
				Validate_StudentImpl.class, validate_Student.getPrimaryKey());
		}
	}

	/**
	 * Creates a new validate_ student with the primary key. Does not add the validate_ student to the database.
	 *
	 * @param studentId the primary key for the new validate_ student
	 * @return the new validate_ student
	 */
	@Override
	public Validate_Student create(long studentId) {
		Validate_Student validate_Student = new Validate_StudentImpl();

		validate_Student.setNew(true);
		validate_Student.setPrimaryKey(studentId);

		return validate_Student;
	}

	/**
	 * Removes the validate_ student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the validate_ student
	 * @return the validate_ student that was removed
	 * @throws com.liferay.tutorial.NoSuchValidate_StudentException if a validate_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student remove(long studentId)
		throws NoSuchValidate_StudentException, SystemException {
		return remove((Serializable)studentId);
	}

	/**
	 * Removes the validate_ student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the validate_ student
	 * @return the validate_ student that was removed
	 * @throws com.liferay.tutorial.NoSuchValidate_StudentException if a validate_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student remove(Serializable primaryKey)
		throws NoSuchValidate_StudentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Validate_Student validate_Student = (Validate_Student)session.get(Validate_StudentImpl.class,
					primaryKey);

			if (validate_Student == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchValidate_StudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(validate_Student);
		}
		catch (NoSuchValidate_StudentException nsee) {
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
	protected Validate_Student removeImpl(Validate_Student validate_Student)
		throws SystemException {
		validate_Student = toUnwrappedModel(validate_Student);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(validate_Student)) {
				validate_Student = (Validate_Student)session.get(Validate_StudentImpl.class,
						validate_Student.getPrimaryKeyObj());
			}

			if (validate_Student != null) {
				session.delete(validate_Student);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (validate_Student != null) {
			clearCache(validate_Student);
		}

		return validate_Student;
	}

	@Override
	public Validate_Student updateImpl(
		com.liferay.tutorial.model.Validate_Student validate_Student)
		throws SystemException {
		validate_Student = toUnwrappedModel(validate_Student);

		boolean isNew = validate_Student.isNew();

		Validate_StudentModelImpl validate_StudentModelImpl = (Validate_StudentModelImpl)validate_Student;

		Session session = null;

		try {
			session = openSession();

			if (validate_Student.isNew()) {
				session.save(validate_Student);

				validate_Student.setNew(false);
			}
			else {
				session.merge(validate_Student);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !Validate_StudentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((validate_StudentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYGENDER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						validate_StudentModelImpl.getOriginalGender()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BYGENDER, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYGENDER,
					args);

				args = new Object[] { validate_StudentModelImpl.getGender() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BYGENDER, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BYGENDER,
					args);
			}
		}

		EntityCacheUtil.putResult(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validate_StudentImpl.class, validate_Student.getPrimaryKey(),
			validate_Student);

		return validate_Student;
	}

	protected Validate_Student toUnwrappedModel(
		Validate_Student validate_Student) {
		if (validate_Student instanceof Validate_StudentImpl) {
			return validate_Student;
		}

		Validate_StudentImpl validate_StudentImpl = new Validate_StudentImpl();

		validate_StudentImpl.setNew(validate_Student.isNew());
		validate_StudentImpl.setPrimaryKey(validate_Student.getPrimaryKey());

		validate_StudentImpl.setStudentId(validate_Student.getStudentId());
		validate_StudentImpl.setCode(validate_Student.getCode());
		validate_StudentImpl.setFullname(validate_Student.getFullname());
		validate_StudentImpl.setGender(validate_Student.isGender());
		validate_StudentImpl.setBirthday(validate_Student.getBirthday());
		validate_StudentImpl.setEmail(validate_Student.getEmail());
		validate_StudentImpl.setAddress(validate_Student.getAddress());
		validate_StudentImpl.setBlog(validate_Student.getBlog());
		validate_StudentImpl.setMark(validate_Student.getMark());

		return validate_StudentImpl;
	}

	/**
	 * Returns the validate_ student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the validate_ student
	 * @return the validate_ student
	 * @throws com.liferay.tutorial.NoSuchValidate_StudentException if a validate_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student findByPrimaryKey(Serializable primaryKey)
		throws NoSuchValidate_StudentException, SystemException {
		Validate_Student validate_Student = fetchByPrimaryKey(primaryKey);

		if (validate_Student == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchValidate_StudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return validate_Student;
	}

	/**
	 * Returns the validate_ student with the primary key or throws a {@link com.liferay.tutorial.NoSuchValidate_StudentException} if it could not be found.
	 *
	 * @param studentId the primary key of the validate_ student
	 * @return the validate_ student
	 * @throws com.liferay.tutorial.NoSuchValidate_StudentException if a validate_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student findByPrimaryKey(long studentId)
		throws NoSuchValidate_StudentException, SystemException {
		return findByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns the validate_ student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the validate_ student
	 * @return the validate_ student, or <code>null</code> if a validate_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Validate_Student validate_Student = (Validate_Student)EntityCacheUtil.getResult(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
				Validate_StudentImpl.class, primaryKey);

		if (validate_Student == _nullValidate_Student) {
			return null;
		}

		if (validate_Student == null) {
			Session session = null;

			try {
				session = openSession();

				validate_Student = (Validate_Student)session.get(Validate_StudentImpl.class,
						primaryKey);

				if (validate_Student != null) {
					cacheResult(validate_Student);
				}
				else {
					EntityCacheUtil.putResult(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
						Validate_StudentImpl.class, primaryKey,
						_nullValidate_Student);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Validate_StudentModelImpl.ENTITY_CACHE_ENABLED,
					Validate_StudentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return validate_Student;
	}

	/**
	 * Returns the validate_ student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the validate_ student
	 * @return the validate_ student, or <code>null</code> if a validate_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validate_Student fetchByPrimaryKey(long studentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns all the validate_ students.
	 *
	 * @return the validate_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validate_Student> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the validate_ students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validate_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of validate_ students
	 * @param end the upper bound of the range of validate_ students (not inclusive)
	 * @return the range of validate_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validate_Student> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the validate_ students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validate_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of validate_ students
	 * @param end the upper bound of the range of validate_ students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of validate_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validate_Student> findAll(int start, int end,
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

		List<Validate_Student> list = (List<Validate_Student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VALIDATE_STUDENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VALIDATE_STUDENT;

				if (pagination) {
					sql = sql.concat(Validate_StudentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Validate_Student>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Validate_Student>(list);
				}
				else {
					list = (List<Validate_Student>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the validate_ students from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Validate_Student validate_Student : findAll()) {
			remove(validate_Student);
		}
	}

	/**
	 * Returns the number of validate_ students.
	 *
	 * @return the number of validate_ students
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

				Query q = session.createQuery(_SQL_COUNT_VALIDATE_STUDENT);

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
	 * Initializes the validate_ student persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.tutorial.model.Validate_Student")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Validate_Student>> listenersList = new ArrayList<ModelListener<Validate_Student>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Validate_Student>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Validate_StudentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VALIDATE_STUDENT = "SELECT validate_Student FROM Validate_Student validate_Student";
	private static final String _SQL_SELECT_VALIDATE_STUDENT_WHERE = "SELECT validate_Student FROM Validate_Student validate_Student WHERE ";
	private static final String _SQL_COUNT_VALIDATE_STUDENT = "SELECT COUNT(validate_Student) FROM Validate_Student validate_Student";
	private static final String _SQL_COUNT_VALIDATE_STUDENT_WHERE = "SELECT COUNT(validate_Student) FROM Validate_Student validate_Student WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "validate_Student.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Validate_Student exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Validate_Student exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Validate_StudentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code"
			});
	private static Validate_Student _nullValidate_Student = new Validate_StudentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Validate_Student> toCacheModel() {
				return _nullValidate_StudentCacheModel;
			}
		};

	private static CacheModel<Validate_Student> _nullValidate_StudentCacheModel = new CacheModel<Validate_Student>() {
			@Override
			public Validate_Student toEntityModel() {
				return _nullValidate_Student;
			}
		};
}