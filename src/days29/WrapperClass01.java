package days29;

public class WrapperClass01 {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        //참조 변수(레퍼런스 변수)들의 비교
        if (i1 == i2) System.out.println("i1과 i2 값이 같다.(==)");
        else System.out.println("i1과 i2 값이 다르다.(==)");
        System.out.printf("i1==i2 ? %b\n", i1 == i2);

        //실제 인스턴스에 저장된 값들의 비교
        if (i1.equals(i2)) System.out.println("i1과 i2 값이 같다.(equals)");
        else System.out.println("i1과 i2 값이 다르다.(equals)");
        System.out.printf("i1.equals(i2) = %b\n", i1.equals(i2));

        System.out.printf("i1.compareTo(i2) = %d\n", i1.compareTo(i2));
        //실제 인스턴스가 저장된 값들의 비교 - 뺄셈 연산으로 비교
        //앞의 숫자가 크면 양수, 뒤의 숫자가 크면 음수, 같으면 0 반환

        //Object 부모 클래스의 메서드 오버라이딩
        System.out.printf("i1.toString() = %s\n", i1.toString());
        System.out.printf("i2.toString() = %s\n", i2);
        //toString 의 리턴값은 String

        //표현가능한 가장 큰 값(스태틱 변수)
        System.out.println("MAX_VALUE = "+Integer.MAX_VALUE);
        //표현가능한 가장 작은 값(스태틱 변수)
        System.out.println("MIN_VALUE = "+Integer.MIN_VALUE);

        //비트 바이트로 표현한 저장 크기
        System.out.printf("SIZE = %d bits\n",Integer.SIZE);
        System.out.printf("BYTES = %d bytes\n",Integer.BYTES);
        //자료형
        System.out.printf("TYPE = %s\n",Integer.TYPE);

        int i = 10;
        Integer inti = (Integer) i;
        //== Integer inti = Integer.valueOf(i);

        int i3 = inti + 10; //참조형과 기본형간의 연산 가능
        System.out.println("i3 = "+i3);

        Integer inti2 = new Integer(20);
        System.out.println("inti2 = "+inti2);
        int i4 = (int)inti2; //참조형을 기본형으로 형변환 가능(형변환 생략 가능)
        System.out.println("i4 = "+i4);

        Integer inti3 = inti2 + i3;
        System.out.println("inti2 + i3 = "+inti3);
    }
}
