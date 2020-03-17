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
 * Provides a wrapper for {@link Validate_StService}.
 *
 * @author annv
 * @see Validate_StService
 * @generated
 */
public class Validate_StServiceWrapper implements Validate_StService,
	ServiceWrapper<Validate_StService> {
	public Validate_StServiceWrapper(Validate_StService validate_StService) {
		_validate_StService = validate_StService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _validate_StService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_validate_StService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _validate_StService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Validate_StService getWrappedValidate_StService() {
		return _validate_StService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedValidate_StService(
		Validate_StService validate_StService) {
		_validate_StService = validate_StService;
	}

	@Override
	public Validate_StService getWrappedService() {
		return _validate_StService;
	}

	@Override
	public void setWrappedService(Validate_StService validate_StService) {
		_validate_StService = validate_StService;
	}

	private Validate_StService _validate_StService;
}