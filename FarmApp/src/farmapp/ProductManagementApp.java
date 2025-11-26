/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmapp;

/**
 *
 * @author safia
 */
public class ProductManagementApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductManagementGUI myGUI = new ProductManagementGUI();
        myGUI.setVisible(true);
    }
      //Cow
       // public String printDetails(){
        // return product_name+","+unit+","+expiry_date+ "," + prod_quantity;
        Cow c = new Cow ("Cow Milk", "20 litres", "27/12/2025" );
        
       //Chicken
        Chicken ch = new Chicken("");
    
       //Lamb
        Lamb la = new Lamb ();
    
       
 
    
}
