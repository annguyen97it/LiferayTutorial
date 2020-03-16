<%@ include file="/html/servicebuildermvc/init.jsp" %>

<h1>Liferay Service Builder/ Student CRUD Operations</h1>
<portlet:renderURL var="addStudent">
	<portlet:param name="mvcPath" value="/html/servicebuildermvc/add_student.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="updateStudent">
	<portlet:param name="mvcPath" value="/html/servicebuildermvc/update_student.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="displayStudent">
	<portlet:param name="mvcPath" value="/html/servicebuildermvc/display_student.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="deleteStudent">
	<portlet:param name="mvcPath" value="/html/servicebuildermvc/delete_student.jsp"/>
</portlet:renderURL>
<br/>

<p><a href="<%=addStudent.toString()%>">Add Student</a></p>
<p><a href="<%=updateStudent.toString()%>">Update Student</a></p>
<p><a href="<%=deleteStudent.toString()%>">Delete Student</a></p>
<p><a href="<%=displayStudent.toString()%>">Display Student</a></p>