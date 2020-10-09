package LabSheet5.exercise1;

//Book.java
/*An instantiable class which defines a Book*/

class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;
    private static int count;
    public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

    public Book(String title, double price, String ISBN, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);

    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Title: " + getTitle() + "  Price: " + getPrice() +
                "  ISBN: " + getISBN() + "  Number of Pages: " + getPages();
    }


}
