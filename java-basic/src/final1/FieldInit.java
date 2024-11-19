package final1;

// final 필드 - 필드 초기화
public class FieldInit {

  static final int CONST_VALUE = 10;

  // 생성자 초기화와 다르게 필드 초기화는 필드의 코드에 해당 값이 미리 정해지게 된다.
  // 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리를 낭비 -> static final 키워드를 이용하여 상수로 선언하고 사용하는게 효과적
  final int value = 10;

}
