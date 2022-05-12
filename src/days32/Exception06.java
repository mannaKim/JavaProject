package days32;

import java.util.Scanner;

public class Exception06 {
    public static void main(String[] args) {

        // 순수한 아라비아기호로 문자열을 입력받아서 숫자로 변환하는 코드를 작성하세요
        // 입력내용 중 숫자가 아닌 다른 것이 입력되면 다시 입력하라는 메시지와 함께 입력받는 코드가 실행되게 한다.
        // 주요코드 : num = Integer.parseInt(sc.nextLine());
        // Integer.parseInt() : 숫자가 아닌 글자를 정수로 변환하려고 하면 예외 발생
        // 최종출력 : "입력한 숫자는 XX 입니다."
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("아라비아 기호(문자형 숫자)를 입력하세요. : ");
        while(true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (/*NumberFormat*/Exception e) {
                //e.printStackTrace();
                System.out.print("아라비아 기호(문자형 숫자)를 입력하세요. : ");
            }
        }
        System.out.println("입력한 숫자는 "+num+"입니다.");

    }
}
