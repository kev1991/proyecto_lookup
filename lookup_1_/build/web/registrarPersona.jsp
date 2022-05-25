<%-- 
    Document   : registrarPersona
    Created on : 15-mar-2022, 21:13:56
    Author     : Kebin Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Persona</title>
    </head>
    <body>
    <center>
        <h1>Registrar Persona</h1>
        <form  method="post" action="Persona">
            <table>
                <tr>
                    Nombre <br>
                <input type="text" name="txtNombre"><br><br>
                Segundo Nombre <br>
                <input type="text" name="txtNombre2"><br><br>
                Apellido <br>
                <input type="text" name="txtApellido"><br><br>
                Segundo Apellido <br>
                <input type="text" name="txtApellido2"><br><br>
                Tipo Documento <br>
                <input type="text" name="txtTypeDocumento"><br><br>
                Numero Documento <br>
                <input type="text" name="txtNumDocumento"><br><br>
                Fecha Nacimiento <br>
                <input type="date" name="txtFechNacimiento"><br><br>
                Correo Personal <br>
                <input type="text" name="txtEmail"><br><br>
                Correo Corporativo <br>
                <input type="text" name="txtEmail2"><br><br>
                Cargo <br>
                <input type="text" name="txtCargo"><br><br>
                </tr>
            </table><br>
            <button>Registrar</button>
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
