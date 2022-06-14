<%-- 
    Document   : registrarDiliCuestionario
    Created on : 30/03/2022, 08:05:39 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.CategoriCuestionarioVO"%>
<%@page import="ModeloDAO.CategoriCuestionarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registrar Dili Cuestionario</title>
    </head>
    <body>
        <div class="padre">
            <div class="hijo">
                <center>
                    <h1>registrar Dili Cuestionario</h1>
                    <form method="post" action="Diligcuestionario">
                        <table>
                            <tr>
                                concentimiento BRP <br>
                            <input type="checkbox" name="checkBoxBRP"><br><br>
                            esta activo<br>
                            <input type="checkbox" name="checkBox"><br><br>
                            fecha aplicacin <br>
                            <input type="date" name="txtFecha"><br><br>
                            usuario <br>
                            <select name="txtIdUsaurio">
                                <option>Seleccione.....</option>
                                <%                                UsuarioDAO usuDAO = new UsuarioDAO();
                                    for (UsuarioVO usuVO : usuDAO.listar()) {
                                %>
                                <option value="<%=usuVO.getId_usuario()%>"> <%= usuVO.getUser_name()%> </option>
                                <%
                                    }
                                %>  


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
                </center>
            </div>
        </div>
    </body>
</html>
