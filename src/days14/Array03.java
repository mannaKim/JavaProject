package days14;

public class Array03 {
    public static void main(String[] args) {
        // 배열 변수의 활용 - 배열과 반복문
        //배열은 하나의 변수명을 가지며, 변수명과 인덱스를 조합하여 각 요소에 접근 가능하다.
        //일반적으로 for 반복문의 기준 변수를 사용하여 배열의 인덱스를 제어하는 방식으로
        //배열의 각 요소에 접근하여 활용한다.

        int [] a = new int[100];
        //반복실행 사용하지 않을 시
        // a[0]=1; ... a[99]=100; 을 직접 입력

        //배열과 반복문을 활용하여 값을 초기화하고 출력
        for (int i=0; i<100; i++) {
            a[i]=i+1;
            System.out.printf("a[%2d]=%2d\t",i,a[i]);
            if ((i+1)%10==0) System.out.println();
        }

    }
}
