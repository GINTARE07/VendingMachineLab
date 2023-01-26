package coins;

import org.omg.CORBA.PRIVATE_MEMBER;

public enum CoinType {
    ONE_P(0.01),
    TWO_P(0.02),
    FIVE_P(0.05),
    TEN_P(0.10),
    TWENTY_P(0.20),
    FIFTY_P(0.50),
    POUND(1.00),
    TWO_POUND(2.00);

    final double value;

    CoinType(double value){
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

}
