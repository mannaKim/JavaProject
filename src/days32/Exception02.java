package days32;



public class Exception02 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4/0); //<--ArithmeticException
            System.out.println(5);
            //try 구문에 있는 명령이라도 에러가 발생한 구문 다음에 위치하는 명령은 실행하지 않는다.
        }catch(ArithmeticException e) { //<--catch 의 매개변수로 해당되는 Exception 객체를 넣는다
            e.printStackTrace();    //오류 메세지 출력: java.lang.ArithmeticException: / by zero
            e.getMessage();         //at days32.Exception02.main(Exception02.java:12)
            System.out.println("6 - 예외처리 1");
        }catch(Exception e) {
            System.out.println("6 - 예외처리 2");
        }
        //try 구문안에서 예외가 발생하면, catch 의 매개변수에 해당 예외에 해당하는 객체가 있는지 확인하고 있으면
        //해당 catch 구문을 실행한다.

        //Exception 객체들(ArithmeticException, RuntimeException 등)의 상위클래스 Exception
        //Exception e 는 모두를 포함-수용하는 최상위 예외 클래스이며, 다중 예외 처리시 가장 마지막에 위치시킨다.
        //다중 예외처리의 표현시 Exception 이 가장 위에 있으면, 아래에 위치한 세부적인 예외처리에 순서가 한번도 돌아가지 못하고
        //Exception 에서 모든 예외가 처리된다.


    }
}
