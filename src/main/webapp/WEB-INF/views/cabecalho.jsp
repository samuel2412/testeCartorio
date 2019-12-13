<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<header
	class="navbar navbar-expand navbar-dark flex-column flex-md-row bd-navbar"
	style="margin-bottom: 50px;">

	<nav class="navbar fixed-top" style="background-color: #000000;">


		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link"
					href="${s:mvcUrl('HC#listar').build()}"
					>Home</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${s:mvcUrl('CC#form').build()}"
					>Cadastro</a></li>
					<li class="nav-item"><a class="nav-link"
					href="${s:mvcUrl('CC#listaJSON').build()}"
					>JSON</a></li>
			</ul>

		</div>
	</nav>


</header>
