/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.Candidate;
import Model.Experience;
import java.util.List;
import java.util.Scanner;


public class CheckInput { 
    private final static Scanner sc = new Scanner(System.in);
    public int checkInputInt(String mess,int min,int max){
        System.out.println(mess);
        while(true){
            String input = sc.nextLine();
            try{
                int number = Integer.parseInt(input);
                if(number < min || number > max){
                    System.err.println("Please input between : " + min + " - " + max + ": ");
                    continue;
                }
                return number;
            }
            catch(NumberFormatException e){
                System.out.println("Please input a integer number :");               
            }
        }                       
    }
    public String checkPhone(String mess){
        System.out.println(mess); 
        while(true){
            String input = sc.nextLine();
            try{
                int phone = Integer.parseInt(input);
                if(input.length()>10 || input.length()<10){
                    System.out.println("Please input 10 numbers for Phonenumber");
                    continue;
                }
                return input;
            }
            catch(NumberFormatException e){
                    System.out.println("Enter Phonenumber again :");                                               
                }
            }        
        }   
    public String checkInputRank(String mess){
        System.out.println(mess);        
        while(true){
            String input = sc.nextLine();           
                String rank = input;
                if(("Excellence").equals(rank) || ("Good").equals(rank) || ("Poor").equals(rank) || ("Fair").equals(rank) ){
                    return rank;
                }
                else{
                    System.err.println("Please input string: Excellence, Good, Fair, Poor");
                    System.out.print("Enter again: ");
                }                                
        }       
    }   
    public int checkInputBirthDay(String mess,int min,int max){
        System.out.println(mess);
        while(true){
            String input = sc.nextLine();
            try{
                int birthday = Integer.parseInt(input);
                if(birthday < min || birthday > max){
                    System.err.println("Please input between : " + min + " - " + max + ": ");
                    continue;
                }
                return birthday;
            }
            catch(NumberFormatException e){
                System.out.println("Please input a integer birthday :");               
            }
        }                       
    }
    public int checkYearofExperience(String mess,int min,int max){
     System.out.println(mess);
        while(true){
            String input = sc.nextLine();
            try{
                int years = Integer.parseInt(input);
                if(years < min || years > max){
                    System.err.println("Please input between : " + min + " - " + max + ": ");
                    continue;
                }
                
                return years;
            }
            catch(NumberFormatException e){
                System.out.println("Please input a integer years :");               
            }
        }                       
    }
    public String checkEmail(String mess){
        System.out.println(mess);
        String input = null;
        Scanner sn = new Scanner(System.in);
        boolean flag = false;
        while(flag == false){        
            input = sn.nextLine();
            if(input.matches("^(.+)@(.+)$")){
                flag = true;
            }
            else{
                flag = false;
                System.out.println("Wrong input please enter again :");
            }                         
        }
        return input;
        }                   
    public String checkInputString(String mess){
        System.out.println(mess);
        String input = null;
        Scanner sn = new Scanner(System.in);
        boolean flag = false;
        while(flag == false){        
            input = sn.nextLine();
            if(input.matches("[A-Za-z\\s]+")){
                flag = true;
            }
            else{
                flag = false;
                System.out.println("Wrong input please enter again :");
            }                         
        }
        return input;
    } 
    public int checkInputID(String mess,int min,int max,List<Candidate> listCandidate){
        System.out.println(mess);
        int id = 0;
        boolean flag = true;
        while(flag == true){
            String input = sc.nextLine();
            try{
                id = Integer.parseInt(input);
                if(id < min || id > max){
                    System.out.println("Invalid id"); 
                    flag = true;
                }
                else{
                    flag = false;
                }
                for(int i = 0; i < listCandidate.size(); i++){                    
                    if(id == listCandidate.get(i).getCandidateId()){
                        System.out.println("ID already exist");
                        System.out.println("Input again :");
                        flag = true;
                    }
                    else{                        
                        flag = false;
                    }
                }                                        
            }
            catch(NumberFormatException e){
                System.out.println("Please input a integer number :");
            }
        } 
        return id; 
    }
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
}
    


