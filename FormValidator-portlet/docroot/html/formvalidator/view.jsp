<%@ include file="/html/formvalidator/init.jsp"%>

<portlet:renderURL var="addStudentURL">
	<portlet:param name="mvcPath" value="/html/formvalidator/edit.jsp"/>
</portlet:renderURL>
<liferay-ui:icon iconCssClass="plus" message="Add a Student" label="true" url="<%= addStudentURL %>"/>
