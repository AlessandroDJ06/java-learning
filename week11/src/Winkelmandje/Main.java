package Winkelmandje;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("B1011", 32.49, "Titel", "auteur1");
        book.addAuthor("auteur2");
        Movie movie = new Movie("F0125", 15.95, "Filmtitel", "acteur1");
        movie.addActor("acteur2");
        movie.addActor("acteur3");
        ShoppingBasket basket = new ShoppingBasket();
        basket.addItem(book);
        basket.addItem(book);
        basket.addItem(movie);
        System.out.println("winkelmandje volgens id:");
        System.out.printf("%8s%40s%8s%6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for (OrderLine orderLine : basket.itemsSortedById()) {
            System.out.println(orderLine);
        }
        System.out.println("TOTAAL: " + basket.getPrice());
        System.out.println("winkelmandje volgens naam:");
        System.out.printf("%8s%40s%8s%6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for (OrderLine orderLine : basket.itemsSortedByName()) {
            System.out.println(orderLine);
        }
        System.out.println("TOTAAL: " + basket.getPrice());
        System.out.println("winkelmandje volgens prijs:");
        System.out.printf("%8s%40s%8s%6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for (OrderLine artikelLijn : basket.itemsSortedByPrice()) {
            System.out.println(artikelLijn);
        }
        System.out.println("TOTAAL: " + basket.getPrice());
    }
}
