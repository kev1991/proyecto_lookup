package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloVO.UsuarioVO;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
response.setDateHeader("Expires",0);

      out.write('\n');

  HttpSession buscarSesion =(HttpSession)request.getSession();  
  String usuario="";
  if(buscarSesion.getAttribute("datosUsuario")== null){
      request.getRequestDispatcher("Home.Html").forward(request, response);      
  }else{
      UsuarioVO usuVO = (UsuarioVO)buscarSesion.getAttribute("datosUsuario");
      usuario = usuVO.getUser_name();
 }
  

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div style=\"float:right;\">\n");
      out.write("            <h1 style=\"color: greenyellow\">  <br>                   \n");
      out.write("                BIENVENIDO ");
      out.print(usuario);
      out.write("\n");
      out.write("            </h1>\n");
      out.write("            <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                <input type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div><br><br>\n");
      out.write("        <div></div><br><br>\n");
      out.write("        <div></div><br><br>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>     \n");
      out.write("\n");
      out.write("    <center>    \n");
      out.write("\n");
      out.write("        <h1>BIENVENIDOS</h1>\n");
      out.write("        <h2>perfil</h2>    \n");
      out.write("        <table border=\"\">\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"registrarPerfil.jsp\">registrar perfil</a><br>\n");
      out.write("                    \n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"ConsultarPerfil.jsp\">consultar perfil</a><br>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <h2>persona</h2>    \n");
      out.write("        <table border=\"\">\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"registrarPersona.jsp\">registrar persona</a><br>\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"ConsultarPersona.jsp\">consultar persona</a><br>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <h2>categoria</h2>    \n");
      out.write("        <table border=\"\">\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"registrarCategoria.jsp\" style=\"text-decoration:none;\">registrar categoria</a><br> \n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <h2>Pregunta</h2>    \n");
      out.write("        <table border=\"\">\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"registrarPregunta.jsp\">registrar pregunta</a><br> \n");
      out.write("                    \n");
      out.write("                </th>\n");
      out.write("                \n");
      out.write("                <th>\n");
      out.write("                    <a href=\"ConsultarPregunta.jsp\">listar preguntas</a><br>  \n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <h2>diligenciar cuestionario</h2>    \n");
      out.write("        <table border=\"\">\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"registrarDiliCuestionario.jsp\">registrar diligenciamiento</a><br> \n");
      out.write("                    \n");
      out.write("                </th>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
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
