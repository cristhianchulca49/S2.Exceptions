package Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sale {
    private List<Product> products = new ArrayList<>();
    private double totalPrice = 0;

    public Sale(List<Product> products) {
        this.products.addAll(products);
    }

    public void calculateTotalPrice() {
        try {
            if (products.isEmpty()) {
                throw new EmptySaleException("To make a sale, you need to add products first");
            }
            for (Product product : products) {
                totalPrice = totalPrice + product.getPrice();
            }
            System.out.println("Total price: " + totalPrice);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
