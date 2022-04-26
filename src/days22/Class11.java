package days22;

class CClass {
    private int age;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    //생성자도 리턴값만 없을 뿐, 메서드이므로 매개변수를 사용할 수 있다.
    // 1. 생성자의 매개변수를 활용하는 경우 각각의 객체마다 서로 다른 초기화 값을 가질 수 있다.
    CClass(int a) {
        this.age = a;
    }
    //5. 생성자 오버로딩 <-- 매개변수에 차이가 있는 같은 용도, 같은 이름의 메서드
    CClass() { age=40; }

}

public class Class11 {
    public static void main(String[] args) {
        //2. 생성자에 전달인수를 만들고 객체마다 다른 값을 전달하여, 객체 생성과 동시에 초기화가 가능하다.
        CClass c1 = new CClass(20);
        CClass c2 = new CClass(30);
        System.out.println("c1 나이 : "+c1.getAge());
        System.out.println("c2 나이 : "+c2.getAge());

        //3. 클래스 내부에 매개변수를 갖든 안갖든, 생성자가 꺼내어지고 정의가 되면 숨어있던
        //   디폴트 생성자는 새로 정의된 생성자로 대체되고 없어진다.
        //CClass c3 = new CClass();
        //4. 위 명령의 경우 디폴트 생성자가 없어졌으므로 에러 발생.

        CClass c3 = new CClass();
        //6. (5번의 생성자 오버로딩으로) 디폴트 생성자가 생겼으므로 위 명령은 정상 실행됨.

        System.out.println("c3 나이 : "+c3.getAge());
    }
}
