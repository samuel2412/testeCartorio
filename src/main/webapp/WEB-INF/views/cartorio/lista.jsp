<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
    <h1>Lista de cartorios</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>Nome</td>
        </tr>
        <c:forEach items="${cartorios}" var="cartorio">
        <tr>
            <td>${cartorio.id}</td>
            <td><a href="${s:mvcUrl('CC#detalhe').arg(0, cartorio.id).build()}">${cartorio.nome}</a></td>
            
        </tr>
    </c:forEach>
    </table>
</body>
</html>