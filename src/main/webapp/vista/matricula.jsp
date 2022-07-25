
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Matricula</title>
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
			<section class="container w60">
				<div class="px-4 py-5 my-5 text-center">
					<h1 class="centro">Listado de Matriculas</h1>
					<form
						action="${pageContext.request.contextPath}/matricula?op=${op}"
						method="post" class="form">
						<div class="row pt-3">
							<div class="col">
								<label for="idMatricula" class="form-label">Id</label> <input
									type="number" class="form-control" id="idMatricula"
									name="idMatricula" value="${matricula.getIdMatricula()}"
									readonly>
							</div>
							<div class="col">
								<label for="idCurso" class="form-label">Codigo Curso</label> <input
									type="text" class="form-control" id="idCurso" name="idCurso"
									value="${matricula.getIdCursoFK()}">
							</div>
						</div>
						<div class="row pt-3">
							<div class="col">
								<label for="idEstudiante" class="form-label">Codigo
									Estudiante</label> <input type="text" class="form-control"
									id="idEstudiante" name="idEstudiante"
									value="${matricula.getIdEstudianteFK()}">
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
									<a style="text-decoration: none; color: white;"
										href="${pageContext.request.contextPath}/matricula">Volver</a>
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