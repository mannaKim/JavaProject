package days17;
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
    }

    public static int squar(int num){
        return num*num;
    }
}
