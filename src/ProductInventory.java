import java.util.ArrayList;
import java.util.List;

public class ProductInventory {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product p) { products.add(p); }

    public boolean removeProduct(String id) {
        return products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase()))
                result.add(p);
        }
        return result;
    }

    public double getTotalValue() {
        double total = 0;
        for (Product p : products) total += p.calculateFinalPrice();
        return total;
    }
}
