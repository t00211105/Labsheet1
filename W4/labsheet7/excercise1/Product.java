package W4.labsheet7.excercise1;

public class Product {
    private int id;
    private String name;
    private String description;
    private static int count = 1000000;


    public Product(String name, String description) {
        incrementCount();
        setId(count);
        setName(name);
        setDescription(description);
    }

    private void incrementCount() {
        count++;
    }

    public int getId() {
        //incrementCount();
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "Product details are as follows: id: " + getId() + "  name: " + getName() + "  description: " + getDescription();
    }

}
