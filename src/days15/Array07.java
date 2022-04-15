package days15;

public class Array07 {
    public static void main(String[] args) {
        // 배열에 있는 값들을 오름차순 또는 내림차순으로 재배치(정렬)

        // 이중 반복문 사용
        //첫번째 반복문의 첨자 i, 두번째 반복문의 첨자 j
        //i=0일때 j는 1~끝까지 반복시켜서 a[i]와 a[j]를 비교하고,
        //a[j] 값이 더 작으면 a[i]와 a[j]의 값을 오름차순에 맞게 맞바꾼다.
        //그 동작을 j가 끝까지 갈 때까지 반복하면 a[i]에는 배열중 가장 작은 값이 저장됨.

        int [] a = {-56,-87,-26,-45,-89,69,36,13,98,77,12};

        int tmp;
        //x에 y값을, y에 x값을 대입 할 때는 임시로 값을 저장할 temp(tmp)변수를 이용
        int x=1,y=2;
        System.out.printf("x=%d,y=%d\n",x,y);
        tmp=x;
        x=y;
        y=tmp;
        System.out.printf("x=%d,y=%d\n",x,y);

        //오름차순
        System.out.println("\n오름차순 정렬");
        for (int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }

        //내림차순
        System.out.println("\n내림차순 정렬");
        for (int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }

    }
}
