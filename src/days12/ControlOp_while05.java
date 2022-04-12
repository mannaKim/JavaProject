package days12;

import java.util.Random;
import java.util.Scanner;

public class ControlOp_while05 {
    public static void main(String[] args) {
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.print("가위(1), 바위(2), 보(3) 중 선택 (종료-0) : ");
            int user = sc.nextInt();
            if (user==0) {
                System.out.print("가위바위보 게임을 종료합니다.");
                break;
            }
            int com = rd.nextInt();
            if (com < 0) com *= -1;
            com = com % 3 + 1; //랜덤으로 발생한 수의 범위를 1~3으로

            if(com==1)System.out.printf("컴퓨터:%s\t\t","가위");
            else if(com==2)System.out.printf("컴퓨터:%s\t\t","바위");
            else System.out.printf("컴퓨터:%s\t\t","보");

            if(user==1)System.out.printf("나:%s","가위");
            else if(user==2)System.out.printf("나:%s","바위");
            else System.out.printf("나:%s","보");

            if(com==user)System.out.println("\n무승부입니다.");
            else if(com==1&&user==2)System.out.println("\n이겼습니다.");
            else if(com==2&&user==3)System.out.println("\n이겼습니다.");
            else if(com==3&&user==1)System.out.println("\n이겼습니다.");
            else System.out.println("\n졌습니다.");
        }

    }
}
