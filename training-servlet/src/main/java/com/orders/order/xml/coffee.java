package com.orders.order.xml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/coffee")
public class coffee extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String coffee = req.getParameter("coffee");
        int amount = Integer.parseInt(req.getParameter("amount"));

        System.out.println("주문하신 커피 : "+coffee);
        System.out.println("수량 : "+amount);

    }
}
