<%@ include file="/html/windowpopup/init.jsp" %>

<%
String parameter = ParamUtil.getString(renderRequest, "parameter");
%>

You value is: <%=parameter%>