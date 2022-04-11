package days10;

import java.util.Scanner;

public class ControlOp_For10 {
    public static void main(String[] args) {
        //정수 하나를 입력받아서 1부터 입력받은 정수까지 짝수의 합을 출력
        Scanner sc=new Scanner(System.in);
        System.out.printf("정수를 입력하세요 : ");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            if (i%2==0) {
                sum+=i;
                System.out.printf("1부터 %d까지의 짝수의 합 : %d\n",i,sum);
            }
        }
        System.out.println();
        sum=0;
        for (int i=1;i<=num;i++){
            if (i%2==1) continue; //현재반복실행의 명령을 다 실행하기 전에 현재 지점에서 중단하고 다음 반복으로 이동
            sum+=i;
            System.out.printf("1부터 %d까지의 짝수의 합 : %d\n",i,sum);
        }

    }
}
