package org.wecancodeit.reviews.models;

import org.wecancodeit.reviews.storage.HashtagStorage;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Review {
    protected Review() {
    }

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne

    private Category category;
    private String manufacturer;
    private String modelName;
    @Lob
    private String description;
    private String name;
    @ManyToMany(mappedBy = "associatedReviews")
    private Set<Hashtag> associatedHashtags = new HashSet<>();

    public Review(Category category, String manufacturer, String modelName, String description) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.description = description;
        this.name = manufacturer + " " + modelName;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public String getDescription() {
        return description;
    }

    public Set<Hashtag> getAssociatedHashtags() {
        return associatedHashtags;
    }

    public void addHashtag(Hashtag hashtag){
        this.associatedHashtags.add(hashtag);
        hashtag.getReviews().add(this);
    }

    public void removeHashtag(Hashtag hashtag){
        this.associatedHashtags.remove(hashtag);
        hashtag.getReviews().remove(this);
    }

    @PreRemove
    public void unlinkHashtagsFromReview() {
        for (Hashtag hashtag : this.associatedHashtags) {
            this.removeHashtag(hashtag);
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public void associateHashtag(Hashtag hashtag) {
//        associatedHashtags.add(hashtag);
//    }

}


