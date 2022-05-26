/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sena
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {

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
        String id_usuario = request.getParameter("txtId");
        String user_name = request.getParameter("txtUsuario");
        String user_password = request.getParameter("txtClave");
        String user_is_active = request.getParameter("txtActive");
        String id_persona = request.getParameter("txtIdPersona");
        String id_perfil = request.getParameter("txtIdPerfil");
        
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        // #2 Quien tiene los datos de forma segura? el VO
        UsuarioVO usuVO = new UsuarioVO(id_usuario, user_name, user_password, user_is_active, id_persona, id_perfil);

        // #3 Quien hace las opreciones? el DAO
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);

        // #4 administrar todas las opreraciones del modulo
        switch (opcion) {

            case 1://metodo #4  iniciar sesión
                if (usuDAO.iniciarSesion(user_name, user_password)) {
                    
                    HttpSession miSesion = request.getSession(true);
                    usuVO = new UsuarioVO(user_name);
                    miSesion.setAttribute("datosUsuario",usuVO);
                    
                    request.getRequestDispatcher("Menu.jsp").forward(request, response);
                    
                } else {
                    request.setAttribute("mensajeError", "Coregir datos !");
                    request.getRequestDispatcher("IniciarSesion.jsp").forward(request, response);
                }
                break;
            case 2: //metodo para agrgar registro
                if (usuDAO.agrgarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se registro corectamente !!");
                } else {
                    request.setAttribute("mensajeError", "El usuario no se registro corectamente !!");
                }
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
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
