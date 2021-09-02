package JDBC;

import java.sql.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

            String url = "jdbc:postgresql://10.10.20.237/edu";
            String user = "edu";
            String password = "edu";

            Connection con = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            try{
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection(url, user, password);
                System.out.println("연결성공");

                Scanner sc = new Scanner(System.in);
                System.out.println("테이블을 입력하시오 ");
                String table = sc.next();
                System.out.println("아이디를 입력하시오");
                String id = sc.next();
                System.out.println("이름을 입력하시오");
                String name = sc.next();
                System.out.println("성별를 입력하시오");
                String gender = sc.next();
                System.out.println("번호를 입력하시오");
                String phone = sc.next();

                String sql = "insert into "+table+" values(nextval('test_seq'),?,?,?,?)";
                pstmt = con.prepareStatement(sql);

                pstmt.setString(1,id);
                pstmt.setString(2,name);
                pstmt.setString(3,gender);
                pstmt.setString(4,phone);
//                pstmt.setString(4,address);

                int re = pstmt.executeUpdate();
                if(re == 1) System.out.println("insert 성공");
                else System.out.println("insert 실패");
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
                if (pstmt != null)pstmt.close();
                if (con != null)con.close();
            }catch (SQLException e){

            }
        }
    }

