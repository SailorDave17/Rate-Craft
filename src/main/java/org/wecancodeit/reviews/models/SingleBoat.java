package org.wecancodeit.reviews.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class SingleBoat {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "singleBoat")
    private Collection<SingleReviewData> reviews;

    protected SingleBoat(){}

    public SingleBoat(String name) {
        this.name = name;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public Collection<SingleReviewData> getReviews() { return reviews; }

}
