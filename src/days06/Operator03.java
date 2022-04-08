package days06;

public class Operator03 {

	public static void main(String[] args) {
		//  논리연산자 &&(And), ||(Or), !(Not)
		// 다수개의 관계(비교)연산식 결과(true/false)값을 연산하여 하나의 boolean 값을 결과로 얻는 연산
		// 피연산자 : boolean, 연산의 결과 : boolean
		
		boolean b1=true&&false;
		System.out.printf("%b && %b -> %b\n", true,false,b1);
		int a = 80;
		boolean b2 = a>50;
		boolean b3 = a<100;
		System.out.printf("b2(%b) && b3(%b) -> %b\n", b2,b3,b2&&b3);
		b1=(a>50)&&(a<100); // <-- 수학적으로 50<a<100과 동일
		System.out.printf("a=%d일때, a>50 이면서 a<100 : %b\n", a,b1);
		
		a=30;
		b1=(a>70)||(a<40);
		System.out.printf("a=%d일때, a>70 이거나 a<40 : %b\n", a,b1);
		a=50;
		b1=(a>70)||(a<40);
		System.out.printf("a=%d일때, a>70 이거나 a<40 : %b\n\n", a,b1);
		
		// AND 연산자 : &&(이면서, 그리고)
		// 좌항과 우항의 관계(비교)식 결과 또는 boolean 값이 모두 true인 경우 true
		// 좌항과 우항 중 하나라도 false인 경우 false
		// 좌항의 비교연산 결과가 false인 경우 우항의 식을 비교하지 않음
		System.out.printf("F && F = %b\n",false&&false);
		System.out.printf("T && F = %b\n",true&&false);
		System.out.printf("F && T = %b\n",false&&true);
		System.out.printf("T && T = %b\n\n",true&&true);
		
		// OR 연산자 : ||(이거나, 또는)
		// 좌항과 관계식 결과 또는 boolean 값이 하나라도 결과가 true인 경우 true가 결과
		// 좌항과 우항 모두 false인 경우 false가 결과
		// 좌항의 결과가 true인 경우 우항의 식을 비교하지 않음
		System.out.printf("F || F = %b\n",false||false);
		System.out.printf("T || F = %b\n",true||false);
		System.out.printf("F || T = %b\n",false||true);
		System.out.printf("T || T = %b\n\n",true||true);
		
		// NOT 연산자 : !
		// 단항연산자(피연산자가 1개)
		// 관계식의 결과를 반대값으로 결과를 냄 true->false, false->true
		b1=false;
		System.out.printf("!T = %b,!F = %b\n",!true,!false);
		System.out.printf("Not-%b = %b\n",b1,!b1);
		System.out.printf("Not-%b = %b\n",true,!true);
		
		// 점수가 80점 이상이면서 90점 이하이면 true, 아니면 false 출력
		int number=80;
		boolean result=(number>=80)&&(number<=90);
		System.out.printf("result=%b\n",result);
		
		// 점수가 100점 이상이거나 50점 미만이면 true, 아니면 false 출력
		number=150;
		result=(number>=100)||(number<50);
		System.out.printf("result=%b\n\n",result);

		int kor=35, eng=98, mat=95;
		double avg;
		//평균이 80이상이면서 영어점수가 75이상이면 true, 아니면 false
		boolean result00;
		avg=(kor+eng+mat)/3.0;
		result00=(avg>=80)&&(eng>=75);
		System.out.printf("평균 80이상, 영어점수 75이상 : %b\n",result00);

		//국어50이상, 영어60이상, 수학70이상이면 true, 아니면 false
		result00=(kor>=50)&&(eng>=60)&&(mat>=70);
		System.out.printf("국어50이상, 영어60이상, 수학70이상 : %b\n",result00);

		//세과목중 한 과목이라도 40미만이면 true, 아니면 false
		result00=(kor<40)||(eng<40)||(mat<40);
		//result00=!((kor>=40)&&(eng>=40)&&(mat>=40));
		System.out.printf("세과목중 한 과목이라도 40미만이면 : %b\n",result00);

		//평균 60이상, 모든 과목 40이상이면 true, 아니면 false
		result00=(avg>=60)&&(kor>40)&&(eng>40)&&(mat>40);
		System.out.printf("평균 60이상, 모든 과목 40이상 : %b\n",result00);

		//평균 60미만이거나 한과목이라도 40미만이면 true, 아니면 false
		result00=(avg<60)||(kor<40)||(eng<40)||(mat<40);
		System.out.printf("평균 60미만이거나 한과목이라도 40미만 : %b\n",result00);

		//평균이 70이상이거나 영어와 수학이 모두 80이상이면 true, 아니면 false
		result00=(avg>=70)||((eng>=80)&&(mat>=80));
		System.out.printf("평균이 70이상이거나 영어와 수학이 모두 80이상 : %b\n",result00);

		//국어점수가 짝수이면 true, 홀수이면 false
		result00=kor%2==0;
		System.out.printf("국어점수가 짝수? : %b\n",result00);

		//year변수에 저장된 년도가 윤년이면 true, 평년이면 false
		int year1=2020, year2=2021;
		//윤년의 조건
		//해당년도가 4의배수이면서, 100의 배수가 아니거나, 400의 배수인 해
		result00=(year1%4==0)&&(year1%100!=0)||(year1%400==0);
		System.out.printf("2020 윤년? : %b\n",result00);
		result00=(year2%4==0)&&(!(year2%100==0))||(year2%400==0);
		System.out.printf("2021 윤년? : %b\n",result00);

		//  연산의 우선순위
		/* 1. ( )
		   2. 변수의 앞에 사용되었다는 가정하에 ++,--
		   3. 곱셈, 나눗셉, 나머지(%)
		   4. 덧셈, 뺄셈
		   5. 비교(관계)연산
		   6. 논리연산
		   7. 대입연산(=)
		*/
	}

}
