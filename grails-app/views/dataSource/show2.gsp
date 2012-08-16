
<%@ page import="autoplaza.DataSource" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dataSource.label', default: 'DataSource')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-dataSource" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-dataSource" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list dataSource">
			
				<g:if test="${dataSourceInstance?.query}">
				<li class="fieldcontain">
					<span id="query-label" class="property-label"><g:message code="dataSource.query.label" default="Query" /></span>
					
						<span class="property-value" aria-labelledby="query-label"><g:fieldValue bean="${dataSourceInstance}" field="query"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dataSourceInstance?.resultado}">
				<li class="fieldcontain">
					<span id="resultado-label" class="property-label"><g:message code="dataSource.resultado.label" default="Resultado" /></span>
					
						<span class="property-value" aria-labelledby="resultado-label"><g:fieldValue bean="${dataSourceInstance}" field="resultado"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${dataSourceInstance?.id}" />
					<g:link class="edit" action="edit" id="${dataSourceInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
