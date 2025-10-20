package bibliotheek;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Y. Daniel Liang", "Introduction to Java programming", 1240);
        book1.setBorrowed(true);
        book1.printDetails();

        Book book2 = new Book();
        book2.setNumberOfPages(291);
        book2.setAuthor("Louis Paul Boon");
        book2.setTitle("De kapellekensbaan");
        book2.printDetails();

        Book book3 = new Book("Jef Geeraerts", "Drugs", 333);
        book3.setBorrowed(true);
        book3.printDetails();
    }
}
