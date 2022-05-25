/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.PreguntaDAO;
import ModeloVO.PreguntaVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kebin
 */
@WebServlet(name = "PreguntaControlador", urlPatterns = {"/Pregunta"})
public class PreguntaControlador extends HttpServlet {

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

        String id_pregunta = request.getParameter("txtID");
        String pre_title = request.getParameter("txtTitle");
        String pre_descripcion = request.getParameter("txtDescripcion");
        String pre_is_active = request.getParameter("txtActive");
        String pre_is_multiple = request.getParameter("txtMultiple");
        String pre_create_at = request.getParameter("txtFecha");
        String pre_puntaje = request.getParameter("txtPuntaje");
        String id_cuestionario = request.getParameter("txtIDCues");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        PreguntaVO preVO = new PreguntaVO(id_pregunta, pre_title, pre_descripcion, pre_is_active, pre_is_multiple, pre_create_at, pre_puntaje,id_cuestionario);

        PreguntaDAO preDAO = new PreguntaDAO(preVO);

        switch (opcion) {
            case 1:
                if (preDAO.agrgarRegistro()) {
                    request.setAttribute("mensajeExito", "La pregunta se registro corectamente !!");
                } else {
                    request.setAttribute("mensajeError", "La oregunta no se registro corectamente !!");
                }
                request.getRequestDispatcher("registrarPregunta.jsp").forward(request, response);
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
