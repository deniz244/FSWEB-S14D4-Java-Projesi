import com.workintech.productForSale.enums.Flavor;
import com.workintech.productForSale.enums.Type;

public class Chocolate extends ProductForSale{

    private Flavor flavor;

    public Chocolate(double price, Type type, String description, Flavor flavor) {
        super(price, type, description);
        this.flavor = flavor;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate flavor: " + flavor);
    }
}
