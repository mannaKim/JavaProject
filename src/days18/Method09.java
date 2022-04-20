package days18;

import java.util.Scanner;

public class Method09 {
    public static void main(String[] args) {
        int r;
        double n,d;
        Scanner sc=new Scanner(System.in);
        System.out.print("반지름을 입력하세요 : ");
        r=sc.nextInt();

        n=calculate1(r); //원의 넓이를 구하는 메서드
        d=calculate2(r); //원의 둘레를 구하는 메서드
        prn(n,d); //넓이와 둘레를 출력하는 메서드
    }
    public static double calculate1(int r){
        return r*r*3.14;
        //리턴식 옆에 연산식을 넣어서 연산의 결과를 리턴되게 할 수 있음
    }
    public static double calculate2(int r){
        return r*2*3.14;
    }
    public static void prn(double n, double d){
        System.out.printf("원의 넓이 : %.2f\n원의 둘레 : %.2f",n,d);
    }
}
