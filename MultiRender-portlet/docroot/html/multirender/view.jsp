<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<%
	String message = ParamUtil.getString(renderRequest, "message");
%>

This is the
<b>Second Portlet</b>
; portlet in View mode...
<br />
<%=message%>

<portlet:renderURL var="editURL">
	<portlet:param name="mvcPath" value="/html/multirender/edit.jsp" />
</portlet:renderURL>

<p>
	<a href="<%=editURL%>">Enter Name</a>
</p>

<portlet:renderURL var="sendEmailURL">
	<portlet:param name="mvcPath" value="/html/multirender/email.jsp" />
</portlet:renderURL>
<p>
	<a href="<%=sendEmailURL%>">Enter Email</a>
</p>