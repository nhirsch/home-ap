
<html>
<head>

</head>
<body>
<div>
	<h2>Aqui debe de ir todo del contenido del home, lo demas  seria el sitemesh</h2>
</div>
<ap:listadoVIP nombre="listado" Anuncios="${Anuncios}" />

<g:each in="${NavPrecio}">
    	<br>-${it.nombre}
		<br>-${it.cantidad}
		<br>-${it.url}
</g:each>

<g:each in="${NavMarca}">
    	<br>-${it.nombre}
		<br>-${it.cantidad}
		<br>-${it.url}
</g:each>

<g:each in="${Anuncios}">
    	<br>-${it.identificador}
		<br>-${it.marca}
		<br>-${it.modelo}
		<br>-${it.precio}
		<br>-${it.Estado}
		<br>-${it.anio}
		<br><img src="${it.urlFotoPrincipal}" />
</g:each>

		
</body>
</html>

