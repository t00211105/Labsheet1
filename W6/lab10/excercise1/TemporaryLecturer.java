package W6.lab10.excercise1;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer{
    private int hoursWorked;
    public TemporaryLecturer(){
    }
    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment,int hoursWorked){
        setHoursWorked(hoursWorked);
    }

    private void setHoursWorked(int hoursWorked) {
        if(hoursWorked>0)
        this.hoursWorked=hoursWorked;
        else
            this.hoursWorked=0;
    }


    public String getStatus() {
        return "Contracted temporary lecturer on part-time hours";
    }


    public void getPointOnScale() {
         getDateOfAppointment().getTime();
         SimpleDateFormat formatDate2 = new SimpleDateFormat("dd-MM-yyyy");
        formatDate2.format(getDateOfAppointment());

        getDateOfBirth().getTime();
        SimpleDateFormat formatDate3 = new SimpleDateFormat("dd-MM-yyyy");
        formatDate3.format(getDateOfAppointment());
        return;
    }
}
