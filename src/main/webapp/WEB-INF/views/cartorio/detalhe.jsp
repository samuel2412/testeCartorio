<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
    <h1>Cartorio ${cartorio.nome}</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>Nome</td>
        </tr>
        <tr>
            <td>${cartorio.id}</td>
            <td>${cartorio.nome}</td>
        </tr>
    </table>
</body>
</html>