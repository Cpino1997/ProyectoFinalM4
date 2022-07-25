<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Profe</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<style>
<%@include file="/static/css/estilos.css" %>
</style>
</head>
<body>
	<div>
		<header>
			<%@include file="head.jsp"%>
		</header>
		<main>
			<section class="container medio w60">
				<div class="px-4 py-5 my-5 text-center">
					<h3 class="centro">Edición de Profes</h3>
					<form
						action="${pageContext.request.contextPath}/facilitador?op=${op}"
						method="post" class="form">
						<div class="row pt-3">
							<div class="col">
								<label for="idFa" class="form-label">Id</label> <input
									type="number" class="form-control" id="idFa" name="idFa"
									value="${facilitador.getIdFa()}" readonly>
							</div>
							<div class="col">
								<label for="rutFa" class="form-label">rut</label> <input
									type="text" class="form-control" id="rutFa" name="rutFa"
									value="${facilitador.rutFa()}">
							</div>
							<div class="col">
								<label for="nombreFa" class="form-label">nombre</label> <input
									type="text" class="form-control" id="nombreFa" name="nombreFa"
									value="${facilitador.getNombreFa()}">
							</div>
						</div>
						<div class="row pt-3">
							<div class="col">
								<label for="emailFa" class="form-label">email</label> <input
									type="email" class="form-control" id="emailFa" name="emailFa"
									value="${facilitador.getEmailFa()}">
							</div>
							<div class="col">
								<label for="telefonoFa" class="form-label">telefono</label> <input
									type="tel" class="form-control" id="telefonoFa"
									name="telefonoFa" value="${facilitador.getTelefonoFa()}">
							</div>
							<div class="col">
								<label for="valorHora" class="form-label">valor Hora</label> <input
									type="text" class="form-control" id="valorHora" name=valorHora
									value="${facilitador.getValorHora()}">
							</div>
						</div>
						<div class="row pt-3">
							<div class="col">
								<label for="bancoFa" class="form-label">Banco</label> <input
									type="text" class="form-control" id="bancoFa" name=bancoFa
									value="${facilitador.getBancoFa()}">
							</div>
							<div class="col">
								<label for="ctaBancariaFa" class="form-label">Numero De
									Cuenta</label> <input type="text" class="form-control"
									id="ctaBancariaFa" name=ctaBancariaFa
									value="${facilitador.getCtaBancariaFa()}">
							</div>
						</div>
						<div class="row pt-3">
							<div class="col">
								<button type="submit" class="btn btn-primary">Guardar</button>
							</div>
							<div class="col-auto">
								<button type="reset" class="btn btn-secondary">Limpiar</button>
							</div>
							<div class="col-auto">
								<button type="reset" class="btn btn-success">
									<a style="text-decoration: none; color: white"
										href="${pageContext.request.contextPath}/facilitador">Volver</a>
								</button>
							</div>
						</div>
					</form>
				</div>
			</section>
		</main>
	</div>

</body>
</html>