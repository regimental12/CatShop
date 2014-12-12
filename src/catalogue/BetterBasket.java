package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  

  // You need to add code here

    @Override
    public boolean add( Product pr )
    {
        if(super.add(pr))
        {
            sortbasket();
            for(int i = 0 ; i < this.size() ; i++ )
            {
                if(this.get(i).getQuantity() == 0)
                {
                    this.remove(i);
                }
            }
            return true;
        }
        return false;

    }

    public void sortbasket()
    {
        Collections.sort(this , new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double f = o1.getPrice();
                double s = o2.getPrice();
                if(f == s)
                {
                    o2.setQuantity(o2.getQuantity() + 1);
                    o1.setQuantity(0);
                    return 0;
                }
                return f<s ? 1 : -1;
            }
        });
    }

}


