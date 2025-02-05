package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

  public static void main(String[] args) {
    Box<Object> objBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();
    dogBox.set(new Dog("멍멍이", 100));

    WildcardEx.printGenericV1(dogBox);
    WildcardEx.printWildcardV1(dogBox);

    Box<Integer> box = new Box<>();
    WildcardEx.printGenericV2(dogBox);
    WildcardEx.printWildcardV2(dogBox);

    Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
    // 와일드카드는 입력된 타입으로 반환할 수 없는 한계가 있음 "Box<Dog> -> Animal"
    Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
  }

}