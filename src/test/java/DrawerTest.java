import operations.Code;
import operations.Drawer;
import org.junit.Before;
import org.junit.Test;
import products.Cola;
import products.Product;

import static org.junit.Assert.assertEquals;

public class DrawerTest {
    Code code;
    Drawer drawer;
    Product product;

    @Before
    public void before() {
        drawer = new Drawer(Code.A1, 1.00);
        product = new Cola("Cola", "CocaCola");

    }

    @Test
    public void canGetProductCount() {
        assertEquals(0, drawer.getProductCount());
    }

    @Test
    public void canAddProduct() {
        drawer.addProduct(product);
        assertEquals(1, drawer.getProductCount());
    }
    @Test
    public void canRemoveProduct(){
        drawer.addProduct(product);
        drawer.removeProduct(product);
        assertEquals(0, drawer.getProductCount());
    }
}


