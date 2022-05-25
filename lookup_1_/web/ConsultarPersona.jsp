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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

        <title>Consultar Perosna</title>
    </head>
    <body>
    <center>
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


    </center>





    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>

</body>
</html>
