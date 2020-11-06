package W6.lab10.sampleprogram1;

import java.util.GregorianCalendar;

public class UnderGraduate extends Student {
    private double gpa;

    public UnderGraduate(){
        setGPA(0);
    }
    public UnderGraduate(String nm,String addr,GregorianCalendar dob, String sid,
                         String cnm,double gpa){
        super(nm,addr,dob,sid,cnm);
        setGPA(gpa);
    }

    public double getGPA() {
        return gpa;
    }

    public String getCategory() {
        return "UnderGraduate";
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString()+"\nLecturer GPA is " + getGPA();
    }
}
