package JDBC;

import java.sql.*;

public class JdbcUtil {
    public static Connection getConnection(){
        try{
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("DriverErr : ");
            e.printStackTrace();
        }
        String url = "jdbc:postgresql://10.10.20.237/edu";
        String user = "edu";
        String password = "edu";

        Connection con =null;
        try{
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
        }catch (SQLException e){
            System.out.println("err : jdbcConn");
            e.printStackTrace();
        }
        return con;
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            System.out.println("[Error] : JDBCTemplate.close(rs)");
            e.printStackTrace();
        }
    }

    // 5. DB 종료
    public static void close(Statement stmt) {
        try {
            stmt.close();
        } catch (SQLException e) {
            System.out.println("[Error] : JDBCTemplate.close(stmt)");
            e.printStackTrace();
        }
    }

    // 5. DB 종료
    public static void close(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("[Error] : JDBCTemplate.close(con)");
            e.printStackTrace();
        }
    }

    public static void commit(Connection con) {
        try {
            con.commit();
        } catch (SQLException e) {
            System.out.println("[Error] : JDBCTemplate.commit(con)");
            e.printStackTrace();
        }
    }

    public static void rollback(Connection con) {
        try {
            con.rollback();
        } catch (SQLException e) {
            System.out.println("[Error] : JDBCTemplate.rollback(con)");
            e.printStackTrace();
        }
    }

//    public static void close() {
//    }
}

