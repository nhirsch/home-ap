<%@ page import="autoplaza.Anuncio" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'anuncio.label', default: 'Anuncio')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<a href="#list-anuncio" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                              default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="list-anuncio" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <table>
        <thead>
        <tr>

            <g:sortableColumn property="anuncioid"
                              title="${message(code: 'anuncio.anuncioid.label', default: 'Anuncioid')}"/>

            <g:sortableColumn property="identificador"
                              title="${message(code: 'anuncio.identificador.label', default: 'Identificador')}"/>

            <g:sortableColumn property="marca" title="${message(code: 'anuncio.marca.label', default: 'Marca')}"/>

            <g:sortableColumn property="modelo" title="${message(code: 'anuncio.modelo.label', default: 'Modelo')}"/>

            <g:sortableColumn property="submodelo"
                              title="${message(code: 'anuncio.submodelo.label', default: 'Submodelo')}"/>

            <g:sortableColumn property="anio" title="${message(code: 'anuncio.anio.label', default: 'Anio')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${anuncioInstanceList}" status="i" var="anuncioInstance">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                <td><g:link action="show"
                            id="${anuncioInstance.id}">${fieldValue(bean: anuncioInstance, field: "anuncioid")}</g:link></td>

                <td>${fieldValue(bean: anuncioInstance, field: "identificador")}</td>

                <td>${fieldValue(bean: anuncioInstance, field: "marca")}</td>

                <td>${fieldValue(bean: anuncioInstance, field: "modelo")}</td>

                <td>${fieldValue(bean: anuncioInstance, field: "submodelo")}</td>

                <td>${fieldValue(bean: anuncioInstance, field: "anio")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <g:paginate total="${anuncioInstanceTotal}"/>
    </div>
</div>
</body>
</html>
