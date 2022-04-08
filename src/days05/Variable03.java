package days05;

import java.util.Scanner;

public class Variable03 {

	public static void main(String[] args) {
		// 삼각형의 밑변과 높이를 입력받아서 넓이를 출력
		// 삼각형의 넓이 : 밑변x높이x0.5
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		double result;
		
		System.out.printf("삼각형의 밑변의 길이를 입력 : ");
		num1=sc.nextInt();
		
		System.out.printf("삼각형의 높이를 입력 : ");
		num2=sc.nextInt();
		
		result=num1*num2*0.5;
		System.out.printf("입력한 삼각형의 넓이 : %.1f\n",result);
	}

}
