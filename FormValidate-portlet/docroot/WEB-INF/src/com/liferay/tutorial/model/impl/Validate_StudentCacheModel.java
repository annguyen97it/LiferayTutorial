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

import com.liferay.tutorial.model.Validate_Student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Validate_Student in entity cache.
 *
 * @author annv
 * @see Validate_Student
 * @generated
 */
public class Validate_StudentCacheModel implements CacheModel<Validate_Student>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{studentId=");
		sb.append(studentId);
		sb.append(", code=");
		sb.append(code);
		sb.append(", fullname=");
		sb.append(fullname);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", email=");
		sb.append(email);
		sb.append(", address=");
		sb.append(address);
		sb.append(", blog=");
		sb.append(blog);
		sb.append(", mark=");
		sb.append(mark);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Validate_Student toEntityModel() {
		Validate_StudentImpl validate_StudentImpl = new Validate_StudentImpl();

		validate_StudentImpl.setStudentId(studentId);

		if (code == null) {
			validate_StudentImpl.setCode(StringPool.BLANK);
		}
		else {
			validate_StudentImpl.setCode(code);
		}

		if (fullname == null) {
			validate_StudentImpl.setFullname(StringPool.BLANK);
		}
		else {
			validate_StudentImpl.setFullname(fullname);
		}

		validate_StudentImpl.setGender(gender);

		if (birthday == Long.MIN_VALUE) {
			validate_StudentImpl.setBirthday(null);
		}
		else {
			validate_StudentImpl.setBirthday(new Date(birthday));
		}

		if (email == null) {
			validate_StudentImpl.setEmail(StringPool.BLANK);
		}
		else {
			validate_StudentImpl.setEmail(email);
		}

		if (address == null) {
			validate_StudentImpl.setAddress(StringPool.BLANK);
		}
		else {
			validate_StudentImpl.setAddress(address);
		}

		if (blog == null) {
			validate_StudentImpl.setBlog(StringPool.BLANK);
		}
		else {
			validate_StudentImpl.setBlog(blog);
		}

		validate_StudentImpl.setMark(mark);

		validate_StudentImpl.resetOriginalValues();

		return validate_StudentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studentId = objectInput.readLong();
		code = objectInput.readUTF();
		fullname = objectInput.readUTF();
		gender = objectInput.readBoolean();
		birthday = objectInput.readLong();
		email = objectInput.readUTF();
		address = objectInput.readUTF();
		blog = objectInput.readUTF();
		mark = objectInput.readDouble();
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

		if (fullname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullname);
		}

		objectOutput.writeBoolean(gender);
		objectOutput.writeLong(birthday);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (blog == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(blog);
		}

		objectOutput.writeDouble(mark);
	}

	public long studentId;
	public String code;
	public String fullname;
	public boolean gender;
	public long birthday;
	public String email;
	public String address;
	public String blog;
	public double mark;
}