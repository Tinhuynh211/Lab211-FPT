/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.CheckInput;

public class Main {       
    public static void main(String[] args) {        
        CheckInput c = new CheckInput();
        Manager b = new Manager();
        int choose = 0;        
        Scanner sb = new Scanner(System.in);
        do{ System.out.println("FRUIT SHOP");
            System.out.println("1.Create Fruit");
            System.out.println("2.View order");
            System.out.println("3.Shopping(buyer)");
            System.out.println("4.Exit");                  
            System.out.println("Enter choosen :");
            choose =  sb.nextInt();
            switch(choose){
            case 1 : b.addFruit();
            boolean h = true;
            while(h == true){
                     switch(c.checkYN()){
                        case("N"):b.showFruitList();
                        h = false;
                        break;                    
                        case("Y"):b.addFruit();
                        h = true;
                        break;
                     }
            }
                     break;                    
            case 2 : b.viewOrder();   
            break;
            case 3 :b.showFruitList();
                    b.orderFruit();
                    boolean g = true;
            while(g == true){
                     switch(c.checkYNN()){
                        case("N"):b.showFruitList();
                                  b.orderFruit();                                          
                        g = true;
                        break;                    
                        case("Y"):b.showOrder();
                                  b.createCustomer();                                 
                                  b.showFruitList();
                        g = false;
                        break;
                     }
            } 
                    break;
            case 4 : break;           
            }  
        }while(choose <4 && choose >=1);
    }
}
