package days09;

public class ControlOp_For03 {

	public static void main(String[] args) {
		//1~10까지 합계 출력
		int sum=0;
		for (int i=1;i<=60000;i++) {
			sum+=i; //sum=sum+i;
			System.out.printf("1~%d까지의 누적 합계 : %d\n", i,(long)sum);
		}

	}

}
