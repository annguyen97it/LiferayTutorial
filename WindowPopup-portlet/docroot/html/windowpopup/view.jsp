<%@ include file="/html/windowpopup/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>

<portlet:renderURL var="buttonURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="mvcPath" value="/html/windowpopup/detail.jsp" />
	
	<portlet:param name="parameter" value="My Button" />
</portlet:renderURL>
<aui:button value="Button" type="Button" useDialog="true" href="<%=buttonURL.toString() %>" />

<portlet:renderURL var="navItemURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/html/windowpopup/detail.jsp"/>
	<portlet:param name="parameter" value="My NavItem"/>
</portlet:renderURL>
<aui:nav-item title="NavItem" label="Nav Item" useDialog="true" href="<%=navItemURL.toString() %>" />

<portlet:renderURL var="iconURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/html/windowpopup/detail.jsp"/>
	<portlet:param name="parameter" value="My NavItem"/>
</portlet:renderURL>
<liferay-ui:icon iconCssClass="icon-edit" message="Icon" label="true" useDialog="true" url="<%=iconURL.toString() %>" />