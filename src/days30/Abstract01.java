package days30;

// 추상클래스
//상속을 통한 다형성을 구현함에 있어서 강제성을 부여하기 위한 클래스
//다형성(부모클래스를 상속받아 여러 형태의 자식클래스를 생성 & 활용 & type casting)

// 상속의 문제점 : 강제성의 부재
//상속을 통해 다형성을 구현하고자 하여도, 하위클래스에서 메소드 오버라이딩을
//구현하지 않으면 다형성을 완벽히 구현할 수 없다.
//이때, 오버라이딩을 구현하지 않는 것이 문법상 문제가 없다는 점을 강제성의 부재라고 한다.

class Animal {
    public void crying() {
        System.out.println("울음소리~!");
    }
}
class Dog extends Animal {
    public void crying() {
        System.out.println("멍~!멍~!");
    } //부모클래스의 crying 메서드를 오버라이딩한 Dog 클래스
}
class Cat extends Animal {
    //부모클래스의 crying 메서드를 오버라이딩 하지 않은 Cat 클래스
    //원하는 결과는 나오지 않지만 오류가 아님
}

public class Abstract01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.crying();
        Cat cat = new Cat();
        cat.crying();
    }
}
