package days07;

import java.util.Scanner;

public class ControlOp_IF01 {
    public static void main(String[] args) {
        // 제어문 (control operation)
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.printf("입력한 정수 %d는 짝수입니다.\n",a);
        }
        if (a%2!=0) System.out.printf("입력한 정수 %d는 홀수입니다.\n",a);

        //  if 문의 특징
        /* 1. ()안의 값이 true면 {}안의 명령을 실행, false면 실행하지 않음
           2. ()안의 값이 true면 실행해야할 명령이 두 개 이상일 수 있으므로,
              {}로 그 경계를 구분. <-실행하거나 실행하지 않을 영역 구분
           3. ()안의 값이 true일 때 실행할 명령이 한 개라면, 중괄호{} 생략 가능
           4. 만약 ()안에 일부러 true를 썼다면 <- if(true){ }
              {}안의 내용은 무조건 실행됨
           5. 반대의 경우 if(false)는 무조건 {}안의 내용을 건너뜀
           6. ()안에는 비교연산과 논리연산이 조합된 복합 연산식 표현이 가능
              if((x==0)&&(y!=0)||(z==0)){ }
           7. ()안에는 비교연산대신 true\false 값을 갖고 있는 boolean 변수도 들어갈 수 있음
         */

        boolean result = a%2==0;
        if (result) System.out.println("입력한 정수는 짝수");
        if (result==true) System.out.println("입력한 정수는 짝수");

        if (!result) System.out.println("입력한 정수는 홀수");
        if (result==false) System.out.println("입력한 정수는 홀수");

    }
}
