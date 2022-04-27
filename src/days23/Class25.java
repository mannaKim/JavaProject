package days23;

class StaticD {
    //private 로 지정된 static 멤버변수
    private static int count; //클래스 내부에서만 사용 가능

    //스태틱 변수 : 인스턴스메서드와 스태틱메서드 모두에서 사용 가능
    //private 로 지정된 스태틱 변수를 이용하고자 한다면, public 으로 지정된 멤버메서드로 이용한다.
    public static void setCount (int count) { StaticD.count=count; }
    public static int getCount() { return count; }

    //인스턴스 메서드는 객체 생성 후 이용 가능
    //스태틱 변수와 매개변수가 이름이 같을 때는 StaticD.count 처럼 앞에 클래스명을 붙여서 구분
    public void instanceSetCount (int count) { StaticD.count=count; }
    public int instanceGetCount() { return StaticD.count; }
}

public class Class25 {
    public static void main(String[] args) {
        //private 로 지정된 static 멤버변수는 클래스의 외부에서 접근이 차단됨
        //StaticD.count = 100;  <-- 에러

        //접근지정자가 public 인 스태틱메서드로 private 로 지정된 스태틱변수의 값을 이용할 수 있다.
        System.out.printf("StaticD.count = %d\n",StaticD.getCount());
        StaticD.setCount(15);
        System.out.printf("StaticD.count = %d\n",StaticD.getCount());

        //private static 변수를 사용하는 인스턴스 메서드는 객체 생성 후 사용이 가능
        StaticD d1 = new StaticD();
        System.out.printf("StaticD.count = %d\n",d1.instanceGetCount());
        d1.instanceSetCount(20);
        System.out.printf("StaticD.count = %d\n",d1.instanceGetCount());
    }
}
