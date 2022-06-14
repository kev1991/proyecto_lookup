<%-- 
    Document   : ConsultarPersona
    Created on : 18-mar-2022, 16:59:04
    Author     : Kebin Martinez
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page import="ModeloVO.PersonaVO"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/centro.css" rel="stylesheet" type="text/css"/>
        
        <title>Consultar Perosna</title>
    </head>
    <body>
    <div class="padre">
        <div class="hijo">
        <h1>Consultar Perosna!</h1>

        <form method="post" action="Persona">

            <table>
                <tr>
                    <th>
                        Numero de documento<br>
                        <input type="text" name="txtNumDocumento"><br><br>
                        <button>Consultar</button>
                        <input type="hidden" value="3" name="opcion">

                    </th>
                </tr>
            </table><br><br>                     

        </form><br>

        <div style="color: red;">
            <%                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <%}%>
        </div>    <br><br>



        <form>
            <table border="">

                <tr>
                    <th> Nombre </th>
                    <th> Segundo Nombre </th>
                    <th> Apellido </th>
                    <th> segundo Apellido </th>
                    <th> Tipo Documento </th>
                    <th> Numero documento </th>
                    <th> Fecha de Nacimiento </th>
                    <th> Correo </th>
                    <th> Correo Corporativo </th>  
                    <th> Cargo </th>  
                </tr>

                <%
                    PersonaVO perVO = new PersonaVO();
                    PersonaDAO perDAO = new PersonaDAO(perVO);
                    ArrayList<PersonaVO> listaPersonas = perDAO.Listar();
                    for (int i = 0; i < listaPersonas.size(); i++) {
                        perVO = listaPersonas.get(i);
                %>

                <tr>
                    <td> <%= perVO.getPer_nombre()%></td>
                    <td> <%= perVO.getPer_segundo_nombre()%></td>
                    <td> <%= perVO.getPer_apellido()%></td>
                    <td> <%= perVO.getPer_segundo_apellido()%></td>
                    <td> <%= perVO.getPer_tipo_documento()%></td>
                    <td> <%= perVO.getPer_numero_documento()%></td>
                    <td> <%= perVO.getPer_fecha_nacimiento()%></td>
                    <td> <%= perVO.getPer_email()%></td>
                    <td> <%= perVO.getPer_email_corporativo()%></td>
                    <td> <%= perVO.getPer_cargo()%></td>

                </tr>
                <% }%>
            </table>

        </form>
        <a href="Menu.jsp" >Volver al menu</a>

        </div>
    </div>





    
</body>
</html>
