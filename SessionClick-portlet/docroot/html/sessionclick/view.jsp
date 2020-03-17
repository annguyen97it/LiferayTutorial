
<!-- SessionClick cach2: Dung JSP Code + Javascript (Không load lại trang=> hay hơn cách 1) -->
<%@ include file="/html/init.jsp"%>
<%@ page import="com.liferay.portal.util.SessionClicks"%>

<%
	String status = SessionClicks.get(request, "status", "");
%>
<aui:row>
	<div class='<%=status != null && status.equals("hide") ? "hide" : ""%>'
		id="divId">
		<img alt="annguyen.com"
			src="<%=request.getContextPath()+"/images/annguyen.png"%>">
	</div>
</aui:row>
<aui:row>
	<aui:col span="4">
		<portlet:renderURL var="refreshURL"></portlet:renderURL>
		<aui:a href="<%=refreshURL.toString()%>">Refresh</aui:a>
	</aui:col>
	<aui:col span="4">
		<aui:a href='<%="javascript:setStatus(\'show\');"%>'>Show</aui:a>
	</aui:col>
	<aui:col span="4">
		<aui:a href='<%="javascript:setStatus(\'hide\');"%>'>Hide</aui:a>
	</aui:col>
</aui:row>

<aui:script use="aui-base,aui-node,aui-toggler,liferay-store">
	Liferay.provide(window, 'setStatus',//Tên  hàm
	function(stt) {
		var divTag = AUI().one('#divId');
		if (stt == 'show') {
			divTag.removeClass('hide');
		} else if (stt == 'hide') {
			divTag.addClass('hide');
		}
		Liferay.Store('status', stt);
	});

	
</aui:script>