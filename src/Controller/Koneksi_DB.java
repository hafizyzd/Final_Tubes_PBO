package Controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;


public class Koneksi_DB {
    static Connection con;
    
    public static Connection connection(){
        
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("mytubes1");
            data.setUser("root");
            data.setPassword("");
            try{
                con = (Connection) data.getConnection();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return con;
    }
}
