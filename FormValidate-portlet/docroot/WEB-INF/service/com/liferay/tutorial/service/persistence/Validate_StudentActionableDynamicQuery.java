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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.tutorial.model.Validate_Student;
import com.liferay.tutorial.service.Validate_StudentLocalServiceUtil;

/**
 * @author annv
 * @generated
 */
public abstract class Validate_StudentActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public Validate_StudentActionableDynamicQuery() throws SystemException {
		setBaseLocalService(Validate_StudentLocalServiceUtil.getService());
		setClass(Validate_Student.class);

		setClassLoader(com.liferay.tutorial.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("studentId");
	}
}