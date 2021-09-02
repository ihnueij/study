package JDBC;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Factory {
    public static DataSource getDataSource(){
        Properties props = new Properties();
        FileInputStream fis = null;
        PGSimpleDataSource ps = null;
        try {
            fis = new FileInputStream("jdbc.properties");
            props.load(fis);
            ps = new PGSimpleDataSource();
            ps.setURL(props.getProperty("url"));
            ps.setUser(props.getProperty("user"));
            ps.setPassword(props.getProperty("pw"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ps;
    }
}

