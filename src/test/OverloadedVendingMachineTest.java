import main.OverloadedVendingMachine;
import main.vending.Product;
import main.vending.product.Chocolate;
import main.vending.product.SaltySnack;
import main.vending.product.SoftDrink;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class OverloadedVendingMachineTest {
   
   @Test
   void shouldBeAbleToBuySoftDrink() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(1, 15, 20);
      SoftDrink softDrink = new SoftDrink();
   
      assertEquals("This is a soft drink", softDrink.description());
      assertEquals(1, vendingMachine.getStock(softDrink));
      
      vendingMachine.buy(softDrink);
      vendingMachine.buy(softDrink);
      vendingMachine.buy(softDrink);
      
      assertEquals(0, vendingMachine.getStock(softDrink));
   }
   
   @Test
   void shouldBeAbleToAddSoftDrinkStock() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 15, 20);
      SoftDrink softDrink = new SoftDrink();
      
      vendingMachine.buy(softDrink);
      vendingMachine.buy(softDrink);
      
      assertEquals("This is a soft drink", softDrink.description());
      assertEquals(8, vendingMachine.getStock(softDrink));
   
      vendingMachine.addStock(softDrink);
      vendingMachine.addStock(softDrink);
      assertEquals(14, vendingMachine.getStock(softDrink));
   }
   
   @Test
   void shouldBeAbleToBuySaltySnack() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 15, 20);
      SaltySnack saltySnack = new SaltySnack();
   
      assertEquals("This is a salty snack", saltySnack.description());
      assertEquals(15, vendingMachine.getStock(saltySnack));
      
      vendingMachine.buy(saltySnack);
      vendingMachine.buy(saltySnack);
      vendingMachine.buy(saltySnack);
      
      assertEquals(12, vendingMachine.getStock(saltySnack));
   }
   
   @Test
   void shouldBeAbleToAddSaltySnackStock() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 15, 20);
      SaltySnack saltySnack = new SaltySnack();
   
      assertEquals("This is a salty snack", saltySnack.description());
      assertEquals(15, vendingMachine.getStock(saltySnack));
   
      vendingMachine.addStock(saltySnack);
      vendingMachine.addStock(saltySnack);
      vendingMachine.addStock(saltySnack);
   
      assertEquals(24, vendingMachine.getStock(saltySnack));
   }
   
   @Test
   void shouldBeAbleToBuyChocolate() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 15, 20);
      Chocolate chocolate = new Chocolate();
      
      assertEquals("This is a chocolate", chocolate.description());
      assertEquals(20, vendingMachine.getStock(chocolate));
      
      vendingMachine.buy(chocolate);
      vendingMachine.buy(chocolate);
      vendingMachine.buy(chocolate);
      
      assertEquals(17, vendingMachine.getStock(chocolate));
   }
   
   @Test
   void shouldBeAbleToAddChocolateStock() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 15, 20);
      Chocolate chocolate = new Chocolate();
   
      assertEquals("This is a chocolate", chocolate.description());
      assertEquals(20, vendingMachine.getStock(chocolate));
   
      vendingMachine.addStock(chocolate);
      vendingMachine.addStock(chocolate);
      vendingMachine.addStock(chocolate);
   
      assertEquals(29, vendingMachine.getStock(chocolate));
   }
   
   @Test
   void shouldBeAbleToBuyAllProducts() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 0, 20);
      Product product = new Product();
      
      assertEquals("This is a product", product.description());
      assertEquals(30, vendingMachine.getStock(product));

      vendingMachine.buy(product);

      assertEquals(28, vendingMachine.getStock(product));
   }
   
   @Test
   void shouldBeAbleToAddProductsStock() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 0, 20);
      Product product = new Product();
      
      assertEquals("This is a product", product.description());
      assertEquals(30, vendingMachine.getStock(product));
      
      vendingMachine.buy(product);
      assertEquals(28, vendingMachine.getStock(product));
      
      vendingMachine.addStock(product);
      vendingMachine.addStock(product);
      assertEquals(46, vendingMachine.getStock(product));
   }

}