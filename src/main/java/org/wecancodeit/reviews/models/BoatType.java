package org.wecancodeit.reviews.models;

import java.util.Collection;

public class BoatType {
    private long id;
    private String name;
    private Collection<ReviewData> reviews;

    public BoatType(long id, String name, Collection<ReviewData> reviews) {
        this.id = id;
        this.name = name;
        this.reviews = reviews;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public Collection<ReviewData> getReviews() { return reviews; }

}
