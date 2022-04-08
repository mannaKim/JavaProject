package days05;

import java.util.Scanner;

public class Variable07 {

	public static void main(String[] args) {
		// (입력) 사과 갯수 입력
		// (입력) 한 상자에 담길 사과의 갯수 입력
		
		// (출력) 입력 조건으로 포장했을 때, 포장된 박스 갯수, 남은 사과 갯수 출력
		// 박스 갯수 : XX 
		// 남은 사과 : XX
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.printf("사과 갯수 입력 :");
		a=sc.nextInt();
		System.out.printf("한 상자에 담길 사과의 갯수 입력 :");
		b=sc.nextInt();
		
		System.out.printf("박스 갯수 : %d 개\n",a/b);
		System.out.printf("남은 사과 : %d 개\n",a%b);

	}

}
