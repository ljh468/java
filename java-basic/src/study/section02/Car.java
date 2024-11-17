package study.section02;

public class Car {

  private String brand;

  private int year;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public static void main(String[] args) {
    Car tesla = new Car();
    tesla.setBrand("Tesla");
    tesla.setYear(2024);

    System.out.println(String.format("차량 브랜드: %s, 생산연도: %d",
                                     tesla.getBrand(),
                                     tesla.getYear()));

  }
}