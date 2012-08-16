<%@ page import="autoplaza.Anuncio" %>



<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'anuncioid', 'error')} required">
    <label for="anuncioid">
        <g:message code="anuncio.anuncioid.label" default="Anuncioid"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="anuncioid" value="${fieldValue(bean: anuncioInstance, field: 'anuncioid')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'identificador', 'error')} required">
    <label for="identificador">
        <g:message code="anuncio.identificador.label" default="Identificador"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="identificador" required="" value="${anuncioInstance?.identificador}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'marca', 'error')} required">
    <label for="marca">
        <g:message code="anuncio.marca.label" default="Marca"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="marca" required="" value="${anuncioInstance?.marca}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'modelo', 'error')} required">
    <label for="modelo">
        <g:message code="anuncio.modelo.label" default="Modelo"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="modelo" required="" value="${anuncioInstance?.modelo}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'submodelo', 'error')} required">
    <label for="submodelo">
        <g:message code="anuncio.submodelo.label" default="Submodelo"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="submodelo" required="" value="${anuncioInstance?.submodelo}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'anio', 'error')} required">
    <label for="anio">
        <g:message code="anuncio.anio.label" default="Anio"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="anio" type="number" value="${anuncioInstance.anio}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'precio', 'error')} required">
    <label for="precio">
        <g:message code="anuncio.precio.label" default="Precio"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="precio" value="${fieldValue(bean: anuncioInstance, field: 'precio')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'kilometraje', 'error')} required">
    <label for="kilometraje">
        <g:message code="anuncio.kilometraje.label" default="Kilometraje"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="kilometraje" type="number" value="${anuncioInstance.kilometraje}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'fechaRegistro', 'error')} required">
    <label for="fechaRegistro">
        <g:message code="anuncio.fechaRegistro.label" default="Fecha Registro"/>
        <span class="required-indicator">*</span>
    </label>
    <g:datePicker name="fechaRegistro" precision="day" value="${anuncioInstance?.fechaRegistro}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'personaID', 'error')} required">
    <label for="personaID">
        <g:message code="anuncio.personaID.label" default="Persona ID"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="personaID" value="${fieldValue(bean: anuncioInstance, field: 'personaID')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'colorExterior', 'error')} ">
    <label for="colorExterior">
        <g:message code="anuncio.colorExterior.label" default="Color Exterior"/>

    </label>
    <g:textField name="colorExterior" value="${anuncioInstance?.colorExterior}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'colorInterior', 'error')} ">
    <label for="colorInterior">
        <g:message code="anuncio.colorInterior.label" default="Color Interior"/>

    </label>
    <g:textField name="colorInterior" value="${anuncioInstance?.colorInterior}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'descripcion', 'error')} ">
    <label for="descripcion">
        <g:message code="anuncio.descripcion.label" default="Descripcion"/>

    </label>
    <g:textField name="descripcion" value="${anuncioInstance?.descripcion}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'email', 'error')} ">
    <label for="email">
        <g:message code="anuncio.email.label" default="Email"/>

    </label>
    <g:textField name="email" value="${anuncioInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'empresaID', 'error')} required">
    <label for="empresaID">
        <g:message code="anuncio.empresaID.label" default="Empresa ID"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="empresaID" type="number" value="${anuncioInstance.empresaID}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'equipamiento', 'error')} ">
    <label for="equipamiento">
        <g:message code="anuncio.equipamiento.label" default="Equipamiento"/>

    </label>
    <g:textField name="equipamiento" value="${anuncioInstance?.equipamiento}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'estado', 'error')} ">
    <label for="estado">
        <g:message code="anuncio.estado.label" default="Estado"/>

    </label>
    <g:textField name="estado" value="${anuncioInstance?.estado}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'estadoID', 'error')} required">
    <label for="estadoID">
        <g:message code="anuncio.estadoID.label" default="Estado ID"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="estadoID" type="number" value="${anuncioInstance.estadoID}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'fechaModificacion', 'error')} required">
    <label for="fechaModificacion">
        <g:message code="anuncio.fechaModificacion.label" default="Fecha Modificacion"/>
        <span class="required-indicator">*</span>
    </label>
    <g:datePicker name="fechaModificacion" precision="day" value="${anuncioInstance?.fechaModificacion}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'financiamiento', 'error')} required">
    <label for="financiamiento">
        <g:message code="anuncio.financiamiento.label" default="Financiamiento"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="financiamiento" type="number" value="${anuncioInstance.financiamiento}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'imagen', 'error')} ">
    <label for="imagen">
        <g:message code="anuncio.imagen.label" default="Imagen"/>

    </label>
    <g:textField name="imagen" value="${anuncioInstance?.imagen}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'marcaID', 'error')} required">
    <label for="marcaID">
        <g:message code="anuncio.marcaID.label" default="Marca ID"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="marcaID" type="number" value="${anuncioInstance.marcaID}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'modeloID', 'error')} required">
    <label for="modeloID">
        <g:message code="anuncio.modeloID.label" default="Modelo ID"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="modeloID" type="number" value="${anuncioInstance.modeloID}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'nombrePersona', 'error')} ">
    <label for="nombrePersona">
        <g:message code="anuncio.nombrePersona.label" default="Nombre Persona"/>

    </label>
    <g:textField name="nombrePersona" value="${anuncioInstance?.nombrePersona}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'submodeloID', 'error')} required">
    <label for="submodeloID">
        <g:message code="anuncio.submodeloID.label" default="Submodelo ID"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="submodeloID" value="${fieldValue(bean: anuncioInstance, field: 'submodeloID')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'telefono1', 'error')} ">
    <label for="telefono1">
        <g:message code="anuncio.telefono1.label" default="Telefono1"/>

    </label>
    <g:textField name="telefono1" value="${anuncioInstance?.telefono1}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'telefono2', 'error')} ">
    <label for="telefono2">
        <g:message code="anuncio.telefono2.label" default="Telefono2"/>

    </label>
    <g:textField name="telefono2" value="${anuncioInstance?.telefono2}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'telefono3', 'error')} ">
    <label for="telefono3">
        <g:message code="anuncio.telefono3.label" default="Telefono3"/>

    </label>
    <g:textField name="telefono3" value="${anuncioInstance?.telefono3}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'tipoAnuncioID', 'error')} required">
    <label for="tipoAnuncioID">
        <g:message code="anuncio.tipoAnuncioID.label" default="Tipo Anuncio ID"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field name="tipoAnuncioID" type="number" value="${anuncioInstance.tipoAnuncioID}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'tipoMoneda', 'error')} ">
    <label for="tipoMoneda">
        <g:message code="anuncio.tipoMoneda.label" default="Tipo Moneda"/>

    </label>
    <g:textField name="tipoMoneda" value="${anuncioInstance?.tipoMoneda}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'transmision', 'error')} ">
    <label for="transmision">
        <g:message code="anuncio.transmision.label" default="Transmision"/>

    </label>
    <g:textField name="transmision" value="${anuncioInstance?.transmision}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: anuncioInstance, field: 'vestidura', 'error')} ">
    <label for="vestidura">
        <g:message code="anuncio.vestidura.label" default="Vestidura"/>

    </label>
    <g:textField name="vestidura" value="${anuncioInstance?.vestidura}"/>
</div>

