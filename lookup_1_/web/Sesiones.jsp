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
    String usuario = "", id="";
    
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("Home.html").forward(request, response);
    } else {
        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
         
        usuario = usuVO.getUser_name();
        id = usuVO.getId_usuario();
       
    }

%>



<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>look_up</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="./assets/vendors2/feather/feather.css">
  <link rel="stylesheet" href="./assets/vendors2/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="./assets/vendors2/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <link rel="stylesheet" href="./assets/vendors2/datatables.net-bs4/dataTables.bootstrap4.css">
  <link rel="stylesheet" href="./assets/vendors2/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" type="text/css" href="/assets/js2/select.dataTables.min.css">
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="./assets/css2/vertical-layout-light/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="./assets/images2/favicon.png" />
  <link href="assets/css/centro.css" rel="stylesheet" type="text/css"/>
</head>

<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo mr-5" href="Menu.jsp"><img src="./assets/images2/LOGO_1.png" class="mr-2"
            alt="logo" /></a>
        <a class="navbar-brand brand-logo-mini" href="Menu.jsp"><img src="./assets/images2/logo-mini.svg" alt="logo" /></a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">       
        <ul class="navbar-nav navbar-nav-right">          
          <li class="nav-item nav-profile dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
              <img src="./assets/images2/logo-mini.svg" alt="logo" />
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
              <a class="dropdown-item">
                <i class="ti-settings text-primary"></i>
                 <%=usuario%>
              </a>
              <a class="dropdown-item" >
                <i class="ti-power-off text-primary"></i>
               <form method="post" action="Sesiones">
                <input type="submit" value="Cerrar Sesion" class="gradient-button">
            </form>
                
              </a>
            </div>
              
          </li>
        </div>
            
         
      <!-- partial -->
      <!-- partial:partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="Menu.jsp">
              <i class="icon-grid menu-icon"></i>
              <span class="menu-title">Inicio</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
              <i class="icon-layout menu-icon"></i>
              <span class="menu-title">Admin</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="registrarPerfil.jsp">Registrar perfil</a></li>
                <li class="nav-item"> <a class="nav-link" href="ConsultarPerfil.jsp">Consultar perfil</a></li>
                <li class="nav-item"> <a class="nav-link" href="registrarPersona.jsp">Registrar persona</a></li>
                <li class="nav-item"> <a class="nav-link" href="ConsultarPersona.jsp">Consultar persona</a></li>

              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false"
              aria-controls="form-elements">
              <i class="icon-columns menu-icon"></i>
              <span class="menu-title">Encuestador</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="form-elements">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"><a class="nav-link" href="registrarCategoria.jsp">Registrar categoria </a></li>
                <li class="nav-item"><a class="nav-link" href="registrarPregunta.jsp">Registrar pregunta </a></li>
                <li class="nav-item"><a class="nav-link" href="ListarRespuestas.jsp">Listar pregunta </a></li>

              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#charts" aria-expanded="false" aria-controls="charts">
              <i class="icon-bar-graph menu-icon"></i>
              <span class="menu-title">Encuestado</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="charts">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="ConsultarPregunta.jsp">Consultar preguntas</a></li>
              </ul>
            </div>
          </li>       
        </ul>
      </nav>
      <!-- partial -->
      <div class="main-panel">
        <div class="content-wrapper">  
          
          <!-- agregar  -->
            




        
        <!-- content-wrapper ends -->
        <!-- partial:partials/_footer.html -->
        <footer class="footer">
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2022.<a
                href="https://www.bootstrapdash.com/" target="_blank">look_up</a></span>           
          </div>
        </footer>
        <!-- partial -->
      
    

</body>

  <!-- plugins:js -->
  <script src="./assets/vendors2/js/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page -->
  <script src="./assets/vendors2/chart.js/Chart.min.js"></script>
  <script src="./assets/vendors2/datatables.net/jquery.dataTables.js"></script>
  <script src="./assets/vendors2/datatables.net-bs4/dataTables.bootstrap4.js"></script>
  <script src="./assets/js2/dataTables.select.min.js"></script>

  <!-- End plugin js for this page -->
  <!-- inject:js -->
  <script src="./assets/js2/off-canvas.js"></script>
  <script src="./assets/js2/hoverable-collapse.js"></script>
  <script src="./assets/js2/template.js"></script>
  <script src="./assets/js2/settings.js"></script>
  <script src="./assets/js2/todolist.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <script src="./assets/js2/dashboard.js"></script>
  <script src="./assets/js2/Chart.roundedBarCharts.js"></script>
  <!-- End custom js for this page-->

</html>
