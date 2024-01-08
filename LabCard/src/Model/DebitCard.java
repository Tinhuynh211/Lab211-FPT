/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DebitCard extends Card{
    private LocalDate dateValid;
    private double amountRemaind;

    public DebitCard(LocalDate dateValid, double amountRemaind, String cardId, int cardNumber, LocalDate dateRelease, int cardType) {
        super(cardId, cardNumber, dateRelease, cardType);
        this.dateValid = dateValid;
        this.amountRemaind = amountRemaind;
    }

    public LocalDate getDateValid() {
        return dateValid;
    }

    public void setDateValid(LocalDate dateValid) {
        this.dateValid = dateValid;
    }

    public double getAmountRemaind() {
        return amountRemaind;
    }

    public void setAmountRemaind(double amountRemaind) {
        this.amountRemaind = amountRemaind;
    }
@Override
    public void showMe() {
        System.out.printf("%-10s%-12d%-15s%-5d%-15s%-13.2f\n",cardId,cardNumber,dateRelease.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),cardType,dateValid.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),amountRemaind);    
    }

    @Override
    public String toString() {
        return cardId + "," + cardNumber + "," + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dateRelease) + "," + cardType + "," + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dateValid) + "," + amountRemaind;
    }
    
    
}
