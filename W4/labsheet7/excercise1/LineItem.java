package W4.labsheet7.excercise1;

//LineItem.java
/*A simple instantiable class definition for an line-item which also demonstrates
the OO concept of aggregation*/

public class LineItem {
    private int id;
    private int quantity;
    private Product product;
    //private int count;

    public LineItem(int id, int quantity, Product product) {
        //incrementCount();
        setId(id);
        setQuantity(quantity);
        setProduct(product);
    }
    /*private void incrementCount() {
        count=100000
        count++;
    }
    public static int getCount(){
        return count;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString() {
        return "LineItem Details are as follows: \n\nid: " + getId() + "\nquantity:" + getQuantity() + "\n" + getProduct() + "\n\n";
    }
}



