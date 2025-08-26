<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">

<style>
nav {
	/*height:70px;*/
	background-color: rgb(37 5 103/ 100%);
	color: wheat;
	position: sticky !important;
	top: 0;
}
</style>
</head>
<body>
	<nav class="navbar">
		<div class="nav-brand ps-2">
			<h1>SAIEC</h1>
		</div>
		<div>
			<ul class="navbar nav">
				<li class="nav-item text-white p-2"><a href="Home.jsp" class="nav-link text-white">
				<i class="bi bi-house-door-fill"></i> Home</a></li>
				<li class="nav-item text-white p-2"> <i class="bi bi-mortarboard-fill"></i> Scholarship</li>
				<li class="nav-item text-white p-2"><a href="About.jsp" class="nav-link text-white"><i class="bi bi-info-circle-fill"></i> About us</a></li>
				<li class="nav-item text-white p-2"><i class="bi bi-person-fill"></i> Profile</li>
			</ul>
		</div>
	</nav>

</body>
</html>