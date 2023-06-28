package com.example.trainingservlet2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/delivery")
public class Delivery extends HttpServlet {
    String delivery = "이상우";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = (String)  req.getAttribute("name");
        String kind = (String)  req.getAttribute("kind");
        String spicy = (String)  req.getAttribute("spicy");
        String topping = (String)  req.getAttribute("topping");
        String addr = (String)  req.getAttribute("addr");


        StringBuilder sb= new StringBuilder();
        sb.append("<!doctype html>\n")
                .append("<html lang=\"en\">")
                .append("<head>")
                .append(" <title>forward</title>")
                .append("</head>")
                .append("<body>")
                .append("<h3 style=\"align-content: center;\">")
                .append("<h1>"+name+"님 의 주문내역</h1> \n")
                .append("<label> 종류 : </label>"+kind)
                .append("<label> 맵기 : </label>"+spicy)
                .append("</br>")
                .append("<label> 토핑종류 :</label>"+topping)
                .append("</br>")
                .append("<label> 배달부이름:</label>"+delivery)
                .append("</br>")
                .append("</body>")
                .append("</html>");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.print(sb.toString());
        out.flush();
        out.close();
    }
}
