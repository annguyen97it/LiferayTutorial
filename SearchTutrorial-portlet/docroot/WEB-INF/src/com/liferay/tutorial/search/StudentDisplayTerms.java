package com.liferay.tutorial.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;
//StudentDisplayTerms chứa các tham số phục vụ cho việc lọc dữ liệu

// DisplayTerms có: keywords , advancedSearch và andOperator
// DisplayTerms vẫn hiển thị từ khóa tìm kiếm khi có kết quả
public class StudentDisplayTerms extends DisplayTerms  {
	
	protected String code;
	protected String name;
	protected int gender;
	
	public StudentDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		code  = ParamUtil.getString(portletRequest, "code");
		name  = ParamUtil.getString(portletRequest, "name");
		gender  = ParamUtil.getInteger(portletRequest, "gender");
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
}
