package days21;

// 생성자(Constructor)
//클래스의 객체가 생성될 때, 멤버필드의 초기화를 위해서 사용되는 메소드
//각각의 객체가 생성될 때, 서로 다른 메모리를 가지는 객체를 생성할 수 있게 한다.

// 생성자의 특징
// 1. 멤버메서드 (특별한 멤버메서드 - 처음 객체 생성시에만 호출, 중간에 호출하지 않음)
// 2. 클래스의 이름과 동일한 이름을 갖는 메서드
// 3. 리턴값이 따로 없는 메서드
// 4. 따로 정의하지 않아도 이미 클래스 내부에 존재하는 메서드
// 5. 생성자는 각각의 객체가 생성될 때마다 호출되는 메서드
// 6. 주로 하는 일은 new 와 함께 객체가 저장될 HEAP 메모리를 할당하고 그 안에 멤버변수를 만드는 일

class AClass {
    private int age;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    //필요에 따라 숨어있는 생성자메서드를 꺼내놓고,
    //메모리 확보하는 동작 외에 다른 일을 시킬 수 있다.
    public AClass() {
        age = 100;
   }
}

public class Class09 {
    public static void main(String[] args) {
        AClass a = new AClass(); //생성자 메서드 호출 동작이 포함됨
        AClass b = new AClass();
        //객체가 만들어질 때만 호출되기 때문에 다른 메서드처럼 호출객체와 함께 사용되지 않음.
        //a.AClass(); <-- 에러

        System.out.println("나이 : "+a.getAge());
        b.setAge(200);
        System.out.println("나이 : "+b.getAge());
    }
}
