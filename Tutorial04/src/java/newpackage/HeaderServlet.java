/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "HeaderServlet", urlPatterns = {"/HeaderServlet"})
public class HeaderServlet extends HttpServlet {

    private static String headWithTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
            out.println("<title>Servlet HeaderServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HeaderServlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet HeaderServlet</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HTTP Headers</h1>");
        out.println("<table border=1>");
        out.println("<tr bgcolor=\"#FDF5E6\"><th>Header Name</th>");
        out.println("<th>Header Value</th></tr>");
        
        // Print all headers
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            out.println("<tr><td>" + headerName + "</td>\n");
            String headerValue = request.getHeader(headerName);
            out.println("<td>" + headerValue + "</td>");
        }
        
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        /* response.setContentType("text/html");
         
        PrintWriter out = response.getWriter();
        String title = "Servlet Example: Showing Request Headers";
        out.println(HeaderServlet.headWithTitle(title) +
                    "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                    "<H1 ALIGN=CENTER>" + title + "</H1>\n" +
                    "<B>Request Method: </B>" + request.getMethod() + "<BR>\n" +
                    "<B>Request URI: </B>" + request.getRequestURI() + "<BR>\n" +
                    "<B>Request Protocol: </B>" + request.getProtocol() + "<BR><BR>\n" +
                        "<TABLE BORDER=1 ALIGN=CENTER>\n" + "<TR BGCOLOR=\"#FFAD00\">\n" +
                    "<TH>Header Name<TH>Header Value");
        
        Enumeration<String> headerNames = request.getHeaderNames();
        
        while(headerNames.hasMoreElements()) 
        {
          String headerName = (String)headerNames.nextElement();
          out.println("<TR><TD>" + headerName + "</TD>\n");
          String headerValue = request.getHeader(headerName);
          out.println("<TD>" + headerValue + "</TD></TR>\n"); 
        }
        out.println("</TABLE>\n</BODY></HTML>");*/
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
            throws ServletException, IOException 
    {
        doGet(request, response);
        
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
