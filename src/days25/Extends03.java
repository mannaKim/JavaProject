package days25;

// 접근지정자와 상속
//부모클래스의 private 멤버는 자식클래스가 접근할 수 없다!

class SuperA {
    private int n1; //private : 현재 클래스 내에 있는 멤버메서드를 통해서만
                             // 접근 가능한 완전 은닉 n1
    public int n2;  //public : 어디서든 자유롭게 접근 가능
    int n3; //default : 동일한 패키지 내부에서는 public 으로 동작,
                     // 다른 패키지에서는 private 로 동작
    protected int n4; // protected : 자식클래스에서는 public 으로 동작,
                                  // 그 외에는 private 로 동작

    //자신의 클래스에 있는 private 멤버를 access 하는 public 메서드를 생성하면
    //자식클래스에서도 부모클래스의 private 멤버 값을 리턴 받아 사용할 수 있다.
    public int getN1() {
        return n1;
    }
    //getter 메서드를 만들어야 한다면, private 멤버의 getter 는 반드시 부모클래스 안에서,
    //protected 멤버는 부모,자식클래스 어디에서나 생성이 가능
    public int getN4() {
        return n4;
    }
}
class SubA extends SuperA {
    public void printInfo() {
        //부모클래스의 private 멤버에는 자식클래스도 절대 access 불가능
        //System.out.println(this.n1); <-- 에러
        //public 으로 선언된 멤버메서드를 이용하면 부모클래스의 private 멤버도 access 가능
        System.out.println(this.getN1());

        //부모클래스의 public 멤버는 자식클래스가 access 가능
        System.out.println(this.n2);

        //부모클래스의 default 멤버는 동일한 패키지에서 public 과 같으므로 access 가능
        System.out.println(this.n3);

        // 부모클래스의 protected 멤버는 자식클래스에게 public 과 같으므로 access 가능
        System.out.println(this.n4);
    }
}

public class Extends03 {
    public static void main(String[] args) {

    }
}
