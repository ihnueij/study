package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Drop_table {
    public void drop() {
        Connection con = null;
        Statement stmt = null;


        try{
            Class.forName("org.postgresql.Driver");
//            System.out.println("드라이버 성공");

            String url = "jdbc:postgresql://10.10.20.237/edu";
            String user = "edu";
            String password = "edu";
            con = DriverManager.getConnection(url, user, password);

            stmt = con.createStatement();

            StringBuffer sql = new StringBuffer();
            sql.append("drop table COMPANY");

            stmt.executeUpdate(sql.toString());

        }catch (ClassNotFoundException e){
            System.out.println("err : "+e);
        }catch (SQLException e){
            System.out.println("sql 오류 : "+e.getMessage());
        }finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {

            }
        }
    }
}
