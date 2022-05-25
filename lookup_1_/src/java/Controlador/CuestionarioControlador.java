/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.CuestionarioDAO;
import ModeloVO.CuestionarioVO;
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
@WebServlet(name = "CuestionarioControlador", urlPatterns = {"/Cuestionario"})
public class CuestionarioControlador extends HttpServlet {

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
       
        // #1 recibir datos de la vista
        String id_cuestionario = request.getParameter("txtId");
        String cues_fecha_cracion = request.getParameter("txtFecha");
        String cues_nombre = request.getParameter("txtNombre");
        String cues_is_active = request.getParameter("txtIsActive");
        String cues_descrpcion = request.getParameter("txtDescripcion");
        String id_Ca__custionario = request.getParameter("txtIdCaCues");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        // #2 Quien tiene los datos de forma segura? el VO
        CuestionarioVO cuesVO = new CuestionarioVO(id_cuestionario, cues_fecha_cracion, cues_nombre, cues_is_active, cues_descrpcion, id_Ca__custionario);
        
        // #3 Quien hace las opreciones? el DAO
        CuestionarioDAO cuesDAO = new CuestionarioDAO(cuesVO);
        
         switch (opcion) {
            case 1:
                if (cuesDAO.agrgarRegistro()) {
                    request.setAttribute("mensajeExito", "EL cuestionario se registro corectamente !!");
                } else {
                    request.setAttribute("mensajeError", "EL cuestionario no se registro corectamente !!");
                }
                request.getRequestDispatcher("registrarCuestionario.jsp").forward(request, response);
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
