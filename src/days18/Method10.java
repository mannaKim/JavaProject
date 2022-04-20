package days18;

import java.util.Scanner;

public class Method10 {
    public static void main(String[] args) {
        int year;
        boolean a;
        Scanner sc = new Scanner(System.in);
        System.out.print("년도 입력 : ");
        year = sc.nextInt();

        a=yoon(year);
        //년도를 전달인수로 전달하여 윤년이면 true, 평년이면 false 리턴하는 메서드

        prn(a);
        //변수 a(type:boolean)을 전달받아 윤년 또는 평년을 출력하는 메서드
    }
    public static boolean yoon(int y){
        if ( y % 4 == 0 && y % 100 != 0 || y % 400 == 0) return true;
        else return false;
    }
    public static void prn(boolean b){
        if (b) System.out.println("윤년");
        else System.out.println("평년");
    }
}
