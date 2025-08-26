package demoservlets.controller;


//package com.example;  // change package as per your project

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")   // must match the fetch URL path
public class fetch extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // get data from React fetch body
        String name = req.getParameter("name");

        // prepare response
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type");


        String jsonResponse = "{\"message\":\"Hello, " + name + "! Data received successfully.\"}";
        resp.getWriter().write(jsonResponse);
    }
}

