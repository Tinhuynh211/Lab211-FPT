/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
import java.util.Scanner;

public class Lab6 {

    
    public static void main(String[] args) {
        Library lb = new Library();
       
       
            int n,m;
        do{            
            System.out.println("Library Management");
            System.out.println("-----------------------------");
            System.out.println("1.List all books");
            System.out.println("2.Search book");
            System.out.println("3.Add new book");
            System.out.println("4.Exit");
            System.out.println("-----------------------------");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch(n){
                case 1 :
                    lb.readFile();
                    break;
                case 2 :
                do{  
                    System.out.println("Book searching");
                    System.out.println("---------------------");
                    System.out.println("1.Find by BookID");
                    System.out.println("2.Find by Title");
                    System.out.println("3.Find by Author");
                    System.out.println("4.Find by Year of publising");
                    System.out.println("---------------------");
                    Scanner sb = new Scanner(System.in);
                    m = sb.nextInt();
                    switch(m){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                }while(n<=4&n>=1);
                case 3 :
                    break;
                case 4 :
                    return;
            }       
   }while(n<=4&n>=1);
    
}
}
