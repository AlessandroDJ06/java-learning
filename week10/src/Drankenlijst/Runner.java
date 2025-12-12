package Drankenlijst;

import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addDrink(new Drink("Coca Cola", 2.50, false));
        menu.addDrink(new Drink("Fanta Orange", 2.40, false));
        menu.addDrink(new Drink("Sprite", 2.30, false));
        menu.addDrink(new Drink("Heineken Bier", 3.20, true));
        menu.addDrink(new Drink("Koffie", 2.10, false));
        menu.addDrink(new Drink("Witte Wijn", 4.50, true));
        menu.addDrink(new Drink("Rode Wijn", 4.80, true));
        menu.addDrink(new Drink("Ice Tea", 2.60, false));
        menu.addDrink(new Drink("Whisky", 6.90, true));
        menu.addDrink(new Drink("Water Plat", 1.80, false));

        menu.getDranken().sort(Collections.reverseOrder());
        menu.printMenu();

        System.out.println("Totale prijs is: " + menu.getTotalPrice());

        System.out.println("het totale aantal drankjes is: " + menu.getSize());

        System.out.println("Duurste drankje is:" + menu.mostExpensiveDrink());

        System.out.println("our alcoholic drinks are: ");
        menu.getAlcoholicDrinks();

        menu.removeMoreExpensiveThen();

        System.out.println("menu without drinks above3€");
        menu.printMenu();
        menu.getAlcoholicDrinks();

        System.out.println("extended menu is: ");
        Drink[] extraDrinks = {
                new Drink("Ice Tea", 2.30, false),
                new Drink("Champagne", 12.50, true),
                new Drink("Sprite", 2.20, false),
                new Drink("Gin Tonic", 7.40, true)
        };

        menu.addDrinks(extraDrinks);
        menu.printMenu();

    }
}
