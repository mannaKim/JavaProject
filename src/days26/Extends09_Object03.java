package days26;

// Object 클래스의 equals 메소드 : 객체간의 비교를 위해서 사용되는 메서드
// Object 가 상속한 메서드들 중 toString 과 함께 가장 많이 오버라이딩 되는 메서드

public class Extends09_Object03 {
    public static void main(String[] args) {
        //일반적, 기본 자료형들의 값의 비교는 비교연산자(==)를 사용
        int n1=10; int n2=10;
        if (n1==n2) System.out.println("n1과 n2 값은 같다.");
        else System.out.println("n1과 n2 값은 다르다.");

        String s1 = "Hello"; String s2 = "Hello";
        System.out.println(s1+s2); //이미 String 클래스에 toString()이 오버라이딩 되어있음
        if (s1==s2) System.out.println("s1과 s2 값은 같다.");
        else System.out.println("s1과 s2 값은 다르다.");

        // == 연산은 변수가 직접 저장한 값으로 비교해주는 연산자라는 것을 감안하면
        // s1==s2 는 두 개의 참조변수값(주소값)이 비교되었다라는 것을 알 수 있다.
        // 현재의 s1과 s2는 같은 주소를 갖고있다는 말이기도 하다.

        // String s1 = "hello"; 실행시에 HEAP 영역에 hello 가 저장되고
        // 그 주소가 s1 변수에 저장된다.
        // String s2 = "hello"; 실행시에는 새로운 영역에 hello 가
        // 저장되는 것이 아니라 이미 존재하는 hello 의 주소를 s2에 또 저장한다.
        // 이는 모두 new 키워드가 없어서 새로운 공간이 생기지 않았기 때문이다.
        // 물론 s1="world"; 라는 새로운 글자를 저장하면 s2는 그대로,
        // 새로운 공간에 world 가 저장되고 그 주소를 s1이 저장함

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        if (s3==s4) System.out.println("s3과 s4 값은 같다.(==)");
        else System.out.println("s3과 s4 값은 다르다.(==)");
        // 앞선 명령과 달리 이번엔 new 키워드를 사용하여 서로 다른 공간에 Hello 를
        // 저장하고 각각의 주소를 s3와 s4에 저장한다.
        // 이를 통해 "==" 은 글자의 비교가 아니라 레퍼런스 주소들의 비교라는 것을 알 수 있다.

        // 실제 객체의 값을 비교하기 위한 equals 메서드를 사용하면 참조값이 서로 다른
        // 객체의 실제 데이터를 비교하여 동일한 데이터를 가지고있는지 확인할 수 있다.
        if (s3.equals(s2)) System.out.println("s3과 s4 값은 같다.(equals)");
        else System.out.println("s3과 s4 값은 다르다.(equals)");
        // Object 클래스에서 상속받은 equals 메서드를 사용한 것이고,
        // String 클래스에 맞게 오버라이딩 되어있기 때문에 글자 비교까지 하는 것.
        // 오버라이딩 되기 전의 equals 는 ==처럼 참조값(주소)끼리 비교된다.

        // 같은 패키지안의 다른 파일에 있는 클래스의 객체 생성
        Point p1 = new Point(10,20);
        Point p2 = new Point(10,20);
        if (p1.equals(p2)) System.out.println("p1과 p2 값은 같다.(equals)");
        else System.out.println("p1과 p2 값은 다르다.(equals)");
        // equals 를 오버라이딩 하지 않은 클래스의 객체간 equals 메서드 사용은
        // 참조값들을 비교하는 결과를 얻는다.
    }
}
