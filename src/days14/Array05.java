package days14;

public class Array05 {
    public static void main(String[] args) {
        // 배열 a,b,c 생성 (각 개수 10개)
        //a 배열에는 3의 배수 10개 저장 - 반복실행문 이용
        //b 배열에는 5의 배수 10개 저장 - 반복실행문 이용
        //c 배열에는 a 배열과 b 배열의 각 같은 인덱스 값들의 합을 저장 - 반복실행문 이용
        //ex c[3]=a[3]+b[3];
        // 출력형식
        //a배열 -> 3,6,...
        //b배열 -> 5,10,...
        //c배열 -> 8,16,...

        int [] a = new int[10];
        int [] b = new int[10];
        int [] c = new int[10];

        for(int i=0;i<10;i++){
            a[i]=(i+1)*3;
            b[i]=(i+1)*5;
            c[i]=a[i]+b[i];
        }

        System.out.print("a배열 -> ");
        for(int i=0;i<10;i++){
            if (i==9) System.out.printf("%d",a[i]);
            else System.out.printf("%d, ",a[i]);
        }
        System.out.print("\nb배열 -> ");
        for(int i=0;i<10;i++){
            if (i==9) System.out.printf("%d",b[i]);
            else System.out.printf("%d, ",b[i]);
        }
        System.out.print("\nc배열 -> ");
        for(int i=0;i<10;i++){
            if (i==9) System.out.printf("%d",c[i]);
            else System.out.printf("%d, ",c[i]);
        }
    }
}
