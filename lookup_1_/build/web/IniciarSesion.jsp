<%-- 
    Document   : IniciarSesion
    Created on : 16-mar-2022, 15:49:03
    Author     : Kebin Martinez
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
        
        <link rel="stylesheet" href="./CSS/Login.css">

    </head>
    
<body>
    <h1>Iniciar Sesión</h1>
    <form method="post" action="Usuario">
        
       
        <input type="text" placeholder="ingrese su usuario" name="txtUsuario">
        
        <input type="password" placeholder="Ingrese su contraseña" name="txtClave">
        
        <button>Iniciar</button>
            <input type="hidden" value="1" name="opcion">
        <p class="link"><a href="Register.html">¿Aun no tienes cuenta?</a></p>
        <p class="link"><a href="Home.html">volver</a></p>
    </form>
    
    
    
    
    
    
    <div style="color: red;">
        <%
            if (request.getAttribute("mensajeError") != null) {%>
        ${mensajeError}
        <% } else {%>
        
            ${mensajeExito}
            <%}%>
    </div>
    
    
    <a href="Home.html" >inicio</a>
    
    
    
    

</body>
</html>