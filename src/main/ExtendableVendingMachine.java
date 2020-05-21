package main;

import main.vending.Product;
import main.vending.product.Chocolate;
import main.vending.product.Peanut;
import main.vending.product.SaltySnack;
import main.vending.product.SoftDrink;

import java.util.Scanner;

public class ExtendableVendingMachine {
   private int softDrinkStockLevel;
   private int saltySnackStockLevel;
   private int chocolateStockLevel;
   private int peanutStockLevel;
   
   public ExtendableVendingMachine(int softDrinkQuantity, int saltySnackQuantity, int chocolateQuantity) {
      this.softDrinkStockLevel = softDrinkQuantity;
      this.saltySnackStockLevel = saltySnackQuantity;
      this.chocolateStockLevel = chocolateQuantity;
   }
   public ExtendableVendingMachine(int softDrinkQuantity, int saltySnackQuantity, int chocolateQuantity, int peanutQuantity) {
      this.softDrinkStockLevel = softDrinkQuantity;
      this.saltySnackStockLevel = saltySnackQuantity;
      this.chocolateStockLevel = chocolateQuantity;
      this.peanutStockLevel = peanutQuantity;
   }
   
   
   public void buy(Product product) {
      if(product instanceof SoftDrink) {
         if(softDrinkStockLevel > 0)
            softDrinkStockLevel--;
      } else if(product instanceof SaltySnack) {
         if(saltySnackStockLevel > 0)
            saltySnackStockLevel--;
      } else if(product instanceof Chocolate) {
         if(chocolateStockLevel > 0)
            chocolateStockLevel--;
      } else if(product instanceof Peanut) {
         if(peanutStockLevel > 0)
            peanutStockLevel--;
      }
   }
   
   public void buy(Product product, int quantity) {
      if(product instanceof SoftDrink) {
         if(softDrinkStockLevel > 0)
            softDrinkStockLevel -= quantity;
      } else if(product instanceof SaltySnack) {
         if(saltySnackStockLevel > 0)
            saltySnackStockLevel -= quantity;
      } else if(product instanceof Chocolate) {
         if(chocolateStockLevel > 0)
            chocolateStockLevel -= quantity;
      } else if(product instanceof Peanut) {
         if(peanutStockLevel > 0)
            peanutStockLevel -= quantity;
      }
      
   }
   
   public void addStock(Product product) {
      if(product instanceof SoftDrink) {
         softDrinkStockLevel += 3;
      } else if(product instanceof SaltySnack) {
         saltySnackStockLevel += 3;
      } else if(product instanceof Chocolate) {
         chocolateStockLevel += 3;
      } else if(product instanceof Peanut) {
         peanutStockLevel += 3;
      }
   }
   
   public void addStock(Product product, int quantity) {
      if(product instanceof SoftDrink) {
         softDrinkStockLevel += quantity;
      } else if(product instanceof SaltySnack) {
         saltySnackStockLevel += quantity;
      } else if(product instanceof Chocolate) {
         chocolateStockLevel += quantity;
      } else if(product instanceof Peanut) {
         peanutStockLevel += quantity;
      }
   }
   
   public int getStock(Product product) {
      int stockLevel = 0;
      
      if(product instanceof SoftDrink)
         stockLevel = softDrinkStockLevel;
      else if(product instanceof SaltySnack)
         stockLevel = saltySnackStockLevel;
      else if(product instanceof Chocolate)
         stockLevel = chocolateStockLevel;
      else if(product instanceof Peanut)
         stockLevel = peanutStockLevel;
      else if(product instanceof Product)
         stockLevel = softDrinkStockLevel + saltySnackStockLevel + chocolateStockLevel + peanutStockLevel;
      else stockLevel = 0;
      
      return stockLevel;
   }
}



//class ExtendableMachineMain {
//   public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Takes ExtendableVendingMachine vending machine through it’s paces.");
//
//      ExtendableVendingMachine machine = new ExtendableVendingMachine(0, 0, 0, 0);
//      Product product = new Product();
//
//      System.out.print("Enter your age: ");
//      int age = scanner.nextInt();
//      System.out.println("Age is: " + age);
//
//   }
//}