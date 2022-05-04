package days27;

import java.util.Calendar;

public class CalendarClass01 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        //Calendar tomorrow = Calendar.getInstance();

        // 싱글톤 방식의 클래스
        // 생성자가 private 로 접근 차단됨 (외부에서 new Calendar() 불가)
        // 유일하게 실행된 new Calendar()는 클래스 내부에서 실행되어
        // 클래스 내부에 단 하나만 존재하게끔 생성된 레퍼런스 변수에 그 주소를 저장한다.
        // 그리고 그 레퍼런스 변수가 갖고있는 주소를 리턴하는 public static 형태의
        // getInstance 메서드로 인스턴스의 주소를 리턴받아 사용한다.
        // 이후 다시 getInstance()메서드가 실행되어도 현재 HEAP 에 존재하는 인스턴스 주소가 리턴된다.

        // 캘린더 클래스에는 static final 변수들이 다수 존재
        System.out.println("Calendar.YEAR : "+Calendar.YEAR);  //1 출력
        // get 메서드는 스태틱 파이널 변수에 해당하는 날짜요소를 얻어주는 용도
        System.out.println("today.get(Calendar.YEAR) : "+today.get(Calendar.YEAR));
        System.out.println("today.get(1) : "+today.get(1));

        System.out.println("Calendar.MONTH : "+Calendar.MONTH);
        int i = today.get(Calendar.MONTH);
        //MONTH 로 얻은 월의 값은 1월=0, 2월=1 ... 12월=11 로 얻어진다.
        System.out.println("월(0~11) : "+i);
        System.out.println("월(1~12) : "+(i+1));

        i = today.get(Calendar.DAY_OF_WEEK);
        System.out.println("요일(1~7, 1-일, 2-월 ... 7-토) : "+i);
        i = today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("이 달의 몇 째 요일 : "+i); //해당 달의 몇 번째 해당 요일이냐
        System.out.println("이 달의 마지막 날 : "+today.getActualMaximum(Calendar.DATE));

        i=today.get(Calendar.DATE);
        System.out.println("이 달의 몇 일 : "+i);
        i=today.get(Calendar.WEEK_OF_YEAR);
        System.out.println("금년의 몇째주 : "+i);
        i=today.get(Calendar.WEEK_OF_MONTH);
        System.out.println("이 달의 몇째주 : "+i);
        i=today.get(Calendar.DAY_OF_YEAR);
        System.out.println("이 해의 몇 일 : "+i);

        System.out.println("오전오후(0-오전, 1-오후) : "+today.get(Calendar.AM_PM));
        System.out.println("시간(0~11) : "+today.get(Calendar.HOUR));
        System.out.println("시간(0~23) : "+today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59) : "+today.get(Calendar.MINUTE));
        System.out.println("초(0~59) : "+today.get(Calendar.SECOND));
        System.out.println("1/1000초 (0~999) : "+today.get(Calendar.MILLISECOND));
        //프로그램이 시작되어 Calendar 인스턴스가 만들어진 시점
        //시:분:초:1/1000초
    }
}
