package LabSheet5.excercise4;
import javax.swing.*;
import java.awt.*;

public class TestBankAccount {
    public static void main(String[] args) {
        int number;
        String owner;
        double interestRate;
        String output="";

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(font);

        BankAccount b1 = new BankAccount();

        output+="Calling  the no-argument Bank Account constructor. The first BankAccount object details are:\n\n " +
        "Owner: " + b1.getOwner() + " Account number: " + b1.getNumber() + " Interest Rate: " + b1.getInterestRate();

        BankAccount b2 = new BankAccount();
        b2.setOwner("Richy Rich");
        b2.setNumber(2342343);
        b2.setInterestRate(0.5);
        output+="Calling  the multi-argument Bank Account constructor. The second BankAccount object details are:\n\n " +
                "Owner: " + b2.getOwner() + " Account number: " + b2.getNumber() + " Interest Rate: " + b2.getInterestRate();

        b1.setInterestRate(0.5);
        output+="Now  calling the setInterestRate() method to change the interest rate to 0.5.\n\nThe first BankAccount object details are:\n\n " +
                "Owner: " + b1.getOwner() + " Account number: " + b1.getNumber() + " Interest Rate: " + b1.getInterestRate();

        b2.setInterestRate(0.5);
        output+="Now  calling the setInterestRate() method to change the interest rate to 0.5.\n\nThe first BankAccount object details are:\n\n " +
                "Owner: " + b2.getOwner() + " Account number: " + b2.getNumber() + " Interest Rate: " + b2.getInterestRate();



    }

}
