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
 * Provides a wrapper for {@link Validate_StLocalService}.
 *
 * @author annv
 * @see Validate_StLocalService
 * @generated
 */
public class Validate_StLocalServiceWrapper implements Validate_StLocalService,
	ServiceWrapper<Validate_StLocalService> {
	public Validate_StLocalServiceWrapper(
		Validate_StLocalService validate_StLocalService) {
		_validate_StLocalService = validate_StLocalService;
	}

	/**
	* Adds the validate_ st to the database. Also notifies the appropriate model listeners.
	*
	* @param validate_St the validate_ st
	* @return the validate_ st that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validate_St addValidate_St(
		com.liferay.tutorial.model.Validate_St validate_St)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.addValidate_St(validate_St);
	}

	/**
	* Creates a new validate_ st with the primary key. Does not add the validate_ st to the database.
	*
	* @param studentId the primary key for the new validate_ st
	* @return the new validate_ st
	*/
	@Override
	public com.liferay.tutorial.model.Validate_St createValidate_St(
		long studentId) {
		return _validate_StLocalService.createValidate_St(studentId);
	}

	/**
	* Deletes the validate_ st with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the validate_ st
	* @return the validate_ st that was removed
	* @throws PortalException if a validate_ st with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validate_St deleteValidate_St(
		long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.deleteValidate_St(studentId);
	}

	/**
	* Deletes the validate_ st from the database. Also notifies the appropriate model listeners.
	*
	* @param validate_St the validate_ st
	* @return the validate_ st that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validate_St deleteValidate_St(
		com.liferay.tutorial.model.Validate_St validate_St)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.deleteValidate_St(validate_St);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _validate_StLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validate_StModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validate_StModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.tutorial.model.Validate_St fetchValidate_St(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.fetchValidate_St(studentId);
	}

	/**
	* Returns the validate_ st with the primary key.
	*
	* @param studentId the primary key of the validate_ st
	* @return the validate_ st
	* @throws PortalException if a validate_ st with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validate_St getValidate_St(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.getValidate_St(studentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the validate_ sts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.tutorial.model.impl.Validate_StModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of validate_ sts
	* @param end the upper bound of the range of validate_ sts (not inclusive)
	* @return the range of validate_ sts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.tutorial.model.Validate_St> getValidate_Sts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.getValidate_Sts(start, end);
	}

	/**
	* Returns the number of validate_ sts.
	*
	* @return the number of validate_ sts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getValidate_StsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.getValidate_StsCount();
	}

	/**
	* Updates the validate_ st in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param validate_St the validate_ st
	* @return the validate_ st that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.tutorial.model.Validate_St updateValidate_St(
		com.liferay.tutorial.model.Validate_St validate_St)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _validate_StLocalService.updateValidate_St(validate_St);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _validate_StLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_validate_StLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _validate_StLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Validate_StLocalService getWrappedValidate_StLocalService() {
		return _validate_StLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedValidate_StLocalService(
		Validate_StLocalService validate_StLocalService) {
		_validate_StLocalService = validate_StLocalService;
	}

	@Override
	public Validate_StLocalService getWrappedService() {
		return _validate_StLocalService;
	}

	@Override
	public void setWrappedService(
		Validate_StLocalService validate_StLocalService) {
		_validate_StLocalService = validate_StLocalService;
	}

	private Validate_StLocalService _validate_StLocalService;
}