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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.tutorial.service.ClpSerializer;
import com.liferay.tutorial.service.Validate_StudentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author annv
 */
public class Validate_StudentClp extends BaseModelImpl<Validate_Student>
	implements Validate_Student {
	public Validate_StudentClp() {
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
	public long getPrimaryKey() {
		return _studentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStudentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _studentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getStudentId() {
		return _studentId;
	}

	@Override
	public void setStudentId(long studentId) {
		_studentId = studentId;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setStudentId", long.class);

				method.invoke(_validate_StudentRemoteModel, studentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_validate_StudentRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullname() {
		return _fullname;
	}

	@Override
	public void setFullname(String fullname) {
		_fullname = fullname;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setFullname", String.class);

				method.invoke(_validate_StudentRemoteModel, fullname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getGender() {
		return _gender;
	}

	@Override
	public boolean isGender() {
		return _gender;
	}

	@Override
	public void setGender(boolean gender) {
		_gender = gender;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", boolean.class);

				method.invoke(_validate_StudentRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirthday() {
		return _birthday;
	}

	@Override
	public void setBirthday(Date birthday) {
		_birthday = birthday;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthday", Date.class);

				method.invoke(_validate_StudentRemoteModel, birthday);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_validate_StudentRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_validate_StudentRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBlog() {
		return _blog;
	}

	@Override
	public void setBlog(String blog) {
		_blog = blog;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setBlog", String.class);

				method.invoke(_validate_StudentRemoteModel, blog);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getMark() {
		return _mark;
	}

	@Override
	public void setMark(double mark) {
		_mark = mark;

		if (_validate_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validate_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setMark", double.class);

				method.invoke(_validate_StudentRemoteModel, mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getValidate_StudentRemoteModel() {
		return _validate_StudentRemoteModel;
	}

	public void setValidate_StudentRemoteModel(
		BaseModel<?> validate_StudentRemoteModel) {
		_validate_StudentRemoteModel = validate_StudentRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _validate_StudentRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_validate_StudentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Validate_StudentLocalServiceUtil.addValidate_Student(this);
		}
		else {
			Validate_StudentLocalServiceUtil.updateValidate_Student(this);
		}
	}

	@Override
	public Validate_Student toEscapedModel() {
		return (Validate_Student)ProxyUtil.newProxyInstance(Validate_Student.class.getClassLoader(),
			new Class[] { Validate_Student.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Validate_StudentClp clone = new Validate_StudentClp();

		clone.setStudentId(getStudentId());
		clone.setCode(getCode());
		clone.setFullname(getFullname());
		clone.setGender(getGender());
		clone.setBirthday(getBirthday());
		clone.setEmail(getEmail());
		clone.setAddress(getAddress());
		clone.setBlog(getBlog());
		clone.setMark(getMark());

		return clone;
	}

	@Override
	public int compareTo(Validate_Student validate_Student) {
		int value = 0;

		if (getStudentId() < validate_Student.getStudentId()) {
			value = -1;
		}
		else if (getStudentId() > validate_Student.getStudentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Validate_StudentClp)) {
			return false;
		}

		Validate_StudentClp validate_Student = (Validate_StudentClp)obj;

		long primaryKey = validate_Student.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{studentId=");
		sb.append(getStudentId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", fullname=");
		sb.append(getFullname());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", birthday=");
		sb.append(getBirthday());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", blog=");
		sb.append(getBlog());
		sb.append(", mark=");
		sb.append(getMark());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.tutorial.model.Validate_Student");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullname</column-name><column-value><![CDATA[");
		sb.append(getFullname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthday</column-name><column-value><![CDATA[");
		sb.append(getBirthday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>blog</column-name><column-value><![CDATA[");
		sb.append(getBlog());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mark</column-name><column-value><![CDATA[");
		sb.append(getMark());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentId;
	private String _code;
	private String _fullname;
	private boolean _gender;
	private Date _birthday;
	private String _email;
	private String _address;
	private String _blog;
	private double _mark;
	private BaseModel<?> _validate_StudentRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.tutorial.service.ClpSerializer.class;
}