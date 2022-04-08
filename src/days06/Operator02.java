package days06;

public class Operator02 {

	public static void main(String[] args) {
		//  관계연산자(비교연산자)
		// 좌항기준 >(초과,크다), <(미만,작다), >=(이상,크거나 같다), <=(이하,작거나 같다), ==(같다), !=(같지않다)
		// 좌항과 우항의 크기를 비교하여 true,false 값이 결과가 되는 연산
		// 관계식이 올바른 경우 true, 관계식이 틀린 경우 false가 연산의 결과가 된다.
		int n1=10, n2=5;
		boolean result;
		result=n1>n2;
		System.out.printf("%d > %d -> %b\n", n1,n2,result);
		result=n1<n2;
		System.out.printf("%d < %d -> %b\n", n1,n2,result);
		result=n1>=n2;
		System.out.printf("%d >= %d -> %b\n", n1,n2,result);
		result=n1<=n2;
		System.out.printf("%d <= %d -> %b\n", n1,n2,result);
		result=n1==n2;
		System.out.printf("%d == %d -> %b\n", n1,n2,result);
		result=n1!=n2;
		System.out.printf("%d != %d -> %b\n\n", n1,n2,result);
		
		char c1='A', c2='B';
		// char형 변수의 비교 : 각 데이터가 갖는 아스키 코드 값으로 비교
		// (int)'A'==65, (int)'B'==66
		result=c1>c2;
		System.out.printf("%c > %c -> %b\n", c1,c2,result);
		result=c1<c2;
		System.out.printf("%c < %c -> %b\n\n", c1,c2,result);

		// String 데이터의 비교
		String s1="1234",s2="987";
		//result=s1>s2; 
		//에러 : The operator > is undefined for the argument type(s) java.lang.String
		//String을 대상으로 할 수 있는 비교연산은 ==와 != 뿐이며, 이것도 원하는 결과로 나오진 않음
		//그래서 ==와 != 연산이 에러 없이 가능하지만, 사용하지 않음
		
		// s1과 s2는 String 자료형이며, 다른 자료형과 다르게 이 두 변수가 직접 문자들을 저장하고 있지 않음(포인팅)
		// 문자들은 별도의 장소에 저장되고, 변수는 저장위치값만 저장
		// 따라서 변수들간의 비교는 저장위치정보의 비교이므로 연산이 의미가 없고, 가능하지도 않음
		
		// String자료간의 비교는 별도로 만들어져있는 도구(메소드)를 사용
		// String의 크다 작다를 판단해주는 compareTo()
		// String의 같다 다르다를 판단해주는 equals()
		int r=s1.compareTo(s2);
		System.out.printf("%s > %s -> %d\n", s1,s2,r);
		System.out.printf("%s > %s -> %b\n", s1,s2,r>0);
		r=s2.compareTo(s1);
		System.out.printf("%s < %s -> %d\n", s1,s2,r);
		System.out.printf("%s < %s -> %b\n", s1,s2,r>0);
		//s1.compareTo(s2)의 경우 s1이 크면 결과가 양수로 계산되고, s2가 크면 음수로 계산됨
		//앞글자(s1)에서 뒷글자(s2)의 아스키코드 값을 뺄셈한 결과를 얻음
		System.out.printf("'1'의 아스키코드값 : %d\n'9'의 아스키코드값 : %d\n",(int)'1',(int)'9');
		System.out.printf("그러므로, s1과 s2를 비교하면 49-57==-8, s2와 s1을 비교하면 57-49==8\n");
			
		result=s1.equals(s2);
		System.out.printf("%s == %s -> %b\n", s1,s2,result);
		result=s1.equals("1234");
		System.out.printf("%s == %s -> %b\n", s1,"1234",result);
		
	}

}
