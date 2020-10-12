package W3.labsheet6.exercise1;

//TestPerson.java
/*This driver program tests out the class Person fully*/

import labsheet6.exercise1.Person;

import javax.swing.*;

public class TestPerson
{
    public static void main(String[] args)
    {
        String text,firstName,lastName;

        text = "Calling the Person() constructor .....";
        labsheet6.exercise1.Person person1 = new labsheet6.exercise1.Person();
        text += "\nValue of first Person object is: " + person1;

        text += "\n\nCalling the Person(String,String) constructor after getting user-supplied values .....";

        firstName = JOptionPane.showInputDialog("Please enter the first name of the second person");
        lastName = JOptionPane.showInputDialog("Please enter the last name of the second person");

        labsheet6.exercise1.Person person2 = new Person(firstName, lastName);
        text += "\nValue of second person object is: " + person2;

        JOptionPane.showMessageDialog(null,"*****Person Class Tester*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
