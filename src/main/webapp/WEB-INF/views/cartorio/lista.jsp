<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!doctype html>
<html lang="pt-br">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<!-- DataTable -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/w/bs4/dt-1.10.18/datatables.min.css" />
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" />

<!--fontawesome-->
	<script src="https://kit.fontawesome.com/d03c52ca4b.js" crossorigin="anonymous"></script>


<title>Cartórios</title>
</head>
<%@ include file="/WEB-INF/views/cabecalho.jsp"%>

<body>



	<div class="container-sm" style="margin-bottom: 35px;">
		<h3>Lista de cartórios</h3>


		<div class="row header" style="text-align: center;">
		</div>
		<table id="myTable" class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Endereço</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cartorios}" var="cartorio">
					<tr>
						<td>${cartorio.id}</td>
						<td>${cartorio.nome}</td>
						<td>${cartorio.endereco}</td>
						<td><a
							href="${s:mvcUrl('CC#detalhe').arg(0, cartorio.id).build()}">
						<button class="btn"
						style="background-color: DodgerBlue; border: none; color: white; padding: 12px 16px; font-size: 16px; cursor: pointer;">
						<i class="fas fa-info-circle">Detalhes</i>
						</button>
						</a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>




	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>

	<script type="text/javascript"
		src="https://cdn.datatables.net/w/bs4/dt-1.10.18/datatables.min.js"></script>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>



	<script>
		$(document).ready(function() {
			$('#myTable').dataTable();
		});
	</script>

</body>
</html>