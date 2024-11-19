package final1.ex;

public class Member {

  private final String id; // final 키워드 사용
  private String name;

  public Member(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public void changeData(String id, String name) {
    // this.id = id; // 컴파일 오류(최초 한번만 할당 가능)
    this.name = name;
  }

  @Override
  public String toString() {
    return "Member{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
