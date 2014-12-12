package clients.cashier;

import catalogue.Basket;
import catalogue.BetterBasket;
import middle.MiddleFactory;

/**
 * Created by Richard on 10/12/2014.
 */
public class betterCashierModel extends CashierModel
{

    /**
     * Construct the model of the Cashier
     *
     * @param mf The factory to create the connection objects
     */
    public betterCashierModel(MiddleFactory mf) {
        super(mf);
    }

    @Override
    protected Basket makeBasket()
    {
        return new BetterBasket();
    }
}
