  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import Controller.Manager;
import java.util .Scanner;



public class Lab3 {
    private final static Scanner sc = new Scanner(System.in); 
   
    public static void main(String[] args) {
        Manager n = new Manager();       
        int choose;   
     do{
        System.out.println("=======CANDIDATE MANAGEMENT SYSTEM=======");
        System.out.println("1.Experience");
        System.out.println("2.Fresher");
        System.out.println("3.Internship");
        System.out.println("4.Searching");
        System.out.println("5.Update");
        System.out.println("6.Delete"); 
        System.out.println("7.Exit");
        System.out.println("Your choose:");
        choose = Manager.checkInputIntLimit(1, 7);
        switch(choose){
            case 1 : n.addExperience();
                     n.showListExperience();
                     n.CheckYNN();                             
                     break;  
            case 2 : n.addFresher();
                     n.showListFresher();
                     n.CheckYNNN();
                     break;
            case 3 : n.addIntern();
                     n.showListIntern();
                     n.CheckYNNNN();
                     break;
            case 4 : n.findCandidate();
                     break;
            case 5 : n.updateDataByCandidateType();
                     break; 
            case 6 : n.deleteData();
                     break;
            case 7 : break;
        }               
    }while(choose < 7 && choose >=1);   
   }
}
