package days08;

import java.util.Scanner;

public class ControlOp_IF09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String user,com;
        com="가위";
        System.out.printf("가위/바위/보 중 하나를 입력하세요 : ");
        user=sc.nextLine();

        if(user.equals("가위")){
            if(com.equals("가위"))System.out.println("비겼습니다.");
            else if(com.equals("바위"))System.out.println("당신이 졌습니다.");
            else System.out.println("당신이 이겼습니다.");
        }
        else if(user.equals("바위")){
            if(com.equals("가위"))System.out.println("당신이 이겼습니다.");
            else if(com.equals("바위"))System.out.println("비겼습니다.");
            else System.out.println("당신이 졌습니다.");
        }
        else if(user.equals("보")){
            if(com.equals("가위"))System.out.println("당신이 졌습니다.");
            else if(com.equals("바위"))System.out.println("당신이 이겼습니다.");
            else System.out.println("비겼습니다.");
        }
        else System.out.printf("잘못입력하셨습니다.");

        if(user.equals("가위")&&com.equals("보"))
            System.out.println("당신이 이겼습니다.");
        else if(user.equals("바위")&&com.equals("가위"))
            System.out.println("당신이 이겼습니다.");
        else if(user.equals("보")&&com.equals("바위"))
            System.out.println("당신이 이겼습니다.");
        else if(user.equals(com))
            System.out.println("비겼습니다.");
        else System.out.println("당신이 졌습니다.");

        if(user.equals("가위")&&com.equals("바위"))
            System.out.println("당신이 졌습니다.");
        else if(user.equals("바위")&&com.equals("보"))
            System.out.println("당신이 졌습니다.");
        else if(user.equals("보")&&com.equals("가위"))
            System.out.println("당신이 졌습니다.");
        else if(user.equals(com))
            System.out.println("비겼습니다.");
        else System.out.println("당신이 이겼습니다.");
    }
}
