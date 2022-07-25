<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Curso</title>
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
	<header>
		<%@include file="head.jsp"%>
	</header>
	<main>
		<section class="container w60">
			<h3 class="centro">Edición de Curso</h3>
			<div class="px-4 py-5 my-5 text-center">
				<form
					action="${pageContext.request.contextPath}/estudiante?op=${op}"
					method="post" class="form">
					<div class="row pt-3">
						<div class="col">
							<label for="idEstudiante" class="form-label">Id</label> <input
								type="text" class="form-control" id="idEstudiante"
								name="idEstudiante" value="${estudiante.getIdEstudiante()}"
								readonly>
						</div>
						<div class="col">
							<label for="nombreEstudiante" class="form-label">Nombre
								Estudiante</label> <input type="text" class="form-control"
								id="nombreEstudiante" name="nombreEstudiante"
								value="${estudiante.getNombreEstudiante()}">
						</div>
					</div>
					<div class="row pt-3">
						<div class="col">
							<label for="rutEstudiante" class="form-label">Rut
								Estudiante</label> <input type="text" class="form-control"
								id="rutEstudiante" name="rutEstudiante"
								value="${estudiante.getRutEstudiante()}">
						</div>
						<div class="col">
							<label for="emailEstudiante" class="form-label">Email
								Estudiante:</label> <input type="email" class="form-control"
								id="emailEstudiante" name="emailEstudiante"
								value="${estudiante.getEmailEstudiante()}">
						</div>
					</div>
					<div class="col">
						<label for="telefonoEstudiante" class="form-label">Telefono
							Estudiante:</label> <input type="tel" class="form-control"
							id="telefonoEstudiante" name="telefonoEstudiante"
							value="${estudiante.getTelefonoEstudiante()}">
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
									href="${pageContext.request.contextPath}/estudiante">Volver</a>
							</button>
						</div>
					</div>
				</form>
			</div>
		</section>
	</main>
</body>
</html>