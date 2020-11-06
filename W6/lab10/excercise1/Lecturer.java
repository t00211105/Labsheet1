package W6.lab10.excercise1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer() {
        this("Undefined", "Undefined", null, "Undefined", null);
    }

    public Lecturer(String nm, String addr, GregorianCalendar dob, String sid, String cnm) {
        setName(nm);
        setAddress(addr);
        setDateOfBirth(dob);
        setStaffID(sid);
        setCoursesTaught(coursesTaught);
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
    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public abstract String getStatus();
    public abstract void getPointOnScale();


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

    str+="\nLecturer ID is " + getStaffID() +
         "\nLecturer Course is " + getCoursesTaught() +
         "\nLecturers' Date Of Appointment is ";
            if (getDateOfBirth()!=null)
        {
            //Need to get the date of birth as a Date for display purposes.
            //The toString() method from the GregorianCalendar class inherits
            //that from its superclass Calendar but this only displays the
            //calendar data in a non-friendly format like the default
            //toString() from the Object class
            Date doa = getDateOfAppointment().getTime();
            //Need to use get the date of birth out on screen in a particular
            //way i.e. DD-MM-YYYY format. The SimpleDateFormat class in
            //java.text does the job. Interestingly, "MM" has to be in capitals
            //or else you would be displaying milliseconds rather than month
            SimpleDateFormat formatDate1 = new SimpleDateFormat("dd-MM-yyyy");
            String strDoA = formatDate1.format(doa);
            str+=strDoA;
        }
        else
            str+="Undefined";
        return str;
    }
}
