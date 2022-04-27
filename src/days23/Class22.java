package days23;

// static 메서드
//static 멤버변수와 같이 프로그램 구동 전에 메모리에 로딩되어 객체 생성 없이 사용할 수 있는 메서드
//사용시에 메서드 이름 앞에 클래스의 이름을 붙여서 사용

import java.util.Random;

class StaticC {
    public static void print() {
        System.out.println("static 메서드 print 로 출력하였습니다.");
    }
    public static void prn() {
        print();
        System.out.println("static 메서드 prn 으로 출력하였습니다.");
    }
}

public class Class22 {
    public static void main(String[] args) {

        StaticC.print(); //객체 생성 없이 static 메서드 호출 가능
        System.out.println();
        StaticC.prn();
        System.out.println();
        abc();
        System.out.println();

        String a = "1234";
        int b = Integer.parseInt(a);  //<-- Integer 라는 클래스의 static 메서드 parseInt()

        //java.lang : import 하지 않아도 원래 import 되어져서 사용할 수 있게 존재하는 패키지(클래스)

        //간단한 공용기능을 제공하기 위한 Math 클래스 (java.lang 패키지에 포함된 클래스)
        //public static int abs(int n){ } 와 같은 양식의 sqrt, random 메서드가 있다.
        //abs : 절댓값 계산 메서드
        //sqrt : 제곱근 계산 메서드
        //random : 난수 발생 메서드

        //Math 클래스의 random 메서드는 Random 클래스의 nextInt() 메서드와 양식은 다르지만 같은 역할을 함
        //다만 Math 클래스의 random 메서드는 static 메서드이므로 Math.random(); 와 같이 사용하고,
        //Random 클래스의 nextInt() 메서드는 동적 멤버메서드이므로 new 명령으로 객체 생성 후 호출객체를 앞에 두고 사용
        Random rd = new Random();
        int r1 = rd.nextInt();
        double r2 = Math.random();
        //-45~45 사이의 난수 출력
        System.out.println(r1%45+1);
        System.out.println((int)(r2*45));

        //abs 의 사용
        int num = -10;
        System.out.printf("num=%d, |num|=%d\n",num,Math.abs(num));

        //sqrt 의 사용
        num=9;
        System.out.printf("num=%d, num의 제곱근 = %.2f\n",num,Math.sqrt(num));

        //Integer 클래스 (int 타입과 매핑되는 클래스)
        //Integer 클래스의 parseInt 메서드는 문자열로 되어있는 정수 값을 int 타입으로 변환
        String strNum1 = "123";
        String strNum2 = "456";
        System.out.printf("\nInteger 클래스 Integer.parseInt() 사용\n%s\t%s\n",strNum1,strNum2);
        System.out.printf("문자 연산 : %s\n",strNum1+strNum2);
        System.out.printf("산술 연산 : %d\n",
                Integer.parseInt(strNum1)+Integer.parseInt(strNum2));
        System.out.println();

        //Double 클래스 (double 타입과 매핑되는 클래스)
        //Double 클래스의 parseDouble 메서드는 문자열로 된 실수 값을 double 타입으로 반환
        strNum1 = "10.75";
        strNum2 = "5.2";
        System.out.printf("Double 클래스 Double.parseDouble() 사용\n%s\t%s\n",strNum1,strNum2);
        System.out.printf("문자 연산 : %s\n",strNum1+strNum2);
        System.out.printf("산술 연산 : %f\n",
                Double.parseDouble(strNum1)+Double.parseDouble(strNum2));
        System.out.println();

        //String 클래스
        //int 또는 double 형 자료를 String 으로 변환 : valueOf()
        int intNum1 = 456;
        int intNum2 = 789;
        System.out.printf("String 클래스 String.valueOf() 사용\n%d\t%d\n",intNum1,intNum2);
        System.out.printf("산술 연산 : %d\n", intNum1+intNum2);
        System.out.printf("문자 연산 : %s\n",
                String.valueOf(intNum1)+String.valueOf(intNum2));



    }

    public static void abc() {
        System.out.println("abc 메서드");
    } //외부에서 호출 시 Class22.abc();
}
