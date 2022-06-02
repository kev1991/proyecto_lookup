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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./CSS/estilos-navbar.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"menu-horizontal\">\n");
      out.write("                <li><a href=\"Menu.jsp\">Inicio</a></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Menu.jsp\">Admin</a>\n");
      out.write("                    <ul class=\"menu-vertical\">\n");
      out.write("                        <li><a href=\"registrarPerfil.jsp\">registrar perfil</a></li>\n");
      out.write("                        <li><a href=\"ConsultarPerfil.jsp\">consultar perfil</a></li>\n");
      out.write("                        <li><a href=\"registrarPersona.jsp\">registrar persona</a></li>\n");
      out.write("                        <li><a href=\"ConsultarPersona.jsp\">consultar persona</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Menu.jsp\">Encuestador</a>\n");
      out.write("                    <ul class=\"menu-vertical\">\n");
      out.write("                        <li> <a href=\"registrarCategoria.jsp\" style=\"text-decoration:none;\">registrar categoria</a> </li>\n");
      out.write("                        <li><a href=\"registrarPregunta.jsp\">registrar pregunta</a> </li>\n");
      out.write("                        \n");
      out.write("                        <li> <a href=\"ListarRespuestas.jsp\">listar preguntas</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Menu.jsp\">Encuestado</a>\n");
      out.write("                    <ul class=\"menu-vertical\">\n");
      out.write("                        <li> <a href=\"ConsultarPregunta.jsp\">consultar preguntas</a></li>\n");
      out.write("                        <li></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    <center>\n");
      out.write("        <div style=\"float:right;\">\n");
      out.write("            <h2 style=\"color: orange\">  <br>                   \n");
      out.write("                ");
      out.print(usuario);
      out.write("\n");
      out.write("                \n");
      out.write("            </h2>\n");
      out.write("            <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                <input type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div><br><br>\n");
      out.write("        <div></div><br><br>\n");
      out.write("        <div></div><br><br>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Actualizar Persona</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Actualizar Persona!</h1>\n");
      out.write("        \n");
      out.write("         ");

            PersonaVO perVO = (PersonaVO) request.getAttribute("PersonaConsultada");
            if (perVO != null) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"Persona\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Nombre<br>\n");
      out.write("                        <input type=\"text\" name=\"txtNombre\" value=\"");
      out.print(perVO.getPer_nombre());
      out.write("\"><br><br>\n");
      out.write("                        Segundo<br>\n");
      out.write("                        <input type=\"text\" name=\"txtNombre2\" value=\"");
      out.print(perVO.getPer_segundo_nombre());
      out.write("\"><br><br>\n");
      out.write("                        Apellido<br>\n");
      out.write("                        <input type=\"text\" name=\"txtApellido\" value=\"");
      out.print(perVO.getPer_apellido());
      out.write("\"><br><br>\n");
      out.write("                        segundo Apellido<br>\n");
      out.write("                        <input type=\"text\" name=\"txtApellido2\" value=\"");
      out.print(perVO.getPer_segundo_apellido());
      out.write("\"><br><br>\n");
      out.write("                        Tipo Documento<br>\n");
      out.write("                        <input type=\"text\" name=\"txtTypeDocumento\" value=\"");
      out.print(perVO.getPer_tipo_documento());
      out.write("\"><br><br>\n");
      out.write("                        Numero documento<br>\n");
      out.write("                        <input type=\"text\" name=\"txtNumDocumento\" value=\"");
      out.print(perVO.getPer_numero_documento());
      out.write("\"><br><br>\n");
      out.write("                        Fecha de Nacimiento<br>\n");
      out.write("                        <input type=\"text\" name=\"txtFechNacimiento\" value=\"");
      out.print(perVO.getPer_fecha_nacimiento());
      out.write("\"><br><br>\n");
      out.write("                        Correo<br>\n");
      out.write("                        <input type=\"text\" name=\"txtEmail\" value=\"");
      out.print(perVO.getPer_email());
      out.write("\"><br><br>\n");
      out.write("                        Correo Corporativo<br>\n");
      out.write("                        <input type=\"text\" name=\"txtEmail2\" value=\"");
      out.print(perVO.getPer_email_corporativo());
      out.write("\"><br><br>\n");
      out.write("                        Cargo<br>\n");
      out.write("                        <input type=\"text\" name=\"txtCargo\" value=\"");
      out.print(perVO.getPer_cargo());
      out.write("\"><br><br>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <button>Actualizar</button>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("                 <div style=\"color: red;\">\n");
      out.write("            ");

                if (request.getAttribute("PersonaConsultada") != null) {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
}
      out.write("   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("        ");

            } else {
                request.getRequestDispatcher("ConsultarPersona.jsp").forward(request,response);
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
