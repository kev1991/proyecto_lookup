<%-- 
    Document   : registrarPerfil
    Created on : 16/03/2022, 08:01:40 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Perfil</title>
    </head>
    <body>
        
        
        <h1>Registrar Perfil</h1>
        <form method="post" action="Perfil">
            <table>
                <tr>
                    Nombre <br>
                <input type="text" name="txtNombre"><br><br>              
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

    </body>
</html>
