<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Cursos</title>
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
	<script src="https://kit.fontawesome.com/b6cd2b590e.js" crossorigin="anonymous"></script>
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
					<h1 class="centro">Listado de Cursos</h1>
					<table class="table table-striped" id="cursos">
						<thead class="table-dark">
							<tr>
								<th>Id</th>
								<th>Codigo</th>
								<th>Nombre</th>
								<th>Facilitador</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${cursos}">
								<tr>
									<th><c:out value="${c.getIdCurso()}"></c:out></th>
									<td><c:out value="${c.getCodigoCurso()}"></c:out></td>
									<td><c:out value="${c.getNombreCurso()}"></c:out></td>
									<td><c:out value="${c.getIdFacilitadorFK()}"></c:out></td>
									<td><a
										href="${pageContext.request.contextPath}/curso?op=edit&id=${c.getIdCurso()}">
											<i class="fa-solid fa-pen-to-square"></i>
									</a> <a
										href="${pageContext.request.contextPath}/curso?op=del&id=${c.getIdCurso()}">
											<i class="fa-solid fa-trash"></i>
									</a></td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
					<div class="izquierda">
						<a class="btn btn-primary"
							href="${pageContext.request.contextPath}/curso?op=new">Crear
							nuevo Curso</a>
					</div>
				</div>
			</section>



		</main>
	</div>
	<script>
$(document).ready( function () {
    $('#cursos').DataTable();
} );
</script>

</body>
</html>