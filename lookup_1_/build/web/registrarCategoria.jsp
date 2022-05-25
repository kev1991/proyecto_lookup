<%-- 
    Document   : registrarCategoria
    Created on : 30/03/2022, 07:27:45 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Categoria</title>
    </head>
    <body>
    <center>
        <h1>Registrar Categoria</h1>
        <form method="post" action="CategoriCuestionario">
            <table>
                <tr>
                    Nombre Categoria <br>
                <input type="text" name="txtNombreCat"><br><br>              
                </tr>
            </table><br>
            <button style="background-color: orange;">Registrar</button>
            <input type="hidden" value="1" name="opcion">
            
        </form>
        <div style="color: red;">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            
            <% } else {%>
            ${mensajeExito}
            <%}%>
        </div>
        <a href="Menu.jsp" >Volver al menu</a>
    </center>
    </body>
</html>
