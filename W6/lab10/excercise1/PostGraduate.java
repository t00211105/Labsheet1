package W6.lab10.excercise1;

import java.util.GregorianCalendar;

public class PostGraduate extends Lecturer {
    private String researchSupervisor;

    public PostGraduate(){
        setResearchSupervisor("Undefined");
    }

    public String getStatus() {
        return null;
    }

    public void getPointOnScale() {

    }

    public PostGraduate(String nm,String addr,GregorianCalendar dob, String sid,String cnm, String svr){
        super();
        setResearchSupervisor(svr);
    }

    public String getResearchSupervisor() {
        return researchSupervisor;
    }

    public void setResearchSupervisor(String researchSupervisor) {
        this.researchSupervisor = researchSupervisor;
    }

    public String getCategory(){
        return "Postgraduate";
    }

    public String toString() {
        return super.toString() + "\nLecturer research supervisor is " + getResearchSupervisor();
    }
}

