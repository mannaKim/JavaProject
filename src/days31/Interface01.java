package days31;

//자바언어에서 제공하는 상속 기능은 일반 클래스이든, 추상클래스이든 단일 상속만을 지원한다.
//하나의 클래스는 하나의 부모클래스를 가질 수 있다.
//(여러개의 클래스를 상속받을 수 없음)
//class SubA extends SuperA, SuperB { } <-- 에러

// 다중 상속을 위해 만들어진
// Interface
//추상클래스보다 더 상속을 위해서 만들어진 클래스이다. 다중 상속이 가능하다.
//인터페이스도 클래스이다. 다만 제약이 다소 존재한다.
//1. 인터페이스는 멤버필드로 public static final 멤버만 가질 수 있다.
//2. 추상클래스처럼 일반 멤버변수와 일반 멤버메서드를 가질 수 없다.
//3. 인터페이스는 멤버메소드로 public abstract 메서드만 가질 수 있다.

//class 만들듯이 생성하며, class 란 키워드 대신 interface 라는 키워드를 써서 생성
interface InterA {
    /*public static final*/ int n1 = 10;
    //인터페이스는 일반 멤버변수를 만들 수 없으며,
    //위와 같이 단순 멤버변수를 만들어도 static final 로 인식된다.
    //interface 에서 public static final 은 생략 가능
    //static final 변수는 변수 생성시 반드시 값을 초기화 해야한다.

    //InterA() { } <-- 에러: 생성자 만들기 불가! 일반클래스와 추상클래스만 만들 수 있음

    //public void prn() {} <-- 에러: 일반 멤버메스드 선언 불가
    void test1(); //interface 에서 public abstract 생략 가능

    //인터페이스 내부에 선언할 수 있는 요소
    public static final int num = 10; //public static final 변수
    public abstract void test2(); //public abstract 메서드

}
//인터페이스를 상속(구현)하는 클래스는 상속(구현)할 클래스 앞에 extends 대신 implements 를 쓴다.
class SubA implements InterA {
    @Override
    public void test1() {
        System.out.println("SubA 클래스의 test1 메소드 실행");
    }
    @Override
    public void test2() {
        System.out.println("SubA 클래스의 test2 메소드 실행");
    }
}

public class Interface01 {
    public static void main(String[] args) {
        //인터페이스는 객체 생성 불가
        //1. 추상메서드를 포함할 수 있기 때문에
        //InterA a = new InterA(); <-- 에러

        //상속을 통한 다형성 구현에만 인터페이스가 활용됨
        //부모인터페이스의 레퍼런스를 사용하여 자식클래스의 객체를 참조 가능
        InterA a = new SubA();
        //부모인터페이스의 레퍼런스를 사용하여 자식클래스의 오버라이딩 된 메소드 호출
        a.test1();
        a.test2();
        //자식인스턴스를 전달인수로 보내고, 부모인터페이스의 레퍼런스를 매개변수로 하여
        //사용 가능
        test(a);
    }
    public static void test(InterA a) {
        System.out.println("매개변수가 부모인터페이스인 test 메소드 실행");
    }
}
