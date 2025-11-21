/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmapp;

/**
 *
 * @author Denise Balasmeh
 * 24701351
 * Animal.java
 * 
 */
public class Animal {//PARENT CLASS
    private int id;
    private String gender;
    private double age; //months i.e 0.6 or years 2.5
    private boolean isAlive;
    private double weight;
    private boolean isHealthy;

    public Animal() {
    }

    public Animal(int id, String gender, double age, boolean isAlive, double weight, boolean isHealthy) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.isAlive = isAlive;
        this.weight = weight;
        this.isHealthy = isHealthy;
    }

    public boolean isIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    
    
    
}
