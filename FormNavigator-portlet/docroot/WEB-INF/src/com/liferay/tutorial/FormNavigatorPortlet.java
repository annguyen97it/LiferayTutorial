package com.liferay.tutorial;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class FormNavigatorPortlet
 */
public class FormNavigatorPortlet extends MVCPortlet {

	// Hàm lấy thông tin SinhVien nhập vào ở form sang
	public void updateStudent(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		System.out.println("\n============= Profile: =============\n\n");

		String name = ParamUtil.getString(actionRequest, "name");
		System.out.println("name: " + name);

		int age = ParamUtil.getInteger(actionRequest, "age");
		System.out.println("age: " + age);

		boolean gender = ParamUtil.getBoolean(actionRequest, "gender");
		System.out.println("gender: " + gender);

		System.out.println("\n============= Contacts: =============\n\n");

		String address = ParamUtil.getString(actionRequest, "address");
		System.out.println("address: " + address);

		int telphone = ParamUtil.getInteger(actionRequest, "telphone");
		System.out.println("telphone: " + telphone);

		String homephone = ParamUtil.getString(actionRequest, "homephone");
		System.out.println("homephone: " + homephone);
		
		
		System.out.println("\n============= Entertaiment: =============\n\n");

		String favoriteMovie = ParamUtil.getString(actionRequest, "favoriteMovie");
		System.out.println("favoriteMovie: " + favoriteMovie);

		int favoriteSong = ParamUtil.getInteger(actionRequest, "favoriteSong");
		System.out.println("favoriteSong: " + favoriteSong);

		String favoriteBook = ParamUtil.getString(actionRequest, "favoriteBook");
		System.out.println("favoriteBook: " + favoriteBook);
		
		System.out.println("\n============= Hight School: =============\n\n");

		String hightSchoolName = ParamUtil.getString(actionRequest, "hightSchoolName");
		System.out.println("hightSchoolName: " + hightSchoolName);
		
		System.out.println("\n============= Sport: =============\n\n");

		String favoriteSport = ParamUtil.getString(actionRequest, "favoriteSport");
		System.out.println("favoriteSport: " + favoriteSport);
		
		System.out.println("\n============= University: =============\n\n");

		String universityName = ParamUtil.getString(actionRequest, "universityName");
		System.out.println("universityName: " + universityName);
		String universitySubject = ParamUtil.getString(actionRequest, "universitySubject");
		System.out.println("universitySubject: " + universitySubject);

	}

}
