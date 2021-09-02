<%--
  Created by IntelliJ IDEA.
  User: sjinc
  Date: 2021-08-19
  Time: 오전 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import=""%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="javax.naming.InitialContext" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    Connection conn=null;
    try{
      Context init = new InitialContext();
      DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/post");
      conn = ds.getConnection();
      Class.forName("org.postgresql.Driver");
      System.out.println("Success!!!");
    }catch(Exception e){
      System.out.println("Failure!!!");
      e.printStackTrace();
    }

  %>
  </body>
</html>
