package days30;

// 추상클래스 (Abstract Class)
//상속을 통한 다형성의 구현(메서드 오버라이드)에 강제성을 부여하기 위한 클래스
//추상메서드를 포함한 클래스: 추상 메서드를 하나 이상 포함하면 추상클래스라고 부른다.
//추상메서드: 메서드의 원형만 존재하고 실제 내용이 없는 메서드

abstract class AbstractAnimal {      //추상클래스
    public abstract void crying();   //추상메서드: 내용(몸체)가 없음
}
// 추상메서드의 작성 방법
//접근지정자 abstract 리턴값의타입 메소드명(매개변수);
//추상클래스는 일반클래스와 동일하게 일반멤버변수, 일반메서드, 생성자 등을 포함할 수 있다.
//단, 추상메소드를 포함할 수 있는 특징이 추가된 클래스이다.
//추상클래스는 상속을 통한 다형성 구현을 위해서 생성된다.

class DogA extends AbstractAnimal {
    @Override
    public void crying() {
        System.out.println("멍~!멍~!");
    }
}
class CatA extends AbstractAnimal {
    @Override
    public void crying() {
        System.out.println("야옹~!애옹~!");
    }
}

public class Abstract02 {
    public static void main(String[] args) {
        DogA dog = new DogA();
        dog.crying();
        CatA cat = new CatA();
        cat.crying();
    }
}
