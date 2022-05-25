<%-- 
    Document   : ConsultarPerfil
    Created on : 31/03/2022, 10:55:55 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PerfilDAO"%>
<%@page import="ModeloVO.PerfilVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Perfil</title>
    </head>
    <body>
    <center>
        <h1>Consultar Perfil</h1>
        <form method="post" action="Perfil">

            <table>
                <tr>
                    <th>
                        Id perfil<br>
                        <input type="text" name="txtId"><br><br>
                        <button>Actualizar</button>
                        <input type="hidden" value="3" name="opcion">

                    </th>
                </tr>
            </table><br><br>                     

        </form><br>
        <div style="color: red;">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeEexito}
            <%}%>
        </div>    <br><br>
        
        
        <form>
            <table border="">

                <tr>
                    <th> ID </th>
                    <th> Perfil </th>
                </tr>

                <%
                    PerfilVO perfVO = new PerfilVO();
                    PerfilDAO perfDAO = new PerfilDAO(perfVO);
                    ArrayList<PerfilVO> listarPerfil = perfDAO.Listar();
                    for (int i = 0; i < listarPerfil.size(); i++) {
                        perfVO = listarPerfil.get(i);
                %>

                <tr>
                    <td> <%= perfVO.getId_perfil()%></td>
                    <td> <%= perfVO.getPerfil()%></td>
                    

                </tr>
                <% }%>
            </table>

        </form>
            <a href="Menu.jsp" >Volver al menu</a>
            <a href="Home.html" >Volver al home</a>
    </center>
    </body>
</html>
