/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.PerfilDAO;
import ModeloVO.PerfilVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sena
 */
@WebServlet(name = "PerfilControlador", urlPatterns = {"/Perfil"})
public class PerfilControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String id_perfil = request.getParameter("txtId");
        String nombre = request.getParameter("txtNombre");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        PerfilVO perfVO = new PerfilVO(id_perfil, nombre);

        PerfilDAO perfDAO = new PerfilDAO(perfVO);
        switch (opcion) {

            case 1://metodo #1 agrgar registro
                if (perfDAO.agrgarRegistro()) {
                    request.setAttribute("mensajeExito", "El perfil se registro corectamente !!");
                } else {
                    request.setAttribute("mensajeError", "El perfil no se registro corectamente !!");
                }
                request.getRequestDispatcher("registrarPerfil.jsp").forward(request, response);
                break;

            case 2: //metodo #2 actualizar los perfiles 
                if (perfDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "el perfil se registro corectamente !!");
                    request.getRequestDispatcher("ConsultarPerfil.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "el perfil  no se registro corectamente !!");
                }
                 request.getRequestDispatcher("ActualizarPerfil.jsp").forward(request, response);
                break;

            case 3://metodo #3 listar los perfiles
                perfVO = perfDAO.ConsultaPerfil(id_perfil);
                if (perfVO != null) {
                    request.setAttribute("PerfilConsultado", perfVO);
                    request.getRequestDispatcher("ActualizarPerfil.jsp").forward(request, response);
                } else {
                    request.setAttribute("PerfilConsultado", "La persona no se registro corectamente !!");
                    request.getRequestDispatcher("ConsultarPerfil.jsp").forward(request, response);
                }
                break;

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
