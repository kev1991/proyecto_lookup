<%-- 
    Document   : registrarCuestionario
    Created on : 4/04/2022, 11:35:53 PM
    Author     : kebin
--%>

<%@page import="ModeloVO.CategoriCuestionarioVO"%>
<%@page import="ModeloDAO.CategoriCuestionarioDAO"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registrar Cuestionario</title>
    </head>
    <body>
    <center>
        <div class="padre">
            <div class="hijo">
                <h1>registrar Cuestionario!</h1>

                <form method="post" action="Cuestionario">
                    <table>
                        <tr>
                            fecha de creación <br>
                        <input type="date" name="txtFecha"><br><br>
                        Nombre cuestionario<br>
                        <input type="text" name="txtNombre"><br><br>
                        esta activo <br>
                        <input type="text" name="txtIsActive"><br><br>
                        Descripción <br>
                        <input type="text" name="txtDescripcion"><br><br>
                        Categori Cuestionario <br>
                        <select name="txtIdCaCues">
                            <option>Seleccione.....</option>
                            <%                                CategoriCuestionarioDAO catcuesDAO = new CategoriCuestionarioDAO();
                                for (CategoriCuestionarioVO catcuesVO : catcuesDAO.listar()) {
                            %>
                            <option value="<%=catcuesVO.getId_Ca__custionario()%>"> <%= catcuesVO.getNombre_custionario()%> </option>
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
