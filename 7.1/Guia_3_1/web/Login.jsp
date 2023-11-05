<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Iniciar Sesion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container p-4">
            <div class="row">
                <div class="col-md-4 mx-auto">
                    <div class="card">
                        <div class="card-body">
                            <div class="row justify-content-center">
                                <%-- Forma legible de imprimir la fecha usando Scriptlets --%>
                                <%
                                    java.util.Date fechaActual = new java.util.Date();
                                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
                                    String fechaActualLegible = sdf.format(fechaActual);
                                %>
                                <%--<p>Fecha actual: <strong><%= fechaActualLegible %></strong></p><br>--%>
                            </div>
                            <div class="row justify-content-center">
                                <h1>Inicio de sesion</h1>
                            </div>
                            <div clas="row justify-content-center">
                                <form method="post" action="/Guia_3_1/ServletPrincipal?accion=Login" id="formulario">
                                    <div id="resultadoLogin" class="form-group"></div>

                                    <div id="resultadoLogin" class="form-group"></div>
                                    <c:set var="fechaActual" value="<%= new java.util.Date() %>" />
                                    <c:set var="formatoFecha" value="dd/MM/YYYY" />
                                    <div><label><strong>
                                                <c:out value="Fecha Actual: " />
                                                <fmt:formatDate value='${fechaActual}' pattern='${formatoFecha}' />
                                    </strong></label></div>
                                    
                                    <div class="form-group">
                                        <div><label>Usuario: </label></div>
                                        <input type="text" class="form-control" name="tfUsuario" id="idtfUsuario" placeholder="Digite su usuario">
                                    </div>

                                    <div class="form-group">
                                        <div><label>Contraseña:  </label></div>
                                        <input type="password" class="form-control" name="tfContrasenia" id="idtfContrasenia" placeholder="Digite su contraseña">
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-success btn-block">Iniciar sesion</button>
                                    </div>
                                </form>
                            </div>
                            <div>
                                <button class="btn btn-primary btn-block" onclick="regresar()">Regresar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script>
            function regresar() {
                window.history.back();
            }
        </script>

    </body>
</html>
