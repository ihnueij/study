package ha;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class DataSourceee {
//    public static DataSource getDataSourceWIthDBCP(){
//        BasicDataSource dbcp = new BasicDataSource();
//        dbcp.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//        dbcp.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:ORCL");
//        dbcp.setUsername("scott");
//        dbcp.setPassword("tiger");
//        dbcp.setInitialSize(20);
//        dbcp.setMaxTotal(5);
//        return dbcp;
//    }
//
//
//    public static DataSource getDataSourceWIthDBCPByProperties() throws Exception{
//        DataSource dbcp = null ;
//        Properties props = new Properties();
//        InputStream input = new DBCPDemo().getClass().getClassLoader().getResourceAsStream("dbcpconfig.properties");
//        props.load(  input );
//
//
//        dbcp = BasicDataSourceFactory.createDataSource(props ) ;
//        return dbcp;
//    }
//
//
//
//
//    public static void main(String[] args) throws Exception {
////        System.out.println(  DataSourceUtil.getDataSourceWithC3P0()); ;
//        System.out.println(getDataSourceWIthDBCP().getConnection() );
////        System.out.println(getDataSourceWIthDBCPByProperties().getConnection() );
//    }
}
