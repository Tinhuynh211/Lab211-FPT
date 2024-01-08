/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.CheckInput;
import model.Customer;
import model.Fruit;
import model.Order;

public class Manager {

    CheckInput nt = new CheckInput();
    Scanner sc = new Scanner(System.in);
    private List<Fruit> listFruit = new ArrayList<>();
    private List<Customer> listCustomer = new ArrayList<>();
    private List<Order> listOrder = new ArrayList<>();

    public Manager() {
        listFruit.add(new Fruit(1, "Coconut", 2, 3, "VietNam"));
        listFruit.add(new Fruit(2, "Orange", 3, 3, "United States"));
        listFruit.add(new Fruit(3, "Apple", 4, 3, "Thailand"));
        listFruit.add(new Fruit(4, "Grape", 6, 3, "France"));
    }

    public void addFruit() {
        int id = nt.inputID(listFruit);
        double price = nt.inputPrice();
        int quantity = nt.inputQuantity();
        String name = nt.inputName();
        String origin = nt.inputOrigin();
        Fruit f = new Fruit(id, name, price, quantity, origin);
        listFruit.add(f);
    }

    public void showFruitList() {
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ | Quantity");
        for (int i = 0; i < listFruit.size(); i++) {
            System.out.println(listFruit.get(i).toString());
        }
        if (listFruit.isEmpty()) {
            System.out.println("List fruit is empty");
        }
    }

    public void orderFruit() {         
        boolean checkQuantity = true;
        boolean searchResult = true;
        while (searchResult == true) {
            int idorder = -1;
            int index = -1;
            int choice;
            int quantity = 0;
            System.out.println("your choice :");
            choice = sc.nextInt();           
            for (int i = 0; i < listFruit.size(); i++) {
                if (choice == listFruit.get(i).getFruitId()) {
                    System.out.println("You selected :" + listFruit.get(i).getFruitName());
                    index = i;
                    searchResult = false;
                    break; 
                }
            }            
            if (index == -1) {
                searchResult = true;
                System.out.println("ID do not exist");
            } else {
                while (checkQuantity == true){
                    System.out.println("Quantity:");
                    quantity = sc.nextInt();                 
                        if(quantity > listFruit.get(index).getQuantity()){
                            System.out.println("Out of Fruit");  
                            checkQuantity = true;                          
                        }
                        else{
                            checkQuantity = false;
                        }
                    }               
                    for(int i = 0; i < listOrder.size();i++){
                        if(choice == listOrder.get(i).getId()){
                            idorder = i;
                            int newquantity = listOrder.get(i).getQuantity() + quantity;
                            listOrder.get(i).setQuantity(newquantity);
                            double newamout = listOrder.get(i).getPrice() * newquantity;
                            listOrder.get(i).setAmout(newamout);                           
                        }                                             
                    }
                    if(idorder == -1){
                            int setquantity = listFruit.get(index).getQuantity() - quantity;
                            listFruit.get(index).setQuantity(setquantity);
                            int idfruit = listFruit.get(index).getFruitId();
                            String fruitOrder = listFruit.get(index).getFruitName();
                            double amout = (listFruit.get(index).getPrice() * quantity);
                            double price = listFruit.get(index).getPrice();
                            Order o = new Order(idfruit,fruitOrder, quantity, price, amout);
                            listOrder.add(o);                                                 
                    }
                    break;
                }
            }
        }          
    public void createCustomer(){ 
        String name;
        Scanner sbb = new Scanner(System.in);
        System.out.println("Input your name :");
        name = sbb.nextLine();
        Customer a = new Customer(name);
        listCustomer.add(a);
    }
    
    public void viewOrder() {               
        for (int i = 0; i < listCustomer.size(); i++) {            
                System.out.println(listCustomer.get(i).getName());            
        }
        System.out.println("Product | Quantity | Price | Amount");
        for (int j = 0; j < listOrder.size(); j++) {
            System.out.println(listOrder.get(j).toString());
        }
        System.out.print("Total :");
        System.out.println(totalPrice());
        if (listOrder.isEmpty()) {
            System.out.println("List order is empty");
        } 
    }

    public double totalPrice() {
        double price = 0;
        for (int i = 0; i < listOrder.size(); i++) {
            price += listOrder.get(i).getAmout();
        }
        return price;
    }

    public void showOrder() {
        System.out.println("Product | Quantity | Price | Amount");
        for (int i = 0; i < listOrder.size(); i++) {
            System.out.println(listOrder.get(i).toString());
        }
    }
    
    
}


