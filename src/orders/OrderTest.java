package orders;

import catalogue.Basket;
import catalogue.Product;
import middle.*;
/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;*/

import java.util.List;
import java.util.Map;

//import static org.junit.Assert.fail;

/**
 * A JUnit test of the Order class
 */
public class OrderTest 
{
 /* private final int ORDER_NUMBER1 = 7;     // number
  private final int ORDER_NUMBER2 = 8;     // number
  private final int ORDER_NUMBER3 = 10;    // number
  private Basket theBought1 = null;        // items
  private Basket theBought2 = null;        // items
  private StockReadWriter theStock = null; // list
  private OrderProcessing theOrder = null; //

  @Before
  public void setUp()
  {
    // Local access to StockList / Order system
    MiddleFactory mf = new LocalMiddleFactory();
    try
    {
      theStock = mf.makeStockReadWriter(); // access
      theOrder = mf.makeOrderProcessing(); // order
    } catch (Exception e) {
      fail("Exception " + e.getMessage());
    }
  
    theBought1 = new Basket();              // bought
    theBought1.setOrderNum( ORDER_NUMBER1 );
    theBought2 = new Basket();              // bought
    theBought2.setOrderNum( ORDER_NUMBER2 );
  
    try 
    {
      Product pr = theStock.getDetails("0001");
      theBought1.add(pr);
      theBought2.add(pr);
     } catch (StockException e) {
      fail("StockException " + e.getMessage());
    }
  }
  
  @After
  public void tearDown() throws Exception 
  {
  }
  
  @Test
  public void test() 
  {
    try
    {
      boolean ok;
      //Introduce two orders
      theOrder.newOrder( theBought1 );  // ORDER_NUMBER1
      theOrder.newOrder( theBought2 );  // ORDER_NUMBER2
      // Check if "Waiting" ORDER_NUMBER1 & ORDER_NUMBER2

      //Get order to pick
      Basket o2p = theOrder.getOrderToPick();
      // Check if is ORDER_NUMBER1
      // Check if ORDER_NUMBER1 is "BeingPicked"
      // Check if ORDER_NUMBER2 is still "Waiting"
      
     //Check [order number 1] completion of being "picked"
      ok = theOrder.informOrderPicked( ORDER_NUMBER1 );

     //Check if [order number 3]can be completed
     // This should fail as no [order no 3]
      ok = theOrder.informOrderPicked( ORDER_NUMBER3 );
          
      //Check if [order number 1] removed from system
      ok = theOrder.informOrderColected( ORDER_NUMBER1 );

      //Check if [order number 3] removed from system
      // Order number 3 does not exist
      ok = theOrder.informOrderColected( ORDER_NUMBER3 );

      // Progress [order number 2]
      //Get order to pick
      o2p = theOrder.getOrderToPick();
      // Check if is ORDER_NUMBER2
 
     //Check [order number 2] completion of being "picked"
      ok = theOrder.informOrderPicked( ORDER_NUMBER2 );

      ok = theOrder.informOrderColected( ORDER_NUMBER2 );
    } catch ( Exception e )
    {
      fail( "Exception " + e.getMessage() );
    }
  
  }*/
  
}

