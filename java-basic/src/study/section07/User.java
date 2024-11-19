package study.section07;

public class User {

  private String name;
  private String password;

  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void changeName(String newName) {
    this.name = newName;
    System.out.println("이름이 성공적으로 변경되었습니다.");
  }

  public void changePassword(String password, String newPassword) {
    validatePassword(password);
    this.password = newPassword;
    System.out.println("비밀번호가 성공적으로 변경되었습니다.");
  }

  public void validatePassword(String oldPassword) {
    if (!password.equalsIgnoreCase(oldPassword)) {
      throw new IllegalArgumentException("현재 비밀번호가 일치하지 않습니다.");
    }
  }

}
