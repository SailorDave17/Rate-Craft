package org.wecancodeit.reviews.models;

public class ReviewData {

    private BoatType boatType;
    private int speed;
    private int comfort;
    private int multiDayTripSuitability;
    private int coolFactor;
    private int price;
    private int practicality;

    public ReviewData(BoatType boatType,int speed, int comfort, int multiDayTripSuitability, int coolFactor, int price, int practicality) {
        this.boatType = boatType;
        this.speed = speed;
        this.comfort = comfort;
        this.multiDayTripSuitability = multiDayTripSuitability;
        this.coolFactor = coolFactor;
        this.price = price;
        this.practicality = practicality;
    }

    public BoatType getBoatType() { return boatType; }
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
