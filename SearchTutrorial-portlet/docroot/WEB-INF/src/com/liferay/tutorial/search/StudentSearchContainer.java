package com.liferay.tutorial.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.tutorial.model.Student;

//StudentSearchContainer: chứa các thông tin số lượng các bản ghi trên một trang, 
//thông điệp khi không tìm thấy kết quả, tiêu đề của các cột, 
//sắp xếp dữ liệu theo cột
public class StudentSearchContainer extends SearchContainer<Student> {
	static List<String> headerNames = new ArrayList<>();
	static Map<String, String> orderableHeaders = new HashMap<>();
	
	//cài đặt tiêu đề của các cột
	static{
		headerNames.add("code");
		headerNames.add("name");
		headerNames.add("gender");
		headerNames.add("address");
	}
	
	public static final String EMPTY_RESULTS_MESSAGE = "Khong tim thay ket qua nao";
	
	public StudentSearchContainer(PortletRequest portletRequest, PortletURL iteratorURL){
		super(portletRequest, new StudentDisplayTerms(portletRequest), 
				new StudentSearchTerms(portletRequest), DEFAULT_CUR_PARAM, DEFAULT_DELTA, iteratorURL,
				headerNames, EMPTY_RESULTS_MESSAGE);
		//DEFAULT_CUR_PARAM: Lưu số bản ghi
		//DEFAULT_DELTA: số bản ghi/ trang
		//headerNames: tiêu đề của các cột
		//EMPTY_RESULTS_MESSAGE: thông điệp khi có kết quả tìm kiếm
		
		StudentDisplayTerms displayTerms = (StudentDisplayTerms) getDisplayTerms();
		
		iteratorURL.setParameter("code", displayTerms.getCode());
		iteratorURL.setParameter("name", displayTerms.getName());
		iteratorURL.setParameter("gender", String.valueOf((displayTerms.getGender())));
	}
}
