package days31;

// 인터페이스들의 생성
interface InterSuper1 {
    public abstract void interSuper1Method();
}
interface InterSuper2 {
    void interSuper2Method();
}

// 인터페이스들끼리의 상속(extends)
//인터페이스를 인터페이스가 상속할 때는 implements 가 아닌 extends 사용
interface InterSub extends InterSuper1,InterSuper2 {
    //인터페이스끼리는 다중상속(extends) 가능
    void interSubMethod();
    //public abstract void interSuper1Method(); <-- 상속받은 추상메서드 존재
    //public abstract void interSuper2Method(); <-- 상속받은 추상메서드 존재

    //인터페이스끼리의 extends 는 추상메서드들을 온전히 물려받는것 이므로,
    //추상메서드의 override 의무는 면제된다.
}

// 일반 클래스의 인터페이스 다중 상속(implements)
//일반 클래스가 인터페이스를 다수개 implements 했다면 그 인터페이스들이
//보유한 추상메서드를 모두 구현(override,implements) 해야한다.
class ClassSub1 implements InterSuper1,InterSuper2 {
    @Override
    public void interSuper1Method() {
        System.out.println("interSuper1Method 메소드 실행");
    }
    @Override
    public void interSuper2Method() {
        System.out.println("interSuper2Method 메소드 실행");
    }
}

// 일반 클래스의 인터페이스를 다중 상속(extends)받은 인터페이스 상속(implements)
//인터페이스 간 상속(extends)이 이루어져 있는 인터페이스를 클래스에서 구현(implements)하는 경우
//부모인터페이스의 추상메소드를 포함하여 모두 오버라이딩 해야한다.
class ClassSub2 implements InterSub {
    @Override
    public void interSuper1Method() {
        System.out.println("interSuper1Method 메소드 실행");
    }
    @Override
    public void interSuper2Method() {
        System.out.println("interSuper2Method 메소드 실행");
    }
    @Override
    public void interSubMethod() {
        System.out.println("interSubMethod 메소드 실행");
    }
}

public class Interface02 {
    public static void main(String[] args) {

        // 자식레퍼런스 = 자식인스턴스
        ClassSub1 cs1 = new ClassSub1();
        ClassSub2 cs2 = new ClassSub2();

        // 부모레퍼런스 = 자식인스턴스
        // 구현(implements)관계가 있는 부모자식간에만 대입 가능
        InterSuper1 is1 = new ClassSub1(); //가능
        InterSuper2 is2 = new ClassSub1(); //가능

        InterSuper1 is3 = new ClassSub2(); //가능
        InterSuper2 is4 = new ClassSub2(); //가능

        //InterSub is5 = new ClassSub1();  //불가능: InterSub 는 ClassSub1과 implements 관계가 아님
        InterSub is6 = new ClassSub2();    //가능


        // 상속되고 구현된 메소드만 사용이 가능
        cs1.interSuper1Method();
        cs1.interSuper2Method();
        //cs1.interSubMethod();     //불가능

        cs2.interSuper1Method();
        cs2.interSuper2Method();
        cs2.interSubMethod();

        is1.interSuper1Method();
        //is1.interSuper2Method();    //불가능
        //is1.interSubMethod();       //불가능

        //is2.interSuper1Method();    //불가능
        is2.interSuper2Method();
        //is2.interSubMethod();       //불가능

        is3.interSuper1Method();
        //is3.interSuper2Method();    //불가능
        //is3.interSubMethod();       //불가능

        //is4.interSuper1Method();    //불가능
        is4.interSuper2Method();
        //is4.interSubMethod();       //불가능

        is6.interSuper1Method();
        is6.interSuper2Method();
        is6.interSubMethod();
    }
}
