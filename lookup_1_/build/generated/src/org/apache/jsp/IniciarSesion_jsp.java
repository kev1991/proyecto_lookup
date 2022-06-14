package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IniciarSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Look_Up</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- dsabilitado -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\"\n");
      out.write("              integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animated.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/Contactenos.js\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/login.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- ***** NAV BAR INICIO***** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- ***** Preloader Start ***** -->\n");
      out.write("        <div id=\"js-preloader\" class=\"js-preloader\">\n");
      out.write("            <div class=\"preloader-inner\">\n");
      out.write("                <span class=\"dot\"></span>\n");
      out.write("                <div class=\"dots\">\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ***** Preloader End ***** -->\n");
      out.write("\n");
      out.write("        <!-- ***** Header Area Start ***** -->\n");
      out.write("        <header class=\"header-area header-sticky wow slideInDown\" data-wow-duration=\"0.75s\" data-wow-delay=\"0s\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <nav class=\"main-nav\">\n");
      out.write("                            <!-- ***** Logo Start ***** -->\n");
      out.write("                            <a href=\"Home.html\" class=\"logo\">\n");
      out.write("                                <img src=\"./assets/images//LOGO_1.png\" alt=\"Chain App Dev\">\n");
      out.write("                            </a>\n");
      out.write("                            <!-- ***** Logo End ***** -->\n");
      out.write("\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- ***** Header Area End ***** -->  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- ***** NAV BAR FIN***** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"modal\" class=\"popupContainer\" style=\"display:none;\">\n");
      out.write("            <div class=\"popupHeader\">\n");
      out.write("                <span class=\"header_title\">Iniciar Sesion</span>\n");
      out.write("                <span class=\"modal_close\"><i class=\"fa fa-times\"></i></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Scripts -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/owl-carousel.js\"></script>\n");
      out.write("        <script src=\"assets/js/animation.js\"></script>\n");
      out.write("        <script src=\"assets/js/imagesloaded.js\"></script>\n");
      out.write("        <script src=\"assets/js/popup.js\"></script>\n");
      out.write("        <script src=\"./assets/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("        <div class=\"main-banner wow fadeIn\" id=\"top\" data-wow-duration=\"1s\" data-wow-delay=\"0.5s\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form method=\"post\" action=\"Usuario\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"container1\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-5\">\n");
      out.write("                                    <img src=\"./assets/images/login.png\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 contents\">\n");
      out.write("                                    <div class=\"row justify-content-center\">\n");
      out.write("                                        <div class=\"col-md-7\">\n");
      out.write("                                            <div class=\"mb-9\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <h3>Iniciar Sesion</h3>\n");
      out.write("                                                <p class=\"mb-4\">Ingresa con nosotros para asi obtener el mejor servicio del\n");
      out.write("                                                    area.\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group first\">\n");
      out.write("\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"username\" name=\"txtUsuario\" placeholder=\"Usuario\">\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group last mb-4\">\n");
      out.write("\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"txtClave\" placeholder=\"Contraseña\">\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"d-flex mb-3 align-items-center\">\n");
      out.write("                                                <label class=\"control control--checkbox mb-0\"><span\n");
      out.write("                                                        class=\"caption\">Recordar\n");
      out.write("                                                        contraseña </span>\n");
      out.write("                                                    <input type=\"checkbox\" checked=\"checked\" />\n");
      out.write("                                                    <div class=\"control__indicator\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"d-flex mb-3 align-items-center\">\n");
      out.write("                                                <label class=\"control control--checkbox mb-0\"><span\n");
      out.write("                                                        class=\"caption\">Acepta\n");
      out.write("                                                        terminos y condiciones</span>\n");
      out.write("                                                    <input type=\"checkbox\" checked=\"checked\" />\n");
      out.write("                                                    <div class=\"control__indicator\"></div>\n");
      out.write("                                                </label>\n");
      out.write("                                                <br>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"contenedor\">\n");
      out.write("                                                <button class=\"btn btn-primary\" >Iniciar Sesión</button>\n");
      out.write("                                                <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"color: red;\">\n");
      out.write("                                                ");

                                                    if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                                ");
 } else {
      out.write("\n");
      out.write("\n");
      out.write("                                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>     ");
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
