package days07;

import java.util.Scanner;

public class ControlOp_IF02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("정수를 입력하세요 : ");
        int a=sc.nextInt();

        if(a%2==0)
            System.out.println("입력한 정수는 짝수(even)입니다.");
        else
            System.out.println("입력한 정수는 홀수(odd)입니다.");

        System.out.println();
        int kor=70,eng=98,mat=95;
        double avg=(kor+eng+mat)/3.0;
        if(avg>=80.0)
            System.out.println("평균 80이상 합격");
        else System.out.println("평균 80미만 불합격");

        // 평균60이상이거나 영어점수가 80이상이면 합격, 아니면 불합격
        if(avg>=80.0||eng>=80)
            System.out.println("합격");
        else System.out.println("불합격");

        // 평균60이상이면서 모든과목 40이상이라면 합격, 아니면 불합격
        if(avg>=60.0&&kor>=40&&eng>=40&&mat>=40)
            System.out.println("합격");
        else System.out.println("불합격");

        // 년도 하나를 입력받아서 변수에 저장하고 입력한 년도가 윤년인지 평년인지 출력
        System.out.printf("년도 입력 : ");
        int year=sc.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
            System.out.printf("%d년은 윤년\n",year);
        else System.out.printf("%d년은 평년\n",year);
    }
}
