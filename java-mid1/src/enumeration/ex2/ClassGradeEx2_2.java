package enumeration.ex2;

public class ClassGradeEx2_2 {

  public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();

    // ClassGrade 클래스를 만들어야 된다고 생각할 수 있음
    // ClassGrade newClassGrade = new ClassGrade(); // x009 // 생성자를 private으로 막아야 함
    // int result = discountService.discount(newClassGrade, price);
    // System.out.println("newClassGrade 등급의 할인 금액: " + result);
  }
}
