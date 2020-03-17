package com.liferay.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.tutorial.model.MyStudent;
import com.liferay.tutorial.model.impl.MyStudentImpl;
import com.liferay.tutorial.service.MyStudentLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AjaxInLiferayPortlet
 */
public class AjaxInLiferayPortlet extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {
		String code = ParamUtil.getString(request, "code");

		MyStudent myStudent = null;
		myStudent = new MyStudentImpl();
		myStudent = MyStudentLocalServiceUtil.createMyStudent(Integer.parseInt(code));

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		jsonObject.put("student-name", myStudent != null ? myStudent.getFullName() : "");
		jsonObject.put("code", myStudent != null ? myStudent.getCode() : "");
		jsonObject.put("gender", myStudent != null && myStudent.getGender() == true ? "Nam" : "Nu");

		response.setContentType("text/javascript");
		response.setCharacterEncoding("UTF-8");

		PrintWriter printWriter;
		printWriter = response.getWriter();
		printWriter.write(jsonObject.toString());

		printWriter.flush();
		printWriter.close();
	}	
}
