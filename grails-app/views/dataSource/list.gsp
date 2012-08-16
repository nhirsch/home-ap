
<%@ page import="autoplaza.DataSource" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dataSource.label', default: 'DataSource')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-dataSource" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-dataSource" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="query" title="${message(code: 'dataSource.query.label', default: 'Query')}" />
					
						<g:sortableColumn property="resultado" title="${message(code: 'dataSource.resultado.label', default: 'Resultado')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dataSourceInstanceList}" status="i" var="dataSourceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${dataSourceInstance.id}">${fieldValue(bean: dataSourceInstance, field: "query")}</g:link></td>
					
						<td>${fieldValue(bean: dataSourceInstance, field: "resultado")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dataSourceInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
