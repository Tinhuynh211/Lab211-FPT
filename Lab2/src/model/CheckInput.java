/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Scanner;


public class CheckInput {         
    public int inputID(List<Fruit> listFruit){
        int a = 0;
        Scanner sb = new Scanner(System.in);
        boolean flag = false;
        while(flag == false)
            try{
               System.out.println("Enter ID :(>5)");
               a = Integer.parseInt(sb.nextLine());              
                if (a > 0){
                    flag = true;
                }
               for (int i = 0; i < listFruit.size(); i++){
                   if(a == listFruit.get(i).getFruitId()){
                       flag = false;
                   }
               }          
            }                                         
            catch(NumberFormatException e){
                flag = false;           
            }
        return a;
    }   
    public String inputName(){
        String name = null;
        Scanner sn = new Scanner(System.in);
        boolean flag = false;
        while(flag == false){          
            System.out.println("Enter Name Fruit :");
            name = sn.nextLine();           
            flag = name.matches("[A-Za-z\\s]+");               
        }
        return name;
    }
    public double inputPrice(){
        double b = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(flag == false)
            try{
                System.out.println("Enter Price :");
                b = Double.parseDouble(sc.nextLine());               
                if (b > 0){
                    flag = true;
                }
            }  
            catch(NumberFormatException e){ 
                flag = false;
            }
        return b;
    }
    public int inputQuantity(){
       int c = 0;
        Scanner sb = new Scanner(System.in);
        boolean flag = false;
        while(flag == false)
            try{
               System.out.println("Enter Quantity :");
               c = Integer.parseInt(sb.nextLine());
               if (c > 0){
                    flag = true;
               }
            }
            catch(NumberFormatException e){
                flag = false;           
            }
        return c;
    }        
    public String inputOrigin(){
        String origin = null;
        Scanner sn = new Scanner(System.in);
        boolean flag = false;
        while(flag == false){          
            System.out.println("Enter Fruit Origin :");
            origin = sn.nextLine();           
            flag = origin.matches("[A-Za-z\\s]+");               
        }
        return origin;
    }
    public String checkYN(){ 
        String choose = "null";
        Scanner sm = new Scanner(System.in);                
        boolean flag = false;
        while(flag == false){
            System.out.println("Do you want to continue (Y/N)?");
            choose = sm.nextLine();
            flag = choose.equalsIgnoreCase("Y")||choose.equalsIgnoreCase("N");
        }
        return choose;               
        } 
    public String checkYNN(){
        String choose = "null";
        Scanner sm = new Scanner(System.in);                
        boolean flag = false;
        while(flag == false){
            System.out.println("Do you want to order now (Y/N)?");
            choose = sm.nextLine();
            flag = choose.equalsIgnoreCase("Y")||choose.equalsIgnoreCase("N");
        }
        return choose;      
    }
}
    

