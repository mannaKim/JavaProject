package days09;

import java.util.Scanner;

public class ControlOp_For04 {

	public static void main(String[] args) {
		//입력한 숫자의 구구단을 출력하세요
		Scanner sc=new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력하세요(2~9) : ");
		dan=sc.nextInt();
		
		System.out.printf("****%d단****\n",dan);
		for(int i=1;i<10;i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		}

	}

}
