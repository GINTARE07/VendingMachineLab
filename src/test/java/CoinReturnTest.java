import coins.Coin;
import coins.CoinReturn;
import coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {
    Coin coin ;
    CoinReturn coinReturn;

    @Before
    public void before(){
        coin = new Coin(CoinType.FIVE_P);
//        coins = new ArrayList<>();
//    }
//    @Test
//    public void canGetCoinCount(){
//        assertEquals(0, coins.getCoinCount());
//    }
//    @Test
//    public void canAddCoinsToTheMachine(){
//        coins.addCoins(coin);
//        assertEquals(1, coins.getCoinsCount());
//    }
}
