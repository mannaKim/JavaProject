package days23;

class MyMath {
    int a, b;
    static int c=0;

    int add() { return a+b; }  //인스턴스 메서드는 인스턴스 변수에 자유롭게 접근 가능
    int subtract() { return a-b; }
    int multiply() { return a*b; }
    double divide() { return a/(double)b; }

    void init() { a=c+20; b=c+30; } //인스턴스 메서드는 스태틱 변수에 자유롭게 접근 가능

    static int add(int e, int d) {
        //return a+b+e+d;    //스태틱 메서드는 인스턴스 변수에 접근이 불가능
        return c+e+d;        //스태틱 메서드는 스태틱 변수에 자유롭게 접근 가능
    }
    static int subtract(int e, int d) { return e-d; }
    static int multiply(int e, int d) { return e*d; }
    static double divide(double e, double d) { return e/d; }
}

public class Class23 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.init();

        //인스턴스 메서드 : 전달인수 없이 멤버변수들로 연산 가능
        System.out.println("<인스턴스 메서드>");
        System.out.println("add "+mm.add());
        System.out.println("subtract "+mm.subtract());
        System.out.println("multiply "+mm.multiply());
        System.out.println("divide "+mm.divide());

        //매개변수와 스태틱변수로 연산 : 필요한 값들을 전달인수로 전달해서 연산
        System.out.println("<스태틱 메서드>");
        System.out.println("add "+MyMath.add(10,30));
        System.out.println("subtract "+MyMath.subtract(10,30));
        System.out.println("multiply "+MyMath.multiply(10,30));
        System.out.println("divide "+MyMath.divide(10,30));
    }
}
