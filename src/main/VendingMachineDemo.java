package main;

import main.vending.Product;
import main.vending.product.Chocolate;
import main.vending.product.Peanut;
import main.vending.product.SaltySnack;
import main.vending.product.SoftDrink;

import java.util.Scanner;

public class VendingMachineDemo {
   public static void main(String[] args) {
      System.out.println();
      go();
   }
   
   public static void go() {
      Scanner scanner = new Scanner(System.in);
      String option;
      
      System.out.print("Enter the letter 'b' / 'B' to buy OR 'a' / 'A' to add new stock: ");
      option = scanner.nextLine();
      
      if (option.equalsIgnoreCase("b")) {
         buyProduct();
         
      } else if (option.equalsIgnoreCase("a")) {
         addStock();
      }
      else {
         System.out.println("Incorrect action to perform code error");
      }
   }
   
   public static void addStock() {
      Scanner scanner = new Scanner(System.in);
   
      ExtendableVendingMachine machine = new ExtendableVendingMachine(2, 1, 5, 4);
      Product product = new Product();
      SoftDrink softDrink = new SoftDrink();
      SaltySnack saltySnack = new SaltySnack();
      Chocolate chocolate = new Chocolate();
      Peanut peanut = new Peanut();
      
      System.out.println("Adding products to the stock...: ");
      System.out.println("Please add the code for the product you want to add: ");
      System.out.print("SoftDrink (sd), SaltySnack (ss), Chocolate (c), Peanut (p) ");
      String choice = scanner.next();
      System.out.println();
      
      if( choice.equalsIgnoreCase("sd") ){
         System.out.println(softDrink.description());
         System.out.println("Soft drink initial stock = " + machine.getStock(softDrink));
         System.out.print("Add number of drinks to add to the stock: ");
         int quantity = scanner.nextInt();
         System.out.println();
      
         machine.addStock(softDrink, quantity);
         System.out.println("Soft drink stock: " + machine.getStock(softDrink));
         System.out.println("All products stock: " + machine.getStock(product));
      
      } else if( choice.equalsIgnoreCase("ss") ) {
         System.out.println(saltySnack.description());
         System.out.println("Salty snack initial stock = " + machine.getStock(saltySnack));
         System.out.print("Add number of snacks to add to the stock: ");
         int quantity = scanner.nextInt();
         System.out.println();
      
         machine.addStock(saltySnack, quantity);
         System.out.println("Salty snack stock: " + machine.getStock(saltySnack));
         System.out.println("All products stock: " + machine.getStock(product));
      
      } else if( choice.equalsIgnoreCase("c") ) {
         System.out.println(chocolate.description());
         System.out.println("Chocolate initial stock = " + machine.getStock(chocolate));
         System.out.print("Add number of chocolates to add to stock: ");
         int quantity = scanner.nextInt();
         System.out.println();
      
         machine.addStock(chocolate, quantity);
         System.out.println("Chocolate stock: " + machine.getStock(chocolate));
         System.out.println("All products stock: " + machine.getStock(product));
      
      } else if( choice.equalsIgnoreCase("p") ) {
         System.out.println(peanut.description());
         System.out.println("Peanut initial stock = " + machine.getStock(peanut));
         System.out.print("Add number of peanuts to add to the stock: ");
         int quantity = scanner.nextInt();
         System.out.println();
      
         machine.addStock(peanut, quantity);
         System.out.println("Peanuts stock: " + machine.getStock(peanut));
         System.out.println("All products stock: " + machine.getStock(product));
      } else {
        
         System.out.println("Incorrect product code error");
      
         // Might want to add loop so to force the user to select the correct product code
         // Future implementation
      }
   }
   
   public static void buyProduct() {
      Scanner scanner = new Scanner(System.in);
   
      ExtendableVendingMachine machine = new ExtendableVendingMachine(10, 15, 20, 25);
      Product product = new Product();
      SoftDrink softDrink = new SoftDrink();
      SaltySnack saltySnack = new SaltySnack();
      Chocolate chocolate = new Chocolate();
      Peanut peanut = new Peanut();
      
      System.out.println("Buying a products: ");
      System.out.println("Choose code for product to buy: ");
      System.out.print("SoftDrink (sd), SaltySnack (ss), Chocolate (c), Peanut (p): ");
      String choice = scanner.next();
   
      if( choice.equalsIgnoreCase("sd") ){
         System.out.println(softDrink.description());
         System.out.println("Soft drink initial stock = " + machine.getStock(softDrink));
         System.out.print("Add number of drinks to buy: ");
         int quantity = scanner.nextInt();
         System.out.println();
      
         machine.buy(softDrink, quantity);
         System.out.println("Soft drink stock: " + machine.getStock(softDrink));
         System.out.println("All products stock: " + machine.getStock(product));
      
      } else if( choice.equalsIgnoreCase("ss") ) {
         System.out.println(saltySnack.description());
         System.out.println("Snack initial stock = " + machine.getStock(saltySnack));
         System.out.print("Add number of snacks to buy: ");
         int quantity = scanner.nextInt();
         System.out.println();
      
         machine.buy(saltySnack, quantity);
         System.out.println("Salty snack stock: " + machine.getStock(saltySnack));
         System.out.println("All products stock: " + machine.getStock(product));
      
      } else if( choice.equalsIgnoreCase("c") ) {
         System.out.println(chocolate.description());
         System.out.println("Chocolate initial stock = " + machine.getStock(chocolate));
         System.out.print("Add number of chocolates to buy: ");
         int quantity = scanner.nextInt();
         System.out.println();
      
         machine.buy(chocolate, quantity);
         System.out.println("Chocolate stock: " + machine.getStock(chocolate));
         System.out.println("All products stock: " + machine.getStock(product));
      
      } else if( choice.equalsIgnoreCase("p") ) {
         System.out.println(peanut.description());
         System.out.println("Peanuts initial stock = " + machine.getStock(peanut));
         System.out.print("Add number of peanuts to buy: ");
         int quantity = scanner.nextInt();
         System.out.println();
      
         machine.buy(peanut, quantity);
         System.out.println("Peanuts stock: " + machine.getStock(peanut));
         System.out.println("All products stock: " + machine.getStock(product));
      } else {
         System.out.println("Incorrect product code error");
      
         // Might want to add loop so to force the user to select the correct product code
         // Future implementation
      }
   }
}
