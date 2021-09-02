package com.javalec.tomcat_jdbc.handler.action.main;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

public class MainAction implements Action {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("dd");
        return "RequestDispatcher:jsp/main/main.jsp";
    }
}
