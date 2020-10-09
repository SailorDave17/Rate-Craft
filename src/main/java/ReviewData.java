public class ReviewData {
    private int speed;
    private int comfort;
    private int multiDayTripSuitability;
    private int coolFactor;
    private int price;
    private int practicality;

    public ReviewData(int speed, int comfort, int multiDayTripSuitability, int coolFactor, int price, int practicality) {
        this.speed = speed;
        this.comfort = comfort;
        this.multiDayTripSuitability = multiDayTripSuitability;
        this.coolFactor = coolFactor;
        this.price = price;
        this.practicality = practicality;
    }

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
