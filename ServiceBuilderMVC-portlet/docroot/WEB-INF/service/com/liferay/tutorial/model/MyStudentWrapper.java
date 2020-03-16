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

package com.liferay.tutorial.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MyStudent}.
 * </p>
 *
 * @author annv
 * @see MyStudent
 * @generated
 */
public class MyStudentWrapper implements MyStudent, ModelWrapper<MyStudent> {
	public MyStudentWrapper(MyStudent myStudent) {
		_myStudent = myStudent;
	}

	@Override
	public Class<?> getModelClass() {
		return MyStudent.class;
	}

	@Override
	public String getModelClassName() {
		return MyStudent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("studentAge", getStudentAge());
		attributes.put("studentGender", getStudentGender());
		attributes.put("studentAddress", getStudentAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Integer studentAge = (Integer)attributes.get("studentAge");

		if (studentAge != null) {
			setStudentAge(studentAge);
		}

		Integer studentGender = (Integer)attributes.get("studentGender");

		if (studentGender != null) {
			setStudentGender(studentGender);
		}

		String studentAddress = (String)attributes.get("studentAddress");

		if (studentAddress != null) {
			setStudentAddress(studentAddress);
		}
	}

	/**
	* Returns the primary key of this my student.
	*
	* @return the primary key of this my student
	*/
	@Override
	public long getPrimaryKey() {
		return _myStudent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this my student.
	*
	* @param primaryKey the primary key of this my student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_myStudent.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student ID of this my student.
	*
	* @return the student ID of this my student
	*/
	@Override
	public long getStudentId() {
		return _myStudent.getStudentId();
	}

	/**
	* Sets the student ID of this my student.
	*
	* @param studentId the student ID of this my student
	*/
	@Override
	public void setStudentId(long studentId) {
		_myStudent.setStudentId(studentId);
	}

	/**
	* Returns the first name of this my student.
	*
	* @return the first name of this my student
	*/
	@Override
	public java.lang.String getFirstName() {
		return _myStudent.getFirstName();
	}

	/**
	* Sets the first name of this my student.
	*
	* @param firstName the first name of this my student
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_myStudent.setFirstName(firstName);
	}

	/**
	* Returns the last name of this my student.
	*
	* @return the last name of this my student
	*/
	@Override
	public java.lang.String getLastName() {
		return _myStudent.getLastName();
	}

	/**
	* Sets the last name of this my student.
	*
	* @param lastName the last name of this my student
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_myStudent.setLastName(lastName);
	}

	/**
	* Returns the student age of this my student.
	*
	* @return the student age of this my student
	*/
	@Override
	public int getStudentAge() {
		return _myStudent.getStudentAge();
	}

	/**
	* Sets the student age of this my student.
	*
	* @param studentAge the student age of this my student
	*/
	@Override
	public void setStudentAge(int studentAge) {
		_myStudent.setStudentAge(studentAge);
	}

	/**
	* Returns the student gender of this my student.
	*
	* @return the student gender of this my student
	*/
	@Override
	public int getStudentGender() {
		return _myStudent.getStudentGender();
	}

	/**
	* Sets the student gender of this my student.
	*
	* @param studentGender the student gender of this my student
	*/
	@Override
	public void setStudentGender(int studentGender) {
		_myStudent.setStudentGender(studentGender);
	}

	/**
	* Returns the student address of this my student.
	*
	* @return the student address of this my student
	*/
	@Override
	public java.lang.String getStudentAddress() {
		return _myStudent.getStudentAddress();
	}

	/**
	* Sets the student address of this my student.
	*
	* @param studentAddress the student address of this my student
	*/
	@Override
	public void setStudentAddress(java.lang.String studentAddress) {
		_myStudent.setStudentAddress(studentAddress);
	}

	@Override
	public boolean isNew() {
		return _myStudent.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_myStudent.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _myStudent.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_myStudent.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _myStudent.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _myStudent.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_myStudent.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _myStudent.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_myStudent.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_myStudent.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_myStudent.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MyStudentWrapper((MyStudent)_myStudent.clone());
	}

	@Override
	public int compareTo(com.liferay.tutorial.model.MyStudent myStudent) {
		return _myStudent.compareTo(myStudent);
	}

	@Override
	public int hashCode() {
		return _myStudent.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.tutorial.model.MyStudent> toCacheModel() {
		return _myStudent.toCacheModel();
	}

	@Override
	public com.liferay.tutorial.model.MyStudent toEscapedModel() {
		return new MyStudentWrapper(_myStudent.toEscapedModel());
	}

	@Override
	public com.liferay.tutorial.model.MyStudent toUnescapedModel() {
		return new MyStudentWrapper(_myStudent.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _myStudent.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _myStudent.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_myStudent.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MyStudentWrapper)) {
			return false;
		}

		MyStudentWrapper myStudentWrapper = (MyStudentWrapper)obj;

		if (Validator.equals(_myStudent, myStudentWrapper._myStudent)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MyStudent getWrappedMyStudent() {
		return _myStudent;
	}

	@Override
	public MyStudent getWrappedModel() {
		return _myStudent;
	}

	@Override
	public void resetOriginalValues() {
		_myStudent.resetOriginalValues();
	}

	private MyStudent _myStudent;
}