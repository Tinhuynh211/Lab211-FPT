/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;


public class Lab4 {
    private final int bairac; 
public Lab4(int B){
    bairac = B;
}
    public static void soBaiRac(){  
        int B = 0;
        int time = 30; 
        int dem = 1;     
        for(int i = 0;i<arr.length-1;i++){           
            B += i;
            time += 8;
            if (B > 10000){
                B = i;
                time +=30;
                dem++;
            }           
        }
        int tiendorac = 57000*dem;
        System.out.println("So tien do rac la:"+ tiendorac);
    }
    public static void soPhut(){  
        int B = 0;
        int time = 30; 
        int dem = 1;     
        for(int i = 0;i<arr.length-1;i++){           
            B += i;
            time += 8;
            if (B > 10000){
                B = i;
                time +=30;
                dem++;
            }   
        }
        int tiencong = 2000*time;
        System.out.println("So tien cong phai tra:" +tiencong);
    }
    public static void main(String[] args) {
        Lab4[] arr = new arr[4];
        arr[1] = new Lab4(1000);
        arr[2] = new Lab4(2000);
        arr[3] = new Lab4(1000);
        arr[4] = new Lab4(2100);
    for (int i=1;i<=arr.length;i++){
        arr[i].Sobairac();
        arr[i].soPhut();
    }         
    }
}


    