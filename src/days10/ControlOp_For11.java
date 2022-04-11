package days10;

import java.util.Scanner;

public class ControlOp_For11 {
    public static void main(String[] args) {
        //입력받은 두개의 정수의 공약수를 출력하세요
        //12와 36을 입력한 경우 : 1,2,3,4,6,12
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        int i,small,gcd=1;
        System.out.printf("첫번째 정수 입력 : ");
        num1=sc.nextInt();
        System.out.printf("두번째 정수 입력 : ");
        num2=sc.nextInt();

        if (num1>num2) small=num2;
        else small=num1;

        for (i=1;i<=small;i++){
            if(num1%i==0&&num2%i==0) {
                System.out.printf("%d ", i);
                gcd=i;
            }
        }
        System.out.printf("\n%d과(와) %d의 최대공약수 : %d ",num1,num2,gcd);
    }
}
