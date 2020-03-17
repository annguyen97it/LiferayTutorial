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

import com.liferay.tutorial.model.Validate_Student;

/**
 * The persistence interface for the validate_ student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author annv
 * @see Validate_StudentPersistenceImpl
 * @see Validate_StudentUtil
 * @generated
 */
public interface Validate_StudentPersistence extends BasePersistence<Validate_Student> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Validate_StudentUtil} to access the validate_ student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the validate_ students where gender = &#63;.
	*
	* @param gender the gender
	* @return the matching validate_ students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.tutorial.model.Validate_Student> findBybyGender(
		boolean gender)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.tutorial.model.Validate_Student> findBybyGender(
		boolean gender, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.tutorial.model.Validate_Student> findBybyGender(
		boolean gender, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first validate_ student in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching validate_ student
	* @throws com.liferay.tutorial.NoSuchValidate_StudentException if a matching validate_ student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.Validate_Student findBybyGender_First(
		boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchValidate_StudentException;

	/**
	* Returns the first validate_ student in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching validate_ student, or <code>null</code> if a matching validate_ student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.Validate_Student fetchBybyGender_First(
		boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last validate_ student in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching validate_ student
	* @throws com.liferay.tutorial.NoSuchValidate_StudentException if a matching validate_ student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.Validate_Student findBybyGender_Last(
		boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchValidate_StudentException;

	/**
	* Returns the last validate_ student in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching validate_ student, or <code>null</code> if a matching validate_ student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.Validate_Student fetchBybyGender_Last(
		boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.tutorial.model.Validate_Student[] findBybyGender_PrevAndNext(
		long studentId, boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchValidate_StudentException;

	/**
	* Removes all the validate_ students where gender = &#63; from the database.
	*
	* @param gender the gender
	* @throws SystemException if a system exception occurred
	*/
	public void removeBybyGender(boolean gender)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of validate_ students where gender = &#63;.
	*
	* @param gender the gender
	* @return the number of matching validate_ students
	* @throws SystemException if a system exception occurred
	*/
	public int countBybyGender(boolean gender)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the validate_ student in the entity cache if it is enabled.
	*
	* @param validate_Student the validate_ student
	*/
	public void cacheResult(
		com.liferay.tutorial.model.Validate_Student validate_Student);

	/**
	* Caches the validate_ students in the entity cache if it is enabled.
	*
	* @param validate_Students the validate_ students
	*/
	public void cacheResult(
		java.util.List<com.liferay.tutorial.model.Validate_Student> validate_Students);

	/**
	* Creates a new validate_ student with the primary key. Does not add the validate_ student to the database.
	*
	* @param studentId the primary key for the new validate_ student
	* @return the new validate_ student
	*/
	public com.liferay.tutorial.model.Validate_Student create(long studentId);

	/**
	* Removes the validate_ student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the validate_ student
	* @return the validate_ student that was removed
	* @throws com.liferay.tutorial.NoSuchValidate_StudentException if a validate_ student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.Validate_Student remove(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchValidate_StudentException;

	public com.liferay.tutorial.model.Validate_Student updateImpl(
		com.liferay.tutorial.model.Validate_Student validate_Student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the validate_ student with the primary key or throws a {@link com.liferay.tutorial.NoSuchValidate_StudentException} if it could not be found.
	*
	* @param studentId the primary key of the validate_ student
	* @return the validate_ student
	* @throws com.liferay.tutorial.NoSuchValidate_StudentException if a validate_ student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.Validate_Student findByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.tutorial.NoSuchValidate_StudentException;

	/**
	* Returns the validate_ student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the validate_ student
	* @return the validate_ student, or <code>null</code> if a validate_ student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.tutorial.model.Validate_Student fetchByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the validate_ students.
	*
	* @return the validate_ students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.tutorial.model.Validate_Student> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.tutorial.model.Validate_Student> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.tutorial.model.Validate_Student> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the validate_ students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of validate_ students.
	*
	* @return the number of validate_ students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}