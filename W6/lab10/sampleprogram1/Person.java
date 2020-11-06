package W6.lab10.sampleprogram1;

import java.util.GregorianCalendar;

public interface Person {
    public abstract String getName();
    public abstract String getAddress();
    public abstract GregorianCalendar getDateOfBirth();
    public abstract void setName(String nm);
    public abstract void setAddress(String addr);
    public abstract void setDateOfBirth(GregorianCalendar dob);
}
