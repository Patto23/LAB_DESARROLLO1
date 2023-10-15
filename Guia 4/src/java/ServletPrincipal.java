/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */



import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author cotuz
 */
public class ServletPrincipal extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPrincipal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPrincipal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
       
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
    String accion = request.getParameter ("accion");
    
        if(accion == null) {
        request.getRequestDispatcher("index.html").forward (request, response);
        }else if (accion.equals("citas")) {
        request.getRequestDispatcher ("/citas.html").forward (request, response); 
        }else if (accion.equals("empleado")) {
        request.getRequestDispatcher ("/empleado.html").forward (request, response); 
        }else if (accion.equals("historial")) {
        request.getRequestDispatcher ("/historial.html").forward (request, response); 
        }else if (accion.equals("mascotas")) {
        request.getRequestDispatcher ("/mascotas.html").forward (request, response); 
        }else if (accion.equals("medicamento")) {
        request.getRequestDispatcher ("/medicamento.html").forward (request, response);
        }else if (accion.equals("login")) {
        request.getRequestDispatcher ("/login.html").forward (request, response);
        }
    }   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter ("accion");
        
        if(accion.equals("login")){
            String usuario = request.getParameter("tfUsuario");
            String contrasena = request.getParameter("tfContrasenia");
        try(PrintWriter print = response.getWriter()){
            if(usuario.equals("admin") && contrasena.equals("root")){
            print.println("<!DOCTYPE html>");
            print.println("<html>");
            print.println("<head>");
            print.println("<title>Login Sistema Escolar 1.0</title>");          print.println("</head>");
            print.println("<body>");
            print.println("<h1>Bienvenido al Sistema Escolar </h1>");
            print.println("</body>");
            print.println("</html>");
         }else{
            print.println("<!DOCTYPE html>");
            print.println("<html>");
            print.println("<head>");
            print.println("<title>Login Sistema Escolar</title>");
            print.println("</head>");
            print.println("<body>");
            print.println("<h2>Error: La contraseña o el usuario son erroneos </h2>");
            print.println("</body>");
            print.println("</html>");
          }  
        }
      }
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
