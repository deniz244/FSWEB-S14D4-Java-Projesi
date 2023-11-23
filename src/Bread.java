import com.workintech.productForSale.enums.BreadType;
import com.workintech.productForSale.enums.Type;

public class Bread extends ProductForSale{

    private BreadType breadType;

    public Bread(double price, Type type, String description, BreadType breadType) {
        super(price, type, description);
        this.breadType = breadType;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread type: " + breadType);
    }
}
