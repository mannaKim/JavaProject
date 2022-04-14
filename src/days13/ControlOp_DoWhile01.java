package days13;

import java.util.Scanner;

public class ControlOp_DoWhile01 {

	public static void main(String[] args) {
		//	for (;;){}
		//	while(){}
		//	do{}while();
		
		int i;
		for (i=11;i<=10;i++){System.out.printf("%d ", i);}
		System.out.printf("\nfor 반복 종료 후 i: %d\n", i);
		System.out.println("-------------------------------");
		
		i=11;
		while(i<=10){System.out.printf("%d ", i); i++;}
		System.out.printf("\nwhile 반복 종료 후 i: %d\n", i);
		System.out.println("-------------------------------");
		
		i=11;
		do {
			System.out.printf("%d ", i);
			i++;
		}while(i<=10);
		System.out.printf("\ndo-while 반복 종료 후 i: %d\n", i);
		System.out.println("-------------------------------");
		
		// do-while의 특이점 
		//1. while(조건)을 후미에 기술
		//2. while()뒤에 세미콜론
			//if(조건); <--X
			//for(int i=1;i<100;i++); <--X
			//while(i<100); <--X
			//do{ }while(조건); <--O
		//3. do에 속한 { } 안의 명령을 한번 먼저 실행 후 조건을 테스트
		
		
		//do-while 반복문을 활용하여 
		//사용자가 100을 입력할 때까지 반복해서 입력받고 최종 합계를 출력
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		do {
			System.out.printf("입력(종료:100) :");
			num=sc.nextInt();
			//if (num==100) break;
			sum+=num;
		} while(num!=100); //while(true);
		System.out.printf("\n입력한 정수들의 합계 : %d\n",sum-100);

	}

}
