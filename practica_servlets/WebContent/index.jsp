<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Usuario</title>
</head>
<body>
<h1> Datos del Usuario </h1>
<form action="SvUsuarios" method="post">
	<p><label>DNI: </label><input type="text" name="dni"></p>
	<p><label>Nombre: </label><input type="text" name="nombre"></p>
    <p><label>Apellido: </label><input type="text" name="apellido"></p>
    <p><label>Teléfono: </label><input type="text" name="telefono"></p>
    <button type="submit">Enviar</button>
</form>
</body>
</html>