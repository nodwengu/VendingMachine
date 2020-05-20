package main.vending.product;

import main.OverloadedVendingMachine;
import main.vending.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Peanut extends Product {
   @Override
   public String description() {
      return "This is a peanut";
   }
}
