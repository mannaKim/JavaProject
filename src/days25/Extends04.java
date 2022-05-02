package days25;

// <<일반 객체의 생성 과정>>
// 1. 멤버 필드 메모리 로딩
// 2. 생성자 호출

// <<상속관계에서의 객체 생성 과정>>
// 1. 멤버 필드의 메모리 로딩
//   - 부모/자식 클래스의 모든 멤버필드가 메모리 로딩
// 2. 생성자 호출 (자식 클래스의 생성자 먼저 호출)
// 3. 자식 클래스 생성자의 첫 번째 실행 코드인 super()에 의해 부모클래스의 생성자 호출.
//    super();는 부모클래스가 있다면 자동 호출되는 명령이고 명령어는 생략되어 있음
// 4. 자식클래스의 생성자의 나머지 코드를 실행
//    - 부모클래스의 private 멤버의 경우 자식클래스에서 초기화가 불가능하므로
//      부모클래스의 생성자를 통해 초기화

class SuperB {
    int superNum;
    public SuperB() {
        System.out.println("부모클래스의 생성자 실행");
    }
}

class SubB extends SuperB {
    int subNum;
    public SubB() {
        //super();
        System.out.println("자식클래스의 디폴트 생성자 실행");
        //디폴트 생성자의 첫 명령에는 항상 super();가 생략되어 있음
        //super(); <-- 부모클래스 생성자를 호출하는 명령
        //this();와 같은 맥락!
    }
    SubB(int subNum) {
        this();
        System.out.println("자식클래스의 this()를 쓴 오버로딩된 생성자 실행");
    }
    //Q : this();와 super(); 중 뭘 먼저 쓸까?
    //A : 둘을 같이 쓰는 경우는 없다.
    // 오버로딩된 형제 생성자가 없다면 this();를 쓸 일이 없음
    // 만약 오버로딩된 형제 생성자가 있다면,
    // this();를 쓰면 호출된 생성자에서 super();가 실행되는 거고,
    // this(); 대신 super();를 쓰면 현재에서 부모생성자를 호출하고 마는 형식

    //즉~! super();는 써도 실행, 안써도 실행된다. 다만, this();가 쓰이면
    //super();는 생략되고 호출된 형제생성자에 super();를 사용할 권한을 일임하는 방식
    SubB(int subNum,int n) {
        super();
        System.out.println("자식클래스의 this()를 쓰지 않은 오버로딩된 생성자 실행");
    }
}

public class Extends04 {
    public static void main(String[] args) {
        //디폴트 생성자로 객체 선언
        SubB b1 = new SubB();
        // 1. 자식클래스 객체 생성 (자식클래스 생성자 호출)
        // 2. 자식클래스 내부에서 부모클래스의 생성자 호출
        // 3. 부모클래스의 생성자 실행
        // ※ 2번의 부모클래스 호출은 따로 기술하지 않아도 자동으로 자식클래스
        //   내부 첫번째 명령으로 호출&실행된다.

        System.out.println();
        //this();로 디폴트생성자를 호출하며 오버로딩한 생성자로 객체 선언
        SubB b2 = new SubB(1);

        System.out.println();
        //this();를 쓰지 않고 오버로딩한 생성자로 객체 선언
        SubB b3 = new SubB(1,1);

    }
}
