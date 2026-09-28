
import java.util.*;

/**
 * 
 */
public abstract class ProductInventory {

    /**
     * Default constructor
     */
    public ProductInventory() {
    }

    /**
     * 
     */
    private List<Product> products;

    /**
     * @param p 
     * @return
     */
    public void addProduct(Product p) {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @return
     */
    public boolean removeProduct(String id) {
        // TODO implement here
        return false;
    }

    /**
     * @param keyword 
     * @return
     */
    public List<Product> findByName(String keyword) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getTotalValue() {
        // TODO implement here
        return 0.0d;
    }

}