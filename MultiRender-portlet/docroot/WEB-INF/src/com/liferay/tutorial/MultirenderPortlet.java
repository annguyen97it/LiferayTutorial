package com.liferay.tutorial;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class MultirenderPortlet
 */
public class MultirenderPortlet extends MVCPortlet {
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
		//Trả data về view có <portlet:actionURL name="editName"...>
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
		
		//Chính là ActionRender
		actionResponse.setRenderParameter("mvcPath", "/html/multirender/view_email.jsp");//Khác p.thức trên là trả về view khác
	}
}
