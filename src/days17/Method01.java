package days17;
// Method : Function 이라고도 부르며, 간헐적으로 반복되는 코드단위를 별도로
//          정의해놓고, 그 이름으로 코드를 실행하는 단위 실행 코드.
//          (JAVA 에서는 Function 보단 Method 라는 표현을 주로 사용)

// 메서드의 특징
//1. 명령들이 모여서 기능을 정의하는 단위
//2. 일련의 실행코드들을 묶어서 재활용
//3. 메서드는 각 메서드마다 고유한 이름이 있음
//4. 메서드가 이름이 불리워져서 실행되라는 명령(Call-호출)을 받으면
//   그 메서드의 몸체를 이루는 코드들이 실행되는 형식
//5. 자바의 메서드는 이름 옆에 항상 괄호()를 달고 나옴
//6. 메서드의 생성 : 클래스 내부에서만 만들 수 있음
//7. main 메서드 위쪽 또는 아래쪽에 만들 수 있음

public class Method01 {
    public static void main(String[] args) {
        System.out.println("메서드 호출");
        aaa();  //메서드의 호출
        //메서드가 하나 호출되면, 메서드의 몸체로 포커스가 이동한 뒤 그 몸체를
        //모두 실행하고 원래 자리로 돌아옴
        System.out.println("메서드 실행 종료");
    }

    // 메서드의 정의(define)
    //개발자가 정의한 메서드의 정의 위치는 main 의 위나 아래에 정의 가능
    //public static void : 문법, aaa : 메서드 이름
    public static void aaa() {
        System.out.println("첫번째 Print 메서드 실행!");
        System.out.println("두번째 Print 메서드 실행!");
        System.out.println("세번째 Print 메서드 실행!");
        System.out.println("네번째 Print 메서드 실행!");
    }  //메서드의 내용으로 기술된 네 개의 println 은 aaa() 로 실행이 가능

}
