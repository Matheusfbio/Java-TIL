package Datatypes;

public class realLife {
  public static void main(String[] args) {
    
    int items = 50;
    float costPerItem = 9.99f;
    float totalCost = items * costPerItem;
    String currency = "$";
    
    System.out.println("number of items: " + items);
    System.out.println("Cost per item: " + costPerItem + currency);
    System.out.println("Total cost: " + totalCost + currency);
  }
}
