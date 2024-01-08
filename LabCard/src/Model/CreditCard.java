/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class CreditCard extends Card{
    private LocalDate dateValid;
    private double amountDue, amountMax;   

    public CreditCard(LocalDate dateValid, double amountDue, double amountMax, String cardId, int cardNumber, LocalDate dateRelease, int cardType) {
        super(cardId, cardNumber, dateRelease, cardType);
        this.dateValid = dateValid;
        this.amountDue = amountDue;
        this.amountMax = amountMax;
    }

    public LocalDate getDateValid() {
        return dateValid;
    }

    public void setDateValid(LocalDate dateValid) {
        this.dateValid = dateValid;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(double amountMax) {
        this.amountMax = amountMax;
    }
    @Override
    public void showMe() {
        System.out.printf("%-10s%-12d%-15s%-5d%-15s%-13.2f%-13.2f\n",cardId,cardNumber,dateRelease.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),cardType,dateValid.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),amountDue,amountMax);     
    }
    
    @Override
    public String toString() {
        return cardId + "," + cardNumber + "," + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dateRelease) + "," + cardType + "," + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dateValid) + "," + amountDue + "," + amountMax;
    }        
}
