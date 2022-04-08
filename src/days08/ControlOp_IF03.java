package days08;

import java.util.Scanner;

public class ControlOp_IF03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 입력하세요 : ");
        int a = sc.nextInt();

        if(a>0) {
            System.out.println("양수입니다.");
        } else {
            if (a < 0) {
                System.out.println("음수입니다.");
            }else {
                System.out.println("0입니다.");
            }
        }

        if(a>0) System.out.println("양수입니다.");
        else if(a<0) System.out.println("음수입니다.");
        else System.out.println("0입니다.");

        // 맨 위의 ()안의 비교연산식으로 계산한 결과가 true인 경우 {}안의 명령이 실행됨
        // false인 경우 다음 else if의 비교연산식을 계산하고 true인 경우 {}안의 명령이 실행됨
        // if도 else if도 모두 false라면 else 부분을 실행하고 종료함

        int kor=70, eng=80, mat=95;
        double avg=(kor+eng+mat)/3.0;

        if(avg>=80) System.out.println("합격");
        else if(avg>=70) System.out.println("대기");
        else System.out.println("불합격");
    }
}
