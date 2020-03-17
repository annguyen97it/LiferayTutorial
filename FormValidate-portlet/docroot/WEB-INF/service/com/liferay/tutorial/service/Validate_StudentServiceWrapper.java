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

package com.liferay.tutorial.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Validate_StudentService}.
 *
 * @author annv
 * @see Validate_StudentService
 * @generated
 */
public class Validate_StudentServiceWrapper implements Validate_StudentService,
	ServiceWrapper<Validate_StudentService> {
	public Validate_StudentServiceWrapper(
		Validate_StudentService validate_StudentService) {
		_validate_StudentService = validate_StudentService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _validate_StudentService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_validate_StudentService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _validate_StudentService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Validate_StudentService getWrappedValidate_StudentService() {
		return _validate_StudentService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedValidate_StudentService(
		Validate_StudentService validate_StudentService) {
		_validate_StudentService = validate_StudentService;
	}

	@Override
	public Validate_StudentService getWrappedService() {
		return _validate_StudentService;
	}

	@Override
	public void setWrappedService(
		Validate_StudentService validate_StudentService) {
		_validate_StudentService = validate_StudentService;
	}

	private Validate_StudentService _validate_StudentService;
}