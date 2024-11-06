package array.ex;

import java.util.Scanner;

/**
 * 상품 관리 프로그램 만들기<p>
 * 자바를 이용하여 상품 관리 프로그램을 만들어 보자. 이 프로그램은 다음의 기능이 필요하다:<p>
 * - 상품 등록: 상품 이름과 가격을 입력받아 저장한다.<p>
 * - 상품 목록: 지금까지 등록한 모든 상품의 목록을 출력한다.<p>
 * 다음과 같이 동작해야 한다:<p>
 * 첫 화면에서 사용자에게 세 가지 선택을 제시한다: "1. 상품 등록", "2. 상품 목록", "3. 종료"<p>
 * - "1. 상품 등록"을 선택하면, 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다.<p>
 * - "2. 상품 목록"을 선택하면, 배열에 저장된 모든 상품을 출력한다.<p>
 * - "3. 종료"를 선택하면 프로그램을 종료한다.<p>
 * <p>
 * **제약 조건**<p>
 * 상품은 최대 10개까지 등록할 수 있다.<p>
 * 다음은 사용해야 하는 변수 및 구조이다:<p>
 * `Scanner scanner` : 사용자 입력을 받기 위한 Scanner 객체<p>
 * `String[] productNames` : 상품 이름을 저장할 String 배열<p>
 * `int[] productPrices` : 상품 가격을 저장할 int 배열<p>
 * `int productCount` : 현재 등록된 상품의 개수를 저장할 int 변수<p>
 * <p>
 * ex:<p>
 * 1. 상품 등록 | 2. 상품 목록 | 3. 종료<p>
 * 메뉴를 선택하세요: 1<p>
 * 상품 이름을 입력하세요: JAVA<p>
 * 상품 가격을 입력하세요: 10000<p>
 * 1. 상품 등록 | 2. 상품 목록 | 3. 종료<p>
 * 메뉴를 선택하세요: 1<p>
 * 상품 이름을 입력하세요: SPRING<p>
 * 상품 가격을 입력하세요: 20000<p>
 * 1. 상품 등록 | 2. 상품 목록 | 3. 종료<p>
 * 메뉴를 선택하세요: 2<p>
 * JAVA: 10000원<p>
 * SPRING: 20000원<p>
 * 1. 상품 등록 | 2. 상품 목록 | 3. 종료<p>
 * 메뉴를 선택하세요: 3<p>
 * 프로그램을 종료합니다.<p>
 * <p>
 * ## **상품을 더 등록할 수 없는 경우**<p>
 * 1. 상품 등록 | 2. 상품 목록 | 3. 종료<p>
 * 메뉴를 선택하세요: 1<p>
 * 더 이상 상품을 등록할 수 없습니다.<p>
 * <p>
 * ## **등록된 상품이 없는 경우**<p>
 * 1. 상품 등록 | 2. 상품 목록 | 3. 종료<p>
 * 메뉴를 선택하세요: 2<p>
 * 등록된 상품이 없습니다.<p>
 */
public class ProductAdminEx {

  public static void main(String[] args) {
    int maxProducts = 10;
    String[] productNames = new String[maxProducts];
    int[] productPrices = new int[maxProducts];
    int productCount = 0;

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
      int menu = scanner.nextInt();
      scanner.nextLine();

      if (menu == 1) {

        if (productCount >= maxProducts) {
          System.out.println("더 이상 상품을 등록할 수 없습니다.");
          continue;
        }

        System.out.print("상품 이름을 입력하세요: ");
        productNames[productCount] = scanner.nextLine();

        System.out.print("상품 가격을 입력하세요: ");
        productPrices[productCount] = scanner.nextInt();

        productCount++;
      } else if (menu == 2) {
        if (productCount == 0) {
          System.out.println("등록된 상품이 없습니다.");
          continue;
        }
        for (int i = 0; i < productCount; i++) {
          System.out.println(productNames[i] + ": " + productPrices[i] + "원");
        }
      } else if (menu == 3) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else {
        System.out.println("잘못된 메뉴를 선택하셨습니다.");
      }
    }
  }
}
