package days09;

public class ControlOp_For02 {

	public static void main(String[] args) {
		//1부터 100사이의 정수 출력
		System.out.printf("정수 출력\n");
		int i;
		for (i=1;i<=100;i++)
			System.out.printf("%d ", i);
		System.out.printf("\n반복문 실행 후 i값 : %d\n", i);
		System.out.println();
		
		//1부터 100사이의 짝수 출력
		System.out.printf("짝수 출력 방법#1\n");
		for (i=2;i<=100;i+=2)
			System.out.printf("%d ", i);
		System.out.println();
		System.out.printf("짝수 출력 방법#2\n");
		for (i=1;i<=100;i++)
			if(i%2==0) System.out.printf("%d ", i);
		System.out.println();
		System.out.println();
		
		//1부터 100사이의 홀수 출력
		System.out.printf("홀수 출력 방법#1\n");
		for (i=1;i<=100;i+=2)
			System.out.printf("%d ", i);
		System.out.println();
		System.out.printf("홀수 출력 방법#2\n");
		for (i=1;i<=100;i++)
			if(i%2!=0) System.out.printf("%d ", i);
		System.out.println();
	}

}
