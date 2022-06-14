package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.PersonaVO;
import ModeloVO.UsuarioVO;

public final class ActualizarPersona_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);

      out.write('\n');

    HttpSession buscarSesion = (HttpSession) request.getSession();
    String usuario = "", id="";
    
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("Home.html").forward(request, response);
    } else {
        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
         
        usuario = usuVO.getUser_name();
        id = usuVO.getId_usuario();
       
    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <title>look_up</title>\n");
      out.write("  <!-- plugins:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"./assets/vendors2/feather/feather.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"./assets/vendors2/ti-icons/css/themify-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"./assets/vendors2/css/vendor.bundle.base.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Plugin css for this page -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"./assets/vendors2/datatables.net-bs4/dataTables.bootstrap4.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"./assets/vendors2/ti-icons/css/themify-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"/assets/js2/select.dataTables.min.css\">\n");
      out.write("  <!-- End plugin css for this page -->\n");
      out.write("  <!-- inject:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"./assets/css2/vertical-layout-light/style.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"./assets/images2/favicon.png\" />\n");
      out.write("  <link href=\"assets/css/centro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"container-scroller\">\n");
      out.write("    <!-- partial:partials/_navbar.html -->\n");
      out.write("    <nav class=\"navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\n");
      out.write("      <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\n");
      out.write("        <a class=\"navbar-brand brand-logo mr-5\" href=\"Menu.jsp\"><img src=\"./assets/images2/LOGO_1.png\" class=\"mr-2\"\n");
      out.write("            alt=\"logo\" /></a>\n");
      out.write("        <a class=\"navbar-brand brand-logo-mini\" href=\"Menu.jsp\"><img src=\"./assets/images2/logo-mini.svg\" alt=\"logo\" /></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"navbar-menu-wrapper d-flex align-items-center justify-content-end\">       \n");
      out.write("        <ul class=\"navbar-nav navbar-nav-right\">          \n");
      out.write("          <li class=\"nav-item nav-profile dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" id=\"profileDropdown\">\n");
      out.write("              <img src=\"./assets/images2/logo-mini.svg\" alt=\"logo\" />\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown\" aria-labelledby=\"profileDropdown\">\n");
      out.write("              <a class=\"dropdown-item\">\n");
      out.write("                <i class=\"ti-settings text-primary\"></i>\n");
      out.write("                 ");
      out.print(usuario);
      out.write("\n");
      out.write("              </a>\n");
      out.write("              <a class=\"dropdown-item\" >\n");
      out.write("                <i class=\"ti-power-off text-primary\"></i>\n");
      out.write("               <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                <input type=\"submit\" value=\"Cerrar Sesion\" class=\"gradient-button\">\n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("          </li>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("      <!-- partial -->\n");
      out.write("      <!-- partial:partials/_sidebar.html -->\n");
      out.write("      <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Menu.jsp\">\n");
      out.write("              <i class=\"icon-grid menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Inicio</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("              <i class=\"icon-layout menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Admin</span>\n");
      out.write("              <i class=\"menu-arrow\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"collapse\" id=\"ui-basic\">\n");
      out.write("              <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"registrarPerfil.jsp\">Registrar perfil</a></li>\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"ConsultarPerfil.jsp\">Consultar perfil</a></li>\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"registrarPersona.jsp\">Registrar persona</a></li>\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"ConsultarPersona.jsp\">Consultar persona</a></li>\n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#form-elements\" aria-expanded=\"false\"\n");
      out.write("              aria-controls=\"form-elements\">\n");
      out.write("              <i class=\"icon-columns menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Encuestador</span>\n");
      out.write("              <i class=\"menu-arrow\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"collapse\" id=\"form-elements\">\n");
      out.write("              <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"registrarCategoria.jsp\">Registrar categoria </a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"registrarPregunta.jsp\">Registrar pregunta </a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"ListarRespuestas.jsp\">Listar pregunta </a></li>\n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#charts\" aria-expanded=\"false\" aria-controls=\"charts\">\n");
      out.write("              <i class=\"icon-bar-graph menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Encuestado</span>\n");
      out.write("              <i class=\"menu-arrow\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"collapse\" id=\"charts\">\n");
      out.write("              <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"ConsultarPregunta.jsp\">Consultar preguntas</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </li>       \n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("      <!-- partial -->\n");
      out.write("      <div class=\"main-panel\">\n");
      out.write("        <div class=\"content-wrapper\">  \n");
      out.write("          \n");
      out.write("          <!-- agregar  -->\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- content-wrapper ends -->\n");
      out.write("        <!-- partial:partials/_footer.html -->\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("          <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\n");
      out.write("            <span class=\"text-muted text-center text-sm-left d-block d-sm-inline-block\">Copyright © 2022.<a\n");
      out.write("                href=\"https://www.bootstrapdash.com/\" target=\"_blank\">look_up</a></span>           \n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- partial -->\n");
      out.write("      \n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("  <!-- plugins:js -->\n");
      out.write("  <script src=\"./assets/vendors2/js/vendor.bundle.base.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Plugin js for this page -->\n");
      out.write("  <script src=\"./assets/vendors2/chart.js/Chart.min.js\"></script>\n");
      out.write("  <script src=\"./assets/vendors2/datatables.net/jquery.dataTables.js\"></script>\n");
      out.write("  <script src=\"./assets/vendors2/datatables.net-bs4/dataTables.bootstrap4.js\"></script>\n");
      out.write("  <script src=\"./assets/js2/dataTables.select.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- End plugin js for this page -->\n");
      out.write("  <!-- inject:js -->\n");
      out.write("  <script src=\"./assets/js2/off-canvas.js\"></script>\n");
      out.write("  <script src=\"./assets/js2/hoverable-collapse.js\"></script>\n");
      out.write("  <script src=\"./assets/js2/template.js\"></script>\n");
      out.write("  <script src=\"./assets/js2/settings.js\"></script>\n");
      out.write("  <script src=\"./assets/js2/todolist.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Custom js for this page-->\n");
      out.write("  <script src=\"./assets/js2/dashboard.js\"></script>\n");
      out.write("  <script src=\"./assets/js2/Chart.roundedBarCharts.js\"></script>\n");
      out.write("  <!-- End custom js for this page-->\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"assets/css/centro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Actualizar Persona</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"padre\">\n");
      out.write("            <div class=\"hijo\">\n");
      out.write("                <center>\n");
      out.write("                    <h1>Actualizar Persona!</h1>\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("\n");
      out.write("                        ");
             PersonaVO perVO = (PersonaVO) request.getAttribute("PersonaConsultada");
                            if (perVO != null) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <form action=\"Persona\" method=\"post\">\n");
      out.write("                            <form>\n");
      out.write("                                Nombre<br>\n");
      out.write("                                <input type=\"text\" name=\"txtNombre\" value=\"");
      out.print(perVO.getPer_nombre());
      out.write("\"><br><br>\n");
      out.write("                                Segundo<br>\n");
      out.write("                                <input type=\"text\" name=\"txtNombre2\" value=\"");
      out.print(perVO.getPer_segundo_nombre());
      out.write("\"><br><br>\n");
      out.write("                                Apellido<br>\n");
      out.write("                                <input type=\"text\" name=\"txtApellido\" value=\"");
      out.print(perVO.getPer_apellido());
      out.write("\"><br><br>\n");
      out.write("                                segundo Apellido<br>\n");
      out.write("                                <input type=\"text\" name=\"txtApellido2\" value=\"");
      out.print(perVO.getPer_segundo_apellido());
      out.write("\"><br><br>\n");
      out.write("                                Tipo Documento<br>\n");
      out.write("                                <input type=\"text\" name=\"txtTypeDocumento\" value=\"");
      out.print(perVO.getPer_tipo_documento());
      out.write("\"><br><br>\n");
      out.write("                            </form>\n");
      out.write("                            <form>\n");
      out.write("                                Numero documento<br>\n");
      out.write("                                <input type=\"text\" name=\"txtNumDocumento\" value=\"");
      out.print(perVO.getPer_numero_documento());
      out.write("\"><br><br>\n");
      out.write("                                Fecha de Nacimiento<br>\n");
      out.write("                                <input type=\"text\" name=\"txtFechNacimiento\" value=\"");
      out.print(perVO.getPer_fecha_nacimiento());
      out.write("\"><br><br>\n");
      out.write("                                Correo<br>\n");
      out.write("                                <input type=\"text\" name=\"txtEmail\" value=\"");
      out.print(perVO.getPer_email());
      out.write("\"><br><br>\n");
      out.write("                                Correo Corporativo<br>\n");
      out.write("                                <input type=\"text\" name=\"txtEmail2\" value=\"");
      out.print(perVO.getPer_email_corporativo());
      out.write("\"><br><br>\n");
      out.write("                                Cargo<br>\n");
      out.write("                                <input type=\"text\" name=\"txtCargo\" value=\"");
      out.print(perVO.getPer_cargo());
      out.write("\"><br><br>\n");
      out.write("                            </form>\n");
      out.write("                    </div>\n");
      out.write("                    <button>Actualizar</button>\n");
      out.write("                    <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <div style=\"color: red;\">\n");
      out.write("                        ");

                            if (request.getAttribute("PersonaConsultada") != null) {
      out.write("\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        ");
}
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            } else {
                                request.getRequestDispatcher("ConsultarPersona.jsp").forward(request, response);
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
