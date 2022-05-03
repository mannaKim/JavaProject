package days26;

// <<Object 클래스>>
// 사용자 정의 클래스를 생성하면서, extends(상속)을 구현하지 않으면 자동으로
// java.lang.Object 클래스를 상속한다.
// Object 클래스는 자바에서 사용되는 모든 클래스들의 최상위 부모클래스이다.
// Subclass extends Super 라는건 Subclass 는 Object 클래스를 상속하지 않지만,
// Super 클래스가 Object 클래스를 상속하므로, Subclass 는 Object 클래스를
// 상위의 상위로 상속한 것과 같은 의미다.

class UserClassA /* extends Object 가 생략되어 있음 */ { }

public class Extends09_Object01 {
    public static void main(String[] args) {
        UserClassA obj = new UserClassA();

        // getClass : 해당 객체의 클래스 이름을 리턴해주는 메서드
        //            Object 클래스에서 상속 받은 메서드
        System.out.println(obj.getClass());

        // hashCode : 해당 객체의 해시코드값(다른 객체와 구분하기 위한 고유값)을
        //            리턴해주는 메서드
        System.out.println(obj.hashCode()); //(JVM 에 의해 관리되고 있는 번호)

        // toString : 해당 객체의 정보를 문자열로 리턴해주는 메서드
        System.out.println(obj.toString()); //객체의 클래스명+@+해시코드값(16진수)
        System.out.println(obj); //System.out.println(obj.toString());과 동일

        //https://docs.oracle.com/javase/8/docs/api/
    }
}
