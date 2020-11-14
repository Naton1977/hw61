package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        resp.getWriter().println("<div style=\"width: 100%; height: 700px; border: 1px solid black; background-color: gainsboro; display: flex; align-items: center; justify-content: center\">");
        resp.getWriter().println(" <form style=\"border: 1px solid black; width: 450px; height: 150px; padding-top: 20px; display: flex; justify-content: center; background-color: beige\">");
        resp.getWriter().println(" <div>");
        resp.getWriter().println(" <label>Enter Login<br>");
        resp.getWriter().println("<input type=\"text\" size=\"40\" name=\"Login\" style=\"margin-top: 10px; margin-bottom: 10px\"><br>");
        resp.getWriter().println(" </label>");
        resp.getWriter().println("<label>Enter Password<br>");
        resp.getWriter().println("<input type=\"password\" size=\"40\" name=\"Password\" style=\"margin-top: 10px\">");
        resp.getWriter().println("</label><br>");
        resp.getWriter().println("<button style=\"margin-top: 10px\">Submit</button>");
        resp.getWriter().println(" </div>");
        resp.getWriter().println(" </form>");
        resp.getWriter().println("</div>");
    }
}
