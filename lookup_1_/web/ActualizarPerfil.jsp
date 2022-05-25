<%-- 
    Document   : ActualizarPerfil
    Created on : 31/03/2022, 10:55:40 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.PerfilVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Perfil</title>
    </head>
    <body>
    <center>

        <h1>Actualizar Perfil!</h1>
        <%
            PerfilVO perfVO = (PerfilVO) request.getAttribute("PerfilConsultado");
            if (perfVO != null) {
        %>
        
        <form action="Perfil" method="post">
            <table>
                <tr>
                    <th>
                        Nombre<br>
                        <input type="text" name="txtNombre" value="<%=perfVO.getPerfil()%>"><br><br>
                        
                    </th>
                </tr>
            </table>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">

        </form>
                          <%
                if (request.getAttribute("PerfilConsultado") != null) {%>
            ${mensajeError}
            <%}%>   
                    
                    
        <%
            } else {
                request.getRequestDispatcher("ConsultarPerfil.jsp").forward(request,response);
            }
        %>  
                        
                        
                        
    </center>
    </body>
    
</html>
