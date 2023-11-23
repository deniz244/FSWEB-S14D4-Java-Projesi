import com.workintech.productForSale.enums.Cflavor;
import com.workintech.productForSale.enums.Type;

public class Coke extends ProductForSale{

    private Cflavor cflavor;

    public Coke(double price, Type type, String description, Cflavor cflavor) {
        super(price, type, description);
        this.cflavor = cflavor;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke flavor: " + cflavor);
    }
}
