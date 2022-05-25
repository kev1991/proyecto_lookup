<%-- 
    Document   : ActualizarPersona
    Created on : 18-mar-2022, 16:59:32
    Author     : Kebin Martinez
--%>

<%@page import="ModeloVO.PersonaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Persona</title>
    </head>
    <body>
    <center>
        <h1>Actualizar Persona!</h1>
        
         <%
            PersonaVO perVO = (PersonaVO) request.getAttribute("PersonaConsultada");
            if (perVO != null) {
        %>

        <form action="Persona" method="post">
            <table>
                <tr>
                    <th>
                        Nombre<br>
                        <input type="text" name="txtNombre" value="<%=perVO.getPer_nombre()%>"><br><br>
                        Segundo<br>
                        <input type="text" name="txtNombre2" value="<%=perVO.getPer_segundo_nombre()%>"><br><br>
                        Apellido<br>
                        <input type="text" name="txtApellido" value="<%=perVO.getPer_apellido()%>"><br><br>
                        segundo Apellido<br>
                        <input type="text" name="txtApellido2" value="<%=perVO.getPer_segundo_apellido()%>"><br><br>
                        Tipo Documento<br>
                        <input type="text" name="txtTypeDocumento" value="<%=perVO.getPer_tipo_documento()%>"><br><br>
                        Numero documento<br>
                        <input type="text" name="txtNumDocumento" value="<%=perVO.getPer_numero_documento()%>"><br><br>
                        Fecha de Nacimiento<br>
                        <input type="text" name="txtFechNacimiento" value="<%=perVO.getPer_fecha_nacimiento()%>"><br><br>
                        Correo<br>
                        <input type="text" name="txtEmail" value="<%=perVO.getPer_email()%>"><br><br>
                        Correo Corporativo<br>
                        <input type="text" name="txtEmail2" value="<%=perVO.getPer_email_corporativo()%>"><br><br>
                        Cargo<br>
                        <input type="text" name="txtCargo" value="<%=perVO.getPer_cargo()%>"><br><br>
                    </th>
                </tr>
            </table>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">

        </form>
                 <div style="color: red;">
            <%
                if (request.getAttribute("PersonaConsultada") != null) {%>
            ${mensajeError}
            <%}%>   
                    
                    
        <%
            } else {
                request.getRequestDispatcher("ConsultarPersona.jsp").forward(request,response);
            }
        %>
        
        
        
        
    </center>
</body>
</html>
