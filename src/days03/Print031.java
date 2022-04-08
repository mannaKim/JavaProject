public class Print031 {

	public static void main(String[] args) {
		System.out.printf("\t\t\t  ###성적표###\n");
		System.out.printf("----------------------------------------------------------------\n");
		System.out.printf("번 호\t 성 명\t\t국 어\t영 어\t수 학\t총 점\t 평 균\n");
		System.out.printf("----------------------------------------------------------------\n");
		System.out.printf("%3d\t%s\t\t%3d\t%3d\t%3d\t%3d\t%5.1f\n",1,"홍길동",8,5,7,8+5+7,(8+5+7)/3.0);
		System.out.printf("%3d\t%s\t\t%3d\t%3d\t%3d\t%3d\t%5.1f\n",2,"홍길서",87,56,77,87+56+77,(87+56+77)/3.0);
		System.out.printf("%3d\t%s\t\t%3d\t%3d\t%3d\t%3d\t%5.1f\n",3,"홍길남",100,100,100,100+100+100,(100+100+100)/3.0);
		System.out.printf("----------------------------------------------------------------\n");

	}

}
