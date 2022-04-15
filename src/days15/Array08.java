package days15;

import java.util.Random;

public class Array08 {
    public static void main(String[] args) {
        int [] a = new int[6];
        Random rd = new Random();
        int tmp;
        //1~45 사이의 임의의 난수를 a 배열에 여섯개 저장한 후,
        //오름차순으로 정렬하여 출력
        int k=1;
        while (k<=5){
            for (int i = 0; i < a.length; i++) {
                a[i] = rd.nextInt(45) + 1;
             /* a[i]=rd.nextInt();
                if (a[i]<0) a[i]*=-1;
                a[i]=a[i]%45+1; */
                int j;
                for (j = 0; j < i; j++) {
                    if (a[j] == a[i]) break;
                }
                if (i != j) i--;
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            //System.out.println("배열 a의 오름차순 정렬 출력");
            for (int i = 0; i < a.length; i++)
                System.out.printf("%2d ", a[i]);
            System.out.println();
            k++;
        }
    }
}
