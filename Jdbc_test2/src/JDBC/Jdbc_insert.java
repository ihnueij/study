package JDBC;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class Jdbc_insert {
    public void insert() {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String seq ="";

       try{

           DataSource ds = Factory.getDataSource();
           con = ds.getConnection();

           Scanner sc = new Scanner(System.in);

           System.out.println("이름을 입력하시오");
           String name = sc.next();
           System.out.println("휴대폰번호를 입력하시오");
           String phone = sc.next();
           System.out.println("주소를 입력하시오");
           String address = sc.next();


           String sql = "insert into users values(nextval('"+seq+"'),?,?,?) ";
           pstmt = con.prepareStatement(sql);
//           pstmt.setString(1,id);
           pstmt.setString(1,name);
           pstmt.setString(2,phone);
           pstmt.setString(3,address);

           int re = pstmt.executeUpdate();
           if(re == 1) System.out.println("insert 완료");
           else System.out.println("insert 실패");
       }catch (SQLException e){
           System.out.println("db연결 실패 드라이버 연결 정보 오류");
           e.printStackTrace();
       }catch (Exception e){
           System.out.println("실패!");
           e.printStackTrace();
       }try{
           if (pstmt != null)pstmt.close();
           if (con != null)con.close();
        }catch (SQLException e){

        }
    }
}
