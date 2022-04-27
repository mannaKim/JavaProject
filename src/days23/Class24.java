package days23;

//인스턴스 메서드에서 인스턴스 변수 사용 가능
//인스턴스 메서드에서 스태틱 변수 사용 가능
//스태틱 메서드에서 인스턴스 변수 사용 불가능
//스태틱 메서드에서 스태틱 변수 사용 가능

//인스턴스 메서드에서 인스턴스 메서드 호출 가능
//인스턴스 메서드에서 스태틱 메서드 호출 가능
//스태틱 메서드에서 인스턴스 메서드 호출 불가능
//스태틱 메서드에서 스태틱 메서드 호출 가능

class MemberCall {
    int iv=10; //인스턴스 변수 : 객체가 생성될 때 iv가 생성되고 10으로 초기화 됨
    static int sv=20; //스태틱 변수 : 프로그램이 시작할 때 sv가 생성되고 20으로 초기화 됨

    int iv2 = sv; //인스턴스 변수 : 객체가 생성될 때 iv2가 생성되고,
                  //             프로그램이 시작할 때 이미 만들어진 sv 값으로 초기화 됨

    //static int sv2 = iv; <-- 에러
    //스태틱 변수 값을 인스턴스 변수 값으로 초기화 할 수 없다.
    //iv가 언제 생성될지 모르기 때문에 sv2에 값을 전달할 수 없다.
    //굳이 사용하려면 아래 방법을 사용
    static int sv2 = new MemberCall().iv;

    //인스턴스 메서드는 인스턴스 변수, 스태틱 변수 모두 사용 가능
    void instanceMethod1() {
        System.out.println(iv);
        System.out.println(sv);
    }

    //스태틱 메서드는 인스턴스 변수 사용 불가능, 스태틱 변수 사용 가능
    //             인스턴스 메서드 사용 불가능, 스태틱 메서드 사용 가능
    static void staticMethod1() {
        //System.out.println(iv);
        System.out.println(new MemberCall().iv); //<-- 억지(?) 사용
        System.out.println(sv);

        //instanceMethod1();
        new MemberCall().instanceMethod1(); //<-- 억지(?) 사용
    }

    //인스턴스 메서드는 인스턴스 메서드, 스태틱 메서드 모두 사용 가능
    void instanceMethod2() {
        instanceMethod1();
        staticMethod1();
    }
}

public class Class24 {
    public static void main(String[] args) {

    }
}
