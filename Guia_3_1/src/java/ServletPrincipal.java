/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

//AGREGAR
/*import java.sql.Conection;
  import java.sql.DriverManager;
  import java.sql.PrepareStatement;
  import java.sql.ResultSet;
  import java.sql.SQLClienteInfoException;
  import java.sql.util.ArrayList;

import Models.ViewModelEmpleado;*/

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

   /* AGREGAR 
    private final String usuario="doctores_login";
    private final String contraseña="root";
    private final String servidor="localhost:1433";
    private final String bd= "Veterinaria";
    
    String url= "jdbc:sqlserver://"
            + servidor
            + ";databaseName=" + bd
            +";user=" + usuario
            +";password=" + contrasenia
            +";encrypt=false;trustServerCertificate=false;";*/
  
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
    
    /* AGREGAR ESTO Y MODIFICAR, TAMBIEN LOS ATRIBUTOS DEJARLOS  IGUAL
    public void mostrarEmpleados(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try(Connection conn = DriverManager.getConnection(url)){
            //ELIMINAR try (Connection conn = DriverManager.getConnection(url);) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Doctores";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();
                ArrayList<ViewModelDoctoress> listaDoctores = new ArrayList<>();
                while (rs.next()) {
                    ViewModelEmpleados empleado = new ViewModelEmpleados();
                    empleado.setID_Empleado(rs.getInt("ID_Empleado"));
                    empleado.setDUI_Empleado(rs.getString("DUI_Empleado"));
                    empleado.setISSS_Empleado(rs.getInt("ISSS_Empleado"));
                    empleado.setNombresEmpleado(rs.getString("nombresEmpleado"));
                    empleado.setApellidosEmpleado(rs.getString("apellidosEmpleado"));
                    empleado.setFechaNacEmpleado(rs.getDate("fechaNacEmpleado"));
                    empleado.setTelefono(rs.getString("telefono"));
                    empleado.setCorreo(rs.getString("correo"));
                    empleado.setID_Cargo(rs.getInt("ID_Cargo"));
                    empleado.setID_Direccion(rs.getInt("ID_Direccion"));
                    listaEmpleados.add(empleado);
                }               
                request.setAttribute("listaEmpleados", listaEmpleados);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion == null) {
            // request.getRequestDispatcher("index.html").forward (request, response);

            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        } else if (accion.equals("citas")) {
            request.getRequestDispatcher("/citas.html").forward(request, response);
        } else if (accion.equals("empleado")) {
            request.getRequestDispatcher("/empleado.html").forward(request, response);
        } else if (accion.equals("historial")) {
            request.getRequestDispatcher("/historial.html").forward(request, response);
        } else if (accion.equals("mascotas")) {
            request.getRequestDispatcher("/mascotas.html").forward(request, response);
        } else if (accion.equals("medicamento")) {
            request.getRequestDispatcher("/medicamento.html").forward(request, response);
        } else if (accion.equals("Login")) {
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
            //request.getRequestDispatcher ("/login.html").forward (request, response);
        }/* AGREGAR
        else if{(accion.equalas(:"GestionarEmpleados")){
        mostrarEmpleados(request, response);
        request.getRequestDispatcher("/GestionarEmpleados.jsp").forward(request,response);
        */
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
       
        if (accion.equals("login")) {
            String usuario = request.getParameter("tfUsuario");
            String contrasena = request.getParameter("tfContrasenia");

            try (PrintWriter print = response.getWriter()) {
                if (usuario.equals("admin") && contrasena.equals("root")) {
                    request.getRequestDispatcher("/PanelAdministrador.jsp").forward(request, response);
                } else {
                    print.println("<!DOCTYPE html>");
                    print.println("<html>");
                    print.println("<head>");
                    print.println("<title>Login Veterinaria Gal-Cia</title>");
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
