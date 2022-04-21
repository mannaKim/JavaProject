package days19;

import java.util.Scanner;

public class Method18 {
    public static void main(String[] args) {
        int [][] scores;
        double [] avg;

        int s=getStudentNumber(); //학생수를 입력받아서 리턴하는 메서드
        int k=getSubjectNumber(); //과목수를 입력받아서 리턴하는 메서드
        scores = new int[s][k+1];
        avg = new double[s];

        input(scores); //s명의 학생의 k개의 과목 점수 입력
        cals(scores, avg); //총점 평균 계산
        output(scores, avg); //성적표 출력
    }

    public static int getStudentNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        return Integer.parseInt(sc.nextLine());
    }
    public static int getSubjectNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("과목 수 입력 : ");
        return Integer.parseInt(sc.nextLine());
    }
    public static void input(int [][] scores){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<scores.length;i++){
            System.out.printf("<%d번 학생 성적 입력>\n",i+1);
            for(int j=0;j<scores[i].length-1;j++){
                System.out.printf("%d번 과목 성적 : ",j+1);
                scores[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
    }
    public static void cals(int [][] scores, double [] avg){
        int stdNum=scores.length;
        int totIndex=scores[0].length-1;
        //변수 선언해서 보기좋게 쓰기

        for(int i=0;i<stdNum;i++){
            int tot=0;
            for(int j=0;j<totIndex;j++){
                tot+=scores[i][j];
                //주석부분 : tot 변수 안쓰고 바로 대입하는 방법
                //scores[i][scores[i].length-1]+=scores[i][j];
            }
            scores[i][totIndex] = tot;
            avg[i]=tot/(double)(totIndex);
            //avg[i]=scores[i][scores[i].length-1]/(double)(scores[i].length-1);
        }
    }
    public static void output(int [][] scores, double [] avg){
        System.out.println("\t\t\t\t===성적표===");
        System.out.println("---------------------------------------------");
        System.out.print("번호\t\t");
        for(int i=0;i<scores[0].length-1;i++){
            System.out.printf("과목%d\t",i+1);
        }
        System.out.print("총점\t\t평균\n");
        System.out.println("---------------------------------------------");
        for(int i=0;i<scores.length;i++){
            System.out.printf("%2d\t\t",i+1); //번호
            for(int j=0;j<scores[i].length;j++){
                System.out.printf("%3d\t\t",scores[i][j]);
            }
            System.out.printf("%.1f\n",avg[i]);
        }
        System.out.println("---------------------------------------------");
    }
}
