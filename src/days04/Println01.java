package days04;

public class Println01 {

	public static void main(String[] args) {
		// println()은 pirntf("\n")과 같은 동작을 합니다.
		// pirntln은 \n이 없어도 모든 출력 후 줄바꿈을 한 번 실행해 줍니다.
		// System.out.println("\n"); <-- 두줄바꿈
		
		// printf와 같이 format 양식 글자(%d,%f,%s)를 사용하지 못합니다.
		// 다만 printf보다 출력이 간단합니다.
		System.out.println(10);
		System.out.println(12.123);
		System.out.println("Java Programming");
		// System.out.println("%d",1); 
		/* 에러 : The method println(int) in the type PrintStream is not applicable 
				 for the arguments (String, int) */
		
		System.out.println(10+12.123);
		// '+' 연산기호는 숫자끼리는 산술연산, 문자와 다른 자료형의 연산은 이어붙이기 연산이 실행됩니다.
		System.out.println(10+" "+12.123); 	// (10+" ")+12.123=("10 ")+12.123="10 12.123"
		System.out.println(10+""+12.123); 	// (10+"")+12.123=("10")+12.123="1012.123"
		
		// 문자와 숫자가 다른점
		/* 1. 표면상으로 그 둘은 따옴표 안에 쓰였냐 아니냐로 구분
		   2. 123은 백이십삼이라고 읽지만, "123"은 일이삼이라고 읽음
		   3. 987은 1234보다 작지만, "987"은 "1234"보다 크다
		   	  - 문자들간의 비교는 첫글자부터 하나씩 같은 위치의 글자와 비교 
		   	  - 첫글자에서 크기가 결정되면 그 다음은 비교하지 않음
		   	  - 두번째 글자를 비교하는 경우는 첫번째 글자가 같은 글자일때 한해서만 비교
		   	  - 두번째 글자도 같은 글자라면 세번째 글자를 비교
		   	  - 사전에서 찾았을 때 먼저 나오는 글자를 작다라고 하고 뒤에 나오는 글자를 크다라고 함 */
		 
		System.out.println();
		System.out.println("10"+"5");	// 문자간 덧셈
		System.out.println("10"+5);		// 문자와 정수의 덧셈
		System.out.println(10+"5");
		System.out.println(10+5); 		// 정수와 정수의 덧셈(산술연산)
		System.out.println("Hello "+"World~!");
		
		// 10 + 5 = 15 를 출력하고 싶을 때
		// 산술연산은 괄호 주의!
		System.out.println(10+" + "+15+" = "+(10+5));
		System.out.println("10 + 15"+" = "+(10+5));
		System.out.println("10 + 15 = "+(10+5));
		System.out.println(10+" + "+15+" = "+(10+5));
		System.out.println("10 + 15 = 1"+5);
		System.out.println("10 + 15 = 15");
	}

}
