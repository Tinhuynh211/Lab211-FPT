/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Scanner;


public class CheckInput {
    public int getInteger(String msg, int min, int max) {
        String quantity;
        while (true) {
            try {
                quantity = getAndValidValue(msg, "[\\d.]+", "Invalid");
                int number = Integer.parseInt(quantity);
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                } else {
                    return number;
                }
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
    public String getAndValidValue(String msg, String regex, String cause) {
        String value;
        while (true) {
            try {
                value = getValue(msg);
                if (value.isEmpty()) {
                    throw new Exception("Input can not empty");
                }
                if (!value.matches(regex)) {
                    throw new Exception(cause);
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return value;
    }
    public String getValue(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextLine().trim();
    }
    public String getDate() {
        int nam = getInteger("Enter Year: ", 1900, 2023);
        int thang = getInteger("Enter Month: ", 1, 12);
        int ngay;
        if (thang == 2) {
            if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
                ngay = getInteger("Enter day: ", 1, 29);
            } else {
                ngay = getInteger("Enter day: ", 1, 28);
            }
        } else if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            ngay = getInteger("Enter day: ", 1, 31);
        } else {
            ngay = getInteger("Enter day: ", 1, 31);
        }
        String namm = String.valueOf(nam), thangg = String.valueOf(thang), ngayy = String.valueOf(ngay);
        if (thang < 10) {
            thangg = "0" + String.valueOf(thang);
        }
        if (ngay < 10) {
            ngayy = "0" + String.valueOf(ngay);
        }
        return ngayy+"/"+thangg+"/"+namm;
    }
    public String getString(String msg) {
        String value;
        while (true) {
            try {
                value = getValue(msg);
                if (value.isEmpty()) {
                    throw new Exception("Input can not empty");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return value;
    }
    public double getAndValidDouble(String msg) {
        String price;
        while (true) {
            try {
                price = getAndValidValue(msg, "[\\d.]+", "Invalid number");
                return Double.parseDouble(price);
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }
    }
    public double getMoney(String msg){
        double money;
        while(true){
            money=getAndValidDouble(msg);
            if (money<=0){
                System.out.println("Money >0");
            }
            else return money;
        }
    }
    public boolean checkInputYN(String mess) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mess);
        while (true) {
            String result = sc.nextLine();

            if (result.equalsIgnoreCase("Y")) {
                return true;
            }

            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    public boolean checkInputUD(String mess) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mess);
        while (true) {
            String result = sc.nextLine();

            if (result.equalsIgnoreCase("u")) {
                return true;
            }

            if (result.equalsIgnoreCase("d")) {
                return false;
            }
            System.err.println("Please input u/U or d/D.");
            System.out.print("Enter again: ");
        }
    }
}

