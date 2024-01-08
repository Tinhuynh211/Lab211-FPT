/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class AtmCard extends Card {
    private double amount;

    public AtmCard(double amount, String cardId, int cardNumber, LocalDate dateRelease, int cardType) {
        super(cardId, cardNumber, dateRelease, cardType);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
@Override
    public void showMe() {
        System.out.printf("%-10s%-12d%-15s%-5d%-13.2f\n",cardId,cardNumber,dateRelease.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),cardType,amount);
    }

    @Override
    public String toString() {
        return cardId + "," + cardNumber + "," + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dateRelease) + "," + cardType  + "," + amount;
    }
    
}
