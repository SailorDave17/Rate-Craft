package org.wecancodeit.reviews.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany
    private Collection<Review> associatedReviews;

    public Hashtag() {
    }

    public Hashtag(String name) {
        this.name = name;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public Collection<Review> getReviews() { return associatedReviews; }


}
