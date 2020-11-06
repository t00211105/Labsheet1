package W4.labsheet8.ex2;

//Person.java
/*An instantiable Person class that acts as a superclass for the Lecturer class. This version
 * demonstrates the use of protected attributes and methods*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bicycle extends Vehicle{
    protected int gearCount;
    protected boolean hasABell;

    public Bicycle(){
        setHasABell(false);
        setGearCount(0);
    }



    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model,boolean hasABell, int maxPassengers){
        setGearCount(gearCount);
        setHasABell(hasABell);
    }

    protected int getGearCount() {
        return gearCount;
    }

    protected void setGearCount(int gears) {
        gearCount = gears;
    }

    public boolean getHasABell() {
        return hasABell;
    }

    public void setHasABell(boolean bell) {
        hasABell = bell;
    }


    public String toString(){
        String str = super.toString() + "\nHas Bell: ";

        if(getHasABell())
            str+="Yes";
        else
            str+="No";

        str += "\nGear Count: " + getGearCount();
        return str;
    }
}
