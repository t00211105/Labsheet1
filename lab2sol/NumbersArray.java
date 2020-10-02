package labsheet2;

//NumbersArray.java
/*This program initialises an array of 8 double values and then calls on 3 user-defined methods to
 *determine the largest value, the average value and the list of numbers that are above the average*/

import javax.swing.JOptionPane;

public class NumbersArray {
    public static void main(String args[])
    {
        double numbers[] = {22.3,45.6,27.4,56.6,73.2,11.5,87.4,23.8};

        String output;

        output = "The largest value in the array is " + largest(numbers) +
                "\nThe average value in the array is " + String.format("%.3f",average(numbers)) +
                "\nThe list of values above the average is: " + aboveAverage(numbers,average(numbers));

        JOptionPane.showMessageDialog(null,output,"Array Stats",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static double largest(double[] numbers)
    {
        double largest = numbers[0];

        for(int i=1; i<numbers.length; i++)
            if(numbers[i]>largest)
                largest = numbers[i];

        return largest;
    }

    public static double average(double[] numbers)
    {
        double total = 0;

        for(int i=0; i<numbers.length; i++)
            total += numbers[i];

        return total/numbers.length;
    }

    public static String aboveAverage(double[] numbers,double average)
    {
        String listAboveAverage="";

        for(int i=0; i<numbers.length; i++)
            if(numbers[i]>average)
                listAboveAverage += numbers[i] + " ";

        return listAboveAverage;
    }
}





