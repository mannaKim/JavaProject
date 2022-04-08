package days02;

public class JavaSecond {

	public static void main(String[] args) {
		
		System.out.println("1\t야호"); 	//t는 tab의 약자
		System.out.printf("12\t야호\n"); 	//n은 new line의 약자
		System.out.println("123\t야호");	
		System.out.println("123456789\t야호");
		
		System.out.printf("겁나 쉬운 \"자바\" 프로그래밍~!!\n");
		// 문자열 내부에 큰따옴표를 표기하려면 앞에 역슬래시 포함(\" 내용 \")
		System.out.printf("겁나 쉬운 \'자바\' 프로그래밍~!!\n");
		System.out.printf("겁나 쉬운 '자바' 프로그래밍~!!\n");
		// 업데이트 이후 작은 따옴표는 \ 생략해도 출력됨
		System.out.printf("겁나 쉬운 %%자바%% 프로그래밍~!!\n");
		System.out.printf("겁나 쉬운 \\자바\\ 프로그래밍~!!\n");
		System.out.printf("겁나 쉬운 자바 프로그래밍~!!\b\b\n");
		/*
		 	\t : Tab을 누른 것 처럼 일정 간격 띄움
		 	\' : 작은 따옴표 출력
		 	\" : 큰 따옴표 출력
		 	%% : % 출력
		 	\\ : \ 출력
		 	\b : 백스페이스 - 커서 왼쪽으로 이동하면서 앞 글자를 한글자씩 삭제, 
		 					다만 이클립스 콘솔창에서는 정상적용되지 않음
		*/
	}

}
