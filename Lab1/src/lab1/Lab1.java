/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.Scanner;


public class Lab1 {

    
    public static void main(String[] args) {       
        int c = 0;
        int a , s;                    
        Scanner sb = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong :");
        int b = sb.nextInt();
        int[] arr = new int[b];
        System.out.print("Nhập các phần tử của mảng:\n");
        for (int i = 0; i < b; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sb.nextInt();
        }
        System.out.println("Cac phan tu cua mang :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < b - 1; i++){  
            boolean flag = false;
            for (int j = 0; j < b - i - 1; j++){                
                if (arr[j] > arr[j + 1]) {                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    c += 1;  
                    flag = true;
                }               
        }
            if(flag==false ) break;
        }
        System.out.println("\n");
        System.out.println("Mang sau khi sap xep :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("So vong lap la :"+c);        
        }      
    }

                
                
        
               
    



                       