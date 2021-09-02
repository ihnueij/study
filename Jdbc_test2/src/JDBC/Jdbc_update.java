package JDBC;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class Jdbc_update {
    public void update() {

        Connection con = null;
        PreparedStatement pstmt = null;

        try {

            DataSource ds = Factory.getDataSource();
            con = ds.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.println("update하는 no 입력 >>");
            int no = sc.nextInt();
            System.out.println("update할 휴대폰번호 입력>>");
            String phone = sc.next();

            String sql = "update users set phone=? where no=? ";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,phone);
            pstmt.setInt(2,no);

            int re = pstmt.executeUpdate();

            if(re > 0) System.out.println("update 완료");
            else System.out.println("update 실패");

        }catch (SQLException e){
            System.out.println("sql오류 : "+e.getMessage());
        }try{
            if (pstmt != null)pstmt.close();
            if (con != null)con.close();
        }catch (SQLException e){

        }
    }
}
