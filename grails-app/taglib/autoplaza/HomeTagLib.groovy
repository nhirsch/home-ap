package autoplaza

class HomeTagLib {
	static namespace ="ap"
	
	def header = { atr, body ->
		
		out << "<div class='header'>"
		out << "<div class='contenidoHeader'>"
		out << "	<div id='menuprin'>"
		out << "		<div class='treinta'>"
		out << "			<a href='http://www.autoplaza.com.mx/'><img src='${resource(dir: 'images', file: 'logo.png')}'/></a>"
		out << "		</div>"
		out << "		<div class='setenta'>"
		out << "			<div class='headermenu'>"
		out << "				<ul>"
		out << "					<li>"
		out << "						<a href='#' class='usados'>Pruebas</a>"
		out << "					</li>"
		out << "					<li>"
		out << "						<a href='#' class='nuevos'>Nuevos</a>"
		out << "					</li>"
		out << "					<li>"
		out << "						<a href='#' class='guiadeprecio'>Guía de precio</a>"
		out << "					</li>"
		out << "					<li>"
		out << "						<a href='#' class='noticias'>Noticias</a>"
		out << "					</li>"
		out << "					<li>"
		out << "						<a href='#' class='miautoplaza'>Mi Autoplaza</a>"
		out << "					</li>"
		out << "					<li>"
		out << "						<a href='#' class='contactanos'>Cont�ctanos</a>"
		out << "					</li>"
		out << "					<li>"
		out << "						<a href='#' class='movil'>Móvil</a>"
		out << "					</li>"
		out << "				</ul>"
		out << "			</div>"
		out << "		</div>"
		out << "	</div>"
		out << "</div>"
		out << "</div>"
		
		
	}
	
	def listadoVIP = { atr, body ->
		
		out << "<div class='publicados'>"
		out << "	<h1>Anuncios VIP más recientes</h1>"
			int renglon = 0
			for(int index=0; index<atr.Anuncios.size(); index++ )
			{
				if ((index)%4 == 0){ 
					renglon = 0
					out << "<div class='listado'>"
				}
				
				out << "<div class='listado${renglon+1}'>"
				out << "	<a href='http://www.autoplaza.com.mx/'><img src='${atr.Anuncios[index].urlFotoPrincipal}'/></a>"
				out << "	<div class='textolistado'>"
				out << "		<p>${atr.Anuncios[index].marca} ${atr.Anuncios[index].modelo} ${atr.Anuncios[index].anio}</p>"
				out << "		<div class='datosauto'>"
				out << "			<a href='http://www.autoplaza.com.mx/'>${atr.Anuncios[index].precio}M.N</a>"
				out << "			<p>${atr.Anuncios[index].Estado}</p>"
				out << "		</div>"
				out << "	</div>"
				out << "</div>"
				
				if ((index)%4 == 0){ 
					out << "</div>"
				 }
				renglon =  renglon + 1
				
				
				
			}
		out <<	"<div class='vertodosvip'>"
		out <<	"<a href='http://www.autoplaza.com.mx/' class='vertodas'>&#187; Ver todos los anuncios VIP</a>"
		out <<  "</div>"
		out << "</div>"

	
	}
	
	
	def footer = { atr, body ->
		
		out << "<div class='footergral'>"
		out << "<div class='contenidoFooter'>"
		out << "	<div class='footermenu'>"
		out << "		<ul>"
		out << "			<li>"
		out << "				<a href='http://www.autoplaza.com.mx/' class='preguntas'>Preguntas Frecuentes</a>"
		out << "			</li>"
		out << "			<li>"
		out << "				<a href='http://www.autoplaza.com.mx/' class='tips'>Preguntas Frecuentes</a>"
		out << "			</li>"
		out << "			<li>"
		out << "				<a href='http://www.autoplaza.com.mx/' class='tutoriales'>Preguntas Frecuentes</a>"
		out << "			</li>"
		out << "			<li>"
		out << "				<a class='nada'></a>"
		out << "			</li>"
		out << "			<li>"
		out << "				<a href='http://www.autoplaza.com.mx/' class='motos'>Preguntas Frecuentes</a>"
		out << "			</li>"
		out << "			<li>"
		out << "				<a href='http://www.autoplaza.com.mx/' class='accesorios'>Preguntas Frecuentes</a>"
		out << "			</li>"
		out << "			<li>"
		out << "				<a href='http://www.autoplaza.com.mx/' class='inmuebles'>Preguntas Frecuentes</a>"
		out << "			</li>"
		out << "			<li>"
		out << "				<a href='http://www.autoplaza.com.mx/' class='subastas'>Preguntas Frecuentes</a>"
		out << "			</li>"
		out << "		</ul>"
		out << "	</div>"
		out << "	<div class='footer1'>"
		out << "		<div class='a1footer'>"
		out << "			<p>"
		out << "				Juan Salvador Agraz No. 50 Piso 3, Col. Santa Fe. Deleg. Cuajimalpa de Morelos.C.P. 05300. Ciudad de México"
		out << "			</p>"
		out << "		</div>"
		out << "		<div class='b1footer'>"
		out << "			<p>"
		out << "				<b>Tel : (01 55) 4424 2000</b>"
		out << "				| con 100 Lineas"
		out << "			</p>"
		out << "		</div>"
		out << "		<div class='c1footer'>"
		out << "			<p>"
		out << "				Síguenos"
		out << "			</p>"
		out << "			<a href='http://www.autoplaza.com.mx/'><img src='${resource(dir: 'images', file: 'facebook.png')}'/></a><a href='http://www.autoplaza.com.mx/'><img src='${resource(dir: 'images', file: 'twitter.png')}'/></a>"
		out << "		</div>"
		out << "	</div>"
		out << "	<div class='footer2'>"
		out << "		<div class='a2footer'>"
		out << "			<p>"
		out << "				Autoplaza es solo un medio de contacto entre vendedor y comprador, La información publicada en Autoplaza es proporcionada por cada vendedor, la información de características y precios es responsabilidad delcliente. Siempre existe el riesgo de que la información cambie entre el tiempo que usted la recibe y la usa."
		out << "			</p>"
		out << "		</div>"
		out << "		<div class='b2footer'>"
		out << "			<a href='http://www.autoplaza.com.mx/'>"
		out << "			<img src='${resource(dir: 'images', file: 'iab.jpg')}'/></a><a href='http://www.autoplaza.com.mx/'>"
		out << "			<img src='${resource(dir: 'images', file: 'comscore.jpg')}'/></a><a href='http://www.autoplaza.com.mx/'>"
		out << "			<img src='${resource(dir: 'images', file: 'amipci.jpg')}'/></a>"
		out << "		</div>"
		out << "	</div>"
		out << "</div>"
		out << "</div>"
	}
}
