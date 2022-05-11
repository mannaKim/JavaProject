package days31;

// 추상클래스 (Abstract Class)
//상속을 통한 다형성의 구현(메서드 오버라이드)에 강제성을 부여하기 위한 클래스
//추상메서드를 포함한 클래스: 추상 메서드를 하나 이상 포함하면 추상클래스라고 부른다.
//추상메서드: 메서드의 원형만 존재하고 실제 내용이 없는 메서드

abstract class AbstractAnimal {       //추상클래스
    private int age=5;
    public void addAge() {
        age++;
    }
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
    public void crying() { System.out.println("야옹~!애옹~!"); }
}

public class Abstract02 {
    public static void main(String[] args) {
        DogA dog = new DogA();
        dog.crying();
        CatA cat = new CatA();
        cat.crying();

        //추상클래스는 상속 전용으로 만들어지므로, 아래와 같이 단독으로 객체 생성이 불가능하다.
        //AbstractAnimal a = new AbstractAnimal(); <-- 에러
        //추상메서드를 포함하고 있는 클래스는 말 그대로 완전하지 않은 클래스 상태라는 뜻
        //따라서 자체적인 객체 생성이 불가능하다.

        //추상클래스로 추상클래스만의 객체를 만들수는 없지만
        //추상클래스(부모)의 레퍼런스 변수로, 자식클래스의 인스턴스 주소는 저장할 수 있다.
        //AbstractAnimal a = new AbstractAnimal(); :불가능
        AbstractAnimal d = new DogA(); //:가능
        AbstractAnimal c = new CatA(); //:가능
        d.crying(); c.crying();

        d.addAge();
        c.addAge();
        incrementAge(dog);
        incrementAge(cat);
    }
    // 자식클래스의 인스턴스를 전달인수로 보내면,
    // 함수의 매개변수인 부모레퍼런스가 받아서 사용할 수 있다.
    // (추상클래스가 아닌 부모클래스를 매개변수로 해도 가능)
    public static void incrementAge(AbstractAnimal animal) {
        animal.addAge();
    }
}

//참고!
//List 클래스는 추상클래스
//List 의 자식 클래스 ArrayList, Vector