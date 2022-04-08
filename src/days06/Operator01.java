package days06;

//  연산자
// 산술-사(오)칙연산자 : +, -, /, *, %
// 관계연산자-비교연산자 : >, <, >=, <=, ==, !=
// 논리 연산자 : &&(And), ||(Or), !(Not)

public class Operator01 {

	public static void main(String[] args) {
		int n1=10, n2=7, result1;
		double result2;
		
		result1 = n1+n2;
		System.out.println(n1+" + "+n2+" = "+result1);
		result1 = n1-n2;
		System.out.println(n1+" - "+n2+" = "+result1);
		result1 = n1*n2;
		System.out.println(n1+" * "+n2+" = "+result1);
		
		result2 = n1/(double)n2;
		System.out.println(n1+" / "+n2+" = "+result2);
		double result3 = (int)(result2*100)/100.0;
		System.out.println(n1+" / "+n2+" = "+result3);
		
		
		System.out.println();
		int n=50;
		System.out.println("n:"+n);
		// 피연산자로 쓰인 변수와 연산의 결과를 저장할 변수가 같은 연산
		n=n+10; 
		System.out.println("n=n+10 -> n:"+n);
		// 1. 현재 n값(50)과 두번째 피연산자인 10이 CPU로 전달되어 덧셈
		// 2. 연산 결과가 돌아와서 다시 n에 저장됨
		// 	  연산에 참여했던 n값 50은 사라지고, 연산의 결과인 60이 n에 저장
		// 간략하게 n+=10; 으로도 사용함
		n-=10;
		System.out.println("n=n-10 -> n:"+n);
		n*=10;
		System.out.println("n=n*10 -> n:"+n);
		n%=7;
		System.out.println("n=n%7 -> n:"+n);
		double d=50.0;
		System.out.println("d:"+d);
		d/=10.0;
		System.out.println("d=d/10 -> d:"+d);

		
		System.out.println();
		// n=n+1; n+=1; n++ 
		// n=n-1; n-=1; n--
		// 특정 변수의 값을 1 증가시키거나, 감소시킬 수 있는 연산자
		// 대입연산자(=)를 사용하지 않고 값을 변경
		n=50;
		n++;
		System.out.println("n++ -> n:"+n);
		++n;
		System.out.println("++n -> n:"+n);
		// 단항연산일 때는 ++나 --를 변수의 앞,뒤 중 어디에 붙여도 똑같이 연산됨.
		// 단항연산:n++, 이항연산:n=n+1
		
		System.out.println();
		// ++,-- 연산기호가 앞 또는 뒤에 있을 때 차이가 나는 경우 : 다른 연산에 섞여있을 때
		n=10;
		System.out.println("현재 n:"+n);
		System.out.println("k = n++;");
		int k = n++; //++,-- 연산이 뒤쪽에 있는 경우 : 현재 값으로 속해있는 연산에 참여 후 1증가.
		// k에 현재 n의 값을 대입하고, 그 다음에 n이 증가
		System.out.println("k:"+k); //10
		System.out.println("n:"+n); //11
		
		System.out.println();
		n=10;
		System.out.println("현재 n:"+n);
		System.out.println("k = ++n;");
		k = ++n; //++,-- 연산이 앞쪽에 있는 경우 : 1 증가 후 다른 연산에 참여
		// n이 증가한 다음, k에 n이 대입됨
		System.out.println("k:"+k); //11
		System.out.println("n:"+n); //11
	}

}
