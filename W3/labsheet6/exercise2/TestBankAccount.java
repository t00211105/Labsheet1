package W3.labsheet6.exercise2;

import labsheet6.exercise2.BankAccount;

import javax.swing.*;
public class TestBankAccount {


//TestBook.java
        /*A driver class for the BankAccount class*/


    public static void main(String[] args) {
        String output = "";

        labsheet6.exercise2.BankAccount account1 = new labsheet6.exercise2.BankAccount();

        output += "Calling the no-argument BankAccount constructor. " +
                "The first BankAccount object details are: \n\n" + account1.toString();

        labsheet6.exercise2.BankAccount account2 = new labsheet6.exercise2.BankAccount("Richy Rich",0.75);

        output += "\n\nCalling the multi-argument BankAccount constructor. " +
                "The second BankAccount object details are: \n\n" + account2.toString();

        labsheet6.exercise2.BankAccount.setInterestRate(0.5);

        output += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5. " +
                "\n\nThe first BankAccount object details are: \n\n" + account1.toString() +
                "\n\nThe second BankAccount object details are: \n\n" + account2.toString() +
                "\n\nThe number of BankAccount objects created is: " + BankAccount.getCount();



        JOptionPane.showMessageDialog(null,output,"BankAccount Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}

