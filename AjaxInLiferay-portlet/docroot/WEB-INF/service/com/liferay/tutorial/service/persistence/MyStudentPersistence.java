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

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.tutorial.model.MyStudent;

/**
 * The persistence interface for the my student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author annv
 * @see MyStudentPersistenceImpl
 * @see MyStudentUtil
 * @generated
 */
public interface MyStudentPersistence extends BasePersistence<MyStudent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MyStudentUtil} to access the my student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the my student where code = &#63; or throws a {@link com.liferay.tutorial.NoSuchMyStudentException} if it could not be found.
	*
	* @param code the code
	* @return the matching my student
	* @throws com.liferay.tutorial.NoSuchMyStudentException if a matching my student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.MyStudent findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException;

	/**
	* Returns the my student where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching my student, or <code>null</code> if a matching my student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.MyStudent fetchByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my student where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching my student, or <code>null</code> if a matching my student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.MyStudent fetchByCode(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the my student where code = &#63; from the database.
	*
	* @param code the code
	* @return the my student that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.MyStudent removeByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException;

	/**
	* Returns the number of my students where code = &#63;.
	*
	* @param code the code
	* @return the number of matching my students
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the my student in the entity cache if it is enabled.
	*
	* @param myStudent the my student
	*/
	public void cacheResult(com.liferay.tutorial.model.MyStudent myStudent);

	/**
	* Caches the my students in the entity cache if it is enabled.
	*
	* @param myStudents the my students
	*/
	public void cacheResult(
		java.util.List<com.liferay.tutorial.model.MyStudent> myStudents);

	/**
	* Creates a new my student with the primary key. Does not add the my student to the database.
	*
	* @param studentId the primary key for the new my student
	* @return the new my student
	*/
	public com.liferay.tutorial.model.MyStudent create(long studentId);

	/**
	* Removes the my student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the my student
	* @return the my student that was removed
	* @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.MyStudent remove(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException;

	public com.liferay.tutorial.model.MyStudent updateImpl(
		com.liferay.tutorial.model.MyStudent myStudent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my student with the primary key or throws a {@link com.liferay.tutorial.NoSuchMyStudentException} if it could not be found.
	*
	* @param studentId the primary key of the my student
	* @return the my student
	* @throws com.liferay.tutorial.NoSuchMyStudentException if a my student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.MyStudent findByPrimaryKey(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchMyStudentException;

	/**
	* Returns the my student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the my student
	* @return the my student, or <code>null</code> if a my student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.MyStudent fetchByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the my students.
	*
	* @return the my students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.tutorial.model.MyStudent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.tutorial.model.MyStudent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.tutorial.model.MyStudent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the my students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of my students.
	*
	* @return the number of my students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}