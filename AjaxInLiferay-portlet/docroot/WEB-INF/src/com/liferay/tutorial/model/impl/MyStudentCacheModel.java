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

package com.liferay.tutorial.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.tutorial.model.MyStudent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MyStudent in entity cache.
 *
 * @author annv
 * @see MyStudent
 * @generated
 */
public class MyStudentCacheModel implements CacheModel<MyStudent>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{studentId=");
		sb.append(studentId);
		sb.append(", code=");
		sb.append(code);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", address=");
		sb.append(address);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MyStudent toEntityModel() {
		MyStudentImpl myStudentImpl = new MyStudentImpl();

		myStudentImpl.setStudentId(studentId);

		if (code == null) {
			myStudentImpl.setCode(StringPool.BLANK);
		}
		else {
			myStudentImpl.setCode(code);
		}

		if (fullName == null) {
			myStudentImpl.setFullName(StringPool.BLANK);
		}
		else {
			myStudentImpl.setFullName(fullName);
		}

		if (birthday == Long.MIN_VALUE) {
			myStudentImpl.setBirthday(null);
		}
		else {
			myStudentImpl.setBirthday(new Date(birthday));
		}

		myStudentImpl.setGender(gender);

		if (address == null) {
			myStudentImpl.setAddress(StringPool.BLANK);
		}
		else {
			myStudentImpl.setAddress(address);
		}

		myStudentImpl.resetOriginalValues();

		return myStudentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studentId = objectInput.readLong();
		code = objectInput.readUTF();
		fullName = objectInput.readUTF();
		birthday = objectInput.readLong();
		gender = objectInput.readBoolean();
		address = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(studentId);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		objectOutput.writeLong(birthday);
		objectOutput.writeBoolean(gender);

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}
	}

	public long studentId;
	public String code;
	public String fullName;
	public long birthday;
	public boolean gender;
	public String address;
}