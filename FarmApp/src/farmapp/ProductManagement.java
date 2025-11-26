/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmapp;

/**
 *
 * @author safia
 */
public class ProductManagement {
    
    private int prod_id;
    private String prod_name;
    private String expiry_date;
    private double prod_quantity;
    
    public ProductManagement(int prod_id, String prod_name, String expiry_date,double prod_quantity){
        this.prod_name = prod_name;
        this.prod_id = prod_id;
        this.expiry_date = expiry_date;
        this.prod_quantity = prod_quantity;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public double getProd_quantity() {
        return prod_quantity;
    }

    public void setProd_quantity(double prod_quantity) {
        this.prod_quantity = prod_quantity;
    }

    
    
    public String printDetails(){
        return prod_id+","+prod_name+","+expiry_date+ "," + prod_quantity;
    }
}
