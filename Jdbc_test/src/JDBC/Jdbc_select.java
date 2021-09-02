package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Jdbc_select {
    public void select() {
        String url = "jdbc:postgresql://10.10.20.237/edu";
        String user = "edu";
        String password = "edu";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
//            System.out.println("연결성공");

            Scanner sc = new Scanner(System.in);
            System.out.println("테이블을 입력하시오 users/company >>");
            String table = sc.next();

            String sql = "select * from " +table+ " order by no asc";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();//select만

            System.out.println("no \t이름\t\t번호\t\t주소");
            System.out.println("==================================");

            while(rs.next()){
                String no = rs.getString("no");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
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
