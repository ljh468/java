package oop1.ex;

public class Rectangle {

  // 길이
  int width;

  // 높이
  int height;

  // 생성자
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  // 넓이 계산 메서드
  int calculateArea() {
    return width * height;
  }

  // 둘레 계산 메서드
  int calculatePerimeter() {
    return 2 * (width + height);
  }

  // 정사각형인지 확인하는 메서드
  boolean isSquare() {
    return width == height;
  }

}
