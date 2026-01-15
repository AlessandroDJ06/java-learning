package oefening2;

import java.util.Comparator;

public class ProductComperator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrijs(), o1.getPrijs());
    }
}
