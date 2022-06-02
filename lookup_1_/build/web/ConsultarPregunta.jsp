<%-- 
    Document   : ConsultarPregunta
    Created on : 5/04/2022, 01:52:56 AM
    Author     : kebin
--%>

<%@page import="ModeloDAO.RespuestaDAO"%>
<%@page import="ModeloVO.RespuestaVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PreguntaDAO"%>
<%@page import="ModeloVO.PreguntaVO"%>
<%@page import="ModeloVO.CuestionarioVO"%>
<%@page import="ModeloVO.UsuarioVO"%>
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
        <h1>Responde las preguntas</h1>




        <form method="post" action="Respuesta">
            <table border="">

                <tr>
                    <th>obción respuest</th>
                    <th>pregunta</th>
                    <th>Respuesta</th>
                    <th>Usuarios</th>

                </tr>



                <%                    PreguntaDAO preDAO = new PreguntaDAO();
                    for (PreguntaVO preVO : preDAO.Listar()) {

                %>

                <tr>

                    <td><input type="text" name="txtOprrespuesta"></td>

                    <td> <textarea name="txtId_pregunta" rows="2" cols="54" readonly="readonly" value="<%= preVO.getId_pregunta()%>" ><%= preVO.getPre_descripcion()%></textarea></td>

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
                   
                    <td > <textarea type="text" name="txtId_usuario" readonly="readonly" value="1">  <%=usuario%> </textarea>  </td>
                </tr>
                
                <%}%>

            </table>
            <button>Registrar</button>
            <input type="hidden" value="1" name="opcion">

        </form>

    </center>
</body>
</html>
