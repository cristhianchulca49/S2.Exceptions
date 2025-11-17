package Level1;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products = new ArrayList<>();
    private double totalPrice = 0;

    public void addNewProduct(Product product) {
        products.add(product);
    }

    public String getProductName(int i) {
        try {
            return products.get(i).getName();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("you can only choose between 1 and " + products.size());
        }
        return "";
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
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }
}
