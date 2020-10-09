package labsheet4.excercise3;

import labsheet3.Computer;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();

        output += "Calling the no-argument Book constructor. " +
                "The first book object details are: \n\n" + b1.toString();

        Book b2 = new Book("The Davinci Code",19.99f,32531332,16,550);

        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}

