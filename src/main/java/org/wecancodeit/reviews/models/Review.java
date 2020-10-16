package org.wecancodeit.reviews.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
    protected Review() {}

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne

    private Category category;
    private String manufacturer;
    private String modelName;
    private String description;

    public Review(Category category, String manufacturer, String modelName, String description) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.description = description;
    }
public long getId() {
        return id;
}
    public Category getCategory() { return category; }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModelName(){
        return modelName;
    }
    public String getDescription() { return description; }
}
