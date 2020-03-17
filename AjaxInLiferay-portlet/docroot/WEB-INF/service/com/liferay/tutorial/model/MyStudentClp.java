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
import com.liferay.tutorial.service.MyStudentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author annv
 */
public class MyStudentClp extends BaseModelImpl<MyStudent> implements MyStudent {
	public MyStudentClp() {
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
		attributes.put("fullName", getFullName());
		attributes.put("birthday", getBirthday());
		attributes.put("gender", getGender());
		attributes.put("address", getAddress());

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

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		Boolean gender = (Boolean)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}
	}

	@Override
	public long getStudentId() {
		return _studentId;
	}

	@Override
	public void setStudentId(long studentId) {
		_studentId = studentId;

		if (_myStudentRemoteModel != null) {
			try {
				Class<?> clazz = _myStudentRemoteModel.getClass();

				Method method = clazz.getMethod("setStudentId", long.class);

				method.invoke(_myStudentRemoteModel, studentId);
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

		if (_myStudentRemoteModel != null) {
			try {
				Class<?> clazz = _myStudentRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_myStudentRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullName() {
		return _fullName;
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_myStudentRemoteModel != null) {
			try {
				Class<?> clazz = _myStudentRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_myStudentRemoteModel, fullName);
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

		if (_myStudentRemoteModel != null) {
			try {
				Class<?> clazz = _myStudentRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthday", Date.class);

				method.invoke(_myStudentRemoteModel, birthday);
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

		if (_myStudentRemoteModel != null) {
			try {
				Class<?> clazz = _myStudentRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", boolean.class);

				method.invoke(_myStudentRemoteModel, gender);
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

		if (_myStudentRemoteModel != null) {
			try {
				Class<?> clazz = _myStudentRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_myStudentRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMyStudentRemoteModel() {
		return _myStudentRemoteModel;
	}

	public void setMyStudentRemoteModel(BaseModel<?> myStudentRemoteModel) {
		_myStudentRemoteModel = myStudentRemoteModel;
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

		Class<?> remoteModelClass = _myStudentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_myStudentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MyStudentLocalServiceUtil.addMyStudent(this);
		}
		else {
			MyStudentLocalServiceUtil.updateMyStudent(this);
		}
	}

	@Override
	public MyStudent toEscapedModel() {
		return (MyStudent)ProxyUtil.newProxyInstance(MyStudent.class.getClassLoader(),
			new Class[] { MyStudent.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MyStudentClp clone = new MyStudentClp();

		clone.setStudentId(getStudentId());
		clone.setCode(getCode());
		clone.setFullName(getFullName());
		clone.setBirthday(getBirthday());
		clone.setGender(getGender());
		clone.setAddress(getAddress());

		return clone;
	}

	@Override
	public int compareTo(MyStudent myStudent) {
		int value = 0;

		value = getFullName().compareTo(myStudent.getFullName());

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

		if (!(obj instanceof MyStudentClp)) {
			return false;
		}

		MyStudentClp myStudent = (MyStudentClp)obj;

		long primaryKey = myStudent.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{studentId=");
		sb.append(getStudentId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", birthday=");
		sb.append(getBirthday());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.tutorial.model.MyStudent");
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
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthday</column-name><column-value><![CDATA[");
		sb.append(getBirthday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentId;
	private String _code;
	private String _fullName;
	private Date _birthday;
	private boolean _gender;
	private String _address;
	private BaseModel<?> _myStudentRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.tutorial.service.ClpSerializer.class;
}