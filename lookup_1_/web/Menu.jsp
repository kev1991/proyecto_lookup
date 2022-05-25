<%-- 
    Document   : Menu
    Created on : 23/03/2022, 08:48:44 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
        <title>Menu</title>
    </head>

    <body>     

    <center>    

        <h1>    </h1> <br><br>
        <h2>perfil</h2>    
        <table border="">
            <tr>
                <th>
                    <a href="registrarPerfil.jsp">registrar perfil</a><br>
                    
                </th>
                <th>
                    <a href="ConsultarPerfil.jsp">consultar perfil</a><br>
                </th>
            </tr>
        </table>

        <h2>persona</h2>    
        <table border="">
            <tr>
                <th>
                    <a href="registrarPersona.jsp">registrar persona</a><br>
                </th>
                <th>
                    <a href="ConsultarPersona.jsp">consultar persona</a><br>
                </th>
                <th>
                    <a href="CambiarContraseña.jsp">cambiar contrseña</a><br>
                </th>
            </tr>
        </table>
        <h2>categoria</h2>    
        <table border="">
            <tr>
                <th>
                    <a href="registrarCategoria.jsp" style="text-decoration:none;">registrar categoria</a><br> 
                </th>
            </tr>
        </table>
        
        <h2>Pregunta</h2>    
        <table border="">
            <tr>
                <th>
                    <a href="registrarPregunta.jsp">registrar pregunta</a><br> 
                    
                </th>
                
                <th>
                    <a href="ConsultarPregunta.jsp">consultar preguntas</a><br>  
                </th>
                
                <th>
                    <a href="ListarRespuestas.jsp">listar preguntas</a><br>  
                </th>
                
            </tr>
        </table>
        
        <h2>diligenciar cuestionario</h2>    
        <table border="">
            <tr>
                <th>
                    <a href="registrarDiliCuestionario.jsp">registrar diligenciamiento</a><br> 
                    
                </th>
                
                
            </tr>
        </table>
    </center>


    
    
    
    
    
     <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
</body>
</html>
