package poly.car0;

public class CarMain0 {

  public static void main(String[] args) {
    Driver driver = new Driver();

    K3Car k3Car = new K3Car();
    driver.setK3Car(k3Car);
    driver.drive();
    System.out.println();

    // K3 -> Model3 차량으로 변경하는 코드
    Model3Car model3Car = new Model3Car();
    driver.setK3Car(null); // k3 차량의 참조는 제거
    driver.setModel3Car(model3Car);
    driver.drive();
  }
}
