<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!-- tag para inserir o jstl --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<h2>Lista de estudantes</h2>
		<table class="tabela">
			<tr >
				<th>Nome</th>
				<th>Sobrenome</th>
				<th>E-mail</th>
				<th>Matrícula</th>
			</tr>
			<c:forEach var="listStudents" items="${student_list}">
					<tr class = "itens">
						<td>${listStudents.name}</td>
						<td>${listStudents.lastName}</td>
						<td>${listStudents.email}</td>
						<td>${listStudents.rgm}</td>
					</tr>
			</c:forEach>
		</table>
</body>
</html>