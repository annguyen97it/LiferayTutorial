package com.liferay.tutorial;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.tutorial.model.Student;
import com.liferay.tutorial.model.impl.StudentImpl;
import com.liferay.tutorial.service.StudentLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ServiceBuilderMVCPortlet
 */
public class ServiceBuilderMVCPortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(ServiceBuilderMVCPortlet.class);
	
	public void addStudent(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			String firstName = ParamUtil.getString(actionRequest, "firstName");
			String lastName = ParamUtil.getString(actionRequest, "lastName");
			int studentAge = ParamUtil.getInteger(actionRequest, "studentAge");
			int studentGender = ParamUtil.getInteger(actionRequest,
					"studentGender");
			String studentAddress = ParamUtil.getString(actionRequest,
					"studentAddress");
			// add student record
			// create primary key
			long studentId = CounterLocalServiceUtil.increment();
			// create student persistance object
			Student student = null;
			student = new StudentImpl();
			student = StudentLocalServiceUtil.createStudent(studentId);
			// fill the data in presistance object
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setStudentAge(studentAge);
			student.setStudentGender(studentGender);
			student.setStudentAddress(studentAddress);
			// Add student persistance object to database student table
			student = StudentLocalServiceUtil.addStudent(student);
			if (student != null) {
				// adding success mesage
				SessionMessages.add(actionRequest.getPortletSession(),
						"student-add-success");
				_log.info("Student have been added successfylly");
			} else {
				SessionErrors.add(actionRequest.getPortletSession(),
						"student-add-error");
				_log.info("There is an error in adding Student");
			}
			// navigate to add student jsp page
			actionResponse.setRenderParameter("mvcPath",
					"/html/servicebuildermvc/add_student.jsp");
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"student-add-error");
			e.printStackTrace();
		}
	}

	public void deleteStudent(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			long studentId = ParamUtil.getLong(actionRequest, "studentId");
			Student student = StudentLocalServiceUtil.deleteStudent(studentId);

			if (student != null) {
				// adding success mesage
				SessionMessages.add(actionRequest.getPortletSession(),
						"student-delete-success");
				_log.info("Student have been delete successfylly");
			} else {
				SessionErrors.add(actionRequest.getPortletSession(),
						"student-delete-error");
				_log.info("There is an Error in delete Student");
			}

			// navigate to add student jsp page
			actionResponse.setRenderParameter("mvcPath",
					"/html/servicebuildermvc/delete_student.jsp");
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"student-delete-error");
			e.printStackTrace();
		}
	}

	public void updateStudent(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		try {
			long studentId = ParamUtil.getLong(actionRequest, "studentId");
			String firstName = ParamUtil.getString(actionRequest, "firstName");
			String lastName = ParamUtil.getString(actionRequest, "lastName");
			int studentAge = ParamUtil.getInteger(actionRequest, "studentAge");
			int studentGender = ParamUtil.getInteger(actionRequest,
					"studentGender");
			String studentAddress = ParamUtil.getString(actionRequest,
					"studentAddress");
			Student student = StudentLocalServiceUtil.getStudent(studentId);
			if (student != null) {
				// fill update information
				student.setFirstName(firstName);
				student.setLastName(lastName);
				student.setStudentAge(studentAge);
				student.setStudentGender(studentGender);
				student.setStudentAddress(studentAddress);
				student = StudentLocalServiceUtil.updateStudent(student);
				if (student != null) {
					// adding success message
					SessionMessages.add(actionRequest.getPortletSession(),
							"student-update-success");
					_log.info("Student have been update successfylly");
				} else {
					SessionErrors.add(actionRequest.getPortletSession(),
							"student-update-error");
					_log.info("There is an Error in delete Student");
				}
			} else {
				SessionErrors.add(actionRequest.getPortletSession(),
						"student-update-error");
				_log.info("Could not find student");
			}

			// navigate to add student jsp page
			actionResponse.setRenderParameter("mvcPath",
					"/html/servicebuildermvc/update_student.jsp");
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"student-update-error");
			e.printStackTrace();
		}
	}

	public void getStudent(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			long studentId = ParamUtil.getLong(actionRequest, "studentId");
			String cmd = ParamUtil.getString(actionRequest, "cmd");
			Student student = StudentLocalServiceUtil.getStudent(studentId);
			if (student != null) {
				// adding success message
				actionRequest.setAttribute("studentObject", student);
				_log.info("Student have been foundn for specific  primary key successfylly");
			} else {
				_log.info("Student not found");
			}
			
			if(cmd.equals("DELETE")){
				//navigate to add student jsp page
				actionResponse.setRenderParameter("mvcPath","/html/servicebuildermvc/delete_student.jsp");
			}
			if(cmd.equals("UPDATE")){
				// navigate to add student jsp page
				actionResponse.setRenderParameter("mvcPath", "/html/servicebuildermvc/update_student.jsp");
			}
			if(cmd.equals("VIEW")){
				// navigate to add student jsp page
				actionResponse.setRenderParameter("mvcPath", "/html/servicebuildermvc/display_student.jsp");
			}
		} catch (Exception e) {
			SessionErrors.add(actionRequest.getPortletSession(),
					"student-add-error");
			e.printStackTrace();
		}
	}
	
}
