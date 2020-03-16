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
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setStudentAge(model.getStudentAge());
		soapModel.setStudentGender(model.getStudentGender());
		soapModel.setStudentAddress(model.getStudentAddress());

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

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public int getStudentAge() {
		return _studentAge;
	}

	public void setStudentAge(int studentAge) {
		_studentAge = studentAge;
	}

	public int getStudentGender() {
		return _studentGender;
	}

	public void setStudentGender(int studentGender) {
		_studentGender = studentGender;
	}

	public String getStudentAddress() {
		return _studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		_studentAddress = studentAddress;
	}

	private long _studentId;
	private String _firstName;
	private String _lastName;
	private int _studentAge;
	private int _studentGender;
	private String _studentAddress;
}