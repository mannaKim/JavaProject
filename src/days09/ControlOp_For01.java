package days09;

public class ControlOp_For01 {

	public static void main(String[] args) {
		//  for 명령 : 반복 실행 명령
		// for( ; ; ){ }
		// ()안에 반복의 횟수를 지정하는 문구가 입력됨
		// 그리고 그 지정된 횟수만큼 {}안의 명령이 실행됨
		
		// 괄호안에 ;로 구분해서 세가지 내용을 기술
		// 작성되는 세 가지 내용은 반복횟수를 제어할 구성요소들로 채워짐
		// 또한 반복되는 횟수는 특정 변수에 의해 제어됨
		
		// 첫 번째 요소 : 반복을 제어할 변수의 최초값 대입 또는 변수의 생성영역
		// 두 번째 요소 : 다음 반복을 계속할지 안할지에 대한 관계(비교)연산식
					 /*(결과 true/false)-비교연산식의 결과가 true이면 반복을 계속하고,
					 					false이면 반복을 멈추고 for영역을 빠져나옴*/
		// 세 번째 요소 : 반복 제어 변수의 증감 연산을 기술
		
		for(int i=1;i<=10;i++) {
			System.out.printf("0자바프로그래밍밍밍\t");
		}
		//첫 번째 요소 : i변수가 1을 최초로 갖고 반복이 시작됩니다.
		//두 번째 요소 : i값이 10보다 작거나 같은 경우 현재의 반복실행을 진행합나다.
		//세 번째 요소 : 반복이 특정횟수를 실행하고 끝날 수 있게 매 반복시마다 계산할 i변수의 증감연산을 실행합니다.
					//1증가 i++ / 1감소 i-- / 2증가 i+=2 / 2감소 i-=2
		//매 반복마다 i++이 실행돼서 i<=10이 false가 되는 순간 반복이 종료
		System.out.println();
		
		//열번을 반복하기 위해 반드시 1부터 10일 필요는 없음!
		for(int i=10;i>=1;i--)
			System.out.printf("1자바프로그래밍밍밍\t");
		System.out.println();
		
		for(int i=220;i<=229;i++)
			System.out.printf("2자바프로그래밍밍밍\t");
		System.out.println();
		
		for(int i=1290;i<1300;i++) 
			System.out.printf("3자바프로그래밍밍밍\t");
		System.out.println();
		
		//for문에 속한 반복대상 명령이 하나라면 중괄호 생략 가능
		for(int i=0;i<=9;i++)System.out.printf("4자바프로그래밍밍밍\t"); 
		System.out.println();
		for(int i=0;i<10;i++) System.out.printf("5자바프로그래밍밍밍\t");
		System.out.println();
		
		//변수를 for문 밖에 선언
		int k;
		for (k=1;k<=10;k++) {
			System.out.printf("6자바프로그래밍k="+k+"\t");
			}
		System.out.println();
		System.out.println("최종 k 값 : "+k); //k는 11 : 조건문이 false가 될 때 까지 k++를 실행하기 때문
		
		//변수를 for문 안에 선언
		for (int q=1;q<=10;q++) System.out.printf("7자바프로그래밍밍밍\t");
		System.out.println();
		//이때 q는 지역변수이기 때문에, 자신을 생성한 영역{}이 끝나면 변수도 소멸됨
		//반복 실행 후 제어변수를 더이상 사용하지 않을 때 사용
		//반복 실행 후 반복제어 변수의 값이 필요하다면 for문 안쪽에 변수를 선언하면 안됨
		//반드시 반복 실행문 위에 별도로 선언 후 사용해야 함.
		

	}

}
