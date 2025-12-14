package Winkelmandje;

import java.util.*;

public class ShoppingBasket {
    private HashSet<OrderLine> orderLines;

    public ShoppingBasket(){
        this.orderLines = new HashSet<>();
    }

    public void addItem(Item item){
        OrderLine adding = new OrderLine(item,1);
        for (OrderLine orderLine : orderLines){
            if (orderLine.equals(adding)){
                orderLine.incrementAmount();
                return;
            }
        }
        orderLines.add(new OrderLine(item,1));
    }

    public void removeItem(Item item){
        orderLines.remove(new OrderLine(item,1));
    }

    public double getPrice(){
        double amount = 0;
        for (OrderLine orderLine : orderLines) {
            amount += orderLine.getPrice() * orderLine.getAmount();
        }
        return amount;
    }

    public List<OrderLine> itemsSortedById(){
        List<OrderLine> sorted = new ArrayList<>(orderLines);
        sorted.sort(Comparator.comparing(oL -> oL.getItem().getId()));
        return sorted;
    }

    public List<OrderLine> itemsSortedByName(){
        List<OrderLine> sorted = new ArrayList<>(orderLines);
        sorted.sort(Comparator.comparing(oL -> oL.getItem().getTitle()));
        return sorted;
    }

    public List<OrderLine> itemsSortedByPrice(){
        List<OrderLine> sorted = new ArrayList<>(orderLines);
        sorted.sort(Comparator.comparing(OrderLine::getPrice));
        return sorted;
    }
}
