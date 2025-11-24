package farmapp;

/**
 * @author Denise Balasmeh
 * 24701351
 * Cow.java
 */

public class Cow extends Animal {//SUBCLASS
    private boolean isMilking;
    private double litresProduced;
    private boolean isPregnant;

    public Cow() {
    }

    public Cow(boolean isMilking, double litresProduced, boolean isPregnant, int id, String gender, double age, boolean isAlive, double weight, boolean isHealthy) {
        super(id, gender, age, isAlive, weight, isHealthy);
        this.isMilking = isMilking;
        this.litresProduced = litresProduced;
        this.isPregnant = isPregnant;
    }

    public boolean isIsPregnant() {
        return isPregnant;
    }

    public void setIsPregnant(boolean isPregnant) {
        this.isPregnant = isPregnant;
    }

    public boolean isIsMilking() {
        return isMilking;
    }

    public void setIsMilking(boolean isMilking) {
        this.isMilking = isMilking;
    }

    public double getLitresProduced() {
        return litresProduced;
    }

    public void setLitresProduced(double litresProduced) {
        this.litresProduced = litresProduced;
    }
    
    
    
}
