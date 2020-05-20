import main.OverloadedVendingMachine;
import main.vending.Product;
import main.vending.product.Chocolate;
import main.vending.product.Peanut;
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
      assertEquals(52, vendingMachine.getStock(product));
   }
   
   @Test
   void shouldBeAbleToBuySpecificQuantityForSoftDrink() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 20, 30);
      SoftDrink softDrink = new SoftDrink();
      
      vendingMachine.buy(softDrink, 4);
      assertEquals(6, vendingMachine.getStock(softDrink));
      
      vendingMachine.buy(softDrink, 4);
      assertEquals(2, vendingMachine.getStock(softDrink));
   }
   
   @Test
   void shouldBeAbleToBuySpecificQuantityForSaltySnack() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 20, 30);
      SaltySnack saltySnack = new SaltySnack();

      vendingMachine.buy(saltySnack, 4);
      assertEquals(16, vendingMachine.getStock(saltySnack));

      vendingMachine.buy(saltySnack, 6);
      assertEquals(10, vendingMachine.getStock(saltySnack));
   }

   @Test
   void shouldBeAbleToBuySpecificQuantityForChocolate() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 20, 30);
      Chocolate chocolate = new Chocolate();

      vendingMachine.buy(chocolate, 4);
      assertEquals(26, vendingMachine.getStock(chocolate));

      vendingMachine.buy(chocolate, 4);
      assertEquals(22, vendingMachine.getStock(chocolate));
   }
   
   @Test
   void shouldBeAbleToAddSpecificQuantityForSoftDrink() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(1, 20, 30);
      SoftDrink softDrink = new SoftDrink();
      
      vendingMachine.addStock(softDrink, 9);
      assertEquals(10, vendingMachine.getStock(softDrink));
      
      vendingMachine.addStock(softDrink, 90);
      assertEquals(100, vendingMachine.getStock(softDrink));
   }
   
   @Test
   void shouldBeAbleToAddSpecificQuantityForSaltySnack() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 0, 30);
      SaltySnack saltySnack = new SaltySnack();

      vendingMachine.addStock(saltySnack, 16);
      assertEquals(16, vendingMachine.getStock(saltySnack));

      vendingMachine.addStock(saltySnack, 5);
      assertEquals(21, vendingMachine.getStock(saltySnack));
   }
   
   @Test
   void shouldBeAbleToAddSpecificQuantityForChocolate() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 20, 30);
      Chocolate chocolate = new Chocolate();

      vendingMachine.addStock(chocolate, 4);
      assertEquals(34, vendingMachine.getStock(chocolate));

      vendingMachine.addStock(chocolate, 10);
      assertEquals(44, vendingMachine.getStock(chocolate));
   }
   
   @Test
   void shouldBeAbleToAddSpecificQuantityForAllProducts() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(0, 0, 0);
      Product product = new Product();
      
      vendingMachine.addStock(product, 5);
      assertEquals(5, vendingMachine.getStock(new SoftDrink()));
      assertEquals(5, vendingMachine.getStock(new SaltySnack()));
      assertEquals(5, vendingMachine.getStock(new Chocolate()));
      assertEquals(5, vendingMachine.getStock(new Peanut()));
      
      assertEquals(20, vendingMachine.getStock(product));
      
      vendingMachine.addStock(product, 10);
      assertEquals(15, vendingMachine.getStock(new SoftDrink()));
      assertEquals(15, vendingMachine.getStock(new SaltySnack()));
      assertEquals(15, vendingMachine.getStock(new Chocolate()));
      assertEquals(15, vendingMachine.getStock(new Peanut()));
      assertEquals(60, vendingMachine.getStock(product));
   }
   
   
   
   @Test
   void shouldBeAbleToBuyPeanuts() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(1, 15, 20, 10);
      Peanut peanut = new Peanut();
      
      assertEquals("This is a peanut", peanut.description());
      assertEquals(10, vendingMachine.getStock(peanut));
      
      vendingMachine.buy(peanut);
      vendingMachine.buy(peanut);
      vendingMachine.buy(peanut);
      
      assertEquals(7, vendingMachine.getStock(peanut));
   }
   
   @Test
   void shouldBeAbleToBuySpecificQuantityForPeanuts() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 20, 30, 20);
      Peanut peanut = new Peanut();

      vendingMachine.buy(peanut, 4);
      assertEquals(16, vendingMachine.getStock(peanut));

      vendingMachine.buy(peanut, 6);
      assertEquals(10, vendingMachine.getStock(peanut));
   }
   
   @Test
   void shouldBeAbleToAddPeanutsStock() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 15, 10, 0);
      Peanut peanut = new Peanut();

      assertEquals("This is a peanut", peanut.description());
      assertEquals(0, vendingMachine.getStock(peanut));

      vendingMachine.addStock(peanut);
      vendingMachine.addStock(peanut);
      assertEquals(6, vendingMachine.getStock(peanut));
   }
   
   @Test
   void shouldBeAbleToAddSpecificQuantityForPeanuts() {
      OverloadedVendingMachine vendingMachine = new OverloadedVendingMachine(10, 0, 30, 0);
      Peanut peanut = new Peanut();

      vendingMachine.addStock(peanut, 16);
      assertEquals(16, vendingMachine.getStock(peanut));

      vendingMachine.addStock(peanut, 5);
      assertEquals(21, vendingMachine.getStock(peanut));
   }





}