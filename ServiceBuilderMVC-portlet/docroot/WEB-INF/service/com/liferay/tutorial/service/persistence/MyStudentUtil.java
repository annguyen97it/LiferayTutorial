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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.tutorial.model.MyStudent;

import java.util.List;

/**
 * The persistence utility for the my student service. This utility wraps {@link MyStudentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author annv
 * @see MyStudentPersistence
 * @see MyStudentPersistenceImpl
 * @generated
 */
public class MyStudentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MyStudent myStudent) {
		getPersistence().clearCache(myStudent);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MyStudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MyStudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MyStudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MyStudent update(MyStudent myStudent)
		throws SystemException {
		return getPersistence().update(myStudent);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MyStudent update(MyStudent myStudent,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(myStudent, serviceContext);
	}

	/**
	* Returns all the my students where studentGender = &#63;.
	*
	* @param studentGender the student gender
	* @return the matching my students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.tutorial.model.MyStudent> findBybyGender(
		int studentGender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBybyGender(studentGender);
	}

	/**
	* Returns a range of all the my students where studentGender = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.MyStudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param studentGender the student gender
	* @param start the lower bound of the range of my students
	* @param end the upper bound of the range of my students (not inclusive)
	* @return the range of matching my students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.tutorial.model.MyStudent> findBybyGender(
		int studentGender, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBybyGender(studentGender, start, end);
	}

	/**
	* Returns an ordered range of all the my students where studentGender = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.MyStudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param studentGender the student gender
	* @param start the lower bound of the range of my students
	* @param end the upper bound of the range of my students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching my students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.tutorial.model.MyStudent> findBybyGender(
		int studentGender, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBybyGender(studentGender, start, end, orderByComparator);
	}

	/**
	* Returns the first my student in the ordered set where studentGender = &#63;.
	*
	* @param studentGender the student gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my student
	* @throws com.liferay.tutorial.NoSuchMyStudentException if a matching my student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.tutorial.model.MyStudent findBybyGender_First(
		int studentGender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException {
		return getPersistence()
				   .findBybyGender_First(studentGender, orderByComparator);
	}

	/**
	* Returns the first my student in the ordered set where studentGender = &#63;.
	*
	* @param studentGender the student gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my student, or <code>null</code> if a matching my student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.tutorial.model.MyStudent fetchBybyGender_First(
		int studentGender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBybyGender_First(studentGender, orderByComparator);
	}

	/**
	* Returns the last my student in the ordered set where studentGender = &#63;.
	*
	* @param studentGender the student gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my student
	* @throws com.liferay.tutorial.NoSuchMyStudentException if a matching my student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.tutorial.model.MyStudent findBybyGender_Last(
		int studentGender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException {
		return getPersistence()
				   .findBybyGender_Last(studentGender, orderByComparator);
	}

	/**
	* Returns the last my student in the ordered set where studentGender = &#63;.
	*
	* @param studentGender the student gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my student, or <code>null</code> if a matching my student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.tutorial.model.MyStudent fetchBybyGender_Last(
		int studentGender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBybyGender_Last(studentGender, orderByComparator);
	}

	/**
	* Returns the my students before and after the current my student in the ordered set where studentGender = &#63;.
	*
	* @param studentId the primary key of the current my student
	* @param studentGender the student gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next my student
	* @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.tutorial.model.MyStudent[] findBybyGender_PrevAndNext(
		long studentId, int studentGender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException {
		return getPersistence()
				   .findBybyGender_PrevAndNext(studentId, studentGender,
			orderByComparator);
	}

	/**
	* Removes all the my students where studentGender = &#63; from the database.
	*
	* @param studentGender the student gender
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBybyGender(int studentGender)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBybyGender(studentGender);
	}

	/**
	* Returns the number of my students where studentGender = &#63;.
	*
	* @param studentGender the student gender
	* @return the number of matching my students
	* @throws SystemException if a system exception occurred
	*/
	public static int countBybyGender(int studentGender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBybyGender(studentGender);
	}

	/**
	* Caches the my student in the entity cache if it is enabled.
	*
	* @param myStudent the my student
	*/
	public static void cacheResult(
		com.liferay.tutorial.model.MyStudent myStudent) {
		getPersistence().cacheResult(myStudent);
	}

	/**
	* Caches the my students in the entity cache if it is enabled.
	*
	* @param myStudents the my students
	*/
	public static void cacheResult(
		java.util.List<com.liferay.tutorial.model.MyStudent> myStudents) {
		getPersistence().cacheResult(myStudents);
	}

	/**
	* Creates a new my student with the primary key. Does not add the my student to the database.
	*
	* @param studentId the primary key for the new my student
	* @return the new my student
	*/
	public static com.liferay.tutorial.model.MyStudent create(long studentId) {
		return getPersistence().create(studentId);
	}

	/**
	* Removes the my student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the my student
	* @return the my student that was removed
	* @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.tutorial.model.MyStudent remove(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException {
		return getPersistence().remove(studentId);
	}

	public static com.liferay.tutorial.model.MyStudent updateImpl(
		com.liferay.tutorial.model.MyStudent myStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(myStudent);
	}

	/**
	* Returns the my student with the primary key or throws a {@link com.liferay.tutorial.NoSuchMyStudentException} if it could not be found.
	*
	* @param studentId the primary key of the my student
	* @return the my student
	* @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.tutorial.model.MyStudent findByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException {
		return getPersistence().findByPrimaryKey(studentId);
	}

	/**
	* Returns the my student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the my student
	* @return the my student, or <code>null</code> if a my student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.tutorial.model.MyStudent fetchByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(studentId);
	}

	/**
	* Returns all the my students.
	*
	* @return the my students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.tutorial.model.MyStudent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.tutorial.model.MyStudent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.liferay.tutorial.model.MyStudent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the my students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of my students.
	*
	* @return the number of my students
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MyStudentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MyStudentPersistence)PortletBeanLocatorUtil.locate(com.liferay.tutorial.service.ClpSerializer.getServletContextName(),
					MyStudentPersistence.class.getName());

			ReferenceRegistry.registerReference(MyStudentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MyStudentPersistence persistence) {
	}

	private static MyStudentPersistence _persistence;
}