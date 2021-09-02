package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DBConnection {

    public static Connection getConnection() throws SQLException, NamingException,
            ClassNotFoundException{

//        Hashtable env = new Hashtable();
//        env.put(Context.INITIAL_CONTEXT_FACTORY,
//                "com.sun.jndi.ldap.LdapCtxFactory");
//        env.put(Context.PROVIDER_URL, "jdbc:postgresql://10.10.20.237/edu");



        InitialContext ctx = new InitialContext();
        Context context = new InitialContext();
        DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/post");
        Connection con = dataSource.getConnection();
            System.out.println("소스룩업성공");

        return con;
    }

//    public static void main(String[] args) {
//
//
//        Connection con=null;
//        PreparedStatement pstmt=null;
//        ResultSet rs=null;
//        String sql="";
//        int re=-1;
//
//        try {
//            con = getConnection();
//            sql="select * from users ";
//            pstmt = con.prepareStatement(sql);
//            rs = pstmt.executeQuery();
//
//            if (rs.next()) {
//                String no = rs.getString("no");
//                String name = rs.getString("name");
//                String phone = rs.getString("phone");
//                String address = rs.getString("address");
//                System.out.printf("%s\t\t%s\t\t%s\t%s\t",no,name,phone,address);
//                System.out.println();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (rs != null) rs.close();
//                if (pstmt != null) pstmt.close();
//                if (con != null) con.close();
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//
//    }
//}
}