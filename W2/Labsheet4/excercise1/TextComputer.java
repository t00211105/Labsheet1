package W2.Labsheet4.excercise1;

import labsheet3.Computer;

import javax.swing.*;

public class TextComputer {
    public static void main(String[] args) {
        String output="";

        Computer c1 = new Computer();

        output += "Calling the no-argument Computer constructor. " +
        "The first Computer object details are: \n\n" + c1.toString();

        /*labsheet3.Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);
        c2.setSpeed(-3.15);
        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\nManufacturer: " + c2.getManufacturer() + "  Type: " + c2.toString();
        labsheet3.Computer c3 = new Computer("Apple", "Tablet",3.65,-16,-500.25);
        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The third Computer object details are: \n\nManufacturer: " + c2.getManufacturer() + "  Type: " + c3.toString();*/
        JOptionPane.showMessageDialog(null,output,"Computer Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}