package construct;

public class MemberThis {

  String nameField;

  void initMember(String nameParameter) {
    // IDEA가 자신의 멤버변수를 구분해주기 때문에 this를 잘 사용하지 않는다.
    nameField = nameParameter;
  }
}
