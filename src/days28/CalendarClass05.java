package days28;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass05 {
    public static void main(String[] args) {
        int year,month;
        int input=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("YEAR : ");
        year=Integer.parseInt(sc.nextLine());
        System.out.print("MONTH : ");
        month=Integer.parseInt(sc.nextLine());

        Calendar sDay = Calendar.getInstance(); //start
        Calendar eDay = Calendar.getInstance(); //end

        while (true) {
            sDay.set(year,month-1,1); //입력한 달의 1일자로 날짜 설정
            //Calendar 에서 MONTH 는 0~11이기 때문에 month-1
            //eDay.set(year,month-1,sDay.getActualMaximum(Calendar.DATE));
            eDay.set(year, month, 1); //입력한 년월의 다음달 1일로 설정
            eDay.add(Calendar.DATE, -1); //다시 그날의 1일 전으로 설정 -> 입력한 년월의 마지막 날

            int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
            //1일의 요일을 숫자로 얻는다 (일-1, ... 토-6)
            //System.out.println(START_WEEK);

            System.out.printf("\n\t\t%d년 %d월\n", year, month);
            System.out.println("--------------------------");
            System.out.println("일\t월\t화\t수\t목\t금\t토");
            System.out.println("--------------------------");

            //1일자까지 빈칸
            for (int i = 1; i < START_WEEK; i++) System.out.print("\t");
            //1일부터 마지막 날짜까지 출력
            for (int i = 1; i <= eDay.get(Calendar.DATE); i++) {
                System.out.printf("%2d\t", i);
                if (START_WEEK++ % 7 == 0 && i != eDay.get(Calendar.DATE))
                    System.out.println();
            }
            System.out.println("\n--------------------------");

            System.out.print("\n[이전달(1)] | [다음달(2)] | [종료(3)] : ");
            input = Integer.parseInt(sc.nextLine());
            if (input == 3) break;
            else if (input==1) {
                if(month==1) {
                    year-=1; month=12;
                } else month-=1;
            }
            else if (input==2) {
                if (month==12) {
                    year+=1; month=1;
                } else month+=1;
            }
        }
        System.out.println("달력 프로그램 종료");
    }
}
