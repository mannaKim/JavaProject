package days20;

// 클래스(class)
//프로그램으로 처리하고자 하는 대상을 자료화하여 하나의 자료형으로 정의한 사용자 정의 자료형
//쉽게 말해 필요에 의해 기본자료형(int, double, char 등) 외에 새롭게 정의한 자료형이다.
//한 개 이상의 자료, 하나 이상의 자료형을 저장할 수 있는 복합 자료형
//활용되기 이전 정의만 되어있는 클래스는 정의된 형태로 기술된 정의영역(설계도,원본)이다.

// 자바의 프로그램 단위는 클래스
//하나의 프로그램 파일(xxx.java) 안에는 여러개의 클래스를 넣어서 사용할 수 있다.
//여러개의 클래스 중 파일이름과 동일한 이름을 쓰는 클래스를 public 으로 지정한다.
//그 클래스에는 보통 public static void main(){} 이 존재한다.
//그 클래스는 자료형으로서의 클래스이기보단 프로그램 실행단위로서의 클래스이다.

//앞으로 우리가 만들어서 사용하거나, import 해서 사용할 클래스는 자료저장&가공용 클래스이다.

// class 만드는 방법 : class 라는 키워드 사용
class className {
    //멤버필드(==속성,멤버변수,필드)
    int var1;
    double var2;
    String var3;
    int [] arr1 = new int[5];

    //멤버 메서드
    public void method1(){ }
    public static void method2(){  }
}

// class First 생성
class First {
    int n1;
    int n2;
    //속성(멤버필드,멤버변수,필드) : 클래스에 속한 정보(변수)들
    //속성은 변수로 생성하며 클래스의 멤버필드라고 호칭한다.
}

public class Class01 {
    public static void main(String[] args) {
        // 클래스 변수의 선언 (First 형 변수 a1)
        First a1;
        //새로 만들어진 클래스의 변수는 위와 같이 생성한다.
        //생선된 변수는 레퍼런스(참조)변수이다.

        //배열과 마찬가지로 new 명령을 이용하여 HEAP 영역에 적정 공간(클래스 크기만큼)
        //확보한 후, 그 주소를 a1 변수에 저장하여 사용한다.
        //레퍼런스 변수와 new 에 의해 만들어진 공간이 합쳐지면, 이를 객체라고 부른다.
        a1 = new First();
        //new 를 이용해 공간이 할당되면, 이제부터 n1,n2변수가 a1이라는 이름과 함께 사용이 가능하다.
        //new First() 로 생성된 새로운 공간을 뉴인스턴스(new instance)라고 부른다.

        First a2 = new First(); //객체도 선언과 동시에 초기화 가능
        //객체가 두 개가 만들어지면 a1에도 n1,n2변수가 생성되고, a2에도 n1,n2변수가 생성되므로,
        //그들을 구분하기 위해 a1.n1, a1.n2, a2.n1, a2.n2 로 사용한다.
        System.out.println("a1.n1값 : "+a1.n1); //초기화된 값은 0
        System.out.println("a1.n2값 : "+a1.n2); //초기화된 값은 0
        a2.n1=30;
        a2.n2=40;
        System.out.println("a2.n1값 : "+a2.n1);
        System.out.println("a2.n2값 : "+a2.n1);

        // Scanner sc = new Scanner(System.in);
        //Scanner 는 import 해서 사용하는 class, sc는 객체
        // Random rd = new Random();
        //Random 은 import 해서 사용하는 class, rd는 객체
    }
}
