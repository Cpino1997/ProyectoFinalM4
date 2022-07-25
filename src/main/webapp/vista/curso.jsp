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
	<div>
		<header>
			<%@include file="head.jsp"%>
		</header>
		<main>
			<section class="container w60">
				<div class="px-4 py-5 my-5 text-center">
					<h3 class="centro">Edición de Curso</h3>
					<form action="${pageContext.request.contextPath}/curso?op=${op}"
						method="post" class="form">
						<div class="row pt-3">
							<div class="col">
								<label for="idCurso" class="form-label">Id</label> <input
									type="number" class="form-control" id="idCurso" name="idCurso"
									value="${curso.getIdCurso()}" readonly>
							</div>
							<div class="col">
								<label for="codigoCurso" class="form-label">Codigo Curso</label>
								<input type="text" class="form-control" id="codigoCurso"
									name="codigoCurso" value="${curso.getCodigoCurso()}">
							</div>
						</div>
						<div class="row pt-3">
							<div class="col">
								<label for="nombreCurso" class="form-label">Nombre Curso</label>
								<input type="text" class="form-control" id="nombreCurso"
									name="nombreCurso" value="${curso.getNombreCurso()}">
							</div>
							<div class="col">
								<label for="idFacilitadorFK" class="form-label">Facilitador</label>
								<input type="number" class="form-control" id="idFacilitadorFK"
									name="idFacilitadorFK" value="${curso.getIdFacilitadorFK()}">
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
										href="${pageContext.request.contextPath}/curso">Volver</a>
								</button>
							</div>
					</form>
				</div>
			</section>
		</main>
	</div>

</body>
</html>