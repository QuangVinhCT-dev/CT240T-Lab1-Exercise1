
import java.util.*;

/**
 * 
 */
public abstract class Product {

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private double Price;

    /**
     * @return
     */
    public double calculateFinalPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public String getID() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public double getPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(double price) {
        // TODO implement here
        return null;
    }

}