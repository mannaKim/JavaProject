package days19;

public class Method14 {
    public static void main(String[] args) {
        // 메서드 오버로딩
        //메서드의 이름은 같고, 매개변수의 타입, 개수, 순서가 다르면
        //서로 다른 메서드로 인지하는 문법
        //일관된 메서드 이름을 사용하여 사용자에게 직관적인 이름을 사용하게 함
        //전달인수(매개변수)의 자료형, 순서 등이 서로 달라도 가능

        //즉, 같은 용도의 서로 다른 메서드들을 이름을 통일하여 사용

        System.out.println("메서드 오버로딩 : max 메서드 만들기");

        int maxValue = max(56,87,23);
        System.out.printf("max(56,87,23) = %d\n",maxValue);

        maxValue = max(56,87,23,54);
        System.out.printf("max(56,87,23,54) = %d\n",maxValue);

        maxValue = max(56,87);
        System.out.printf("max(56,87) = %d\n",maxValue);

        double maxValueD = max(123.45,456.56);
        System.out.printf("max(123.45,456.56) = %.2f\n",maxValueD);
    }

    public static int max(int a, int b, int c){
        int m=a;
        if (m<b) m=b;
        if (m<c) m=c;
        return m;
    }
    public static int max(int a, int b, int c, int d){
        int m=a;
        if (m<b) m=b;
        if (m<c) m=c;
        if (m<d) m=d;
        return m;
    }
    public static int max(int a, int b){
        return (a>b)? a:b;
    }
    public static double max(double a, double b){
        return (a>b)? a:b;
    }
}
