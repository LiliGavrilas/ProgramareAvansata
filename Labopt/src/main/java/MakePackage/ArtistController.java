package MakePackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArtistController {
    DataBase  db ;

    public ArtistController(DataBase db) {
        this.db = db;
    }

    /*public void create(String name, String country)
    {
        Statement stmt=null;
        int idMax=0;
        try {
            stmt = db.getConn().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        try {
            ResultSet aux = stmt.executeQuery("select max(id) from artists;");
                        aux.next();
                idMax=aux.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        try {
            String query=String.format("insert into artists values(%d,'%s','%s');",idMax+1,name,country);
            System.out.println(query);
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }*/

    public void create(Artist artist)
    {
        Statement stmt=null;
        int idMax=0;
        try {
            stmt = db.getConn().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        try {
            ResultSet aux = stmt.executeQuery("select max(id) from artists;");
            aux.next();
            idMax=aux.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        try {
            String query=String.format("insert into artists values(%d,'%s','%s');",idMax+1,artist.getName(),artist.getCountry());
            System.out.println(query);
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
   
   public void findByName(String name)
   {
       Statement stmt =null;
       try {
           stmt=db.getConn().createStatement();
       } catch (SQLException e) {
           e.printStackTrace();
           return;
       }
       ResultSet res;
       try {
           String query=String.format("select * from artists  where name = '%s';", name);
           res = stmt.executeQuery(query);
       } catch (SQLException e) {
           e.printStackTrace();
           return;
       }

       try {
           res.next();
       } catch (SQLException e) {
           e.printStackTrace();
           return;
       }
       while(true)
       {
           try {
               if (res.isAfterLast()) break;
           } catch (SQLException e) {
               e.printStackTrace();
               return;
           }

           try {
               System.out.println(res.getString(1));
               System.out.println(res.getString(2));
               System.out.println(res.getString(3));
           } catch (SQLException e) {
               e.printStackTrace();
               return;
           }
           try {
               res.next();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }
}
