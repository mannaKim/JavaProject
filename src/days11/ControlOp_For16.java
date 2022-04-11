package days11;

import java.util.Scanner;

public class ControlOp_For16 {
    public static void main(String[] args) {
        //1부터 100사이의 숫자 하나를 입력 받아서 그 숫자가 소수(prime number)인지 아닌지 출력
        //소수(prime number) : 1과 자기 자신으로만 나누어떨어지는 수

        /*
        Scanner sc=new Scanner(System.in);
        System.out.printf("소수인지 판단할 숫자를 입력 : ");
        int num=sc.nextInt();
        int i,cnt=0;
        for (i=1;i<=num;i++){
            if(num%i==0) cnt+=1;
        }
        if (cnt==2) System.out.printf("%d은(는) 소수이다.\n",num);
        else System.out.printf("%d은(는) 소수가 아니다.\n",num);
        */

        //1부터 100사이의 모든 소수(prime number)를 출력
        for(int i=1;i<=100;i++){
            int cnt=0;
            for(int j=1;j<=i;j++){
                if(i%j==0) cnt++;
            }
            if (cnt==2) System.out.printf("%d은(는) 소수이다.\n",i);
            //else System.out.printf("%d은(는) 소수가 아니다.\n",i);
        }


    }
}
