package days17;

import java.util.Scanner;

public class Method03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단을 입력하세요 : ");
        int dan = Integer.parseInt(sc.nextLine());

        googoodan(dan);
        googoodan(8);

    }

    //전달인수로 넣은 (main 에서 사용한) 변수의 이름과 메서드의 매개변수 이름은 같아도 되고 같지 않아도 된다.
    //즉, 두 변수는 다른 변수다.
    public static void googoodan(int d) {
        //전달인수 dan 의 값이 메서드의 매개변수 d에 전달되어 사용됨.
        System.out.printf("==%d단 출력==\n",d);
        for (int i=1;i<10;i++){
            System.out.printf("%d x %d = %2d\n",d,i,d*i);
        }
    }
}
