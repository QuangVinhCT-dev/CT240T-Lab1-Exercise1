public class ElectronicProduct extends Product implements Discountable {
    private static final double VAT = 0.10;
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() * (1 + VAT);
    }

    @Override
    public void applyDiscount(double percent) {
        setPrice(getPrice() * (1 - percent / 100));
    }

    public int getWarrantyMonths() { return warrantyMonths; }
    public void setWarrantyMonths(int w) { this.warrantyMonths = w; }
}
