package days32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception06 {
    public static void main(String[] args) {

        // 순수한 아라비아기호로 문자열을 입력받아서 숫자로 변환하는 코드를 작성하세요
        // 입력내용 중 숫자가 아닌 다른 것이 입력되면 다시 입력하라는 메시지와 함께 입력받는 코드가 실행되게 한다.
        // 주요코드 : num = Integer.parseInt(sc.nextLine());
        // Integer.parseInt() : 숫자가 아닌 글자를 정수로 변환하려고 하면 예외 발생
        // 최종출력 : "입력한 숫자는 XX 입니다."

        // 방법 #1
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("정수를 입력하세요. : ");
        while(true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (/*NumberFormat*/Exception e) {
                //e.printStackTrace();
                System.out.print("정수가 아닌 타입이 입력되었습니다. 다시 입력하세요. : ");
            }
        }
        System.out.println("입력한 숫자는 "+num+"입니다.");

        // 방법 #2
        System.out.print("정수를 입력하세요. : ");
        while(true) {
            try {
                num = sc.nextInt();
                break;
            } catch(InputMismatchException e) {
                System.out.print("정수가 아닌 타입이 입력되었습니다. 다시 입력하세요. : ");
                sc.nextLine(); //입력버퍼를 비움. 키보드 버퍼에 남아있는 문자열(엔터 등)의 값을 제거
            }
        }
        System.out.println("입력한 숫자는 "+num+"입니다.");

    }
}
