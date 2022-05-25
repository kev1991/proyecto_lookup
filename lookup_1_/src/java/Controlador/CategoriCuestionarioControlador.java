/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.CategoriCuestionarioDAO;
import ModeloVO.CategoriCuestionarioVO;
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
@WebServlet(name = "CategoriCuestionarioControlador", urlPatterns = {"/CategoriCuestionario"})
public class CategoriCuestionarioControlador extends HttpServlet {

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
        String id_Ca__custionario = request.getParameter("txtIdCat");
        String nombre_custionario = request.getParameter("txtNombreCat");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        // #2 Quien tiene los datos de forma segura? el VO
        CategoriCuestionarioVO catVO = new CategoriCuestionarioVO(id_Ca__custionario,nombre_custionario);
        
        // #3 Quien hace las opreciones? el DAO
        CategoriCuestionarioDAO catDAO = new CategoriCuestionarioDAO(catVO);
        
         // #4 administrar todas las opreraciones del modulo
        switch (opcion) {
            case 1:
                if (catDAO.agrgarRegistro()) {
                    request.setAttribute("mensajeExito", "La categoria se registro corectamente !!");
                } else {
                    request.setAttribute("mensajeError", "La categoria no se registro corectamente !!");
                }
                request.getRequestDispatcher("registrarCategoria.jsp").forward(request, response);
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
