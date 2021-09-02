package JDBC;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
 // 시퀀스 초기화 하고 다시 적용해줘러ㅏ라ㅏ!!
public class Jdbc_delete {
    public void delete() {
//        String url = "jdbc:postgresql://10.10.20.237/edu";
//        String user = "edu";
//        String password = "edu";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
//            Class.forName("org.postgresql.Driver");
//            con = DriverManager.getConnection(url, user, password);
//            System.out.println("연결성공");

            DataSource ds = Factory.getDataSource();
            con = ds.getConnection();

            Scanner sc = new Scanner(System.in);


            System.out.println("삭제할 no를 입력하시오>> ");
            int no = sc.nextInt();

            String sql = "delete from users where no=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, no);

            int re = pstmt.executeUpdate();

            if (re > 0) System.out.println("delete 완료");
            else System.out.println("delete실패");
        } catch (SQLException e) {
            System.out.println("sql오류 : " + e.getMessage());
        }
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {

        }
    }
}
