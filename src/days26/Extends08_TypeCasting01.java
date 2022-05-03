package days26;

class NormalA {
    int num;
}
class NormalB {
    int num;
}

public class Extends08_TypeCasting01 {
    public static void main(String[] args) {

        short s = 10;
        int i = s; //자동형변환 (short -> int) : 작은 용량에서 큰 용량의 변수로
        int j = 10;
        //short k=j; <-- 에러 (int -> short) : 큰 용량에서 작은 용량의 변수로
        short k = (short)j; //해결 방법 : 강제 캐시팅 연산자를 앞에 붙여 사용

        //클래스의 레퍼런스 변수간의 형변환은 각 레퍼런스의 접근 범위에
        //영향을 받는다. 서로 다른 클래스 객체간의 형변환은 허용되지 않는다.
        NormalA a1 = new NormalA();
        /*
        NormalB b1 = a1;
        NormalB b1 = (NormalB)a1;
        NormalB b1 = new NormalA();
        모두 에러 */

        NormalB b2 = new NormalB();
        /*
        NormalA a2 = b2;
        NormalA a2 = (NormalA) b2;
        NormalA a2 = new NormalB();
        모두 에러 */
    }
}
