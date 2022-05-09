package days29;

import java.math.BigInteger;

public class WrapperClass02 {
    public static void main(String[] args) {
        //BigInteger k = 1; <-- 에러
        BigInteger k = BigInteger.ONE;
        //System.out.println(k);
        //k = k.add(BigInteger.ONE);
        //System.out.println(k);

        BigInteger fact;
        for (int i=1; i<=40; i++) {
            //1부터 현재 i값까지 모두 곱셈을 하여 출력하는 반복문 실행
            fact = BigInteger.ONE;
            //반복을 제어해주는 변수는 k(BigInteger)
            //일반 정수를 BigInteger 로 변환하는 스태틱 메서드 BigInteger.valueOf()
            //k.compareTo(BigInteger.valueOf(i))<=0 : k가 i보다 작거나 작은 동안 반복
            for (k=BigInteger.ONE;
                    k.compareTo(BigInteger.valueOf(i))<=0;
                    k=k.add(BigInteger.ONE)) {
                fact = fact.multiply(k);
            }
            System.out.printf("%d! = %s\n",i,fact); //fact == fact.toString()
        }
    }
}
