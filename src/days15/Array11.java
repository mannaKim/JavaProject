package days15;

import java.util.Random;
import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        //야구 게임 프로그램
        //컴퓨터가 나에게 알려주지 않은 숫자를 질문과 답변을 통해 맞춰가는 게임.

        //사용자에게 알려주지 않은 일의 자리 숫자 세 개를 준비하고
        //질문 : 일의 자리 숫자 세 개를 입력받아 비교함
        //답변 : 같은 숫자가 자리수 까지 같으면 S, 숫자만 같으면 B를 출력
        //숫자 하나는 0~9까지, 세개의 숫자 중 중복 숫자 없음
        //컴퓨터가 갖고있는 숫자 : 5 6 8
        //사용자의 질문 : 4 5 6 ? --> 답변 : 1S(자릿수와 숫자가 같은) 1B(숫자만 같은)

        // 1. 컴퓨터가 기억할 숫자를 저장할 배열, 사용자가 입력한 숫자를 저장할 배열 생성
        int [] com = new int[3];
        int [] user = new int[3];

        // 2. com 에 랜덤한 숫자(0~9) 3개 생성
        Random rd = new Random();
        for(int i=0;i<com.length;i++){
            com[i]=rd.nextInt();
            if(com[i]<0) com[i]*=-1;
            com[i]%=10;
            int j;
            for(j=0;j<i;j++)
                if(com[i]==com[j]) break;
            if (i!=j) i--;
        }
        // com 확인
        // System.out.println(com[0]+" "+com[1]+" "+com[2]);

        while(true) {
            // 3. 사용자로부터 숫자 3개 입력 받기
            //방법#1
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < user.length; i++) {
                System.out.printf("%d번째 숫자 입력(0~9) : ", i + 1);
                user[i] = Integer.parseInt(sc.nextLine());
            }
            /*방법#2
            System.out.printf("입력(세자리숫자-중복되지 않게) : ");
            int num=Integer.parseInt(sc.nextLine());
            user[0]=num/100;        // 123/100 -> 1
            user[1]=(num%100)/10;   // 123%100 -> 23, 23/10 -> 2
            user[2]=num%10;         // 123%10 -> 3
            */
            /*방법#3
            System.out.printf("입력(세자리숫자-중복되지 않게) : ");
            String num = sc.nextLine();
            user[0]=num.charAt(0)-'0';  //'4'-'0'=4
                                        //charAt : days07-Operator04 참고
            user[1]=num.charAt(1)-'0';
            user[2]=num.charAt(2)-'0';
            */
            // user 확인
            // System.out.println(user[0]+" "+user[1]+" "+user[2]);

            // 4.
            int countS = 0, countB = 0;
            for (int i = 0; i < com.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (com[i] == user[j]) {
                        if (i == j) countS += 1;
                        else countB += 1;
                    }
                }
            }
            System.out.println(countS + "Strike, " + countB + "Ball\n");
            if (countS == 3) {
                System.out.println("맞췄습니다. 프로그램을 종료합니다.");
                break;
            }
        }
    }
}
