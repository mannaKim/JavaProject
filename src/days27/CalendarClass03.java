package days27;

import java.util.Calendar;

public class CalendarClass03 {
    public static void main(String[] args) {

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY,10);
        time1.set(Calendar.MINUTE,20);
        time1.set(Calendar.SECOND,30);
        time2.set(Calendar.HOUR_OF_DAY,20);
        time2.set(Calendar.MINUTE,30);
        time2.set(Calendar.SECOND,10);

        printTime(time1);
        printTime(time2);

        System.out.println(time1.getTimeInMillis());
        System.out.println(time2.getTimeInMillis());
        //.getTimeInMillis() : 날짜와 시간을 밀리초로 환산하는 메서드

        long dif = (time2.getTimeInMillis()-time1.getTimeInMillis()) / 1000;
        //1000으로 나누는건 밀리초단위를 초단위로 환산하기 위해
        System.out.println("time1과 time2의 차이 : "+dif+"초");
    }

    private static void printTime(Calendar c) {
        System.out.println("time : "
                + c.get(Calendar.HOUR_OF_DAY)+"시 "
                + c.get(Calendar.MINUTE)+"분 "
                + c.get(Calendar.SECOND)+"초 "
                + c.get(Calendar.MILLISECOND)+"(1/1000초)");
    }
}
