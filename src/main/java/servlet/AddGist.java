package java.servlet;

import database.Database;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class AddGist extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Database.getConnection().createStatement().executeUpdate("INSERT INTO test_table (name) VALUE ('" + request.getParameter("name") + "');");
            request.getSession().setAttribute("name", request.getParameter("name"));
            response.sendRedirect(this.getServletContext().getContextPath() + "/pages/createDone.jsp");
        } catch (SQLException e) {
            out.println("ОШИБКА! Данные НЕ добавлены.");
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("ACCESS DENIED");
    }
}
