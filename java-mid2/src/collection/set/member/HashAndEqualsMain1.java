package collection.set.member;

import collection.set.MyHashSetV2;

// hashCode, equals를 모두 구현하지 않은 경우
public class HashAndEqualsMain1 {

  public static void main(String[] args) {
    // 다른 공간에 중복 등록이 될 수 있음
    MyHashSetV2 set = new MyHashSetV2(10);
    MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
    MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
    System.out.println("m1.hashCode() = " + m1.hashCode());
    System.out.println("m2.hashCode() = " + m2.hashCode());
    System.out.println("m1.equals(m2) = " + m1.equals(m2));

    set.add(m1);
    set.add(m2);
    System.out.println(set);

    // 참조값의 hashCode로 찾기 때문에 검색에 실패
    MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
    System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
    boolean contains = set.contains(searchValue);
    System.out.println("contains = " + contains);
  }
}