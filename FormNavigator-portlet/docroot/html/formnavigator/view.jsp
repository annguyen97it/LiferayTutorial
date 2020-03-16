<%@ include file="/html/formnavigator/init.jsp" %>

<%
//Tạo các mục lớn 
String[] CATEGORY_NAMES = new String[]{"basic-information", "education", "hobbies"};

//Tạo các mục con
String[] basic_information = new String[]{"profile", "contacts"};
String[] education = new String[]{"university", "high_school" };
String[] hobbies = new String[]{"sport", "entertaiment"};
//các mục
String[][] categorySections = {basic_information, education, hobbies};
%>

<portlet:actionURL name="updateStudent" var="formActionURL" />

<aui:form method="post" name="fm" action="<%=formActionURL %>">
	<liferay-ui:form-navigator categorySections="<%=categorySections %>" categoryNames="<%=CATEGORY_NAMES%>"
	 jspPath="/html/formnavigator/subjsp/" />
	
</aui:form>