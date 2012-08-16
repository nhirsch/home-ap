<%@ page import="autoplaza.DataSource" %>



<div class="fieldcontain ${hasErrors(bean: dataSourceInstance, field: 'query', 'error')} ">
	<label for="query">
		<g:message code="dataSource.query.label" default="Query" />
		
	</label>
	<g:textField name="query" value="${dataSourceInstance?.query}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: dataSourceInstance, field: 'resultado', 'error')} ">
	<label for="resultado">
		<g:message code="dataSource.resultado.label" default="Resultado" />
		
	</label>
	<g:textField name="resultado" value="${dataSourceInstance?.resultado}"/>
</div>


