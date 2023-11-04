<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PanelAdmin</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <style>
        body {
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }

        .content {
            flex: 1;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 10px;
        }
    </style>
</head>
<body>
<div class="content">
    <!-- Contenido de tu página JSP -->
    <%@include file="MenuAdministrador.jsp" %>
    <div class="container">
        <h1>Veterinaria Gal-Cia</h1>
        <c:set var="usuario" value="${param.tfUsuario}" />

        <c:choose>
            <c:when test="${empty usuario}">
                <h3><strong>¡Bienvenido, Admin!</strong></h3>
            </c:when>
            <c:when test="${usuario == 'gerente'}">
                <c:choose>
                    <c:when test="${empty sessionScope.contador}">
                        <h3><strong>¡Bienvenido, Gerente!</strong></h3>
                        <c:set var="contador" value="0" scope="session" />
                    </c:when>
                    <c:otherwise>
                        <c:choose>
                            <c:when test="${contador % 3 == 0}">
                                <h3><strong>¡Bienvenido, Admin!</strong></h3>
                            </c:when>
                            <c:when test="${contador % 3 == 1}">
                                <h3><strong>¡Bienvenido, Gerente!</strong></h3>
                            </c:when>
                            <c:when test="${contador % 3 == 2}">
                                <h3><strong>¡Bienvenido, Usuario!</strong></h3>
                            </c:when>
                        </c:choose>
                        <c:set var="contador" value="${contador + 1}" scope="session" />
                    </c:otherwise>
                </c:choose>
            </c:when>
            <c:otherwise>
                <c:choose>
                    <c:when test="${empty sessionScope.contador}">
                        <h3><strong>¡Bienvenido, Admin!</strong></h3>
                        <c:set var="contador" value="0" scope="session" />
                    </c:when>
                    <c:otherwise>
                        <c:choose>
                            <c:when test="${contador % 3 == 0}">
                                <h3><strong>¡Bienvenido, Admin!</strong></h3>
                            </c:when>
                            <c:when test="${contador % 3 == 1}">
                                <h3><strong>¡Bienvenido, Gerente!</strong></h3>
                            </c:when>
                            <c:when test="${contador % 3 == 2}">
                                <h3><strong>¡Bienvenido, Usuario!</strong></h3>
                            </c:when>
                        </c:choose>
                        <c:set var="contador" value="${contador + 1}" scope="session" />
                    </c:otherwise>
                </c:choose>
            </c:otherwise>
        </c:choose>

        <h3>Menú de opciones</h3>
        <div>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/Guia_3_1">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/Guia_3_1?accion=Login">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/Guia_3_1?accion=citas">citas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/Guia_3_1?accion=historial">historial</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/Guia_3_1?accion=mascotas">mascotas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/Guia_3_1?accion=medicamento">medicamento</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/Guia_3_1?accion=empleado">empleado</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<!-- Footer -->
<%@include file="footer.jsp" %>
</footer>
</body>
</html>
