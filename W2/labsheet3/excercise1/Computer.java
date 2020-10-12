package W2.labsheet3.excercise1;

 public class Computer {
    private String manufacturer;
    private String type;

    public Computer(){
       manufacturer ="Not available";
       type = "Not avialable";

    }

    public Computer(String manufacturer,String type,double speed,int RAM,double price){
        this.manufacturer=manufacturer;
        this.type=type;

    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getType(){
        return type;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

     public String toString(){
        return "Manufacturer: " + getManufacturer() + " Type:" + getType();

    }
}
