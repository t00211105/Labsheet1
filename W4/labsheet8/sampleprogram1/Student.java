package W4.labsheet8.sampleprogram1;

//Lecturer.java
/*An instantiable Lecturer class that inherits from a Person superclass*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student extends Person {

    private int id;
    private String dept;

    public Student(){
        setId(0);
        setDept("No department specified");
    }

    public Student(String name, String address, GregorianCalendar dateOfBirth, int id, String dept) {
        super(name,address,dateOfBirth);
        setId(id);
        setDept(dept);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString(){
        String str = "Lecturer Name: " + name + "\nLecturer Address: " + address + "\nLecturer Date of Birth: ";

        if(dateOfBirth==null)
            str+="No date of birth specified";
        else
            str+=dateOfBirth.get(Calendar.DATE) + "-" + dateOfBirth.get(Calendar.MONTH) +
                    "-" + dateOfBirth.get(Calendar.YEAR) ;

        str+= "\nLecturer ID: " + getId() + "\nLecturer Department: " + getDept() + "\n";

        return str;
    }
}
