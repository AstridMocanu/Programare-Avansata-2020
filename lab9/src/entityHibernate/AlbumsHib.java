package entityHibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "albums", schema = "MusicAlbums", catalog = "")
public class AlbumsHib {
    private int id;
    private String name;
    private int artistId;
    private Integer releaseYear;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "artist_id", nullable = false)
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Basic
    @Column(name = "release_year", nullable = true)
    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumsHib albumsHib = (AlbumsHib) o;
        return id == albumsHib.id &&
                artistId == albumsHib.artistId &&
                Objects.equals(name, albumsHib.name) &&
                Objects.equals(releaseYear, albumsHib.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, artistId, releaseYear);
    }
}
