<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Profes</title>
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
<script src="https://kit.fontawesome.com/81a2ed02b0.js" crossorigin="anonymous"></script>
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
			<section class="container-fluid w60">
				<div class="px-4 py-5 my-5 text-center">
					<h1 class="centro">Listado de Profes</h1>
					<table class="table table-striped " id="profes">
						<thead class="table-dark">
							<tr>
								<th>Id</th>
								<th>Rut</th>
								<th>Nombre</th>
								<th>Email</th>
								<th>Telefono</th>
								<th>valor hora</th>
								<th>banco</th>
								<th>ctaBancaria</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="f" items="${facilitadores}">
								<tr>
									<th><c:out value="${f.getIdFa()}"></c:out></th>
									<td><c:out value="${f.getRutFa()}"></c:out></td>
									<td><c:out value="${f.getNombreFa()}"></c:out></td>
									<td><c:out value="${f.getEmailFa()}"></c:out></td>
									<td><c:out value="${f.getTelefonoFa()}"></c:out></td>
									<td><c:out value="${f.getValorHora()}"></c:out></td>
									<td><c:out value="${f.getBancoFa()}"></c:out></td>
									<td><c:out value="${f.getCtaBancariaFa()}"></c:out></td>
									<td><a
										href="${pageContext.request.contextPath}/facilitador?op=edit&id=${c.getIdFa()}">
											<i class="fa-solid fa-pen-to-square"></i>
									</a> <a
										href="${pageContext.request.contextPath}/facilitador?op=del&id=${c.getIdFa()}">
											<i class="fa-solid fa-trash"></i>
									</a></td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
					<div class="izquierda">
						<a class="btn btn-primary"
							href="${pageContext.request.contextPath}/facilitador?op=new">Crear
							nuevo Profe</a>
					</div>
				</div>
			</section>



		</main>
	</div>
	<script>
$(document).ready( function () {
    $('#profes').DataTable();
} );
</script>

</body>
</html>