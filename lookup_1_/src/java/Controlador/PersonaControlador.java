/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.PersonaDAO;
import ModeloVO.PersonaVO;
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
@WebServlet(name = "PersonaControlador", urlPatterns = {"/Persona"})
public class PersonaControlador extends HttpServlet {

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
        String id_persona = request.getParameter("txtId");
        String per_nombre = request.getParameter("txtNombre");
        String per_segundo_nombre = request.getParameter("txtNombre2");
        String per_apellido = request.getParameter("txtApellido");
        String per_segundo_apellido = request.getParameter("txtApellido2");
        String per_tipo_documento = request.getParameter("txtTypeDocumento");
        String per_numero_documento = request.getParameter("txtNumDocumento");
        String per_fecha_nacimiento = request.getParameter("txtFechNacimiento");
        String per_email = request.getParameter("txtEmail");
        String per_email_corporativo = request.getParameter("txtEmail2");
        String per_cargo = request.getParameter("txtCargo");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        // #2 Quien tiene los datos de forma segura? el VO
        PersonaVO perVO = new PersonaVO(id_persona, per_nombre, per_segundo_nombre, per_apellido, per_segundo_apellido, per_tipo_documento, per_numero_documento, per_fecha_nacimiento, per_email, per_email_corporativo, per_cargo);

        // #3 Quien hace las opreciones? el DAO
        PersonaDAO perDAO = new PersonaDAO(perVO);

        // #4 administrar todas las opreraciones del modulo
        switch (opcion) {
            case 1:
                if (perDAO.agrgarRegistro()) {
                    request.setAttribute("mensajeExito", "La persona se registro corectamente !!");
                } else {
                    request.setAttribute("mensajeError", "La persona no se registro corectamente !!");
                }
                request.getRequestDispatcher("registrarPersona.jsp").forward(request, response);
                break;

            case 2:
                if (perDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "La persona se registro corectamente !!");
                    request.getRequestDispatcher("ConsultarPersona.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "La persona no se registro corectamente !!");
                }
                request.getRequestDispatcher("ActualizarPersona.jsp").forward(request, response);
                break;

            case 3:
                perVO = perDAO.ConsultarPersona(per_numero_documento);
                if (perVO != null) {
                    request.setAttribute("PersonaConsultada", perVO);
                    request.getRequestDispatcher("ActualizarPersona.jsp").forward(request, response);

                } else {
                    request.setAttribute("PersonaConsultada", "La persona no se registro corectamente !!");
                    request.getRequestDispatcher("ConsultarPersona.jsp").forward(request, response);
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
