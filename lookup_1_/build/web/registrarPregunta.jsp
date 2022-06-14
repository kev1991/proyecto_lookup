<%-- 
    Document   : registrarPregunta
    Created on : 5/04/2022, 01:28:08 AM
    Author     : kebin
--%>

<%@page import="ModeloVO.CuestionarioVO"%>
<%@page import="ModeloDAO.CuestionarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registrar Pregunta</title>
    </head>
    <body>
        <div class="padre">
            <div class="hijo">
                <h3 style="color: white;"> h  </h3>
                <center>
                    <h1>registrar Pregunta!</h1>

                    <form method="post" action="Pregunta">
                        <table>
                            <tr>
                                Titulo de la pregunta <br>
                            <input type="text" name="txtTitle"><br><br>
                            Pregunta <br>
                            <input type="text" name="txtDescripcion"><br><br>
                            Esta activa <br>
                            <input type="text" name="txtActive"><br><br>
                            La pregunta es de obcion multiple <br>
                            <input type="text" name="txtMultiple"><br><br>
                            Fecha de creación de la pregunta <br>
                            <input type="date" name="txtFecha"><br><br>
                            Cuestionario <br>
                            <select name="txtIDCues">
                                <option>Seleccione.....</option>
                                <%                                CuestionarioDAO cuesDAO = new CuestionarioDAO();
                                    for (CuestionarioVO cuesVO : cuesDAO.listar()) {
                                %>
                                <option value="<%=cuesVO.getId_cuestionario()%>"> <%= cuesVO.getCues_nombre()%> </option>
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
                    <a href="Menu.jsp" >Volver al menu</a>
                </center>
            </div>
        </div>
    </body>
</html>
