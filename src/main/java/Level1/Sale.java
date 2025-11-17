package Level1;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products = new ArrayList<>();
    private double totalPrice;

    public void addProduct() {

    }

    public void calculateTotalPrice() {
        try {
            if (products.isEmpty()) {
                throw new EmptySaleException("To make a sale, you need to add products first");
            }
            for (Product product : products) {
                totalPrice = totalPrice + product.getPrice();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
