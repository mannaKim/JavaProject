package days23;

class StaticB {
    int number;
    static int count = 0;

    public StaticB() {
        count++;
        number = count;
        //count == StaticB.count <-- 클래스 안에서는 StaticB. 생략 가능
    }
}

public class Class20 {
    public static void main(String[] args) {
        System.out.printf("count = %d\n",StaticB.count);
        StaticB b1 = new StaticB();
        System.out.printf("b1.number = %d, count = %d\n", b1.number,StaticB.count);
        StaticB b2 = new StaticB();
        System.out.printf("b2.number = %d, count = %d\n", b2.number,StaticB.count);
        StaticB b3 = new StaticB();
        System.out.printf("b3.number = %d, count = %d\n", b3.number,StaticB.count);
    }
}
