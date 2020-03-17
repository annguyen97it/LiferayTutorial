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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Validate_Student}.
 * </p>
 *
 * @author annv
 * @see Validate_Student
 * @generated
 */
public class Validate_StudentWrapper implements Validate_Student,
	ModelWrapper<Validate_Student> {
	public Validate_StudentWrapper(Validate_Student validate_Student) {
		_validate_Student = validate_Student;
	}

	@Override
	public Class<?> getModelClass() {
		return Validate_Student.class;
	}

	@Override
	public String getModelClassName() {
		return Validate_Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("code", getCode());
		attributes.put("fullname", getFullname());
		attributes.put("gender", getGender());
		attributes.put("birthday", getBirthday());
		attributes.put("email", getEmail());
		attributes.put("address", getAddress());
		attributes.put("blog", getBlog());
		attributes.put("mark", getMark());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String fullname = (String)attributes.get("fullname");

		if (fullname != null) {
			setFullname(fullname);
		}

		Boolean gender = (Boolean)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String blog = (String)attributes.get("blog");

		if (blog != null) {
			setBlog(blog);
		}

		Double mark = (Double)attributes.get("mark");

		if (mark != null) {
			setMark(mark);
		}
	}

	/**
	* Returns the primary key of this validate_ student.
	*
	* @return the primary key of this validate_ student
	*/
	@Override
	public long getPrimaryKey() {
		return _validate_Student.getPrimaryKey();
	}

	/**
	* Sets the primary key of this validate_ student.
	*
	* @param primaryKey the primary key of this validate_ student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_validate_Student.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student ID of this validate_ student.
	*
	* @return the student ID of this validate_ student
	*/
	@Override
	public long getStudentId() {
		return _validate_Student.getStudentId();
	}

	/**
	* Sets the student ID of this validate_ student.
	*
	* @param studentId the student ID of this validate_ student
	*/
	@Override
	public void setStudentId(long studentId) {
		_validate_Student.setStudentId(studentId);
	}

	/**
	* Returns the code of this validate_ student.
	*
	* @return the code of this validate_ student
	*/
	@Override
	public java.lang.String getCode() {
		return _validate_Student.getCode();
	}

	/**
	* Sets the code of this validate_ student.
	*
	* @param code the code of this validate_ student
	*/
	@Override
	public void setCode(java.lang.String code) {
		_validate_Student.setCode(code);
	}

	/**
	* Returns the fullname of this validate_ student.
	*
	* @return the fullname of this validate_ student
	*/
	@Override
	public java.lang.String getFullname() {
		return _validate_Student.getFullname();
	}

	/**
	* Sets the fullname of this validate_ student.
	*
	* @param fullname the fullname of this validate_ student
	*/
	@Override
	public void setFullname(java.lang.String fullname) {
		_validate_Student.setFullname(fullname);
	}

	/**
	* Returns the gender of this validate_ student.
	*
	* @return the gender of this validate_ student
	*/
	@Override
	public boolean getGender() {
		return _validate_Student.getGender();
	}

	/**
	* Returns <code>true</code> if this validate_ student is gender.
	*
	* @return <code>true</code> if this validate_ student is gender; <code>false</code> otherwise
	*/
	@Override
	public boolean isGender() {
		return _validate_Student.isGender();
	}

	/**
	* Sets whether this validate_ student is gender.
	*
	* @param gender the gender of this validate_ student
	*/
	@Override
	public void setGender(boolean gender) {
		_validate_Student.setGender(gender);
	}

	/**
	* Returns the birthday of this validate_ student.
	*
	* @return the birthday of this validate_ student
	*/
	@Override
	public java.util.Date getBirthday() {
		return _validate_Student.getBirthday();
	}

	/**
	* Sets the birthday of this validate_ student.
	*
	* @param birthday the birthday of this validate_ student
	*/
	@Override
	public void setBirthday(java.util.Date birthday) {
		_validate_Student.setBirthday(birthday);
	}

	/**
	* Returns the email of this validate_ student.
	*
	* @return the email of this validate_ student
	*/
	@Override
	public java.lang.String getEmail() {
		return _validate_Student.getEmail();
	}

	/**
	* Sets the email of this validate_ student.
	*
	* @param email the email of this validate_ student
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_validate_Student.setEmail(email);
	}

	/**
	* Returns the address of this validate_ student.
	*
	* @return the address of this validate_ student
	*/
	@Override
	public java.lang.String getAddress() {
		return _validate_Student.getAddress();
	}

	/**
	* Sets the address of this validate_ student.
	*
	* @param address the address of this validate_ student
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_validate_Student.setAddress(address);
	}

	/**
	* Returns the blog of this validate_ student.
	*
	* @return the blog of this validate_ student
	*/
	@Override
	public java.lang.String getBlog() {
		return _validate_Student.getBlog();
	}

	/**
	* Sets the blog of this validate_ student.
	*
	* @param blog the blog of this validate_ student
	*/
	@Override
	public void setBlog(java.lang.String blog) {
		_validate_Student.setBlog(blog);
	}

	/**
	* Returns the mark of this validate_ student.
	*
	* @return the mark of this validate_ student
	*/
	@Override
	public double getMark() {
		return _validate_Student.getMark();
	}

	/**
	* Sets the mark of this validate_ student.
	*
	* @param mark the mark of this validate_ student
	*/
	@Override
	public void setMark(double mark) {
		_validate_Student.setMark(mark);
	}

	@Override
	public boolean isNew() {
		return _validate_Student.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_validate_Student.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _validate_Student.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_validate_Student.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _validate_Student.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _validate_Student.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_validate_Student.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _validate_Student.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_validate_Student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_validate_Student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_validate_Student.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Validate_StudentWrapper((Validate_Student)_validate_Student.clone());
	}

	@Override
	public int compareTo(
		com.liferay.tutorial.model.Validate_Student validate_Student) {
		return _validate_Student.compareTo(validate_Student);
	}

	@Override
	public int hashCode() {
		return _validate_Student.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.tutorial.model.Validate_Student> toCacheModel() {
		return _validate_Student.toCacheModel();
	}

	@Override
	public com.liferay.tutorial.model.Validate_Student toEscapedModel() {
		return new Validate_StudentWrapper(_validate_Student.toEscapedModel());
	}

	@Override
	public com.liferay.tutorial.model.Validate_Student toUnescapedModel() {
		return new Validate_StudentWrapper(_validate_Student.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _validate_Student.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _validate_Student.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_validate_Student.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Validate_StudentWrapper)) {
			return false;
		}

		Validate_StudentWrapper validate_StudentWrapper = (Validate_StudentWrapper)obj;

		if (Validator.equals(_validate_Student,
					validate_StudentWrapper._validate_Student)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Validate_Student getWrappedValidate_Student() {
		return _validate_Student;
	}

	@Override
	public Validate_Student getWrappedModel() {
		return _validate_Student;
	}

	@Override
	public void resetOriginalValues() {
		_validate_Student.resetOriginalValues();
	}

	private Validate_Student _validate_Student;
}