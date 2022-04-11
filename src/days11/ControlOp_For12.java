package days11;

public class ControlOp_For12 {
    public static void main(String[] args) {
        //1부터 20사이 : 이전 숫자와 다음 숫자가 세트를 이루는 수열을 출력
        //(0,1,2),(1,2,3),(2,3,4)...(19,20,21)

        int i;
        for (i=1;i<=20;i++) {
            if (i==20) System.out.printf("(%d,%d,%d)",i-1,i,i+1);
            else System.out.printf("(%d,%d,%d), ",i-1,i,i+1);
            if (i%10==0)System.out.println();
        }

    }
}
