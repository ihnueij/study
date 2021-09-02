package JDBC;

import javax.sql.DataSource;
import java.sql.*;

public class Create_table {
    public void create() {
        Connection con =null;
        Statement stmt=null;

        try{
            DataSource ds = Factory.getDataSource();
            con = ds.getConnection();
            stmt = con.createStatement();

            StringBuffer sql = new StringBuffer();
            sql.append("create table company(");
            sql.append("  no integer primary key ,\n" +
                    "    name varchar(50),\n" +
                    "    phone varchar(50),\n" +
                    "    address varchar(50) )");

            stmt.executeUpdate(sql.toString());

            System.out.println("테이블 생성 완료");


        }catch (SQLException e){
            System.out.println("sql 오류 : "+e.getMessage());
        }finally {
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            }catch (SQLException e){

            }
        }
    }
}
