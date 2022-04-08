package days10;

import java.util.Scanner;

public class ControlOp_For06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i,k;
        System.out.printf("출력할 팩토리얼을 입력 : ");
        k=sc.nextInt();

        //입력한 숫자의 팩토리얼 계산 후 출력
        //6을 입력했다면 6!=720
        System.out.printf("%d! = ",k);
        for (i=1;i<=k;i++) {
            fact *= i;
            if (i==k) System.out.printf("%d",i);
            else System.out.printf("%d x ",i);
        }
        System.out.printf(" = %d",fact);
    }
}
