package days13;

import java.util.Scanner;

public class ContolOp_while06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("년 입력 :");
		int y=sc.nextInt();
		System.out.printf("월 입력 :");
		int m=sc.nextInt();
		
		int input;
        
		while(true) {	
			int days=365*(y-1);
			for (int i=1;i<y;i++){
				if (i%4==0&&i%100!=0||i%400==0) days+=1;
			}
        
			switch(m) {
            	case 12:days+=30;
            	case 11:days+=31;
            	case 10:days+=30;
            	case 9:days+=31;
            	case 8:days+=31;
            	case 7:days+=30;
            	case 6:days+=31;
            	case 5:days+=30;
            	case 4:days+=31;
            	case 3: //입력받은 년이 윤년일 경우도 고려해야 함
            		if (y%4==0&&y%100!=0||y%400==0) days+=29;
            		else days+=28;
            	case 2:days+=31;
            	//case 1:days+=0;
			}
			days=days+1;
        
			int t = days % 7; //일-0, 월-1, ..., 토-6
        
			System.out.println();
			System.out.println("\t\t    "+y+"년 "+m+"월");
			System.out.println("--------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("--------------------------------------------------");
		
			int k;
			for (k=1;k<=t;k++) System.out.printf("\t");
        
			int endDay=31;
			switch(m) {
        		case 12:case 10:case 8:case 7:case 5:case 3:case 1:
        			endDay=31;break;
        		case 11:case 9:case 6:case 4:
        			endDay=30;break;
        		case 2:
        			if (y%4==0&&y%100!=0||y%400==0) endDay=29;
        			else endDay=28;    	
			}
        
			for(int i=1;i<=endDay;i++) {
				System.out.printf("%2d\t",i);
				if (k%7==0) System.out.println();
				k++;
			}
			System.out.printf("\n\n[1.이전달]\t[2.다음달]\t[3.종료] : ");
			input=sc.nextInt();
			if(input==3) break;
			switch(input) {
    			case 1:
    				if(m==1) {m=12;y--;}
    				else m--;
    				break;
    			case 2:
    				if (m==12) {m=1;y++;}
    				else m++;
    				break;
			}
        }
		System.out.println("프로그램 종료");
	}

}
