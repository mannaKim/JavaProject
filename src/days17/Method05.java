package days17;

public class Method05 {

    // 매개변수의 역할과 생명 주기

    public static void main(String[] args) {
        int num=10;
        System.out.printf("main 의 num -> %d\n",num);

        updateValue(num);
        //전달인수로 변수를 사용하는 건, 변수를 전달하는게 아니라
        //변수에 저장된 값을 전달한다는 뜻. 변수값의 복사본이 전달됨

        System.out.printf("main 의 num -> %d\n",num);
    }

    public static void updateValue(int num) {
        num=200;
        System.out.printf("updateValue 의 num -> %d\n",num);
    }
    // 1. 메서드 호출 시 전달인수로 넣어주는 변수와 updateValue 메서드 영역의
    //    매개변수로 쓰이는 변수의 이름은 같아도 상관 없다.
    //    위에서 언급한 두 변수는 지역변수이며, 서로 다른 변수이다.
    // 지역변수 : { } 중괄호 안에 선언된 변수. 자신이 선언된 { }를 벗어나면 소멸됨

    // 2. 전달인수의 변수값이 매개변수 변수로 "값"만 전달되는 방식을
    //    Call by Value 라고 한다.
}
