
import java.util.*;

/**
 * 
 */
public abstract class ElectronicProduct extends Product implements Discountable {

    /**
     * Default constructor
     */
    public ElectronicProduct() {
    }

    /**
     * 
     */
    private int warrantyMonths;

    /**
     * @return
     */
    public double calculateFinalPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param percent 
     * @return
     */
    public void applyDiscount(double percent) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getWarrantyMonths() {
        // TODO implement here
        return 0;
    }

    /**
     * 
     */
    public void applyDiscount(percent: double): void() {
        // TODO implement here
    }

}