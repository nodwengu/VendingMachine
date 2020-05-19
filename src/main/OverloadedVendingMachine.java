package main;

import main.vending.*;
import main.vending.product.Chocolate;
import main.vending.product.SaltySnack;
import main.vending.product.SoftDrink;

public class OverloadedVendingMachine {
   private int softDrinkStockLevel;
   private int saltySnackStockLevel;
   private int chocolateStockLevel;
   
   public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
      this.softDrinkStockLevel = softDrinkQty;
      this.saltySnackStockLevel = saltySnacksQty;
      this.chocolateStockLevel = chocolatesQty;
   }
   
   //Buying a product decrease the number of products in stock by one.
   // The stock level for a product can’t be negative.
   
   public void buy(SoftDrink softDrink){
      if(softDrinkStockLevel > 0) {
         softDrinkStockLevel -= 1;
      } else {
         System.out.println("Soft drink out of stock");
      }
   }
   
   public void buy(SaltySnack saltySnack){
      if(saltySnackStockLevel > 0) {
         saltySnackStockLevel -= 1;
      } else {
         System.out.println("Salt snack out of stock");
      }
   }
   
   public void buy(Chocolate chocolate){
      if(chocolateStockLevel > 0) {
         chocolateStockLevel -= 1;
      } else {
         System.out.println("Chocolate out of stock");
      }
   }
   
   public void buy(Product product){
      if(softDrinkStockLevel > 0)
         softDrinkStockLevel -= 1;
      
      if(saltySnackStockLevel > 0)
         saltySnackStockLevel -= 1;
   
      if(chocolateStockLevel > 0)
         chocolateStockLevel -= 1;
   }
   
   public void addStock(SoftDrink softDrink){
      softDrinkStockLevel += 3;
   }
   
   public void addStock(SaltySnack saltySnack){
      saltySnackStockLevel += 3;
   }
   
   public void addStock(Chocolate chocolate){
      chocolateStockLevel += 3;
   }
   
   public void addStock(Product product){
      softDrinkStockLevel += 3;
      saltySnackStockLevel += 3;
      chocolateStockLevel += 3;
   }
   
   public int getStock(SoftDrink softDrink){
      return softDrinkStockLevel;
   }
   
   public int getStock(SaltySnack saltySnack){
      return saltySnackStockLevel;
   }
   
   public int getStock(Chocolate chocolate){
      return chocolateStockLevel;
   }
   
   public int getStock(Product product){
      return softDrinkStockLevel + saltySnackStockLevel + chocolateStockLevel;
   }
   
}
