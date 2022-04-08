package days05;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		// 반지름을 입력받아서 원의 넓이와(r*r*3.141592), 둘레의 길이(2*r*3.141592)를 출력
		// 입력1, 출력2
		// 필요한 변수의 이름은 임의로 지어서 사용
		// 출력양식
		// 입력한 원의 넓이 : XX.XX, 둘레의 길이 : XX.XX
		Scanner sc = new Scanner(System.in);
		System.out.printf("원의 반지름 입력 : ");
		int r = sc.nextInt(); //radius
		
		double resultA,resultC; //area:resultA, circumference:resultC
		double pi=3.141592;
		resultA=r*r*pi;
		resultC=2*r*pi;
		
		System.out.printf("입력한 원의 넓이 : %.2f, 둘레의 길이 : %.2f\n", resultA,resultC);
		System.out.println("입력한 원의 넓이 : " + (int)(resultA*100)/100.0 + 
						   ", 둘레의 길이 : "+ (int)(resultC*100)/100.0);
	}

}
