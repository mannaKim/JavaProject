package days25;

class SuperC {
    public SuperC() {
        System.out.println("부모클래스의 매개변수가 없는 생성자 실행");
    }
    public SuperC(int num) {
        System.out.println("부모클래스의 매개변수가 있는 생성자 실행");
    }
}
class SubC extends SuperC {
    // 부모클래스에 디폴트 생성자가 존재하지 않는 경우
    //자식클래스의 생성자에서 super 를 사용하여 명시적으로 매개변수가 있는 부모클래스의 생성자를 호출
    public SubC() {
        //super(10);
        //this(10);
        super();
    }
    public SubC(int n) {
        super(n);
    }
    // 자식클래스 생성자에서 super 를 호출했으면
    // 그에 맞게 오버로딩된 부모생성자가 있거나 <-- ex) 부모클래스에 매개변수가 없는 생성자와 있는 생성자 모두 두기
    // 없으면 지금 존재하는 부모생성자에 맞춰서 호출한다. <-- ex) super(매개변수);
}

public class Extends05 {
    public static void main(String[] args) {
        SubC c = new SubC();
    }
}
