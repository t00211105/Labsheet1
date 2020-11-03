package W4.labsheet8.ex2;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle(){
        this(0,0,0,0,"No manufacturer specified","No model specified");

    }
    public Vehicle(double pr,double len, double hgt, double wgt, String mft, String mod){
        setPrice(pr);
        setLength(len);
        setHeight(hgt);
        setWeight(wgt);
        setManufacturer(mft);
        setModel(mod);

    }

    public void setPrice(double pr) {
        this.price = pr;
    }

    public void setLength(double len) {
        this.length = len;
    }

    public void setHeight(double hgt) {
        this.height = hgt;
    }

    public void setWeight(double wgt) {
        this.weight = wgt;
    }

    public void setManufacturer(String mft) {
        this.manufacturer = mft;
    }

    public void setModel(String mod) {
        this.model = mod;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }


    public String toString() {
        return "price: " + getPrice() +
                "\nlength: " + getLength() +
                "\nheight: " + getHeight() +
                "\nweight: " + getWeight() +
                "\nmanufacturer: " + getManufacturer() +
                "\nmodel: " + getModel();
    }
}
