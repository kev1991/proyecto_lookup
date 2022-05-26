<%-- 
    Document   : Sesiones
    Created on : 6/04/2022, 07:29:57 AM
    Author     : 2233903
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);
%>
<%
    HttpSession buscarSesion = (HttpSession) request.getSession();
    String usuario = "";
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("Home.html").forward(request, response);
    } else {
        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        usuario = usuVO.getUser_name();
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./CSS/estilos-navbar.css">
        <title>JSP Page</title>
    </head>
    <body>
        <nav>
            <ul class="menu-horizontal">
                <li><a href="Menu.jsp">Inicio</a></li>
                <li>
                    <a href="Menu.jsp">Admin</a>
                    <ul class="menu-vertical">
                        <li><a href="registrarPerfil.jsp">registrar perfil</a></li>
                        <li><a href="ConsultarPerfil.jsp">consultar perfil</a></li>
                        <li><a href="registrarPersona.jsp">registrar persona</a></li>
                        <li><a href="ConsultarPersona.jsp">consultar persona</a></li>
                        
                    </ul>
                </li>
                <li>
                    <a href="Menu.jsp">Encuestador</a>
                    <ul class="menu-vertical">
                        <li> <a href="registrarCategoria.jsp" style="text-decoration:none;">registrar categoria</a> </li>
                        <li><a href="registrarPregunta.jsp">registrar pregunta</a> </li>
                        
                        <li> <a href="ListarRespuestas.jsp">listar preguntas</a></li>
                    </ul>
                </li>
                <li>
                    <a href="Menu.jsp">Encuestado</a>
                    <ul class="menu-vertical">
                        <li> <a href="ConsultarPregunta.jsp">consultar preguntas</a></li>
                        <li></li>
                    </ul>

                </li>

            </ul>
        </nav>
    <center>
        <div style="float:right;">
            <h2 style="color: orange">  <br>                   
                <%=usuario%>
            </h2>
            <form method="post" action="Sesiones">
                <input type="submit" value="Cerrar Sesion">
            </form>


        </div><br><br>
        <div></div><br><br>
        <div></div><br><br>
    </center>
</body>
</html>
