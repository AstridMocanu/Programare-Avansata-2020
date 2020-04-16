package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ChartsPK implements Serializable {
    private int id;
    private int albumId;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "album_id", nullable = false)
    @Id
    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChartsPK chartsPK = (ChartsPK) o;
        return id == chartsPK.id &&
                albumId == chartsPK.albumId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, albumId);
    }
}
