package Drankenlijst;

import java.util.*;

public class Menu{
    private List<Drink> dranken;

    public Menu(){
        this.dranken = new ArrayList<>();
    }

    public void addDrink(Drink drink){
        dranken.add(drink);
    }

    public void printMenu(){
        for (Drink drink : dranken){
            System.out.println(drink + "; ");
        }
    }

    public int getSize(){
        return dranken.size();
    }

    public double getTotalPrice(){
        double total = 0;
        for (Drink drink : dranken){
            total += drink.getPrice();
        }
        return total;
    }

    public double mostExpensiveDrink(){
        double mostExpensive = 0;

        for (Drink drink : dranken){
            if (drink.getPrice() > mostExpensive){
                mostExpensive = drink.getPrice();
            }
        }

        return mostExpensive;
    }

    public void getAlcoholicDrinks(){
        for (Drink drink : dranken){
            if (drink.isAlcoholic()){
                System.out.print(drink + "; ");
            }
        }
    }

    public void removeMoreExpensiveThen(){
        Iterator<Drink> it = dranken.iterator();

        while(it.hasNext()){
            Drink drink = it.next();
            if (drink.getPrice() > 3.0){
                it.remove();
            }
        }
    }

    public void addDrinks(Drink[] drinks){
        dranken.addAll(Arrays.asList(drinks));
    }

    public List<Drink> getDranken(){
        return dranken;
    }





}
