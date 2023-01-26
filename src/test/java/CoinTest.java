import coins.Coin;
import coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;

    @Before
    public void before(){
        coin = new Coin(CoinType.FIFTY_P);
    }
    @Test
    public void coinHasValue(){
        assertEquals(CoinType.FIFTY_P.getValue(), 0.5, 0.00);
    }


}
