import main.ExtendableVendingMachine;
import main.vending.Product;
import main.vending.product.Chocolate;
import main.vending.product.SaltySnack;
import main.vending.product.SoftDrink;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtendableVendingMachineTest {
   
   @Test
   void shouldBeAbleToBuyAProduct() {
      ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(5, 10, 15);
      
      SoftDrink softDrink = new SoftDrink();
      SaltySnack saltySnack = new SaltySnack();
      Chocolate chocolate = new Chocolate();
      Product product = new Product();
   
      assertEquals("This is a soft drink", softDrink.description() );
      vendingMachine.buy(softDrink);
      vendingMachine.buy(softDrink);
      assertEquals(3, vendingMachine.getStock(softDrink));
   
      assertEquals("This is a salty snack", saltySnack.description() );
      vendingMachine.buy(saltySnack);
      vendingMachine.buy(saltySnack);
      assertEquals(8, vendingMachine.getStock(saltySnack));
   
      assertEquals("This is a chocolate", chocolate.description() );
      vendingMachine.buy(chocolate);
      vendingMachine.buy(chocolate);
      assertEquals(13, vendingMachine.getStock(chocolate));
   }
   
   @Test
   void shouldBeAbleToAddStock() {
      ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(0, 5, 0);
      
      SoftDrink softDrink = new SoftDrink();
      SaltySnack saltySnack = new SaltySnack();
      Chocolate chocolate = new Chocolate();
      Product product = new Product();
   
      assertEquals(5, vendingMachine.getStock(product));
      
      assertEquals("This is a soft drink", softDrink.description() );
      vendingMachine.addStock(softDrink);
      vendingMachine.addStock(softDrink);
      assertEquals(6, vendingMachine.getStock(softDrink));

      assertEquals("This is a salty snack", saltySnack.description() );
      vendingMachine.addStock(saltySnack);
      vendingMachine.addStock(saltySnack);
      assertEquals(11, vendingMachine.getStock(saltySnack));

      assertEquals("This is a chocolate", chocolate.description() );
      vendingMachine.addStock(chocolate);
      assertEquals(3, vendingMachine.getStock(chocolate));
   
      assertEquals(20, vendingMachine.getStock(product));
   
      assertEquals("This is a product", product.description() );
      vendingMachine.addStock(product);
      assertEquals(20, vendingMachine.getStock(product));
   }
   
   @Test
   void shouldBeAbleToBuyASpecificQuantityForProduct() {
      ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(10, 15, 20);
      
      SoftDrink softDrink = new SoftDrink();
      SaltySnack saltySnack = new SaltySnack();
      Chocolate chocolate = new Chocolate();
      Product product = new Product();
      
      assertEquals("This is a soft drink", softDrink.description() );
      vendingMachine.buy(softDrink, 5);
      assertEquals(5, vendingMachine.getStock(softDrink));
      
      assertEquals("This is a salty snack", saltySnack.description() );
      vendingMachine.buy(saltySnack, 5);
      assertEquals(10, vendingMachine.getStock(saltySnack));

      assertEquals("This is a chocolate", chocolate.description() );
      vendingMachine.buy(chocolate, 5);
      assertEquals(15, vendingMachine.getStock(chocolate));
   }
   
   
   @Test
   void shouldBeAbleToAddSpecificQuantityForProduct() {
      ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(0, 5, 0);
   
      SoftDrink softDrink = new SoftDrink();
      SaltySnack saltySnack = new SaltySnack();
      Chocolate chocolate = new Chocolate();
      Product product = new Product();
   
      assertEquals(5, vendingMachine.getStock(product));
   
      assertEquals("This is a soft drink", softDrink.description());
      vendingMachine.addStock(softDrink, 10);
      assertEquals(10, vendingMachine.getStock(softDrink));

      assertEquals("This is a salty snack", saltySnack.description() );
      vendingMachine.addStock(saltySnack, 5);
      assertEquals(10, vendingMachine.getStock(saltySnack));

      assertEquals("This is a chocolate", chocolate.description() );
      vendingMachine.addStock(chocolate, 15);
      assertEquals(15, vendingMachine.getStock(chocolate));

      assertEquals(35, vendingMachine.getStock(product));

      assertEquals("This is a product", product.description() );
      vendingMachine.addStock(product);
      assertEquals(35, vendingMachine.getStock(product));
   }
}