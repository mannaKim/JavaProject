package days22;

// this 의 용도 #2
//오버로딩 되어있는 생성자들 간에 서로를 재호출 하기위한 이름으로 사용
//호출하는 형태데로 생ㅅㅇ자가 오버라이딩 되어있어야 사용 가능

class ThisC {
    private int num1;
    private int num2;
    private int num3;

    ThisC(int n) {
        num1 = n;
        System.out.println("ThisC 생성자1 호출");
    }
    ThisC(int n1, int n2) {
        //num1=n1;
        //ThisC(n1); <-- 오류
        this(n1);
        //전달인수가 하나인 생성자를 호출하기 위해
        //ThisC(n1);가 아닌 this(n1);을 사용
        //현재 위치에서 실행될 명령이 다른 생성자에 똑같이 존재한다면,
        //똑같은 코드를 또 쓰지 않고 this 를 통해 다른 생성자를 호출해서 실행을 대신하겠다는 뜻
        num2 = n2;
        System.out.println("ThisC 생성자2 호출");
    }
    ThisC(int n1, int n2, int n3) {
        this(n1,n2);
        num3 = n3;
        System.out.println("ThisC 생성자3 호출");
    }
    //this 를 사용한 생성자간 호출코드는 반드시 생성자 코드에서 첫줄로만 사용 가능!
}

public class Class16 {
    public static void main(String[] args) {
        System.out.println("<t1 생성>");
        ThisC t1 = new ThisC(10);
        System.out.println();

        System.out.println("<t2 생성>");
        ThisC t2 = new ThisC(20,30);
        System.out.println();

        System.out.println("<t3 생성>");
        ThisC t3 = new ThisC(10,20,30);
        System.out.println();
    }
}
