package TEST;

import TEST.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientTest {
    public static void main(String[] args) throws SQLException {

            String sql = "SELECT * FROM USERS";

        try(Connection connection = DbUtil.getDataSource().getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);){

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                String no = rs.getString("no");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");

                System.out.printf("%s\t\t%s\t\t%s\t%s\t",no,name,phone,address);
                System.out.println();
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
