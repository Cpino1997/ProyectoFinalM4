<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Estudiantes</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link
	href="http://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css"
	rel="stylesheet">
<script
	src="http://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script src="https://kit.fontawesome.com/81a2ed02b0.js"
	crossorigin="anonymous"></script>
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
					<h1 class="centro">Listado de Estudiantes</h1>
					<table class="table table-striped" id="estudiantes">
						<thead class="table-dark">
							<tr>
								<th>Id</th>
								<th>Nombre</th>
								<th>Rut</th>
								<th>Email</th>
								<th>Telefono</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="e" items="${estudiantes}">
								<tr>
									<th><c:out value="${e.getIdEstudiante()}"></c:out></th>
									<td><c:out value="${e.getNombreEstudiante()}"></c:out></td>
									<td><c:out value="${e.getRutEstudiante()}"></c:out></td>
									<td><c:out value="${e.getEmailEstudiante()}"></c:out></td>
									<td><c:out value="${e.getTelefonoEstudiante()}"></c:out></td>
									<td><a
										href="${pageContext.request.contextPath}/estudiante?op=edit&id=${e.getIdEstudiante()}">
											<i class="fa-solid fa-pen-to-square"></i>
									</a> <a
										href="${pageContext.request.contextPath}/estudiante?op=del&id=${e.getIdEstudiante()}">
											<i class="fa-solid fa-trash"></i>
									</a></td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
					<div class="izquierda">
						<a class="btn btn-primary"
							href="${pageContext.request.contextPath}/estudiante?op=new">Crear
							nuevo Estudiante</a>
					</div>
				</div>
			</section>



		</main>
	</div>
	<script>
$(document).ready( function () {
    $('#estudiantes').DataTable();
} );
</script>

</body>
</html>