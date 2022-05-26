<%-- 
    Document   : ConsultarPregunta
    Created on : 5/04/2022, 01:52:56 AM
    Author     : kebin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PreguntaDAO"%>
<%@page import="ModeloVO.PreguntaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>Consultar Perosna!</h1>

        <form method="post" action="Pregunta">
            <table border="">

                <tr>
                    <th> pregunta </th>

                </tr>

                <%
                    PreguntaVO preVO = new PreguntaVO();
                    PreguntaDAO preDAO = new PreguntaDAO(preVO);
                    ArrayList<PreguntaVO> listaPreguntas = preDAO.Listar();
                    for (int i = 0; i < listaPreguntas.size(); i++) {
                        preVO = listaPreguntas.get(i);
                %>

                <tr>
                    <td> <%= preVO.getPre_descripcion()%></td>
                    <td> 
                        <select name="txtPuntaje">
                            <option >Seleccione</option>
                            <option value="1">Siempre </option>
                            <option value="2">Casi siempre</option>
                            <option value="3">Algunas veces</option>
                            <option value="4">Casi nunca</option>
                            <option value="5">Nunca </option>

                        </select>

                    </td>


                </tr>
                <% }%>
            </table>

        </form>
        <a href="Menu.jsp" >Volver al menu</a>


    </center>
</body>
</html>
