<%@ include file="/html/ajaxinliferay/init.jsp"%>

<input type="text" name="searchInput" id="searchInput" />
<button type="button" onclick="javascript: onSearch();"
	name="searchButton" id="searchButton">Search</button>
<br />

<table width="100%">
	<tr>
		<td width="30%"><liferay-ui:message key="student-name" /></td>
		<td><span id="studentName" style="font-weight: bold;"></span></td>
	</tr>
	<tr>
		<td width="30%">
			<liferay-ui:message key="student-code" />
		</td>
		<td><span id="studentCode" style="font-weight:bold;"></span></td>
	</tr>
	<tr>
		<td width="30%">
			<liferay-ui:message key="student-gender" />
		</td>
		<td><span id="studentGender" style="font-weight:bold;"></span></td>
	</tr>
</table>

<portlet:resourceURL var="resourceURL"></portlet:resourceURL>
<aui:script use="aui-base,aui-node,aui-io-request,liferay-portlet-url">
	Liferay.provide(
			window,
			"onSearch",//ten ham js
			function(){
				var code = AUI().one('#searchInput').val();
				
				var resourceURL = '<%= resourceURL.toString()%>';
				
				var ajaxrequest = AUI().io.request(
					resourceURL,
					{
						data: {'<portlet:namespace/>code': code},
						dataType: 'json',
						method: 'post',
						autoLoad: false,
						sync: true,
						on: {
							success: function() {
								
								AUI().one('#studentName').text(this.get('responseData').name);
								AUI().one('#studentCode').text(this.get('responseData').code);
								AUI().one('#studentGender').text(this.get('responseData').gender);
							}
						}
					}
				);
				
				ajaxrequest.start();
			},['liferay-util-window']
	);
</aui:script>