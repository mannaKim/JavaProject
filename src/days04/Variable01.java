package days04;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(35+" + "+38+" = "+(35+38));
		System.out.println(35+" - "+38+" = "+(35-38));
		System.out.println(35+" x "+38+" = "+(35*38));
		System.out.println(35+" / "+38+" = "+(35/38.0));
		System.out.println(35+" % "+38+" = "+(35%38));
		System.out.println();
		// 변수(variable) : 프로그램 실행중 발생 또는 입력되는 데이터를 저장할 목적으로 만든 임시 저장 장소
		// 프로그램 실행명령시 생성되고, 프로그램 종료시 소멸
		
		// 변수의 이름을 만드는 규칙
		/* 1. 인터넷 사이트의 회원가입시 만드는 아이디 이름 규칙과 비슷
		   2. 영문과 숫자, 그리고 일부 특수문자(_)를 섞어서 사용가능
		   3. 첫글자는 반드시 영문
		   4. 이름 중간에 공백 불가능
		   5. 너무 짧지 않게 약간의 의미를 부여해서 생성하는 편
		   6. 변수의 이름이 너무 짧을 시 : 변수의 갯수가 많아졌을 때 서로의 용도 구분이 어려움
		   7. 변수의 이름이 너무 길 시 : 사용할 때마다 직접 입력해야함
		   8. 두가지 의미의 단어가 조합되어 변수이름이 만들어진다면 첫단어는 소문자, 두번째 단어는 대문자
		      ex) 덧셈의 결과를 저장할 변수 이름 : plusResult
		   9. 변수는 자료형(정수, 실수, 문자)에 따라 만드는 명령이 다름
		      - int : 정수, double : 실수, String : 문자 등
		      - int a; // 정수형 변수 생성
		      - double b; // 실수형 변수 생성
		      - String c; // 문자형 변수 생성 */
		
		int a; 	//a라는 이름의 변수 생성(정수형)
		int b;	//b라는 이름의 변수 생성(정수형)
		int plusResult, minusResult, multiplyResult;	//한번에 여러 변수 생성(정수형)
		double divideResult; 	//divideResult라는 이름의 변수 생성(실수형)
		
		//a=10.23			//실수를 정수형 변수에 저장하면서 데이터 손실을 유발하므로 에러
		divideResult=100; 	//정수를 실수형 변수에 저장하는건 데이터 손실이 없으므로 정상 실행	
		
		// boolean : 참(true) 또는 거짓(false) 중 하나를 저장하는 자료형
		boolean b1;		
		b1=true;
		boolean b2=false;
		System.out.printf("변수 b1의 값: %b\n", b1);
		System.out.println("변수 b1의 값: "+ b1);
		System.out.printf("변수 b2의 값: %b\n", b2);
		System.out.println("변수 b2의 값: "+ b2);
		// boolean 값을 printf로 출력할 때는 %b
		
		// 자료형의 종류
		/* int - 4Byte 정수
		   long - 8Byte 정수
		   float - 4Byte 실수
		   double - 8Byte 실수
		   char - 2Byte 문자 ('a', 'b' 등 String과 다름)
		   String - 문자열 클래스(객체) ("", "a", "abc" 등 0글자에서 글자개수 제한 없이 문자열 저장 가능) */
		
		char c;
		c = 'A';
		System.out.printf("변수 c의 값: %c\n", c);
		System.out.println("변수 c의 값: "+ c);
		
		String s;
		s= "ABCD";
		System.out.printf("변수 s의 값: %s\n", s);
		System.out.println("변수 s의 값: "+ s);
		System.out.println();
		// 예전 시스템의 int - 2Byte (-32768 ~ 32767)
		// 현재 시스템의 int - 4Byte (-2147483648 ~ 2147483647)
		
		// double - 8Byte 	
		// 0.00002 => 0.2x10^-4  :변수에 저장되는 값 -> 2와 -4
		// 이런 과정때문에 정수연산보다 시간이 더 오래걸림
		// 10의 -308승 부터 308승까지
		
		a=15;
		b=11;
		c='+';
		plusResult = a+b;
		minusResult = a-b;
		multiplyResult = a*b;
		divideResult = (double)a/b;
		// 정수와 정수의 사칙연산은 결과도 정수 => 피연산자를 실수로 형변환을 해야 실수 결과가 나옴
		// 현재 위치에서만 잠시 int형인 a를 double형으로 변환.
		
		System.out.println("<printf로 출력>");
		System.out.printf("%d %c %d = %d\n", a,c,b,plusResult);
		c='-';
		System.out.printf("%d %c %d = %d\n", a,c,b,minusResult);
		c='x';
		System.out.printf("%d %c %d = %d\n", a,c,b,multiplyResult);
		c='/';
		System.out.printf("%d %c %d = %.2f\n\n", a,c,b,divideResult);
		
		System.out.println("<println으로 출력>");
		c='+';
		System.out.println(a+" "+c+" "+b+" = "+plusResult);
		c='-';
		System.out.println(a+" "+c+" "+b+" = "+minusResult);
		c='x';
		System.out.println(a+" "+c+" "+b+" = "+multiplyResult);
		c='/';
		System.out.println(a+" "+c+" "+b+" = "+(int)(divideResult*100)/100.0);
											//println에서 소수점아래 둘째자리까지 출력하는 방법
											//ex)소수점아래넷째자리까지 출력 : (int)(divideResult*10000)/10000.0)
	}

}
