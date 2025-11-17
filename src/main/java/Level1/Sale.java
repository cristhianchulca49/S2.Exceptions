package Level1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products = new ArrayList<>();
    private BigDecimal totalPrice;

    public void calculateTotalPrice() {
        try {
            if (products.isEmpty()) {
                throw new EmptySaleException("To make a sale, you need to add products first");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
