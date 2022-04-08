package days08;

import java.util.Scanner;

public class ControlOp_IF05 {
    public static void main(String[] args) {
        // 출생년도를 입력 받아서 나이를 계산하고
        // 12세 미만 어린이, 12~18세 청소년, 19~25세 청년, 26세 이상 성년임을 출력하는 if문 작성
        Scanner sc = new Scanner(System.in);
        System.out.printf("출생년도를 입력하세요 : ");
        int year=sc.nextInt();
        int age=2022-year+1;

        if(age<0)System.out.println("잘못입력하셨습니다.");
        else if(age<12)System.out.println(age+"세 어린이입니다.");
        else if(age<19)System.out.println(age+"세 청소년입니다.");
        else if(age<26)System.out.println(age+"세 청년입니다.");
        else System.out.println(age+"세 성년입니다.");

    }
}
