package com.example.trainingservlet2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/kyochon")
public class Kyochon extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("안녕하세요 교촌입니다.");
        StringBuilder redirectText = new StringBuilder();
        redirectText.append("<!DOCTYPE html>\n")
                .append("<head>\n")
                .append(" <title>교촌입니다.</title>\n")
                .append("</head>\n")
                .append("<body>")
                .append("<h1>안녕하세요 교촌입니다. </h1>")
                .append("</body>\n")
                .append("</html>\n");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(redirectText.toString());
        out.flush();
        out.close();
    }
}

