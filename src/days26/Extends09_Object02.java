package days26;

// <<toString 메서드의 사용>>
// toString 메서드는 클래스의 객체 정보를 문자열로 반환: 객체의클래스명+'@'+해시코드값(16진수)
// 사용자 정의 클래스(사용자가 직접 만든 클래스)에 toString 메서드를 오버라이딩하여
// 클래스의 정보를 문자열로 제공하도록 변형(재정의)할 수 있다.

class UserClassB { } //toString 을 오버라이딩하지 않은 클래스
class Point { //toString 을 오버라이딩한 클래스
    private int x;
    private int y;
    public Point(int x, int y) { this.x=x; this.y=y; }
    public String toString() {
        return "(x="+this.x+", y="+this.y+")";
    }
}

public class Extends09_Object02 {
    public static void main(String[] args) {
        UserClassB obj1 = new UserClassB();
        UserClassB obj2 = new UserClassB();
        System.out.println("오버라이딩 되지 않은 toString() => " + obj1.toString());
        System.out.println("오버라이딩 되지 않은 toString() => " + obj2);

        Point p = new Point(10,20);
        System.out.println("오버라이딩 된 toString() => " + p.toString());
        //== System.out.println("오버라이딩 된 toString() => " + p);

        //.toString()은 print 에서 사용되거나 다른 문자열과 '+' 연산될 때 생략 가능
        String msg = "Point => "+p; //== "Point => "+p.toString();
        System.out.println(msg);
    }
}
