package days18;
// 메서드를 사용하는 세 번째 목적
//메서드 호출 후 메서드에서 계산된 결과를 호출한 지점에 리턴받아서 사용하고자 할 때

// 리턴값이 존재하는 메서드의 선언
//선언된 메서드가 return 명령을 이용하여 호출된 지점으로 결과값 하나를 전달 할 수 있다.

import java.util.Scanner;

public class Method08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num=sc.nextInt();

        int sq = squar(num);
        System.out.printf("%d^2 = %d\n",num,sq);

        int maxValue = max(10,34,67);
        System.out.printf("10,34,67 중 가장 큰 숫자 : %d\n",maxValue);

        max(65,87,12);  //<--리턴값을 받을 변수가 없어도 오류나지 않음
        //메서드의 호출과 실행, 리턴값의 구조가 반드시 리턴값을 별도의
        //변수에 저장되게 구성해야하는 것은 아님
        //다만, 리턴명령의 목적이 메서드 실행결과를 리턴받아 사용할 목적이었다면
        //리턴값을 별도의 변수에 저장하는 것이 설계목적상 올바른 사용이다.

        System.out.printf("65,87,12 중 가장 큰 숫자 : %d\n",max(65,87,12));
        //또한 메서드의 실행 결과(리턴값)는 변수에 저장할 수 있을 뿐만 아니라
        //다음과 같이 다른 메서드의 구성으로 사용할 수도 있다.
        //리턴된 값이 System.out.printf()의 출력내용으로 사용됨
    }
    public static int squar(int num) {
        return num*num;
    }
    //public static 리턴할자료형 메서드명(매개변수자료형 매개변수명){ 메서드내용 }
    public static int max(int a, int b, int c) {
        int max=a;
        if (max<b) max=b;
        max=(max<c)? c:max;

        return max;
    }
}
// 메서드 사용에 따른 메서드 형태
//abc() : 전달인수 없고, 리턴값도 없는 형태
//abc(10,20) : 전달인수 두 개, 리턴값은 없는 형태
//k=abc() : 전달인수 없고, 리턴값이 있는 형태
//k=abc(10,20) : 전달인수 두 개, 리턴값이 있는 형태

//개발자 필요에 의해 만들어지는 메서드는 반드시 클래스 안에 정의 되어야 하며,
//생성된 메서드 간에는 자유롭게 서로를 호출하여 사용할 수 있다.
//그들은 그들을 둘러싼 클래스에 속해있는 멤버들이라고 한다.
//다만, 서로를 자유롭게 호출하는 대상에서 main 메서드는 제외한다.
//main 을 호출한다는건 프로그램을 시작한다는 뜻이며, 개발자에의해 임의호출될 수 없다.
