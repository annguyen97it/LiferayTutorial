<%@ include file="/html/servicebuildermvc/init.jsp"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors" %>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages" %>

<portlet:renderURL var="homeURL"></portlet:renderURL>
<portlet:actionURL name="addStudent" var="addStudentActionURL" windowState="normal" />

<%
	if(SessionMessages.contains(renderRequest.getPortletSession(), "student-add-success")){
%>
<liferay-ui:success key="student-add-success" message="Student information have been added successfully." />
<%	
	}
%>
<h2>Add Student</h2>
<a href="<%=homeURL.toString()%>">Home</a><br/><br/>
<form action="<%=addStudentActionURL %>" name="studentForm" method="POST" >
<b>First Name</b><br/>
<input type="text" name='<portlet:namespace/>firstName' id='<portlet:namespace/>firstName' /><br/>

<b>Last  Name</b><br/>
<input type="text" name='<portlet:namespace/>lastName' id='<portlet:namespace/>lastName' /><br/>

<b>Age</b><br/>
<input type="text" name="<portlet:namespace/>studentAge" id='<portlet:namespace/>studentAge' /><br/>

<b>Gender</b><br/>
<input type="radio" name='<portlet:namespace/>studentGender' value="1" />Male<br/>
<input type="radio" name='<portlet:namespace/>studentGender' value="0" />Female<br/>

<b>Address</b><br/>
<textarea rows="4" col="50" name='<portlet:namespace />studentAddress'></textarea><br/>
<input type="submit" name='addStudent' id="addStudent" value="Add Student" />
</form>