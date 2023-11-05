<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Doctores</title>
    </head>
    <body>
        <h1>Gestión de Doctores</h1>
        <h2>Listado de Doctores</h2>

        <h1>Conexion: ${mensaje_conexion}</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>ID_Doctor</th>
                    <th>Nombre</th>
                    <th>Especialidad</th>
                    <th>Fecha_Inicio</th>
                    <th>Salario</th>
                    <th>ID_Direccion</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaDoctores}" var="item">
                    <tr>
                        <td><c:out value="${item.ID_Doctor}" /></td>
                        <td><c:out value="${item.nombre} ${item.apellido}" /></td>
                        <td><c:out value="${item.especialidad}" /></td>
                        <td><c:out value="${item.fechainicio}" /></td>
                        <td><c:out value="${item.salario}" /></td>
                        <td><c:out value="${item.ID_Direccion}" /></td>
                    </tr>
                </c:forEach>
            </tbody>            
        </table>
    </body>
</html>
