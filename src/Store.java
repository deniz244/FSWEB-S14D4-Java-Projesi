import com.workintech.productForSale.enums.BreadType;
import com.workintech.productForSale.enums.Cflavor;
import com.workintech.productForSale.enums.Flavor;
import com.workintech.productForSale.enums.Type;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] productForSales = {new Chocolate(21, Type.SNACK,"çikolata", Flavor.ALMOND),
                new Coke(15,Type.DRINK,"kola", Cflavor.LIGHT),
                new Bread(18,Type.BAKERY,"ekmek", BreadType.RYE)
        };

        listProducts(productForSales);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i = 0; i < products.length; i++ ){
            products[i].showDetails();
        }
    }
}