/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AtmCard;
import Model.CreditCard;
import Model.DebitCard;



    public class CardException {
    public boolean checkCredit(CreditCard c, double money){
        //AmountDue + Money
        if (c.getAmountDue()+money>c.getAmountMax()) return false;
        else return true;
    }
    public boolean checkDebit(DebitCard d, double money){
        if (d.getAmountRemaind()>money) return true;
        else return false;
    }
    public boolean checkATM(AtmCard a, double money){
         if (a.getAmount()>money) return true;
        else return false;
    }
}
