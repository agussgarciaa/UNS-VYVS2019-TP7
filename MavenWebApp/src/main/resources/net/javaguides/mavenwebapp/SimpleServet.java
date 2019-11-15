package net.javaguides.mavenwebapp;

import java.io.IOException;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.lang.String;

/**

 * Servlet implementation class SimpleServlet

 */

@WebServlet("/hello")

public class SimpleServlet extends HttpServlet {

   private static final long serialVersionUID = 1L;

   @Override

   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 

         throws ServletException, IOException {
	   try {}
	   catch() {}

      resp.setContentType("text/plain");

      resp.getWriter().write("Hello World! Maven Web Project Example.");

   }

}