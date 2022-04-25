package days21;

public class Test0425 {

	public static void main(String[] args) {
		// 0425 시험
		
		// #1
		int ave=cals2("평균",98,78,45,12,23,32,98,63,25,87);
		System.out.println(ave);

		// #2
		for(int i=0;i<=4;i++) System.out.printf("%d\t",i+101);
		System.out.println();
		
		// #4
		int a;
		a=0;
		char [] grade = {'a','b','c','d','f'};
		switch(a/10) {
			case 10:
			case 9:System.out.println(grade[0]); break;
			case 8:System.out.println(grade[1]); break;
			case 7:System.out.println(grade[2]); break;
			case 6:System.out.println(grade[3]); break;
			default :System.out.println(grade[4]); break;
		}

		// #5
		int [] b = new int[10];
		for(int i=0;i<b.length;i++) {
			b[i]=i+101;
			System.out.printf("%d\t",b[i]);
		}
		System.out.println();
		
		// #6
		int c=-5;
		if ((c<0)||(c%2==0)) System.out.println("음수거나 짝수");
		else System.out.println("해당없음");
		
	}
	
	public static int cals2(String op, int ... num){
        int total=0;
        for(int i:num) total+=i;
        if (op.equals("합계"))
            return total;
        else return total/num.length;
    }

}
