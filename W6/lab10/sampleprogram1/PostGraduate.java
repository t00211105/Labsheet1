package W6.lab10.sampleprogram1;

import java.util.GregorianCalendar;

public class PostGraduate extends Student {
    private String researchSupervisor;

    public PostGraduate(){
        setResearchSupervisor("Undefined");
    }
    public PostGraduate(String nm,String addr,GregorianCalendar dob, String sid,String cnm, String supervisor){
        super(nm,addr,dob,sid,cnm);
        setResearchSupervisor(supervisor);
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

