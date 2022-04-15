package days15;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        //점수를 입력받아서 해당 학점을 출력
        //if 문을 이용하지 않고, 배열을 이용
        //90이상-A, 80이상-B, 70이상-C, 60이상-D, 나머지-F
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0~100) : ");
        int score = Integer.parseInt(sc.nextLine());

        char [] grade = {'F','F','F','F','F','F','D','C','B','A','A'};

        int index = (score==0)? 0 : score/10;

        System.out.println("학점 : "+grade[index]);
    }
}
