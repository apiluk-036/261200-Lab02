public class Book {
    String title;
    String author;
    double price;

    Book(){
        this("Unknown title", "Unknown author", 0.0);
    }

    Book(String title){
        this(title, "Unknown author", 0.0);
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public void updatePrice(double newPrice){
        if(newPrice >= 0)
            this.price = newPrice;
        else{
            System.out.println("มันบ่มีหนังสือนี้ คิงเอาอันใดมา");
        }
    }


    public void applyDiscount(double discountPercent) {
        if(discountPercent > 0 && discountPercent < 100) {
            double discountAmount = (discountPercent / 100.0) * price;
            price -= discountAmount;
            System.out.println("Applied discount: " + discountPercent + "%");
        } else {
            System.out.println("Invalid discount: " + discountPercent + "%. Must be between 0 and 100 (exclusive).");
        }
    }
}
