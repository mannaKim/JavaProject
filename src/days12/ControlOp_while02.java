package days12;

import java.util.Scanner;

public class ControlOp_while02 {
    public static void main(String[] args) {
        //정수를 입력받아서 입력된 정수의 팩터리얼을 출력
        //while 이용
        Scanner sc=new Scanner(System.in);
        System.out.printf("팩터리얼을 계산할 정수 입력 : ");
        int num=sc.nextInt();

        //6을 입력하면 6! = 1x2x3x4x5x6 = 720
        int i=1, fact=1;
        System.out.printf("%d! = ",num);
        while(i<=num-1){
            fact*=i;
            System.out.printf("%dx",i);
            i++;
        }
        System.out.printf("%d = %d\n",num,fact*num);

        //6을 입력하면 6! = 6x5x4x3x2x1 = 720
        i=num;
        fact=1;
        System.out.printf("%d! = ",num);
        while(i>=2){
            fact*=i;
            System.out.printf("%dx",i);
            i--;
        }
        System.out.printf("%d = %d\n",1,fact);
    }
}
