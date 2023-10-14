

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                <div><h3><strong>¡Bienvenido, <c:out value="${usuario}" />!</strong></h3></div>
                <% String usuario = request.getParameter("tfUsuario"); %>
                <h2><strong>Bienvenido, <%= usuario %>!</strong></h2>
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
        <footer>
            <%@include file="footer.jsp" %>
        </footer>
    </body>
</html>

