package days10;

import java.util.Scanner;

public class ControlOp_For05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,a,b;
        System.out.printf("첫 번째 정수 입력 : ");
        a=sc.nextInt();
        System.out.printf("두 번째 정수 입력 : ");
        b=sc.nextInt();

        //입력받은 숫자 중 작은 숫자부터 큰 숫자까지 모든 정수를 출력하세요
        //8과 3을 입력했다면 3 4 5 6 7 8

        //방법#1
        if (a>=b) {
            for(i=b;i<=a;i++) System.out.printf("%d ",i);
        }
        else {
            for(i=a;i<=b;i++) System.out.printf("%d ",i);
        }

        //방법#2
        System.out.println();
        int min,max;
        if (a>b){
            max=a;
            min=b;
        }
        else {
            max=b;
            min=a;
        }
        for (i=min;i<=max;i++) System.out.printf("%d ",i);

    }
}
