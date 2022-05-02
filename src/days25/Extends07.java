package days25;

// 상속 문법
// 1. 각각의 클래스에서 발견되는 공통 변수, 메소드 등을 하나의 클래스로 선언하여 물려받는 문법
// 2. 상속은 모든 클래스의 공통되는 속성, 기능이 정의된 부모클래스를 자식클래스에게 물려주는 방식이다.
// 3. 부모클래스에 정의되는 속성, 기능들은 모든 자식클래스에서 동작해야하므로 일반적인 정의만 사용할 수 있다.
// 4. 상속받은 메서드들은 자식클래스의 생성 목적이나 용도에 따라 사용이 어울리지 않는 메서드일 가능성이 있다.

class Animal {
    public void crying() {
        System.out.println("소리를 냅니다.");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("멍멍~!");
    }
    public void crying() {
        super.crying();
        System.out.println("멍멍~!");
    }
}
class Cat extends Animal {
    public void sound() {
        System.out.println("야옹~!");
    }
    public void crying() {
        super.crying();
        System.out.println("야옹~!");
    }
}
public class Extends07 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.crying(); d.sound();
        c.crying(); c.sound();
    }
}
// 메소드 오버라이딩
// 1. 메서드의 이름이 동일해야 함
// 2. 메소드의 매개변수타입,개수,순서가 다를 경우 같은 이름의 메소드라도
//    다른 메소드로 인식
// 3. 상속관계에서만 사용 가능
// 4. 부모클래스의 메소드의 원형과 반드시 일치해야 함 (리턴값의 타입, 메소드 이름, 매개변수)
// 5. 접근지정자는 축소될 수 없다. (다형성 때문)
// 6. 부모클래스의 final 로 정의된 메소드는 오버라이딩이 불가능
// 7. 오버라이딩 된 자식클래스의 메서드에서 super.crying();
//    이란 명령으로 부모클래스의 메서드를 호출할 수 있다.
// 8. 클래스의 외부에서는 super 라는 키워드를 쓸 수 없으므로,
//    생성된 객체를 통한 super 사용은 허용하지 않는다. (c.super.crying(); <-- 에러)