/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Tania Garcia and Javier Galindo
 */
public class registro extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Guia_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro Exitoso</h1>");
            String Dueno = request.getParameter("dueno");
            String Nombre = request.getParameter("nombre");
            String Especie = request.getParameter("especie");
            String Raza = request.getParameter("raza");
            int edad = Integer.parseInt(request.getParameter("edad"));
            float Peso = Float.parseFloat(request.getParameter("peso"));
            String Fecha = request.getParameter("registro");
            
            out.println("<p>Dueño Mascota: " + Dueno + " </p>");
            out.println("<p>Nombre del animal: " + Nombre + " </p>");
            out.println("<p>Especie : " + Especie + "</p>");
            out.println("<p>Raza : " + Raza + "</p>");
            out.println("<p>Edad : " + edad + " Anios " + "</p>");
            out.println("<p>Peso : " + Peso + " kg " + "</p>");
            out.println("<p>Fecha de registro: " + Fecha+ "</p>");
            
            out.println("</body>");
            out.println("</html>");
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
