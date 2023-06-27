package com.orders.order.xml;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Order extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String menu = req.getParameter("menu");
        int amount = Integer.parseInt(req.getParameter("amount"));


        System.out.println("주문받은 음식 "+menu);
        System.out.println("갯수 "+amount);

    }
}
