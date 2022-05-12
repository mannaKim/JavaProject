package days32;

public class Exception04 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        method2();

        /*try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //throws Exception 꼬리표가 붙은 메서드를 호출하면,
        //호출하는 지점에 다시 빨간줄(에러)이 표시된다.
        //그럼 다시 add throw declaration 와
        //surround with try-catch(인텔리제이: more action -> surround with try-catch) 중 하나를 선택할 수 있다.
    }
    //현재 예외처리를 해결하는 방법#2
    //add throw declaration 메뉴 사용 (인텔리제이: add exception to method signature)
    //"현재 메서드의 명령중에는  에러(예외)가 발생하는 명령이 포함되어 있습니다."
    //라고 메서드에 꼬리표(throws Exception)를 붙인다.

    private static void method2() throws Exception{
        throw new Exception();  //강제 예외 발생 - 예외가 발생할테니 처리하라는 의미의 빨간줄

        //현재 예외처리를 해결하는 방법#1
        /*try {
            throw new Exception();
        } catch (Exception e) { }*/

    }
}
