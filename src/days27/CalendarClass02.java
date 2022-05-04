package days27;

import java.util.Calendar;

public class CalendarClass02 {
    static String[] weekday = {"","일","월","화","수","목","금","토"};
    public static void main(String[] args) {

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        //date1 달력 객체의 오늘 날짜를 2015년 8월 15일로 설정
        date1.set(2015,7,15);
        //set : 원하는 특정 날짜로 객체 내 날짜 구성을 재설정

        //set 메서드에 스태틱파이널필드명과 값을 넣어주면 해당 필드값만 변경
        date2.set(Calendar.MONTH,6); //<--7월

        //date1과 date2에 설정된 날짜를 "0000년 0월 0일 0요일" 형식으로 출력
        //String[] weekday = {"","일","월","화","수","목","금","토"};
        System.out.println(date1.get(Calendar.YEAR)+"년 "
                + (date1.get(Calendar.MONTH)+1)+"월 "
                + date1.get(Calendar.DATE)+"일 "
                + weekday[date1.get(Calendar.DAY_OF_WEEK)]+"요일");
        System.out.println(date2.get(Calendar.YEAR)+"년 "
                + (date2.get(Calendar.MONTH)+1)+"월 "
                + date2.get(Calendar.DATE)+"일 "
                + weekday[date2.get(Calendar.DAY_OF_WEEK)]+"요일");

        //위 출력을 단순하게 해줄 메서드 만들기
        prnDate(date1);
        prnDate(date2);
    }

    private static void prnDate(Calendar c) {
        System.out.println(c.get(Calendar.YEAR)+"년 "
                + (c.get(Calendar.MONTH)+1)+"월 "
                + c.get(Calendar.DATE)+"일 "
                + weekday[c.get(Calendar.DAY_OF_WEEK)]+"요일");
    }
}
