public class Main {
    public static void main(String[] args) {
        Book book = new Book("How to train the dragon", "Apiluk", 1000.00);
        book.applyDiscount(-20);
        book.applyDiscount(25.00);
        book.displayDetails();

        System.out.println("===================================");

        Book book2 = new Book("Khuam sayong 2 rum 1", "gipsee", 800.00);
        book2.applyDiscount(0);
        book2.applyDiscount(50);
        book2.displayDetails();
    }
}
