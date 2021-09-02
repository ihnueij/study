package JDBC;



import javax.sql.DataSource;
import java.sql.*;

class Jdbc_select {
    public void select() {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            DataSource ds = Factory.getDataSource();
            con = ds.getConnection();

            String sql = "select * from users order by no asc";
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
