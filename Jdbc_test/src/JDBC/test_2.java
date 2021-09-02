package JDBC;

import java.sql.*;

public class test_2 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://10.10.20.237/edu";
        String user = "edu";
        String password = "edu";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("연결성공");
            String sql = "select * from test";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();//select만

            System.out.println("번호\t이름\t\t성별\t\t폰번호");
            System.out.println("==================================");

            while(rs.next()){
                String no = rs.getString("no");
                String name = rs.getString("name");
                String address = rs.getString("gender");
                String phone = rs.getString("phone");
                System.out.printf("%s\t\t%s\t\t%s\t%s\t",no,name,phone,address);
                System.out.println();
            }
        }catch (SQLException e){
            System.out.println("db연결 실패 드라이버 연결 정보 오류");
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            System.out.println("db연결 실패 클래스 파일 오류");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("실패!");
            e.printStackTrace();
        }try{
            if (rs != null)rs.close();
            if (pstmt != null)pstmt.close();
            if (con != null)con.close();
        }catch (SQLException e){
        }

    }
    }

