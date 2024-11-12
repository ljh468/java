package ref.ex;

import java.util.Scanner;

/**
 * 문제: 상품 주문 시스템 개발 - 사용자 입력<p>
 * **문제 설명**<p>
 * 앞서 만든 상품 주문 시스템을 사용자 입력을 받도록 개선해보자.<p>
 * <p>
 * **요구 사항**<p>
 * - 아래 입력, 출력 예시를 참고해서 다음 사항을 적용하자.<p>
 * - 주문 수량을 입력 받자<p>
 *   - 예) 입력할 주문의 개수를 입력하세요:<p>
 * - 가격, 수량, 상품명을 입력 받자<p>
 *   - 입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요." 라는 메시지를 출력하세요.<p>
 * - 입력이 끝나면 등록한 상품과 총 결제 금액을 출력하자.<p>
 * <br>
 * ex:<p>
 * 입력할 주문의 개수를 입력하세요: 3<p>
 * 1번째 주문 정보를 입력하세요.<p>
 * 상품명: 두부<p>
 * 가격: 2000<p>
 * 수량: 2<p>
 * 2번째 주문 정보를 입력하세요.<p>
 * 상품명: 김치<p>
 * 가격: 5000<p>
 * 수량: 1<p>
 * 3번째 주문 정보를 입력하세요.<p>
 * 상품명: 콜라<p>
 * 가격: 1500<p>
 * 수량: 2<p>
 * <p>
 * 상품명: 두부, 가격: 2000, 수량: 2<p>
 * 상품명: 김치, 가격: 5000, 수량: 1<p>
 * 상품명: 콜라, 가격: 1500, 수량: 2<p>
 * 총 결제 금액: 12000<p>
 */
public class ProductOrderMain3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력할 주문의 개수를 입력하세요: ");
    int n = scanner.nextInt();
    scanner.nextLine();

    ProductOrder[] orders = new ProductOrder[n];
    for (int i = 0; i < orders.length; i++) {
      System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

      System.out.print("상품명: ");
      String productName = scanner.nextLine();

      System.out.print("가격: ");
      int price = scanner.nextInt();

      System.out.print("수량: ");
      int quantity = scanner.nextInt();
      scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드

      orders[i] = createOrder(productName, price, quantity);
    }
    printOrders(orders);
    int totalAmount = getTotalAmount(orders);
    System.out.println("총 결제 금액: " + totalAmount);
  }

  static ProductOrder createOrder(String productName, int price, int quantity) {
    ProductOrder order = new ProductOrder();
    order.productName = productName;
    order.price = price;
    order.quantity = quantity;
    return order;
  }

  static void printOrders(ProductOrder[] orders) {
    for (ProductOrder order : orders) {
      System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
    }
  }

  static int getTotalAmount(ProductOrder[] orders) {
    int totalAmount = 0;
    for (ProductOrder order : orders) {
      totalAmount += order.price * order.quantity;
    }
    return totalAmount;
  }
}
