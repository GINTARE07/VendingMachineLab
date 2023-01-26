package operations;

import coins.Coin;
import coins.CoinReturn;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> coins;
    private ArrayList<CoinReturn> coinReturns;

    public VendingMachine(){
        this.drawers = new ArrayList<>();
        this.coins = new ArrayList<>();
        this.coinReturns = new ArrayList<>();
    }
}
