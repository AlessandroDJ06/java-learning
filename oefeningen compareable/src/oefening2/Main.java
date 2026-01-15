package oefening2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] p = {new Product("p1",105.50),new Product("p2",155.50),new Product("p3",100.50)};
        ArrayList<Product> products = new ArrayList<>(Arrays.asList(p));
        System.out.println("voor sortering");
        for (Product product : products){
            System.out.println(product.getPrijs());
        }
        products.sort(new ProductComperator());
        System.out.println("na sortering");
        for (Product product : products){
            System.out.println(product.getPrijs());
        }
    }
}
