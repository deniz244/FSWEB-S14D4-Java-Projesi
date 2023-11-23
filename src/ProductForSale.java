import com.workintech.productForSale.enums.Type;

public abstract class ProductForSale {

    private double price;
    private Type type;
    private String description;

    public ProductForSale(double price, Type type, String description) {
        this.price = price;
        this.type = type;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }
    public abstract void showDetails();

}
