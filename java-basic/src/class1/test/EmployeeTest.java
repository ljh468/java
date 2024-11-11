package class1.test;

import java.util.Arrays;

// 클라이언트 코드
public class EmployeeTest {

  public static void main(String[] args) {
    // Employee 객체 배열 생성
    Employee[] employees = {
        new Employee("조인성", "Manager", 7000),
        new Employee("류승룡", "Manager", 7500),
        new Employee("이정하", "Developer", 6000),
        new Employee("고윤정", "Developer", 6500),
        new Employee("한효주", "Designer", 5500)
    };

    // Company 객체 생성 후 직책 필터링 기능 사용
    Company company = new Company(employees);
    System.out.println("### Developer 검색 ###");
    company.findByPosition("Developer");
  }
}

// 직원 클래스
class Employee {
  private String name;
  private String position;
  private long salary;

  // 생성자
  public Employee(String name, String position, long salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  // 속성을 반환하는 Getter 메서드
  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public long getSalary() {
    return salary;
  }
}

// 회사 클래스
class Company {

  private final Employee[] employees;

  public Company(Employee[] employees) {
    this.employees = employees;
  }

  // 특정 직책에 해당하는 직원 정보 출력 메서드
  public void findByPosition(String position) {
    System.out.println("직원(" + position + ") 목록");
    Arrays.stream(employees)
          .filter(employee -> employee.getPosition().equalsIgnoreCase(position))
          .forEach(employee -> System.out.println("이름: " + employee.getName() + ", 연봉: " + employee.getSalary()));
  }

}
