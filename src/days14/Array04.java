package days14;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int std = Integer.parseInt(sc.nextLine());
        // sc.nextInt()로 입력 받는 내용에는 'Enter' 가 포함되지 않음
        // 따라서 입력 버퍼에 남아있던 'Enter' 는 바로 다음에 나오는 sc.nextLine()에
        // 자동으로 입력되어 문자 입력의 기회를 상실할 수 있기 때문에,
        // 'Enter' 가 포함될 수 있는 sc.nextLine(); 으로 먼저 입력 받고 숫자로 변환한다.

        int [] kor = new int[std];
        int [] eng = new int[std];
        int [] mat = new int[std];
        int [] tot = new int[std];
        double [] avg = new double[std];
        String [] name = new String[std];

        for (int i=0;i<std;i++){
            System.out.printf("%d번 학생의 이름 : ",i+1);
            name[i]=sc.nextLine();
            System.out.printf("%d번 학생의 국어 점수 : ",i+1);
            kor[i]=Integer.parseInt(sc.nextLine());
            System.out.printf("%d번 학생의 영어 점수 : ",i+1);
            eng[i]=Integer.parseInt(sc.nextLine());
            System.out.printf("%d번 학생의 수학 점수 : ",i+1);
            mat[i]=Integer.parseInt(sc.nextLine());
            System.out.println();

            tot[i]=kor[i]+eng[i]+mat[i];
            avg[i]=tot[i]/3.0;
        }

        System.out.println("\t\t  ###성적표###");
        System.out.println("-----------------------------------");
        System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t 평균");
        System.out.println("-----------------------------------");
        for (int i=0;i<kor.length;i++)
            System.out.printf("%d\t%s\t\t%3d\t%3d\t%3d\t%3d\t%.2f\n",
                    i+1,name[i],kor[i],eng[i],mat[i],tot[i],avg[i]);
        System.out.println("-----------------------------------");

        // 배열의 크기 : 배열의 크기는 프로그램에서 중요한 정보
        //배열의 크기에 따라 반복의 횟수나, 특정 인덱스의 값을 참조하는 것이 수시로 바뀌기 때문
        //배열은 이러한 문제를 해결하기 위해 length 라는 속성을 제공
        //배열명.length -> 배열의 크기(정수)를 얻음




    }
}
