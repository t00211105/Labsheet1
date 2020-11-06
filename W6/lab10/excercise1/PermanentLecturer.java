package W6.lab10.excercise1;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer{
    private String pensionEntitlements;
    private String status;

    public PermanentLecturer(){
        this.pensionEntitlements="Undefined";
        this.status="Undefined";
    }
    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught,GregorianCalendar dateOfAppointment,String status,String PE){
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        if (pensionEntitlements==null)
            this.pensionEntitlements ="undefined";
        else
            this.pensionEntitlements=pensionEntitlements;
    }

    public void setStatus(String status) {
        if (status==null)
            this.status = "inactive";
        else
            this.status=status;
    }

    public String getStatus() {
        if(status!="Full-time Post-Doctorate"||status!="Part-time Visiting Lecturer") {
            status += "Full-time Post-Doctorate";
        }
        else {
            setStatus(status);
        }
            return status;
    }

    public void getPointOnScale() {
        getDateOfAppointment().getTime();
        SimpleDateFormat formatDate3 = new SimpleDateFormat("dd-MM-yyyy");
        formatDate3.format(getDateOfAppointment());


     return;
    }

}
