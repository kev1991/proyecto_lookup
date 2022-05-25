<%-- 
    Document   : cambiar contraseña
    Created on : 11-may-2022, 20:51:24
    Author     : kebin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="Persona">

            <table>
                <tr>
                    <th>
                        Numero de documento<br>
                        <input type="text" name="txtNumDocumento"><br><br>
                        <button>Consultar</button>
                        <input type="hidden" value="4" name="opcion">

                    </th>
                </tr>
            </table>                    

        </form><br>
    </body>
</html>
