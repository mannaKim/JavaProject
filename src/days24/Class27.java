package days24;

// 싱글턴 패턴(Singleton Pattern)
//웹프로그래밍에서 자주 사용하는 기법!

//웹프로그래밍의 특성상 하나의 프로그램을 서버에 두고 다수의 사용자가 접속해서
//그 하나의 프로그램을 사용하게 되는데, 이때 그 프로그램 내의 클래스로 만들어지는
//객체는 다수의 사용자 인원 만큼 따로 생성되어 사용되기 마련이다.
//이때, 메모리 과부하가 일어날 수 있으며, 이를 해결하기 위해 하나의 객체를 각각 다른 사용자가
//혼자 사용하는것처럼 공유해서 쓸 수 있도록 하는 기법이 싱글턴 기법이다.

//특정 클래스의 인스턴스를 반드시 한 개만 생성할 수 있도록 강제하는 패턴
//하나의 인스턴스를 여러 레퍼런스 변수가 공유하여 사용하도록 제어하는 방식

import java.util.Calendar;

class SingletonEx {
    int n1;
    int n2;

    // <<클래스를 싱글톤으로 설계하는 방법>> <-- ☆☆중요☆☆
    // 1. 생성자를 private 로 보호
    private SingletonEx() { } //즉, main 에서 SingletonEx s1 = new SingletonEx(); 같은 명령 불가

    // 2. 클래스 내부에서 생성자를 호출해서 객체 하나(new 인스턴스)를 생성
    //    private static 으로 생성한다.
    private static SingletonEx itc = new SingletonEx();
    // 위 itc 객체에 저장된 new SingletonEx() 가 모두가 공유해서 사용할 유일한 new 인스턴스가 된다.

    // 3. 생성해놓은 객체의 참조변수 값을 리턴하는 public 형의 메서드를 생성
    //    메서드 이름은 getInstance()로 생성 (public static)
    public static SingletonEx getInstance() {
        return itc;
    }
}

public class Class27 {
    public static void main(String[] args) {
        /* 공간이 객체마다 각각
        SingletonEx s1 = new SingletonEx();
        SingletonEx s2 = new SingletonEx();*/

        /* 공간은 하나, 레퍼런스 변수는 두 개
        SingletonEx s1 = new SingletonEx();
        SingletonEx s2 = s1;*/

        // 4. 싱글톤 클래스 사용법
        //   SingletonEx.getInstance()가 리턴해주는 유일한 인스턴스 주소를 s1에 저장해서 사용
        SingletonEx s1 = SingletonEx.getInstance();
        SingletonEx s2 = SingletonEx.getInstance();
        SingletonEx s3 = SingletonEx.getInstance();

        // s1~3은 모두 같은 주소값을 가짐
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //객체 참조 변수를 출력하면 클래스 이름과 해쉬코드가 출력된다.
        //해쉬코드 : 각 객체들을 서로 구분할 수 있는 고유값
        //         새로운 저장장소의 주소를 계산하는 피연산자이기도 함.
        s1.n1=150;
        s2.n2=200;
        System.out.printf("%d\t%d",s3.n1, s3.n2);

        //싱글턴 패턴이 구현된 클래스의 활용 예시
        //날짜, 시간에 관련된 정보를 제공하는 Calendar
        //클래스 싱글턴 패턴이 구현되어 new 인스턴스를 사용하여 객체생성이 안된다.
        //반드시 getInstance() 메서드를 사용해야 한다.
        Calendar calendar = Calendar.getInstance();

    }
}
// 싱글톤 방식은 생성자가 private 로 보호되어 main 메서드 안에서 new SingletonEx()로
// 새로운 객체 생성이 불가능하다. (SingletonEx s1 = new SingletonEx(); 가 에러가 난다는 뜻)
// 클래스 내부에 유일한 객체(itc)를 생성해두고 (private static 으로 생성)
// public static 으로 만들어진 getInstance() 메서드를 호출하여
// itc(유일한 객체의 주소값)을 리턴받아 객체를 사용한다.
// 생성자 메서드는 static 인스턴스 itc 를 만들때 말고는 사용되지 않는다.
// 싱글톤 방식은 주로 유지되어야 할 정보가 많거나 메서드를 많이 갖고 있는 클래스에서 많이 사용된다.
// 여러개의 객체가 유지되면 부담스러운 부분을 하나로 공유하고, 필요한 내용을 멤버 변수로 해결하는 방식이다.