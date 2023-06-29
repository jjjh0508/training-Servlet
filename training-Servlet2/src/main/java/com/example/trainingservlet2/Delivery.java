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


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String delivery = "이상우";
        String name = (String)  req.getAttribute("name");
        String kind = (String)  req.getAttribute("kind");
        String spicy = (String)  req.getAttribute("spicy");
        String[] toppings = (String[]) req.getAttribute("toppings");
        String addr = (String)  req.getAttribute("addr");
        System.out.println(delivery);

        StringBuilder stringBuilder = new StringBuilder();
        for (String topping : toppings) {
            stringBuilder.append(topping+" ");
        }

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
                .append("<label> 토핑종류 :</label>"+stringBuilder)
                .append("</br>")
                .append("<label> 주소 : </label>"+addr)
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
