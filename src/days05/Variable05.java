package days05;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// 이름,국어,영어,수학 점수를 입력받아서 1명의 성적표를 총점,평균과 함께 출력
		// 문자 입력 : sc.nextLine()
		// 입력 받을때 반드시 이름부터 입력받으세요. 순서 : 이름,국어,영어,수학
		// 평균은 소수점 첫째자리까지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("이름 : ");
		String name = sc.nextLine();
		System.out.printf("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.printf("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.printf("수학 점수 : ");
		int mat = sc.nextInt();
		
		int total = kor+eng+mat;
		double average = total/3.0;
		
		System.out.println("\t\t\t  ###성적표###");
		System.out.println("-------------------------------------------------------------");
		System.out.println("번 호\t성 명\t\t국 어\t영 어\t수 학\t총 점\t평 균");
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%3d\t%s\t\t%3d\t%3d\t%3d\t%3d\t%4.1f\n",1,name,kor,eng,mat,total,average);
		System.out.println(1+"\t"+name+"\t\t"+kor+"\t"+eng+"\t"+mat+"\t"+total
							+"\t"+(int)(average*10)/10.0);
		System.out.println("-------------------------------------------------------------");
	}

}
