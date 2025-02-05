package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

  public static void main(String[] args) {
    AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
    AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

    Dog dog = new Dog("멍멍이1", 100);
    Cat cat = new Cat("냐옹이1", 300);

    // 개 병원
    dogHospital.set(dog);
    dogHospital.checkup();

    // 고양이 병원
    catHospital.set(cat);
    catHospital.checkup();

    // 문제1 해결: 개 병원에 고양이 전달 (다른 타입 입력시 컴파일 오류)
    // dogHospital.set(cat);

    // 문제2 해결: 개 타입 반환 (다운 캐스팅하지 않아도 됨)
    dogHospital.set(dog);
    Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}