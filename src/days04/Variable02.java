package days04;

import java.util.Scanner; //import 단축키 : Ctrl+Shift+o

public class Variable02 {

	public static void main(String[] args) {
		int num1, num2;
		int result1;		//덧셈,뺄셈,곱셈의 결과 저장할 변수
		double result2;		//나눗셈의 결과 저장할 변수
		
		// 프로그래밍을 하다보면, 외부의 라이브러리 또는 API 를 불러다 사용해야할 경우가 있는데,
		// 사용자로부터 화면 입력을 받는 도구는 외부 라이브러리에 있는 도구를 불러와서 사용해야함
		// 사용자 입력을 위해 불러와서 준비해야할 코드
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정수를 입력하세요: ");
		num1 = sc.nextInt(); 	// 화면으로부터 정수를 입력받아 num1에 저장
		// 컴파일러가 sc.nextInt()명령을 만나면 커서를 깜빡이면서 사용자에게서 입력이 있을때까지 무한정 대기
		System.out.printf("입력한 정수 : %d\n", num1);
		
		System.out.printf("정수를 입력하세요: ");
		num2 = sc.nextInt();
		System.out.printf("입력한 정수 : %d\n", num2);
		
		System.out.printf("\n");
		result1=num1+num2;
		System.out.printf("%d + %d = %d\n", num1,num2,result1);
		result1=num1-num2;
		System.out.printf("%d - %d = %d\n", num1,num2,result1);
		result1=num1*num2;
		System.out.printf("%d x %d = %d\n", num1,num2,result1);
		result2=(double)num1/num2;
		System.out.printf("%d / %d = %.2f\n\n", num1,num2,result2);
		
	}

}
