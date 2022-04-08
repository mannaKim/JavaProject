package days08;

import java.util.Scanner;

public class ControlOp_IF04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("점수를 입력하세요 : ");
        int a = sc.nextInt();

        //90이상:A, 80~89:B, 70~79:C, 60~69:D, 60미만:F
        if(a>=90)System.out.println("A학점");
        else if(a>=80)System.out.println("B학점");
        else if(a>=70)System.out.println("C학점");
        else if(a>=60)System.out.println("D학점");
        else System.out.println("F학점");
        //----------------------------------------
        if(a<60)System.out.println("F학점");
        else if(a<70)System.out.println("D학점");
        //여기서 조건을 a>=60 이런식으로 하면 안됨!
        //부등호 방향 통일해야 문제 없이 출력됨
        else if(a<80)System.out.println("C학점");
        else if(a<90)System.out.println("B학점");
        else System.out.println("A학점");
    }
}
