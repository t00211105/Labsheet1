package W2.labsheet3;

import labsheet3.Computer;

import javax.swing.*;

public class TextComputer{
    public static void main(String[] args) {
        String output="";

        labsheet3.Computer c1 = new labsheet3.Computer();

        output += "Calling the no-argument Computer constructor. " +
        "The first Computer object details are: \n\n" + c1.toString();

        labsheet3.Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);
        c2.setSpeed(-3.15);
        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\nManufacturer: " + c2.getManufacturer() + "  Type: " + c2.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}