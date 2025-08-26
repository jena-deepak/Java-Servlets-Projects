<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<style>
body {
	margin: 0;
	padding: 0;
	background: linear-gradient(90deg, rgb(14 11 1/ 76%), rgb(16 21 51/ 78%),
		rgb(28 5 59/ 80%), rgb(63 6 20/ 86%));
	font-family: Arial, sans-serif;
}

h1 {
	font-family: Arial, sans-serif;
	font-size: 40px;
	font-weight: 400;
	/*color: rgb(31, 5, 58);*/
	color: rgb(31, 5, 58);
	text-align: center;
	margin-top: 50px;
}

form {
	width: 75%;
	/*max-width: 500px;*/
	/*background: transparent;*/
	background: white;
	margin: 20px auto;
	padding: 20px;
	border-radius: 8px;
}

label {
	display: block;
	font-size: 20px;
	font-weight: bold;
	color: black;
	margin-bottom: 5px;
}

/*  input[type="text"],*/
input {
	width: 100%;
	padding: 10px;
	border-radius: 5px;
	border: 1px solid black;
	/*background: linear-gradient(90deg, rgb(18 3 18 / 4%), rgb(16 21 51 / 34%), rgb(43 4 94 / 43%), rgb(63 6 20 / 25%));*/
	background: transparent;
	font-size: 14px;
	margin-bottom: 20px;
	box-sizing: border-box;
	outline: none;
}

#reg-btn {
	background-color: #7a1f3ca6;
	border: none;
	/*color: #b69595;*/
	color: white;
	padding: 10px 25px;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
	display: inline-block;
}

#reg-btn:hover {
	background-color: #2c0511ed;
}

#reg-btn a {
	text-decoration: none;
	color: white;
	display: block;
}

.text-center {
	text-align: center;
}
h3{
	color:#4e4e78;
}
</style>
</head>
<body>
	<form action="home" method="GET" style="border: 2px solid black">
		<div>
			<p>
			<h3>Hi I am Deepak Jena, Developer of this Website .I have
				developed this  website for School , that will track the all the
				acticivities of all the Students, Staff, Teachers and also the
				School Management. It is very clean and well designed Site also user-friendly.</h3>
			</p>
		</div>
		<div class="text-center">
			<input type="submit" value="Back Home" id="reg-btn"
				style="width: 150px">
		</div>
	</form>



</body>
</html>

