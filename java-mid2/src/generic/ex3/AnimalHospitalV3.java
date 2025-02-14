package generic.ex3;

import generic.animal.Animal;

// 타입 매개변수 제한 (Animal 또는 그 자식만 들어올 수 있으므로 Animal 메서드를 사용할 수 있게 됨)
public class AnimalHospitalV3<T extends Animal> {

  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  public void checkup() {
    System.out.println("동물 이름: " + animal.getName());
    System.out.println("동물 크기: " + animal.getSize());
    animal.sound();
  }

  public T bigger(T target) {
    return animal.getSize() > target.getSize() ? animal : target;
  }

}