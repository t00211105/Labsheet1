package W3.LabSheet5.exercise3;

import W3.LabSheet5.exercise3.Thermometer;

import javax.swing.*;
import java.awt.*;

public class TestThermometer {
    public static void main(String[] args) {
        int currentTemp,maxTemp,minTemp;
        String output = "";

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(font);

        W3.LabSheet5.exercise3.Thermometer t1 = new W3.LabSheet5.exercise3.Thermometer();

        JOptionPane.showInputDialog(null,"Please enter the current temperature of the first thermometer:","",JOptionPane.INFORMATION_MESSAGE);

        System.out.print(t1.getCurrentTemp());
        t1.setCurrentTemp(35);
        output+="Calling the single-argument constructor....setting the temperature of first thermometer to 35C" +
                "\nFirst Thermometer\nCurrent temperature: "+ t1.getCurrentTemp() +
                "\nMaximum temperature " + t1.getMaxTemp() + "\nMinimum temperature " + t1.getMinTemp();

        W3.LabSheet5.exercise3.Thermometer t2 = new W3.LabSheet5.exercise3.Thermometer();

        System.out.print(t2.getCurrentTemp());
        t2.setCurrentTemp(0);
        output+="\n\nCalling the no-argument constructor....setting the temperature of second thermometer to 0C" +
                "\nSecond Thermometer\nCurrent temperature: "+ t2.getCurrentTemp() +
                "\nMaximum temperature " + t2.getMaxTemp() + "\nMinimum temperature " + t2.getMinTemp();

        W3.LabSheet5.exercise3.Thermometer t3 = new Thermometer();

        System.out.print(t3.getCurrentTemp());
        t3.setCurrentTemp(25);
        t3.setMinTemp(25);
        t3.setMaxTemp(25);
        output+="\n\nCalling the no-argument constructor....setting the temperature of second thermometer to 0C" +
                "\nSecond Thermometer\nCurrent temperature: "+ t3.getCurrentTemp() +
                "\nMaximum temperature " + t3.getMaxTemp() + "\nMinimum temperature " + t3.getMinTemp();

        JOptionPane.showMessageDialog(null,output,"*****Thermomenter Testing***",JOptionPane.INFORMATION_MESSAGE);





    }
}
