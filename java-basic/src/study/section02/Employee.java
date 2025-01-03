package study.section02;

public class Employee {

  private String name;

  private String position;

  private long salary;

  public Employee(String name, String position, long salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public boolean isPosition(String position) {
    return this.position.equalsIgnoreCase(position);
  }

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
