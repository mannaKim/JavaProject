package days04;

public class Println02 {

	public static void main(String[] args) {
		System.out.println("\t\t\t  ###성적표###");
		System.out.println("----------------------------------------------------------------");
		System.out.println("번 호\t성 명\t\t국 어\t영 어\t수 학\t총 점\t 평 균");
		System.out.println("----------------------------------------------------------------");
		System.out.println(1+"\t"+"홍길동"+"\t\t"+8+"\t"+5+"\t"+7+"\t"+(8+5+7)+"\t"+((8+5+7)/3.0));
		System.out.println("2\t홍길서\t\t87\t56\t77"+"\t"+(87+56+77)+"\t"+((87+56+77)/3.0));
		System.out.println("3\t홍길남\t\t100\t100\t100\t"+(100+100+100)+"\t"+((100+100+100)/3.0));
		System.out.println("----------------------------------------------------------------");
		// System.out.println 으로 출력되는 실수는 소수점이 조절되지 않음
		// System.out.println 으로 출력되는 수치 데이터는 소수점 정렬도 하기가 어려움
		
		// println에서 소수점 조절 예시
		// 64.666666*10 == 646.66666
		// (int)646.66666 == 646
		// 646/10 == 64.6
	}

}
