package W3.LabSheet5.excercise4;

public class BankAccount {
    private String owner;
    private int number;
    private double interestRate;



    public static void main(String[] args) {

    }
    public BankAccount(){
        this("",0,0);

    }
    public BankAccount(String owner, int number,double interestRate) {
        setOwner(owner);
        setNumber(number);
        setInterestRate(interestRate);
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String toString() {
        return "BankAccount{" +
                "owner='" + getOwner() + '\'' +
                ", number=" + getNumber() +
                ", interestRate=" + getInterestRate()+
                '}';
    }
}
