package Level1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Sale sale = new Sale();
        sale.calculateTotalPrice();

        sale.addNewProduct(new Product("Laptop", 100));
        sale.addNewProduct(new Product("Tablet", 200));
        sale.addNewProduct(new Product("Mouse", 300));
        sale.addNewProduct(new Product("Mouse", 500));
        sale.calculateTotalPrice();

    }
}
