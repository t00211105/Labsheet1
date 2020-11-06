package W4.labsheet8.ex2;

//Lecturer.java
/*An instantiable Lecturer class that inherits from a Person superclass*/

import java.util.Calendar;

public class Car extends Vehicle {

    private int maxPassengers;
    private String registrationNumber;

    public Car() {
        setMaxPassengers(0);
        setRegistrationNumber("No department specified");
    }

    public Car(double pr, double len, double hgt, double wgt, String mft, String mod, int passnum, String reg) {
        super(pr, len, hgt, wgt, mft, mod);
        setMaxPassengers(passnum);
        setRegistrationNumber(reg);
    }

    public void setMaxPassengers(int num) {
        maxPassengers = num;
    }

    public void setRegistrationNumber(String reg) {
        registrationNumber = reg;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String toString() {
        return super.toString() + "\nMax passengers: " + getMaxPassengers() + "\nRegistration Number: " + getRegistrationNumber();
    }
}