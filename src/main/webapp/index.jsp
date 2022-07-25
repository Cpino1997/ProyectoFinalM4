<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="es">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Proyecto Final Modulo 4">
<meta name="author" content="PinoLabs">
<title>Gestión de Alumnos</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link rel="icon" href=”favicon.ico” type=”image/x-icon” />
<link rel="shortcut icon" href=”favicon.ico” type=”image/x-icon” />
<style><%@include file="/static/css/estilos.css"%></style>
<script src="https://kit.fontawesome.com/b6cd2b590e.js" crossorigin="anonymous"></script>
</head>
<body onload="saludar()">
	<header>
		<%@include file="/vista/head.jsp"%>
	</header>
	<main>

		<div class="b-example-divider"></div>

		<section class="medio" id=Inicio>
			<div class="px-4 py-5 my-5 text-center">
				<img class="d-block mx-auto mb-4">
				<h1 class="display-5 fw-bold">Alumn Control</h1>
				<div class="col-lg-6 mx-auto">
					<p class="lead mb-4">Plataforma de Gestion para escuelas</p>
					<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
						<button type="button" class="btn btn-primary btn-lg px-4 gap-3">
							<a style="text-decoration: none; color: white;" href="#sobreNosotros">Leer Mas</a>
						</button>
					</div>
				</div>
			</div>
		</section>
		<div class="b-example-divider"></div>
		<section id=sobreNosotros>
			<div class="container col-xl-10 col-xxl-8 px-4 py-5">
				<div class="row align-items-center g-lg-5 py-5">
					<div class="col-lg-7 text-center text-lg-start">
						<h1 class="display-4 fw-bold lh-1 mb-3">Sobre Nosostros</h1>
						<p class="col-lg-10 fs-4">Nacimos de la necesidad de una
							plataforma de gestion escolar, donde nuestros usuarios puedan
							acceder de forma rapida, eficaz y segura a sus archivos.</p>
					</div>
					<div class="col-md-10 mx-auto col-lg-5">
						<form class="p-4 p-md-5 border rounded-3 ">
							<p class="centro">Solicita tu Prueba Ahora!</p>
							<div class="form-floating mb-3">
								<input type="text" class="form-control" id="iUsuario"
									placeholder="juan"> <label for="iUsuario">Usuario
									:</label>
							</div>
							<div class="form-floating mb-3">
								<input type="email" class="form-control" id="iCorreo"
									placeholder="juan@juan.cl"> <label for="iCorreo">Correo
									:</label>
							</div>
							<div class="form-floating mb-3">
								<label for="iTexto">Mensaje :</label>
								<textarea class="form-control" id="iTexto" rows="3"></textarea>
							</div>
							<br>
							<button class="w-100 btn btn-lg btn-primary" type="submit"
								onclick="enviarMensaje()">Enviar</button>
							<hr class="my-4">
							<small class="text-muted">Al precionar enviar, nos
								autorizas a obtener todos tus datos.</small>
						</form>
					</div>
				</div>
			</div>
		</section>

	</main>
	<footer>
		<%@include file="/vista/footer.jsp"%>
	</footer>
	<!-- JavaScript Bundle with Popper -->
	<script><%@include file="/static/js/main.js" %></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>
</html>