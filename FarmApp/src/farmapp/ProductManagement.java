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
    
    private String product_name;
    private String unit;
    private String expiry_date;
    private double prod_quantity;
    
    public ProductManagement(String product_name,String unit, String expiry_date,double prod_quantity){
        this.product_name = product_name;
        this.unit = unit;
        this.expiry_date = expiry_date;
        this.prod_quantity = prod_quantity;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
        return product_name+","+unit+","+expiry_date+ "," + prod_quantity;
    }
}
