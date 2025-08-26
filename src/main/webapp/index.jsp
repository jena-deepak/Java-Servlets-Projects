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
	color:wheat;
	text-align: center;
	margin-top: 50px;
}

form {
	width: 25%;
	max-width: 500px;
	/*background: transparent;*/
	background:white;
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

#reg-btn{
	background-color: #7a1f3ca6;
	border: none;
	/*color: #b69595;*/
	color:white;
	
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
</style>
</head>
<body>
	<h1>SAIEC</h1>
	<form action="dirLogin">
	<input type="submit" value="Existing Student" id="reg-btn">
	<div><h4>!! New Students Register Below !!</h4></div>
	</form>
	<form action="register"
		method="GET" style="border: 2px solid black">
		<div>
			<label for="id" >Id</label> <input type="text" name="id" id="id" required>
		</div>
		<div>
			<label for="name">Name</label> <input type="text" name="name" id="name" required>
		</div>
		<div>
			<label for="age">Age</label> <input type="number" name="age" id="age" required>
		</div>
		<div>
			<label for="password">Password</label> <input type="password" name="password" id="password" required>
		</div>
		<div>
			<label for="confirmPassword">Confirm Password</label> <input type="password" name="confirmPassword" id="confirmPassword" required>
		</div>
		<div class="text-center">
			<input type="submit" value="REGISTER"  id="reg-btn" style="width:150px">
		</div>
	</form>
	
	
	
</body>
</html>

