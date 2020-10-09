package labsheet4.excercise3;

public class Book {
    private String title;
    private String ISBN;
    private double price;
    private int pages;

    public Book(){
         title="Not available";
        ISBN= "Not avialable";
        price=0;
        pages=0;
    }

    public Book(String title,double price,String ISBN,int pages){
        this.title=title;
        this.ISBN=ISBN;
        this.price=price;
        this.pages=pages;
    }

    public Book(String the_davinci_code, float v, int i, int i1, int i2) {
    }

    public String getTitle(){
        return title;
    }
    public String getISBN(){
        Integer.parseInt(ISBN);
        return ISBN;
    }
    public double getPrice(){
        return price;
    }

    public int getPages() {
        return pages;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String type) {
        this.ISBN = ISBN;
    }

    public void setPrice(double price) {
        if(price>0)
            this.price = price;
    }


    public void setPages(int pages) {
        if(pages>0)
            this.pages = pages;
    }

    public String toString(){
        return "Title: " + getTitle() + " Price: " + getPrice() +
                " ISBN: " + getISBN() + " Pages:" + getPages();

    }
}
