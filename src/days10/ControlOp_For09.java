package days10;

import java.util.Scanner;

public class ControlOp_For09 {
    public static void main(String[] args) {
        int sum=0,i,num;
        //10개의 정수를 입력받아 그들의 합계와 평균 출력
        //10개를 입력하는 중간에 종료를 원하면 0을 입력하여 입력을 종료하고 최종합계를 출력

        //입력양식
        //입력1: XX
        //입력2: XX
        //  ...
        //입력10: XX

        //출력양식
        //입력한 정수들의 합계 : XXX
        //입력한 정수들의 평균 : XX.X
        Scanner sc=new Scanner(System.in);
        for (i=1;i<=10;i++){
            System.out.printf("입력 %d: ",i);
            num= sc.nextInt();
            if (num==0) {
                System.out.printf("입력한 정수들의 합계 : %d\n",sum);
                break;
            }
            sum+=num;
            if (i==10){
                System.out.printf("입력한 정수들의 합계 : %d\n",sum);
                System.out.printf("입력한 정수들의 평균 : %.1f\n",sum/10.0);
            }
        }

    }
}
