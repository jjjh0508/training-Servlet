package com.example.trainingservlet2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tteokbokki")
public class Tteokbokki extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String kind  = req.getParameter("kind");
        String spicy = req.getParameter("spicy");
        String topping = req.getParameter("topping");
        String addr = req.getParameter("addr");

        System.out.println(name);
        System.out.println(kind);
        System.out.println(spicy);
        System.out.println(topping);
        System.out.println(addr);

        if(name.isEmpty()){
            resp.sendError(404,"이름을 입력해주세요");
        }else if(kind==null){
            resp.sendError(404,"종류를 골라주세요");
        }else if(spicy==null){
            resp.sendError(404,"맵기를 골라주세요");
        }else if(topping==null){
            resp.sendError(404,"토핑를 골라주세요");
        }else if(addr==null) {
            resp.sendError(404, "주소를 입력해주세요");
        }else {
            req.setAttribute("name",name);
            req.setAttribute("kind",kind);
            req.setAttribute("spicy",spicy);
            req.setAttribute("topping",topping);
            req.setAttribute("addr",addr);

            RequestDispatcher rd = req.getRequestDispatcher("delivery");
            rd.forward(req,resp);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("교촌");
        resp.sendRedirect("/kyochon");
    }
}
