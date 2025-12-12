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
        System.out.println("winkelmandje:\n" + basket);
        System.out.println("TOTAAL: " + basket.getPrice());
        basket.removeItem(book);
        System.out.println("\nwinkelmandje na verwijderen:\n" + basket);
        System.out.println("TOTAAL: " + basket.getPrice());
    }
}
