package days32;

// 예외(Exception) 처리
//에러(Error) : 문법적으로 잘못된 것, 에러가 존재하는 경우 컴파일이 안돼서 실행자체가 될 수 없음
//예외(Exception) : 실행중 발생한 오류, 특정 상황 또는 조건이 만족되는 경우 오류가 발생하여 프로그램이 실행중간에 종료되는 현상

//예외는 다양한 상황에 대해서 발생하는 현상으로 모든 예외를 대처할 수 없다.
//다만, 예외가 발생한 경우 프로그램이 종료되지 않고 저장과 같은 기능을 제공할 수 있어야한다.
//(예외가 발생해도 프로그램이 강제 종료되지 않고 사용자에게 선택권 또는 처리기회를 주는 것을 말한다.)
//예외처리 : 예외가 발생한 경우 프로그램이 강제 종료되지 않도록 방지 또는 처리하는 것

public class Exception01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int k = (int) (Math.random() * 10); //0~9사이의 랜덤 정수 발생
            try {
                int result = 100 / k;
                System.out.println(i + "번째 " + result);
                // 문맥상 오류가 아님! k==0 일 경우 Exception 발생
                // Exception in thread "main" java.lang.ArithmeticException: / by zero
                // => try catch 로 예외처리 해주면 Exception 이 발생하지 않음
            }catch(ArithmeticException e) {
                System.out.println(i + "번째 무효 : result 가 0으로 나눠짐");
                //예외가 발생하면 catch 구문 안의 명령을 대신 실행하고 프로그램 실행을 계속한다.
            }

        }
    }
}