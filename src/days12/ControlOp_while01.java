package days12;

import java.util.Scanner;

public class ControlOp_while01 {
    public static void main(String[] args) {
        // while 반복문
        //for 반복문은 정해진 횟수의 반복을 괄호안에 미리 정의 해놓고 반복하는 특징이 있음
        //while 문은 정해지지 않은 횟수의 반복을 처리하는데 주로 사용
        //특정 조건이 만족할때까지 무한 수행
        //while(ture){ } <-이 반복문은 종료되지 않음: 무한 반복

        //for 10회 반복
        for (int i=1;i<=10;i++)
            System.out.printf("  for-%d  ",i);
        System.out.println();

        //while 10회 반복
        int i=1;
        while(i<=10){
            System.out.printf("while-%d  ",i);
            i++;
        } //괄호안의 관계연산식의 참/거짓 유무를 먼저 판단 후 반복을 계속할지 결정
        System.out.println();

        //for 도 위의 while 처럼 쓸 수 있음
        i=1;
        for(;;){
            i++;
            System.out.printf("  for-%d  ",i);
            if(i>=10) break;
        }
        System.out.println();

        /*
        while 의 경우 위에서 코딩한 것 처럼 i++명령에 의해 반복 유지 유무가 결정되는 것 보단
        특정 조건에 의해 순서와 반복횟수에 상관없이 반복이 결정되는 상황에 더 적절히 사용됨
        */

        //while 사용 예시
        Scanner sc = new Scanner(System.in);
        System.out.print("\n메뉴선택 : 1(저장), 2(불러오기), 3(종료): ");
        int input=sc.nextInt();
        while(input!=3){
            switch(input){
                case 1:System.out.print("저장했습니다."); break;
                case 2:System.out.print("불러왔습니다."); break;
            }
            System.out.print("\n메뉴선택 : 1(저장), 2(불러오기), 3(종료): ");
            input=sc.nextInt();
        }
        System.out.print("프로그램을 종료합니다.\n");
        //----------------------------------------------
        while(true){
            System.out.print("\n메뉴선택 : 1(저장), 2(불러오기), 3(종료): ");
            input=sc.nextInt();
            if(input==3) {
                System.out.print("프로그램을 종료합니다.\n");
                break;
            }
            switch(input){
                case 1:System.out.print("저장했습니다."); break;
                case 2:System.out.print("불러왔습니다."); break;
            }
        }
        System.out.println();
        //----------------------------------------------
        //1부터 100사이의 짝수 출력 : while 문 이용
        i=2;
        while(i<=100){
            System.out.printf("%d ",i);
            i+=2;
        }
    }
}
