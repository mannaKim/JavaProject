package days28;

import java.util.Calendar;

public class CalendarClass04 {
    public static void main(String[] args) {

        Calendar date = Calendar.getInstance();
        System.out.println("==현재 날짜==");
        date.set(2021,10,30); //전체 날짜 또는 일부를 수정하는 메서드 set
        System.out.println(toDate(date));

        System.out.println("==1일 후==");
        //상대적 날짜 수정
        date.add(Calendar.DATE,1);
        //add 메서드의 증감은 하나의 요소를 변경하지만, 그로인해 다른 필드에
        //영향을 줄 수 있다. 일을 변경하여 달이 바뀌거나, 월을 변경하여 년도가 바뀌는 등
        System.out.println(toDate(date));

        System.out.println("==6달 후==");
        date.add(Calendar.MONTH,6);
        System.out.println(toDate(date));

        System.out.println("==7달 전==");
        date.add(Calendar.MONTH,-7);
        System.out.println(toDate(date));

        System.out.println("==40일 후(roll)==");
        date.roll(Calendar.DATE,40);
        //다른 필드에 영향을 주지 않고 해당 필드만으로 더하고 빼는 메서드 roll
        //11월 1일에서 29일을 더하면 11월 30, 이후 11일이 더해져 다시 11일이 나옴
        //월에는 영향을 주지 않으므로 결과가 11월 11일
        System.out.println(toDate(date));

    }
    public static String toDate(Calendar c) {
        String cDate = c.get(Calendar.YEAR)+"년 "
                + (c.get(Calendar.MONTH)+1)+"월 "
                + c.get(Calendar.DATE)+"일";
        return cDate;
    }

}
