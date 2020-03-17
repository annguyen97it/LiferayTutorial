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
 * This class is a wrapper for {@link Validate_St}.
 * </p>
 *
 * @author annv
 * @see Validate_St
 * @generated
 */
public class Validate_StWrapper implements Validate_St,
	ModelWrapper<Validate_St> {
	public Validate_StWrapper(Validate_St validate_St) {
		_validate_St = validate_St;
	}

	@Override
	public Class<?> getModelClass() {
		return Validate_St.class;
	}

	@Override
	public String getModelClassName() {
		return Validate_St.class.getName();
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
	* Returns the primary key of this validate_ st.
	*
	* @return the primary key of this validate_ st
	*/
	@Override
	public long getPrimaryKey() {
		return _validate_St.getPrimaryKey();
	}

	/**
	* Sets the primary key of this validate_ st.
	*
	* @param primaryKey the primary key of this validate_ st
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_validate_St.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student ID of this validate_ st.
	*
	* @return the student ID of this validate_ st
	*/
	@Override
	public long getStudentId() {
		return _validate_St.getStudentId();
	}

	/**
	* Sets the student ID of this validate_ st.
	*
	* @param studentId the student ID of this validate_ st
	*/
	@Override
	public void setStudentId(long studentId) {
		_validate_St.setStudentId(studentId);
	}

	/**
	* Returns the code of this validate_ st.
	*
	* @return the code of this validate_ st
	*/
	@Override
	public java.lang.String getCode() {
		return _validate_St.getCode();
	}

	/**
	* Sets the code of this validate_ st.
	*
	* @param code the code of this validate_ st
	*/
	@Override
	public void setCode(java.lang.String code) {
		_validate_St.setCode(code);
	}

	/**
	* Returns the fullname of this validate_ st.
	*
	* @return the fullname of this validate_ st
	*/
	@Override
	public java.lang.String getFullname() {
		return _validate_St.getFullname();
	}

	/**
	* Sets the fullname of this validate_ st.
	*
	* @param fullname the fullname of this validate_ st
	*/
	@Override
	public void setFullname(java.lang.String fullname) {
		_validate_St.setFullname(fullname);
	}

	/**
	* Returns the gender of this validate_ st.
	*
	* @return the gender of this validate_ st
	*/
	@Override
	public boolean getGender() {
		return _validate_St.getGender();
	}

	/**
	* Returns <code>true</code> if this validate_ st is gender.
	*
	* @return <code>true</code> if this validate_ st is gender; <code>false</code> otherwise
	*/
	@Override
	public boolean isGender() {
		return _validate_St.isGender();
	}

	/**
	* Sets whether this validate_ st is gender.
	*
	* @param gender the gender of this validate_ st
	*/
	@Override
	public void setGender(boolean gender) {
		_validate_St.setGender(gender);
	}

	/**
	* Returns the birthday of this validate_ st.
	*
	* @return the birthday of this validate_ st
	*/
	@Override
	public java.util.Date getBirthday() {
		return _validate_St.getBirthday();
	}

	/**
	* Sets the birthday of this validate_ st.
	*
	* @param birthday the birthday of this validate_ st
	*/
	@Override
	public void setBirthday(java.util.Date birthday) {
		_validate_St.setBirthday(birthday);
	}

	/**
	* Returns the email of this validate_ st.
	*
	* @return the email of this validate_ st
	*/
	@Override
	public java.lang.String getEmail() {
		return _validate_St.getEmail();
	}

	/**
	* Sets the email of this validate_ st.
	*
	* @param email the email of this validate_ st
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_validate_St.setEmail(email);
	}

	/**
	* Returns the address of this validate_ st.
	*
	* @return the address of this validate_ st
	*/
	@Override
	public java.lang.String getAddress() {
		return _validate_St.getAddress();
	}

	/**
	* Sets the address of this validate_ st.
	*
	* @param address the address of this validate_ st
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_validate_St.setAddress(address);
	}

	/**
	* Returns the blog of this validate_ st.
	*
	* @return the blog of this validate_ st
	*/
	@Override
	public java.lang.String getBlog() {
		return _validate_St.getBlog();
	}

	/**
	* Sets the blog of this validate_ st.
	*
	* @param blog the blog of this validate_ st
	*/
	@Override
	public void setBlog(java.lang.String blog) {
		_validate_St.setBlog(blog);
	}

	/**
	* Returns the mark of this validate_ st.
	*
	* @return the mark of this validate_ st
	*/
	@Override
	public double getMark() {
		return _validate_St.getMark();
	}

	/**
	* Sets the mark of this validate_ st.
	*
	* @param mark the mark of this validate_ st
	*/
	@Override
	public void setMark(double mark) {
		_validate_St.setMark(mark);
	}

	@Override
	public boolean isNew() {
		return _validate_St.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_validate_St.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _validate_St.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_validate_St.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _validate_St.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _validate_St.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_validate_St.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _validate_St.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_validate_St.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_validate_St.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_validate_St.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Validate_StWrapper((Validate_St)_validate_St.clone());
	}

	@Override
	public int compareTo(com.liferay.tutorial.model.Validate_St validate_St) {
		return _validate_St.compareTo(validate_St);
	}

	@Override
	public int hashCode() {
		return _validate_St.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.tutorial.model.Validate_St> toCacheModel() {
		return _validate_St.toCacheModel();
	}

	@Override
	public com.liferay.tutorial.model.Validate_St toEscapedModel() {
		return new Validate_StWrapper(_validate_St.toEscapedModel());
	}

	@Override
	public com.liferay.tutorial.model.Validate_St toUnescapedModel() {
		return new Validate_StWrapper(_validate_St.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _validate_St.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _validate_St.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_validate_St.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Validate_StWrapper)) {
			return false;
		}

		Validate_StWrapper validate_StWrapper = (Validate_StWrapper)obj;

		if (Validator.equals(_validate_St, validate_StWrapper._validate_St)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Validate_St getWrappedValidate_St() {
		return _validate_St;
	}

	@Override
	public Validate_St getWrappedModel() {
		return _validate_St;
	}

	@Override
	public void resetOriginalValues() {
		_validate_St.resetOriginalValues();
	}

	private Validate_St _validate_St;
}