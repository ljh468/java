public class Order {

  public static double discountRate = 0.1;

  public int orderCount = 0;

  public void processOrder() {
    double totalAmount = 200.0;
    System.out.println(totalAmount * (1 - discountRate));
  }
}