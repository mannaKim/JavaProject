package days13;

import java.util.Scanner;

public class ControlOp_DoWhile02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,result=0,operator;
		int isExit;
		do {
			System.out.printf("1번째 정수 입력 : ");
			n1=sc.nextInt();
			System.out.printf("2번째 정수 입력 : ");
			n2=sc.nextInt();
			System.out.printf("계산에 사용할 연산 선택[1:+][2:-][3:*][4:/] : ");
			operator=sc.nextInt();
			switch(operator) {
				case 1:result=n1+n2;break;
				case 2:result=n1-n2;break;
				case 3:result=n1*n2;break;
				case 4:result=n1/n2;break;
			}
			System.out.printf("result = %d\n",result);
			System.out.printf("계속 하시겠습니까?[y:1/n:2] : ");
			isExit=sc.nextInt();
		}while(isExit!=2);
		System.out.printf("프로그램 종료");	
	}

}
