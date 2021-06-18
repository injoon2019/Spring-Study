package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie extends Item{

    private String director;
    private String actor;
    private Long id;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
