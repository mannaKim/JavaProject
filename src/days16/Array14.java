package days16;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        int [][] score = new int[3][4]; //3명의 학생의 3과목 점수를 저장하기 위한 배열. 마지막 열은 총점을 저장
        double [] avg = new double[3];
        String [] name = new String[3];

        Scanner sc = new Scanner(System.in);
        //이중 반복문을 이용해서 이름과 점수 입력 받기
        for(int i=0;i<score.length;i++){
            System.out.printf("%d번 이름 : ",i+1);
            name[i]=sc.nextLine();
            for (int j=0;j<score[i].length-1;j++){
                System.out.printf("%d번 학생 과목%d : ",i+1,j+1);
                score[i][j]=Integer.parseInt(sc.nextLine());
            }
        }

        //이중 반복문을 이용해서 총점 평균 계산
        for(int i=0;i<score.length;i++){
            for (int j=0;j<score[i].length-1;j++){
                score[i][score[i].length-1]+=score[i][j];
            }
            avg[i]=score[i][score[i].length-1]/3.0;
        }

        //이중 반복문을 이용해서 성적표 출력
        System.out.println("\t\t    ===성적표===");
        System.out.println("--------------------------------------");
        System.out.println("번호\t 성명\t\t국어\t영어\t수학\t총점\t 평균");
        System.out.println("--------------------------------------");
        for(int i=0;i<score.length;i++){
            System.out.printf("%d\t%3s\t\t",i+1,name[i]);
            for (int j=0;j<score[i].length;j++){
                System.out.printf("%3d\t",score[i][j]);
            }
            System.out.printf("%.2f\n",avg[i]);
        }

    }
}
