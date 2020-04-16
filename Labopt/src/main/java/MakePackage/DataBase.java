package MakePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBase {
    //"jdbc:mysql://192.168.43.181";//tel
//"jdbc:mysql://192.168.1.9";-pc
    private String url = "jdbc:mysql://192.168.1.9";
    //private String user = "dba";
    //private String password = "sql";
    static DataBase db=null; ///singelton = singura instanta a clasei database
    Connection conn=null;


    private DataBase(String url, String username, String passwd ) {
       // this.url = url;
        try {
            this.conn= DriverManager.getConnection(url, username, passwd);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    public static DataBase get_DB(String url, String user, String passwd)
    {
        if(db == null)
        {
            db = new DataBase(url, user, passwd);
        }
        return db;
    }
}
