package days18;

import java.util.Scanner;

public class Method12 {
    public static void main(String[] args) {
        int kor,eng,mat,tot;
        //String grade;
        double ave;
        kor=myInput(1);
        eng=myInput(2);
        mat=myInput(3);
        tot=sum(kor,eng,mat);
        ave=avg(kor,eng,mat);
        prn(kor,eng,mat,tot,ave);
    }
    public static int myInput(int n) {
        Scanner sc = new Scanner(System.in);
        if (n==1) System.out.print("국어 점수를 입력하세요 : ");
        else if (n==2) System.out.print("영어 점수를 입력하세요 : ");
        else System.out.print("수학 점수를 입력하세요 : ");
        return Integer.parseInt(sc.nextLine());
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static double avg(int a, int b, int c) {
        return sum(a,b,c)/3.0;
    }
    public static void prn(int kor, int eng, int mat, int total, double ave) {
        System.out.println("\t  ===성적표===");
        System.out.println("------------------------");
        System.out.println("국어\t영어\t수학\t총점\t  평균");
        System.out.println("------------------------");
        System.out.printf("%3d\t%3d\t%3d\t%3d\t %.2f\n",kor,eng,mat,total,ave);
        System.out.println("------------------------");
    }
}
