package org.wecancodeit.reviews.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany
    private Collection<Review> associatedReviews = new ArrayList<>();

    public Hashtag() {
    }

    public Hashtag(String name, Review review) {
        this.name = name;
        this.associatedReviews.add(review);
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public Collection<Review> getReviews() { return associatedReviews; }

    public void addReview(Review review){
        associatedReviews.add(review);
    }

    public void setId(long id) {
        this.id = id;
    }
}
