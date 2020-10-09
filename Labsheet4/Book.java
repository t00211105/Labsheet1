package Labsheet4;

public class Book {
    private static String ISBN;
    private int pages;
    private String title;
    private double price;

    public Book(){
        ISBN="ISBN Not Available";
        pages=0;
        price=0;
        title="Title Not Available";


    }
    public Book(String title,double price,String ISBN,int pages){
        this.title =title;
        this.price=price;
        this.ISBN=ISBN;
        this.pages=pages;

    }

    public Book(String title_not_available, int i, String not_available) {
    }

    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getPages(){
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        if(price>0)
            this.price = price;
    }

    public static void setISBN(String ISBN) {
        Book.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static void main(String[] args) {

    }
    public String toString(){
        return "Title: " + getTitle() + " Price: " + getPrice() + " ISBN: " + getISBN() + " Pages: " + getPages();
    }

}
