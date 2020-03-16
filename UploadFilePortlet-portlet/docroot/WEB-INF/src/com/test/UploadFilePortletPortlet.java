package com.test;

import java.io.File;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class UploadFilePortletPortlet
 */
public class UploadFilePortletPortlet extends MVCPortlet {
	public void uploadFile(ActionRequest actionRequest, ActionResponse actionRespoinse){
		UploadPortletRequest uploadPortletRequest  = PortalUtil.getUploadPortletRequest(actionRequest);
		File file = uploadPortletRequest.getFile("fileData");
		if( file != null && file.getName() != null ){
			System.out.println("File name: " + file.getName());
		}
		else{
			System.out.println("Cannot get file data");
		}
	}

}
