package days12;

import java.util.Random;

public class ControlOp_while04 {
    public static void main(String[] args) {
        //랜덤한 숫자(난수)를 얻기 위해서는 랜덤한 숫자를 발행해주는 도구가 필요
        Random rd=new Random();

        int i=0;
        while(i<10) {
            int num = rd.nextInt();
            if (num < 0) num *= -1;
            num = num % 10 + 1;
            //Random을 이용해 얻은 정수를 1~10 중 하나의 수로 출력
            System.out.printf("%d ",num);
            i++;
        }
    }
}
