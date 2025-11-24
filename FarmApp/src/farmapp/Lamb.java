package farmapp;

/**
 * @author Denise Balasmeh
 * 24701351
 * Lamb.java
 */

public class Lamb extends Animal {//SUBCLASS
    private int woolLength;
    private boolean isLeaned;

    public Lamb() {
    }

    public Lamb(int woolLength, boolean isLeaned, int id, String gender, double age, boolean isAlive, double weight, boolean isHealthy) {
        super(id, gender, age, isAlive, weight, isHealthy);
        this.woolLength = woolLength;
        this.isLeaned = isLeaned;
    }

    public boolean isIsLeaned() {
        return isLeaned;
    }

    public void setIsLeaned(boolean isLeaned) {
        this.isLeaned = isLeaned;
    }

    public int getWoolLength() {
        return woolLength;
    }

    public void setWoolLength(int woolLength) {
        this.woolLength = woolLength;
    }
    
    
}
