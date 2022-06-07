/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.RespuestaDAO;
import ModeloVO.RespuestaVO;
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
@WebServlet(name = "RespuestaControlador", urlPatterns = {"/Respuesta"})
public class RespuestaControlador extends HttpServlet {

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
        // #1 recibir datos de la vista
        response.setContentType("text/html;charset=UTF-8");
        String id_respuesta = request.getParameter("txtId");
        String id_Op_respuesta = request.getParameter("txtOprrespuesta");
        String id_pregunta = request.getParameter("txtId_pregunta");
        int res_puntaje = Integer.parseInt(request.getParameter("txtPuntaje"));
        String id_usuario = request.getParameter("txtId_usuario");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        // #2 Quien tiene los datos de forma segura? el VO
        RespuestaVO resVO = new RespuestaVO(id_respuesta, id_Op_respuesta, id_pregunta, res_puntaje, id_usuario);
        
        // #3 Quien hace las opreciones? el DAO
        RespuestaDAO resDAO = new RespuestaDAO(resVO);
        
        // #4 administrar todas las opreraciones del modulo
        switch (opcion){
            case 1:
                if (resDAO.agrgarRegistro()) {
                     request.setAttribute("mensajeExito", "La persona se registro corectamente !!");
                } else {
                    request.setAttribute("mensajeError", "La persona no se registro corectamente !!");
                }
                request.getRequestDispatcher("ConsultarPregunta.jsp").forward(request, response);
                
        
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
