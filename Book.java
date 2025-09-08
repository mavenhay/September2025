public class Book {
    String title;
    int year;
    double price;

    public Book(String title, int year, double price){
        this.title = title;
        this.year = year;
        this.price = price;
    }
    public void display(){
        System.out.println("Title: "+ title);
        System.out.println("Year: "+ year);
        System.out.println("Price: "+ price);
        System.out.println("====================\n");
    }
}
