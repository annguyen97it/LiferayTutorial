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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.tutorial.service.http.MyStudentServiceSoap}.
 *
 * @author annv
 * @see com.liferay.tutorial.service.http.MyStudentServiceSoap
 * @generated
 */
public class MyStudentSoap implements Serializable {
	public static MyStudentSoap toSoapModel(MyStudent model) {
		MyStudentSoap soapModel = new MyStudentSoap();

		soapModel.setStudentId(model.getStudentId());
		soapModel.setCode(model.getCode());
		soapModel.setFullName(model.getFullName());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setGender(model.getGender());
		soapModel.setAddress(model.getAddress());

		return soapModel;
	}

	public static MyStudentSoap[] toSoapModels(MyStudent[] models) {
		MyStudentSoap[] soapModels = new MyStudentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MyStudentSoap[][] toSoapModels(MyStudent[][] models) {
		MyStudentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MyStudentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MyStudentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MyStudentSoap[] toSoapModels(List<MyStudent> models) {
		List<MyStudentSoap> soapModels = new ArrayList<MyStudentSoap>(models.size());

		for (MyStudent model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MyStudentSoap[soapModels.size()]);
	}

	public MyStudentSoap() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public boolean getGender() {
		return _gender;
	}

	public boolean isGender() {
		return _gender;
	}

	public void setGender(boolean gender) {
		_gender = gender;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	private long _studentId;
	private String _code;
	private String _fullName;
	private Date _birthday;
	private boolean _gender;
	private String _address;
}