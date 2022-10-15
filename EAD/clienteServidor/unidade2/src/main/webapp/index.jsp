<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- importação das libs -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix ="sql" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Unidade 2 - framework JSTL</title>
</head>
<body>
	<!-- comunicação com o bd -->
	
	<sql:setDataSource 
		var="snapshot"
		driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/clienteServidor?useSSL=false&serverTimezone=UTC"
		user="root"
		password="Mad@2021"/>
		
		<!-- Escolhendo o que ler da tabela do bd -->
	<sql:query dataSource="${snapshot}" var="result">
		select 
		
		id_aluno, nome_aluno, rgm_aluno, email_aluno 
		
		from aluno_table
	</sql:query>
	
	<!-- montagem do "front" -->
	<table border="1" width=100%>
		<tr>
			<th>ID</th>
			<th>Nome do aluno</th>
			<th>Email do aluno</th>
			<th>RGM do aluno</th>
		</tr>
		
		
		<!-- mostrando na tela os dados do BD -->
		<c:forEach var="registro" items="${result.rows}">
			<tr>
				<td><c:out value="${registro.id_aluno}"/></td>
				<td><c:out value="${registro.nome_aluno}"/></td>
				<td><c:out value="${registro.email_aluno}"/></td>
				<td><c:out value="${registro.rgm_aluno}"/></td>
				
			</tr>
				
		</c:forEach>
	</table>

</body>
</html>