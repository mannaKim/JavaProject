package days22;

class DClass {
    private int age;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public DClass() { System.out.println("default 생성자 호출"); }
    public DClass(int age) {
        this.age = age;
        System.out.println("int 타입 매개변수를 갖는 생성자 호출");
    }
    public DClass(double age) {
        this.age = (int)age;
        System.out.println("double 타입 매개변수를 갖는 생성자 호출");
    }
}

public class Class12 {
    public static void main(String[] args) {
        //아래 명령들이 실행이 가능하도록 DClass 생성자 정의하기
        //생성자에서는 각각 어떤 매개변수가 있는 생성자인지 출력되도록 정의한다.
        DClass d1 = new DClass(); //<-- 디폴트 생성자 호출
        DClass d2 = new DClass(10); //<-- int 타입 매개변수를 갖는 생성자 호출
        DClass d3 = new DClass(10.23); //<-- double 타입 매개변수를 갖는 생성자 호출

        System.out.println("d1 나이 : "+d1.getAge());
        System.out.println("d2 나이 : "+d2.getAge());
        System.out.println("d3 나이 : "+d3.getAge());
    }
}
