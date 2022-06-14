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
        <link href="assets/css/centro.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="padre">
            <div class="hijo">
                <center>
                    <h1>Responde las preguntas</h1>




                    <form method="post" action="Respuesta">
                        <table border="">

                            <tr>
                                <th>opción respuesta</th>
                                <th>pregunta</th>
                                <th>Respuesta</th>
                                <th>Usuarios</th>

                            </tr>



                            <%  
                                PreguntaDAO preDAO = new PreguntaDAO();
                                for (PreguntaVO preVO : preDAO.Listar()) {
                            %>
                            
                            
                                   

                            <tr>

                                <td><input type="text" name="txtOprrespuesta"readonly="readonly" value="1"></td>

                                <td> <textarea name="txtId_pregunta" rows="1" cols="1" readonly="readonly"  ><%= preVO.getId_pregunta()%></textarea> <%= preVO.getPre_descripcion()%></td>

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

                                <td > 
                                    <select name="txtId_usuario" >
                                        <option value="1"> <%=usuario%> </option>
                                    </select>

                                </td>
                            </tr>
                            <%}
                                
                            %>


                        </table>
                        <button>Enviar</button>
                        <input type="hidden" value="1" name="opcion">

                    </form>

                </center>
            </div>
        </div>
    </body>
</html>
