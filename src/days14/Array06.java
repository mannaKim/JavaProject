package days14;

public class Array06 {
    public static void main(String[] args) {
        // 배열에 있는 값들 중 최댓값과 최솟값을 찾아서 출력
        int [] a = {56,87,96,45,89,69,36,13,98,77};
        int max=a[0],min=a[0];
        for(int i=1;i<a.length;i++){
            if (max<a[i]) max=a[i];
            if (min>a[i]) min=a[i];
        }
        System.out.println("최댓값 :"+max+", 최솟값 :"+min);
    }
}
