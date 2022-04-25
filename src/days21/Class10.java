package days21;

class BClass {
    private int age;
    //앞선 예제 Class09와 같이 클래스 내부에 생성자를 꺼내어 따로 정의하지 않으면,
    //컴파일러는 자동으로 클래스 내부에 숨어있는 생성자(디폴트 생성자)를 호출
    //디폴트 생성자 : BClass(){}와 같이 생겨서 기본 형태만 설정된 생성자
    //아래와 같이 내용없이 생성자를 따로 정의하는 것은, 따로 생성자를 아예 기술하지 않는 것과 같다.
    BClass(){ } //디폴트 생성자

    //생성자도 리턴값만 없을 뿐, 메서드이므로 매개변수를 사용할 수 있다.
    // 1. 생성자의 매개변수를 활용하는 경우 각각의 객체마다 서로 다른 초기화 값을 가질 수 있다.
    public BClass(int age) {
        this.age = age;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class Class10 {
    public static void main(String[] args) {
        BClass b1= new BClass(); //별도의 생성자가 없으면 컴파일러가 클래스 내부에 숨어있는 디폴트 생성자 호출
        b1.setAge(30);

        BClass b2= new BClass(40);
        BClass b3= new BClass(50);

        System.out.println("b1 나이 : "+b1.getAge());
        System.out.println("b2 나이 : "+b2.getAge());
        System.out.println("b3 나이 : "+b3.getAge());
    }
}
