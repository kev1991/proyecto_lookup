package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.PersonaDAO;
import ModeloVO.PersonaVO;
import ModeloVO.UsuarioVO;

public final class ConsultarPersona_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

response.setHeader("Pragma", "No-cache");
response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
response.setDateHeader("Expires",0);

      out.write('\n');

  HttpSession buscarSesion =(HttpSession)request.getSession();  
  String usuario="";
  if(buscarSesion.getAttribute("datosUsuario")== null){
      request.getRequestDispatcher("Home.html").forward(request, response);      
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Consultar Perosna</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Consultar Perosna!</h1>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"Persona\">\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Numero de documento<br>\n");
      out.write("                        <input type=\"text\" name=\"txtNumDocumento\"><br><br>\n");
      out.write("                        <button>Consultar</button>\n");
      out.write("                        <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table><br><br>                     \n");
      out.write("\n");
      out.write("        </form><br>\n");
      out.write("\n");
      out.write("        <div style=\"color: red;\">\n");
      out.write("            ");

                if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>    <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <table border=\"\">\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th> Nombre </th>\n");
      out.write("                    <th> Segundo Nombre </th>\n");
      out.write("                    <th> Apellido </th>\n");
      out.write("                    <th> segundo Apellido </th>\n");
      out.write("                    <th> Tipo Documento </th>\n");
      out.write("                    <th> Numero documento </th>\n");
      out.write("                    <th> Fecha de Nacimiento </th>\n");
      out.write("                    <th> Correo </th>\n");
      out.write("                    <th> Correo Corporativo </th>  \n");
      out.write("                    <th> Cargo </th>  \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    PersonaVO perVO = new PersonaVO();
                    PersonaDAO perDAO = new PersonaDAO(perVO);
                    ArrayList<PersonaVO> listaPersonas = perDAO.Listar();
                    for (int i = 0; i < listaPersonas.size(); i++) {
                        perVO = listaPersonas.get(i);
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_nombre());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_segundo_nombre());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_apellido());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_segundo_apellido());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_tipo_documento());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_numero_documento());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_fecha_nacimiento());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_email());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_email_corporativo());
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( perVO.getPer_cargo());
      out.write("</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("<a href=\"Menu.jsp\" >Volver al menu</a>\n");
      out.write("\n");
      out.write("\n");
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
