
<ap:bannerLayer name="bannerLayer" />
 ${BannersScript.Codigo}
<div class="contenidoContent">
	<div class="david">
		<div class="container">
			<div class="content">
				<div class="encabezado">
					<div class="banner1">
						<div class="interiorbanner1"><ap:bannerMega name="bannerMega" /></div>
					</div>
					<div class="anunciatuauto">
						<a href="http://www.autoplaza.com.mx/"><img src="${resource(dir: 'images', file: 'anuncia.jpg')}"/></a>
					</div>
				</div> 
				<div class="inicio">
				 
					<div class="buscador">
                    	tag lib del buscador
					</div>
					<div class="noticiasbox">
						<div class="interiornoticias">
							<h2>Noticias Relacionadas</h2>
							<a href="http://www.autoplaza.com.mx/"><img src="${resource(dir: 'images', file: 'noticiasauto.jpg')}"/></a>
							<a class="subtitulo" href="http://www.autoplaza.com.mx/">El nuevo Porsche 2013</a>
							<p>Poco a poco, Porsche va desvelando nuevos modelos, y haciendo gala de su gran reputación...</p>
                            <div class="vertodosvip">
								<a href="http://www.autoplaza.com.mx/" class="vertodasnoti">&#187; Leer noticia completa</a>
							</div>
						</div>
					</div>
					<div class="cajainterior">
						<div class="seleccion">
							<ap:menu Nombre="Marca" Menu="${NavMarca}" maxItems="10" />
							<ap:menu Nombre="Precio" Menu="${NavPrecio}" maxItems="10" />
							<ap:menu Nombre="Estado" Menu="${NavEstado}" maxItems="10" />
							<ap:menu Nombre="Año" Menu="${NavYear}" maxItems="10" />
						</div>
		    			<ap:listadoVIP nombre="listado" Anuncios="${Anuncios}" />
					</div>
					<div class="banner2">
						<h6>PUBLICIDAD</h6>
						<div class="interiorbanner2">
							    <ap:bannerBox name="bannerBox" />
						</div>
					</div>
					<div class="agencias"><h2>Grupos recomendados</h2></div>
                    <div class="agenciasygrupos">
						<div class="agenciasbotones">
							<a href="http://www.autoplaza.com.mx/"><img src="${resource(dir: 'images', file: 'grupo1.jpg')}"/></a>
							<a href="http://www.autoplaza.com.mx/"><img src="${resource(dir: 'images', file: 'grupo2.jpg')}"/></a>
							<a href="http://www.autoplaza.com.mx/"><img src="${resource(dir: 'images', file: 'grupo3.jpg')}"/></a>
							<a href="http://www.autoplaza.com.mx/"><img src="${resource(dir: 'images', file: 'grupo4.jpg')}"/></a>
                            <div class="vertodosvip">
                            	<a href="http://www.autoplaza.com.mx/" class="vertodasagen">&#187; Ver todas</a>
							</div>
						</div>
					</div>
					<div class="banner2">
						<h6>PUBLICIDAD</h6>
						<div class="interiorbanner2"><ap:bannerBox2 name="bannerBox2" /></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>







		


