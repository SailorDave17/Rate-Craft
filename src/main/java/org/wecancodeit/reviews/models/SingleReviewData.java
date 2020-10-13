package org.wecancodeit.reviews.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SingleReviewData {
    protected SingleReviewData() {}

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne

    private SingleBoat singleBoat;
    private int speed;
    private int comfort;
    private int multiDayTripSuitability;
    private int coolFactor;
    private int price;
    private int practicality;

    public SingleReviewData(SingleBoat singleBoat, int speed, int comfort, int multiDayTripSuitability, int coolFactor, int price, int practicality) {
        this.singleBoat = singleBoat;
        this.speed = speed;
        this.comfort = comfort;
        this.multiDayTripSuitability = multiDayTripSuitability;
        this.coolFactor = coolFactor;
        this.price = price;
        this.practicality = practicality;
    }

    public SingleBoat getBoatType() { return singleBoat; }
    public int getSpeed(){
        return speed;
    }
    public int getComfort(){
        return comfort;
    }
    public int getMultiDayTripSuitability(){
        return multiDayTripSuitability;
    }
    public int getCoolFactor(){
        return coolFactor;
    }
    public int getPrice(){
        return price;
    }
    public int getPracticality(){
        return practicality;
    }
}
