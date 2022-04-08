package days05;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// 정수형 : byte(1), short(2), int(4)-기본형, long(8)
		// 실수형 : float(4), double(8)-기본형
		   	/* 기본형이란 별도의 표시없이 쓰이는 정수나 실수가 int와 double로 인식되어 사용된다는 뜻
		 		- 100(int), 100L(long) : 기본형은 int
		 		- 123.12(double), 123.12F(float) : 기본형은 double */
		// 문자형 : char(2)-유니코드 지원
		// 진위형 : boolean(1)-true(1)/false(0)
		// 문자열 : String(클래스, 정해진 크기 없음)
		Scanner scan = new Scanner(System.in);
		
		//byte a = 300; //에러 : Type mismatch: cannot convert from int to byte
		//byte a = (byte)300;
		//System.out.println(a); //출력은 되나, 값의 오류
		
		// 1byte == 8bit (0000 0000 ~ 1111 1111) : 2^8==256 개 중 하나 저장 가능
		//			7bit : 128개
		//			16bit : 65536개 <-- 한글
		
		// 변수의 다양한 선언(생성) 방법
		// 1. 변수 선언 후 값을 할당
		int n1;
		n1 = 10;
		
		// 2. 변수의 선언과 값의 대입을 동시에 처리
		int n2 = 20;
				// (해당 내용 보류)
				// int n3 = scan.nextInt(); // <--- 권장x
				// 프로그램이 시작되면, 변수를 선언하는 명령만 따로 모아서 변수들을 관리하는 테이블에 넣고 시작
				// 이 때 입력명령이 섞여있는 변수는 에러를 발생시킴 (문법상 오류는 아니지만 런타임 에러 발생)
		
		// 3. 다수의 변수를 한번에 선언하는 방법 (동일 자료형)
		int n4, n5, n6;
		
		// 4. 다수의 변수에 값을 대입하면서 생성하는 방법
		int n7=70, n8=80;
		
		// 5. 처음부터 모든 변수에 값을 대입할 필요는 없음
		int n9, n10=100, n11;
		
		
		// 변수 선언 위치
		// 변수의 사용 전이라면 위치에 관계없이 변수 선언 가능
		// 변수는 반드시 선언 후에 사용 가능하며, 선언 전에 사용하는 변수는 오류 
							//에러 : 변수명 cannot be resolved to a variable
		// 선언 이후라도, 값이 대입되지 않으면 사용 불가
							//에러 : The local variable 변수명 may not have been initialized
		
		
		// 변수 값은 여러번 대입할 수 있으며, 저장되는 값은 가장 최근, 마지막에 저장한 값이 저장되어 사용됨
		// 그 이전에 저장되는 값은 소멸 - 한번에 하나씩만 저장할 수 있는 단점이 있음
		n1=100;
		System.out.println(n1); //이전에 저장한 10은 사라지고 갱신된 값만 출
		
		// char형 데이터는 컴퓨터 저장장치에 저장될때, 이진수 코드로 저장됨
		// 문자를 저장하기위한 코드체계에 의해 조합된 코드(ASCII 코드)
		// 이를 십진수로 변환하면 정수로도 변환이 가능
		// 위의 내용을 기초로 한 결과 정수와 문자간 호환성이 발생
		char ch = 'A';
		System.out.println("\n"+(int)ch+"\t"+ch);		
		System.out.println((int)'B'+"\t"+(char)66);
		System.out.println((int)'C'+"\t"+(char)67);
		System.out.println((int)'Z'+"\t"+(char)90);
		System.out.println((int)'a'+"\t"+(char)97);
		System.out.println((int)'z'+"\t"+(char)122);
		System.out.println((int)'0'+"\t"+(char)48+"\n");
		
		// A + 32 -> a
		System.out.printf("%c + 32 -> %c\n",ch,ch+32);
		System.out.printf("%c - 32 -> %c\n",ch+32,ch);
		// 아라비아 기호 '8'에서 아라비아 기호 '0'을 빼면 정수 8이 결과로 나옴
		System.out.printf("'8'-'0' -> %d\n",'8'-'0');
		
		
		// 실수형 변수의 초기화
		// 자바에서 모든 실수들은 별도의 표기가 없으면, 기본적으로 double 타입으로 인식
		
		// float 타입으로 값을 저장하기 위해서는 float형 변수를 선언하고 float형 데이터를 저장
		// float 변수에 double형 데이터 입력 -> 에러
		// float f1=1.123; 
						//Type mismatch: cannot convert from double to float
		// float 변수에 float형 데이터 입력 -> 정상실행
		float f2=1.123f; // or float f2=1.123F;
		
		// float 변수에 캐스팅 연산을 적용한 double형 데이터 입력 -> 정상실행
		double f3 = 1.123;
		float f4 = (float)f3;
		
		// 용량이 큰 자료형(double)에 작은 자료형(float) 데이터 대입 -> 정상실행
		float f5 = 123.456F;
		double f6 = f5; //캐스팅 연산 필요 없음
		
		// 정수들의 값의 대입
		int a = 100;
		byte b1 = (byte)a;
		//byte b2 = a; 변수를 이용한 값의 대입은 캐스팅이 필요
						//Type mismatch: cannot convert from int to byte
		byte b2 = 123;  // 일반값에 의한 대입은 캐스팅이 필요 없음 (정수일때만)
		a=b2; // 용량이 작은 자료형을 큰 자료형에 대입은 정상실행
		
		// 용량이 큰 변수값을 용량이 작은 변수값으로 넣으려고 하면 캐스팅 연산 필요
		// 반대의 경우는 문제 없음
	}

}
