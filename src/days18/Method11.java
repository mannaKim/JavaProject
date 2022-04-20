package days18;

import java.util.Scanner;

public class Method11 {
    public static void main(String[] args) {
        //밑변과 높이를 입력받아서 삼각형의 넓이를 계산하여 출력(메서드 사용)
        int a,b;
        double c;
        a=myInput(1); //밑변을 입력 받음. "밑변을 입력하세요"라고 안내
        b=myInput(2); //높이을 입력 받음. "높이를 입력하세요"라고 안내
        c=calculate(a,b); //넓이를 계산
        prn(c); //넓이 출력
    }
    public static int myInput(int n){
        Scanner sc = new Scanner(System.in);
        if (n==1) System.out.print("밑변을 입력하세요 : ");
        else System.out.print("높이를 입력하세요 : ");
        return Integer.parseInt(sc.nextLine());
    }
    public static double calculate(int a, int b){
        return a*b*0.5;
    }
    public static void prn(double c){
        System.out.printf("삼각형의 넓이 : %.2f\n",c);
    }
}
