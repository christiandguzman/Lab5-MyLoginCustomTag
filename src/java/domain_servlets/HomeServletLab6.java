/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain_servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 683676
 */
public class HomeServletLab6 extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        
        
        
        if(session.getAttribute("username")!=null){
            String username = (String) session.getAttribute("username");
            request.setAttribute("username", username);
            getServletContext().getRequestDispatcher("/WEB-INF/homelab6.jsp").forward(request, response); 
        }
         
        getServletContext()
                    .getRequestDispatcher("/WEB-INF/loginlab6.jsp")
                    .forward(request, response);
            
        
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       } 
}
