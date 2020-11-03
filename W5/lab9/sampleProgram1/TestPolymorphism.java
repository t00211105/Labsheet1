package W5.lab9.sampleProgram1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

import W5.lab9.excercise1.Boss;

public class TestPolymorphism {
    public static void main(String args[])
    {
        Employee employeeRef; //a reference to the Employee superclass
        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);

        employeeRef=b1; //recall a Boss "is a" Employee so this assignment is allowed

        //will now use the Employee reference object to display the correct information via polymorphism

        System.out.println(employeeRef.toString() + " and the earnings were €" +

                String.format("%.2f",employeeRef.earnings()));

        employeeRef=hw1; //recall that an HourlyWorker "is a" Employee so this is okay too

        //will now use the Employee reference object to display the correct information via polymorphism

        //note the generic nature of the code here

        System.out.println("\n" + employeeRef.toString() + " and the earnings were €" +

                String.format("%.2f",employeeRef.earnings()));
    }
}