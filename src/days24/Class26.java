package days24;

// 초기화 블럭
class StaticE {
    private int number;
    private static int num = 1;

    // 일반 초기화 블럭
    //: 객체 생성시 실행 (생성자와 성격이 비슷)
    //단순 값으로 초기화하는 경우 대입 연산자를 통해서 처리할 수 있지만,
    //실행문이 포함된 초기화를 진행하는 경우 아래와 같이 초기화 과정을 정의할 수 있음
    {
        number=100;
        System.out.println("인스턴스 변수 초기화용 초기화 블럭 #1");
    }
    
    // static 초기화 블럭
    //: static 멤버를 초기화하기 위한 영역, 객체 생성 이전에 실행
    static {
        num=55;
        System.out.println("StaticE의 static 블럭 실행");
    }

    // 일반 초기화 블럭에서는 스태틱 멤버에 접근이 자유롭게 가능
    // 스태틱 초기화 블럭에서는 인스턴스 멤버에 접근이 제한됨
    static int cnt=0;
    int serialNo;
    {
        ++cnt;
        serialNo=cnt;
        System.out.println("인스턴스 변수 초기화용 초기화 블럭 #2");
    }
}

public class Class26 {
    public static void main(String[] args) {
        StaticE e = new StaticE();
    }
}
