package W5.lab9.excercise1;

//Boss.java
/*A subclass of the Employee class*/

import W5.lab9.sampleProgram1.Employee;

public final class Boss extends Employee {

    private double weeklySalary;

    public Boss(String firstName, String lastName, double weeklySalary) {
        super(firstName,lastName);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary>0)
            this.weeklySalary=weeklySalary;
        else
            this.weeklySalary=0;
    }



    //don't need to define a getWeeklySalary() accessor here because earnings() does the same job


    public double earnings() {
        return weeklySalary;
    }

    public String toString() {
        return "Boss's name is " + super.toString();
    }
}