<%@ page import="autoplaza.Anuncio" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'anuncio.label', default: 'Anuncio')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>
<a href="#show-anuncio" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                              default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]"/></g:link></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="show-anuncio" class="content scaffold-show" role="main">
<h1><g:message code="default.show.label" args="[entityName]"/></h1>
<g:if test="${flash.message}">
    <div class="message" role="status">${flash.message}</div>
</g:if>
<ol class="property-list anuncio">

<g:if test="${anuncioInstance?.anuncioid}">
    <li class="fieldcontain">
        <span id="anuncioid-label" class="property-label"><g:message code="anuncio.anuncioid.label"
                                                                     default="Anuncioid"/></span>

        <span class="property-value" aria-labelledby="anuncioid-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                     field="anuncioid"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.identificador}">
    <li class="fieldcontain">
        <span id="identificador-label" class="property-label"><g:message code="anuncio.identificador.label"
                                                                         default="Identificador"/></span>

        <span class="property-value" aria-labelledby="identificador-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                         field="identificador"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.marca}">
    <li class="fieldcontain">
        <span id="marca-label" class="property-label"><g:message code="anuncio.marca.label" default="Marca"/></span>

        <span class="property-value" aria-labelledby="marca-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                 field="marca"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.modelo}">
    <li class="fieldcontain">
        <span id="modelo-label" class="property-label"><g:message code="anuncio.modelo.label" default="Modelo"/></span>

        <span class="property-value" aria-labelledby="modelo-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                  field="modelo"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.submodelo}">
    <li class="fieldcontain">
        <span id="submodelo-label" class="property-label"><g:message code="anuncio.submodelo.label"
                                                                     default="Submodelo"/></span>

        <span class="property-value" aria-labelledby="submodelo-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                     field="submodelo"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.anio}">
    <li class="fieldcontain">
        <span id="anio-label" class="property-label"><g:message code="anuncio.anio.label" default="Anio"/></span>

        <span class="property-value" aria-labelledby="anio-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                field="anio"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.precio}">
    <li class="fieldcontain">
        <span id="precio-label" class="property-label"><g:message code="anuncio.precio.label" default="Precio"/></span>

        <span class="property-value" aria-labelledby="precio-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                  field="precio"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.kilometraje}">
    <li class="fieldcontain">
        <span id="kilometraje-label" class="property-label"><g:message code="anuncio.kilometraje.label"
                                                                       default="Kilometraje"/></span>

        <span class="property-value" aria-labelledby="kilometraje-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                       field="kilometraje"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.fechaRegistro}">
    <li class="fieldcontain">
        <span id="fechaRegistro-label" class="property-label"><g:message code="anuncio.fechaRegistro.label"
                                                                         default="Fecha Registro"/></span>

        <span class="property-value" aria-labelledby="fechaRegistro-label"><g:formatDate
                date="${anuncioInstance?.fechaRegistro}"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.personaID}">
    <li class="fieldcontain">
        <span id="personaID-label" class="property-label"><g:message code="anuncio.personaID.label"
                                                                     default="Persona ID"/></span>

        <span class="property-value" aria-labelledby="personaID-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                     field="personaID"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.colorExterior}">
    <li class="fieldcontain">
        <span id="colorExterior-label" class="property-label"><g:message code="anuncio.colorExterior.label"
                                                                         default="Color Exterior"/></span>

        <span class="property-value" aria-labelledby="colorExterior-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                         field="colorExterior"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.colorInterior}">
    <li class="fieldcontain">
        <span id="colorInterior-label" class="property-label"><g:message code="anuncio.colorInterior.label"
                                                                         default="Color Interior"/></span>

        <span class="property-value" aria-labelledby="colorInterior-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                         field="colorInterior"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.descripcion}">
    <li class="fieldcontain">
        <span id="descripcion-label" class="property-label"><g:message code="anuncio.descripcion.label"
                                                                       default="Descripcion"/></span>

        <span class="property-value" aria-labelledby="descripcion-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                       field="descripcion"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.email}">
    <li class="fieldcontain">
        <span id="email-label" class="property-label"><g:message code="anuncio.email.label" default="Email"/></span>

        <span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                 field="email"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.empresaID}">
    <li class="fieldcontain">
        <span id="empresaID-label" class="property-label"><g:message code="anuncio.empresaID.label"
                                                                     default="Empresa ID"/></span>

        <span class="property-value" aria-labelledby="empresaID-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                     field="empresaID"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.equipamiento}">
    <li class="fieldcontain">
        <span id="equipamiento-label" class="property-label"><g:message code="anuncio.equipamiento.label"
                                                                        default="Equipamiento"/></span>

        <span class="property-value" aria-labelledby="equipamiento-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                        field="equipamiento"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.estado}">
    <li class="fieldcontain">
        <span id="estado-label" class="property-label"><g:message code="anuncio.estado.label" default="Estado"/></span>

        <span class="property-value" aria-labelledby="estado-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                  field="estado"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.estadoID}">
    <li class="fieldcontain">
        <span id="estadoID-label" class="property-label"><g:message code="anuncio.estadoID.label"
                                                                    default="Estado ID"/></span>

        <span class="property-value" aria-labelledby="estadoID-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                    field="estadoID"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.fechaModificacion}">
    <li class="fieldcontain">
        <span id="fechaModificacion-label" class="property-label"><g:message code="anuncio.fechaModificacion.label"
                                                                             default="Fecha Modificacion"/></span>

        <span class="property-value" aria-labelledby="fechaModificacion-label"><g:formatDate
                date="${anuncioInstance?.fechaModificacion}"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.financiamiento}">
    <li class="fieldcontain">
        <span id="financiamiento-label" class="property-label"><g:message code="anuncio.financiamiento.label"
                                                                          default="Financiamiento"/></span>

        <span class="property-value" aria-labelledby="financiamiento-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                          field="financiamiento"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.imagen}">
    <li class="fieldcontain">
        <span id="imagen-label" class="property-label"><g:message code="anuncio.imagen.label" default="Imagen"/></span>

        <span class="property-value" aria-labelledby="imagen-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                  field="imagen"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.marcaID}">
    <li class="fieldcontain">
        <span id="marcaID-label" class="property-label"><g:message code="anuncio.marcaID.label"
                                                                   default="Marca ID"/></span>

        <span class="property-value" aria-labelledby="marcaID-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                   field="marcaID"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.modeloID}">
    <li class="fieldcontain">
        <span id="modeloID-label" class="property-label"><g:message code="anuncio.modeloID.label"
                                                                    default="Modelo ID"/></span>

        <span class="property-value" aria-labelledby="modeloID-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                    field="modeloID"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.nombrePersona}">
    <li class="fieldcontain">
        <span id="nombrePersona-label" class="property-label"><g:message code="anuncio.nombrePersona.label"
                                                                         default="Nombre Persona"/></span>

        <span class="property-value" aria-labelledby="nombrePersona-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                         field="nombrePersona"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.submodeloID}">
    <li class="fieldcontain">
        <span id="submodeloID-label" class="property-label"><g:message code="anuncio.submodeloID.label"
                                                                       default="Submodelo ID"/></span>

        <span class="property-value" aria-labelledby="submodeloID-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                       field="submodeloID"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.telefono1}">
    <li class="fieldcontain">
        <span id="telefono1-label" class="property-label"><g:message code="anuncio.telefono1.label"
                                                                     default="Telefono1"/></span>

        <span class="property-value" aria-labelledby="telefono1-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                     field="telefono1"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.telefono2}">
    <li class="fieldcontain">
        <span id="telefono2-label" class="property-label"><g:message code="anuncio.telefono2.label"
                                                                     default="Telefono2"/></span>

        <span class="property-value" aria-labelledby="telefono2-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                     field="telefono2"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.telefono3}">
    <li class="fieldcontain">
        <span id="telefono3-label" class="property-label"><g:message code="anuncio.telefono3.label"
                                                                     default="Telefono3"/></span>

        <span class="property-value" aria-labelledby="telefono3-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                     field="telefono3"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.tipoAnuncioID}">
    <li class="fieldcontain">
        <span id="tipoAnuncioID-label" class="property-label"><g:message code="anuncio.tipoAnuncioID.label"
                                                                         default="Tipo Anuncio ID"/></span>

        <span class="property-value" aria-labelledby="tipoAnuncioID-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                         field="tipoAnuncioID"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.tipoMoneda}">
    <li class="fieldcontain">
        <span id="tipoMoneda-label" class="property-label"><g:message code="anuncio.tipoMoneda.label"
                                                                      default="Tipo Moneda"/></span>

        <span class="property-value" aria-labelledby="tipoMoneda-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                      field="tipoMoneda"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.transmision}">
    <li class="fieldcontain">
        <span id="transmision-label" class="property-label"><g:message code="anuncio.transmision.label"
                                                                       default="Transmision"/></span>

        <span class="property-value" aria-labelledby="transmision-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                       field="transmision"/></span>

    </li>
</g:if>

<g:if test="${anuncioInstance?.vestidura}">
    <li class="fieldcontain">
        <span id="vestidura-label" class="property-label"><g:message code="anuncio.vestidura.label"
                                                                     default="Vestidura"/></span>

        <span class="property-value" aria-labelledby="vestidura-label"><g:fieldValue bean="${anuncioInstance}"
                                                                                     field="vestidura"/></span>

    </li>
</g:if>

</ol>
<g:form>
    <fieldset class="buttons">
        <g:hiddenField name="id" value="${anuncioInstance?.id}"/>
        <g:link class="edit" action="edit" id="${anuncioInstance?.id}"><g:message code="default.button.edit.label"
                                                                                  default="Edit"/></g:link>
        <g:actionSubmit class="delete" action="delete"
                        value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                        onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"/>
    </fieldset>
</g:form>
</div>
</body>
</html>
