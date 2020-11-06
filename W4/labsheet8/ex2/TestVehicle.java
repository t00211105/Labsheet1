package W4.labsheet8.ex2;

//TestPerson.java
/*This driver program tests out the classes Person and Lecturer fully*/

import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import javax.swing.*;
import java.util.GregorianCalendar;

class TestVehicle
{
    public static void main(String[] args)
    {
        String text;

        System.out.println("Testing the Car() no-arg constructor: ");
        Car c1 = new Car();
        System.out.println(c1);

        System.out.println("Testing the Car() multi-arg constructor: ");
        Car c2 = new Car(1000,4.5,1.25,2000,"Ferrari","F2",2,"05KY1");
        System.out.println(c2);

        System.out.println("Testing the Bicycle() no-arg constructor: ");
        Bicycle b1 = new Bicycle();
        System.out.println(b1);

        System.out.println("Testing the Bicycle() no-arg constructor: ");
        Bicycle b2= new Bicycle(500,1.5,1,50,"Raleigh","MountainBike",true,4);
        System.out.println(b2);
    }
}