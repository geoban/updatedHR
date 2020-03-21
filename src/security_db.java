

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class security_db {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "security_db";
    private static Integer portnumber = 3306;
    private static String password = "";
    
     public static Connection getConnection()
    {
        Connection connect = null;
        
        MysqlDataSource data = new MysqlDataSource();
        
        data.setServerName(servername);
        data.setUser(username);
        data.setPassword(password);
        data.setDatabaseName(dbname);
        data.setPortNumber(portnumber);
        
        try {
            connect = data.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection -> " + security_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
        
    }
}


