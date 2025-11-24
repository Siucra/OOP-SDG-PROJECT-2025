package farmapp;

/**
 * @author Denise Balasmeh
 * 24701351
 * Chicken.java
 */

public class Chicken extends Animal{
    private int eggQty;
    private double eggQuality;
    private boolean isLayingEggs;

    public Chicken() {
    }

    public Chicken(int eggQty, double eggQuality, boolean isLayingEggs, int id, String gender, double age, boolean isAlive, double weight, boolean isHealthy) {
        super(id, gender, age, isAlive, weight, isHealthy);
        this.eggQty = eggQty;
        this.eggQuality = eggQuality;
        this.isLayingEggs = isLayingEggs;
    }

    public boolean isIsLayingEggs() {
        return isLayingEggs;
    }

    public void setIsLayingEggs(boolean isLayingEggs) {
        this.isLayingEggs = isLayingEggs;
    }

    public int getEggQty() {
        return eggQty;
    }

    public void setEggQty(int eggQty) {
        this.eggQty = eggQty;
    }

    public double getEggQuality() {
        return eggQuality;
    }

    public void setEggQuality(double eggQuality) {
        this.eggQuality = eggQuality;
    }
    
    
    
}
