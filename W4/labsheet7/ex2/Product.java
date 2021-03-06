package W4.labsheet7.ex2;

public class Product {
    private int id;
    private String name;
    private String description;


    public Product(int id,String name, String description) {
        setId(id);
        setName(name);
        setDescription(description);
    }
    public int getId() {
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
