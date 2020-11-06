package W4.labsheet8.sampleprogram2;

//TestPerson.java
/*This driver program tests out the classes Person and Lecturer fully*/

import javax.swing.*;
import java.util.GregorianCalendar;

public class TestPerson
{                                                      
    public static void main(String[] args)             
    {   
        String text;
        
        text = "Calling the Person() constructor .....";                                              
        Person person1 = new Person();
        text += "\nValue of first Person object is: " + person1;

		text += "\n\nCalling the Person(String,String,GregorianCalendar) constructor after getting user-supplied values .....";
		
		String name = JOptionPane.showInputDialog("Please enter the name of the second person");
		String address = JOptionPane.showInputDialog("Please enter the address of the second person");
        String dateOfBirth = JOptionPane.showInputDialog("Please enter the date of birth of the second person in the form dd-mm-yyyy");

        int day = Integer.parseInt(dateOfBirth.substring(0,2));
        int month = Integer.parseInt(dateOfBirth.substring(3,5));
        int year = Integer.parseInt(dateOfBirth.substring(6,10));

        GregorianCalendar birthDate = new GregorianCalendar(year,month,day);

        Person person2 = new Person(name, address,birthDate);
        text += "\nValue of second person object is: " + person2;


        text += "\n\nCalling the Lecturer() constructor .....";
        Student student1 = new Student();

        text += "\nValue of first Lecturer object is: " + student1;

        text += "\n\nCalling the Lecturer(String,String,GregorianCalendar,int,String) constructor using hard-coded values .....";
        Student student2 = new Student("Michael O' Connor","Ballybunion, Co. Kerry",
                           new GregorianCalendar(1996,4,12),425362,"Computing");

        text += "\nValue of second Lecturer object is: " + student2;

        JOptionPane.showMessageDialog(null,"*****Person and Lecturer Class Tester*****\n\n" + text,"",
                                      JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }                                      
}                                                      