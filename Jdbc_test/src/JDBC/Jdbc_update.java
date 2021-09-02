package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Jdbc_update {
    public void update() {
        String url = "jdbc:postgresql://10.10.20.237/edu";
        String user = "edu";
        String password = "edu";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
//            System.out.println("연결성공");

            Scanner sc = new Scanner(System.in);
            System.out.println("테이블을 입력하시오 users/company >>");
            String table = sc.next();
            System.out.println("update하는 no 입력 >>");
            int no = sc.nextInt();
            System.out.println("update할 휴대폰번호 입력>>");
            String phone = sc.next();

            String sql = "update "+table+" set phone=? where no=? ";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,phone);
            pstmt.setInt(2,no);

            int re = pstmt.executeUpdate();

            if(re > 0) System.out.println("update 완료");
            else System.out.println("update 실패");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("sql오류 : "+e.getMessage());
        }try{
            if (pstmt != null)pstmt.close();
            if (con != null)con.close();
        }catch (SQLException e){

        }
    }
}
