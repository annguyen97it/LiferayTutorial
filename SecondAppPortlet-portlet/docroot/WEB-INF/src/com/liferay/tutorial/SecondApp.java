package com.liferay.tutorial;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class SecondApp
 */
public class SecondApp extends MVCPortlet {
	/*
	 * @Override public void processAction(ActionRequest actionRequest,
	 * ActionResponse actionResponse) throws IOException, PortletException {
	 * 
	 * String name = ParamUtil.getString(actionRequest, "name");
	 * 
	 * String message = ""; if ( name == null || name.isEmpty()) {
	 * 
	 * message = "Hello World. No name"; } else {
	 * 
	 * message = "Hello " + name; } actionResponse.setRenderParameter("message",
	 * message);
	 * 
	 * super.processAction(actionRequest, actionResponse); }
	 */

	public void editName(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		String name = ParamUtil.getString(actionRequest, "name");

		String message = "";
		if (name == null || name.isEmpty()) {

			message = "Hello World. No name";
		} else {

			message = "Hello " + name;
		}
		actionResponse.setRenderParameter("message", message);
	}

	public void sendEmail(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		String email = ParamUtil.getString(actionRequest, "email");
		String subject = ParamUtil.getString(actionRequest, "subject");
		String content = ParamUtil.getString(actionRequest, "content");

		String message = "";
		if (email == null || email.isEmpty() || subject == null || subject.isEmpty() || content == null || content.isEmpty()) {

			System.out.println("No Email");
		} else {

			System.out.println("Sending to: " + email);
			System.out.println("Subject: " + subject);
			System.out.println("Content: " + content);
		}
	}
}
