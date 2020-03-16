<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<portlet:actionURL name="uploadFile" var="uploadFileURL" />
<aui:form action="<%=uploadFileURL %>" name="fm" method="post" enctype="multipart/form-data" >
	<aui:input name="fileData" type="file" label="Upload File"></aui:input>
	<aui:button type="submit">Upload File</aui:button>
</aui:form>