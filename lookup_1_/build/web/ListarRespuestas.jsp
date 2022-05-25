<%-- 
    Document   : ListarRespuestas
    Created on : 6/04/2022, 07:51:29 AM
    Author     : Sena
--%>

<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PreguntaDAO"%>
<%@page import="ModeloVO.PreguntaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <table border="">

                <tr>
                    <th> Usuario </th>
                    <th> pregunta  </th>
                    <th> puntaje </th>
                      
                </tr>
<%
                    UsuarioVO userVO = new UsuarioVO();
                    UsuarioDAO userDAO = new UsuarioDAO(userVO);
                    ArrayList<UsuarioVO> listarUsuarios = userDAO.listar();
                    for (int i = 0; i < listarUsuarios.size(); i++) {
                        userVO = listarUsuarios.get(i);
                %>
                <tr>
                    <td> <%= userVO.getUser_name()%></td>
                    
                    
                </tr>
                <% }%>
                
                <tr>
                    
                </tr>
                
                <%
                    PreguntaVO perVO = new PreguntaVO();
                    PreguntaDAO perDAO = new PreguntaDAO(perVO);
                    ArrayList<PreguntaVO> listaPreguntas = perDAO.Listar();
                    for (int i = 0; i < listaPreguntas.size(); i++) {
                        perVO = listaPreguntas.get(i);
                %>
                <tr>
                    <td> <%= perVO.getPre_descripcion()%></td>
                </tr>
                <% }%>
            </table>

        </form>
<a href="Menu.jsp" >Volver al menu</a>
    </body>
</html>
