package Winkelmandje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingBasket {
    private List<OrderLine> orderLines;

    public ShoppingBasket(){
        this.orderLines = new ArrayList<>();
    }

    public void addItem(Item item){
        orderLines.add(new OrderLine(item ,1));
    }

    public void removeItem(Item item){
        Iterator<OrderLine> it = orderLines.iterator();
         while(it.hasNext()){
             OrderLine orderLine = it.next();
             if (orderLine.getItem().equals(item)){
                 it.remove();
             }
         }
    }

    public double getPrice(){
        double amount = 0;
        Iterator<OrderLine> it = orderLines.iterator();
        while(it.hasNext()){
            OrderLine orderLine = it.next();

            amount += orderLine.getPrice() * orderLine.getAmount();
        }
        return amount;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nnummer    beschrijving                  aantal\n");
        for (OrderLine orderLine : orderLines){
            sb.append(orderLine).append("\n");
        }

        return sb.toString();
    }



}
