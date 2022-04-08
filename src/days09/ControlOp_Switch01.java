package days09;

import java.util.Scanner;

public class ControlOp_Switch01 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		a=sc.nextInt();
		
		if(a==1)System.out.println("1을 입력하셨습니다.");
		else if(a==2)System.out.println("2을 입력하셨습니다.");
		else if(a==3)System.out.println("3을 입력하셨습니다.");
		else if(a==4)System.out.println("4을 입력하셨습니다.");
		else System.out.println("1~4외의 값을 입력하셨습니다.");
		
		//switch문은 if문과 비슷한 구조이지만, 변수값의 단순 참조에 의해 실행될 명령이 선택되는 것이 다름
		switch(a){ //괄호안의 a변수값을 참조하여, 아래 해당값이 있는 case의 명령을 실행
			case 1:
				System.out.println("1을 입력하셨습니다."); //a가 1일때 실행하는 명령
				break; //멈춰!
				//break : 자신을 감싸고있는 if문 또는 반복문의 경계({})를 빠져나가라는 명령
			case 2:
				System.out.println("2을 입력하셨습니다.");
				break;
			case 3:
				System.out.println("3을 입력하셨습니다.");
				break;
			case 4:
				System.out.println("4을 입력하셨습니다.");
				break;
			default:
				System.out.println("1~4외의 값을 입력하셨습니다.");
		}
		

	}

}
