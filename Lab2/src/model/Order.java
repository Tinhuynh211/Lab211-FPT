/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Order {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private double amout;

    public Order(int id, String name, int quantity, double price, double amout) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.amout = amout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

   

    @Override
    public String toString() {
        return "" + "" + name + "       " + quantity + "        " + price + "       " + amout  ;
    }
   
    
   
  
}
