package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Entity
public class Album {

    @javax.persistence.Id
    public Integer Id;

    @Column(name = "name")
    private String name;


    ///TODO: add @foreignKey
    @Column(name = "artistId")
    private Integer artistId;

    @Column(name = "releaseYear")
    private Integer releaseYear;


    public Album(String name, int artistId, int releaseYear) {
        this.name = name;
        this.artistId = artistId;
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
