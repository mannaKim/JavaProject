package days11;

import java.util.Scanner;

public class ControlOp_For14 {
    public static void main(String[] args) {
        //이중 반복문을 이용해서 구구단 2단부터 9단까지를 출력하세요
        //한개의 단이 출력되는 방향은 세로,가로 상관없습니다.

        for(int i=2;i<10;i++) {
            System.out.printf("****%d단****\n",i);
            for (int j=1;j<10;j++) System.out.printf("%d x %d = %d\n",i,j,i*j);
            System.out.printf("\n");
        }
    }
}
