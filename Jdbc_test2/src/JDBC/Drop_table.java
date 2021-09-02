package JDBC;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class Drop_table {
    public void drop() {
        Connection con = null;
        Statement stmt = null;


        try{
            DataSource ds = Factory.getDataSource();
            con = ds.getConnection();
            stmt = con.createStatement();

            StringBuffer sql = new StringBuffer();
            sql.append("drop table COMPANY");

            stmt.executeUpdate(sql.toString());

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
