package MakePackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class AlbumController {
    DataBase  db ;


    public AlbumController(DataBase db) {
        this.db = db;
    }

        public void create(Album album)
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
        }
        try {
            String query=String.format("insert into albums values(%d,'%s',%d,%d);",++idMax,album.getName(),album.getArtistId(), album.getReleaseYear());
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<Album> findByArtist(int artistId) throws SQLException {
        List<Album> resAlbums=new LinkedList<>();
        Statement stmt = db.getConn().createStatement();

        ResultSet res;
        String query=String.format("select * from albums  where artist_id = %d;", artistId);
        res = stmt.executeQuery(query);

        res.next();

        while(!res.isAfterLast())
        {
             resAlbums.add( new Album(res.getString(2),res.getInt(3),res.getInt(4)));
             res.next();
        }
        return resAlbums;
    }
}
