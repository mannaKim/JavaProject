package days25;

// 클래스의 상속
//다수의 클래스에 중복되는 멤버변수, 멤버메서드를 포함하고 있는 경우
//부모-자식 관계를 생성하여 코드의 중복을 방지하는 것을 1차 목적으로 사용
//2차 목적으로는 코드의 재활용
//코드의 중복이 발생하고 있는 클래스에서 중복되는 멤버들을 별도의 클래스로 선언하고
//상속을 구현하여 사용한다.

//코드의 중복이 발생하고 있는 클래스 ex
/*class PersonA {
    String name; int age;
    String stdNo;
}
class PersonB {
    String name; int age;
    String empNo;
}*/

//중복되는 멤버나 메서드 등으로 구성된 부모클래스 생성
class Person {
    String name; int age;
}

//부모클래스를 상속하는 자식클래스 생성
class PersonA extends Person {
    String stdNo;
}
class PersonB extends Person {
    String empNo;
}

public class Extends01 {
    public static void main(String[] args) {
        PersonA a = new PersonA();
        PersonB b = new PersonB();

        a.name = "홍길동";
        a.age = 30;
        a.stdNo = "201200000";
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.stdNo);

        b.name = "홍길서";
        b.age = 25;
        b.empNo = "202200000";
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.empNo);
    }
}
// 상속의 구현
//extends 키워드의 사용
//class SubClass명(자식클래스) extends SuperClass명(부모클래스)
//상속을 받는 클래스 : 서브클래스, 자식클래스, 하위클래스
//상속을 제공하는 클래스 : 슈퍼클래스, 부모클래스, 상위클래스