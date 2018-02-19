package controller;

import service.SkeletonService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @autor K.Brik
 */


@WebServlet("/reverse")
public class SkeletonServlet extends javax.servlet.http.HttpServlet {
    SkeletonService service = new SkeletonService();
    /**
     *method POST
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws IOException
     */
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    /**
     * method GET
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws IOException
     */
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();

        String text = request.getParameter("text");
         String reversedText = service.reverseText(text);
         session.setAttribute("reversedText", reversedText);

         response.sendRedirect("/ServletSkeleton/redirect.jsp");
    }
    protected void doPut(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
    protected void doDelete(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
