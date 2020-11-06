package W6.lab10.sampleprogram1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Student implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String studentID;
    private String course;

    public Student(){
        this("Undefined","Undefined",null,"Undefined","Undefined");
    }
    public Student(String name,String address,GregorianCalendar dateOfBirth, String studentID, String course){
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStudentID(studentID);
        setCourse(course);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public abstract String getCategory();


    public String toString() {
        String str = "Lecturer name is " + getName() +
                "\nLecturer address is " + getAddress() +
                "\nLecturer date of birth is";
    if (getDateOfBirth()!=null)
    {
        //Need to get the date of birth as a Date for display purposes.
        //The toString() method from the GregorianCalendar class inherits
        //that from its superclass Calendar but this only displays the
        //calendar data in a non-friendly format like the default
        //toString() from the Object class
        Date dob = getDateOfBirth().getTime();
        //Need to use get the date of birth out on screen in a particular
        //way i.e. DD-MM-YYYY format. The SimpleDateFormat class in
        //java.text does the job. Interestingly, "MM" has to be in capitals
        //or else you would be displaying milliseconds rather than month
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        String strDob = formatDate.format(dob);
        str+=strDob;
    }
    else
        str+="Undefined";

    str+="\nLecturer ID is " + getStudentID() +
         "\nLecturer Course is " + getCourse() +
         "\nLecturer Category is " + getCategory();
        return str;
    }
}
