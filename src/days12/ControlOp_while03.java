package days12;

import java.util.Scanner;

public class ControlOp_while03 {
    public static void main(String[] args) {
        //사용자에게서 단을 입력 받아 구구단을 출력
        //사용자가 0을 입력할때까지 출력할 단을 연이어 입력받고 구구단을 출력
        //while 문을 이용해서 작성
        Scanner sc=new Scanner(System.in);
        int dan;
        while(true){
            System.out.printf("출력할 단을 입력하세요. (0 입력시 종료): ");
            dan=sc.nextInt();
            if(dan==0){
                System.out.printf("----구구단 출력 종료----");
                break;
            }
            for(int i=1;i<=9;i++){
                System.out.printf("%dx%d=%d\t",dan,i,dan*i);
            }
            System.out.println();
        }
    }
}
