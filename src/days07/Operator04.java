package days07;

public class Operator04 {
    public static void main(String[] args) {
        // 캐스팅 연산 & 자료의 형변환

        byte b1 = 10; //byte b1 = (byte)10; 이와 같은 표현이 맞는 표현이지만 정수에 한해 형변화를 생략
        byte b2 = 5; //생략이 가능한건 단순 데이터를 변수에 저장하는 동작까지만 간으

        byte b3 = (byte)(b1+b2);
        //정수(int,byte,short)들의 산술연산의 결과는 int 이기 때문에 형변환 필요

        // 캐스팅 연산 - 서로 호환이 가능한 자료끼리만 사용이 가능
        // 실수->정수
        double d1=1.123456;
        int a=(int)d1;
        // 정수->실수
        double d2=(double)a;

        // 문자->정수
        char c='A';
        a=(int)c; //a에 아스키코드값 65가 저장됨
        // 정수->문자
        a=97;
        c=(char)a; //97아스키코드에 해당하는 'a'가 저장됨

        // 용량이 큰 변수값을 용량이 작은 변수에 저장해야 할 때
        long a2=1000;
        int a3=(int)a2;
        double f1=123.123;
        float f2=(float)f1;
        // 반대의 경우는 캐스팅 없이 자유롭게 값 전달이 가능

        // 잘못된 예 (String->int)
        String s1="123";
        //int a4=(int)s1; <- String과 int간 호환성이 존재하지 않아 에러

        // 잘못된 예 (int->String)
        int a4=1234;
        //String s2=(String)a4;

        // 호환이 되지 않는 자료들간의 형변환은 별도의 도구(메서드)가 필요
        String str5="123456";
        int a5=Integer.parseInt(str5);
        int a6=123456;
        String str6=String.valueOf(a6);

        // double->String
        double d3=123.1234;
        //String s3=(String)d3; <-에러
        String s3=String.valueOf(d3);

        // String->double
        String s4="123.1234";
        //double d4=(double)s4; <-에러
        double d4=Double.parseDouble(s4);

        // String->char
        String s5="ABCDEFG";
        char c5=s5.charAt(0); //0:첫번째글자, 1:두번째글자, 2:세번째글자 ...

        // char->String
        char c6='A';
        String s6=String.valueOf(c6);
    }
}
