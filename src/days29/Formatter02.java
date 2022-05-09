package days29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatter02 {
    public static void main(String[] args) throws ParseException {
        String s2 = "2020/11/24";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");

        // SimpleDateFormat 에는 parse 메서드를 이용하여 문자열을 날짜로 변환해주는 기능이 있다.
        // 다만 변환을 위해서는 반드시 설정된 서식을 지켜야 한다.

        Date d = sdf1.parse(s2);
        // parse 를 이용해서 Date 형식으로 변경이 되어야 아래의 포맷 적용이 가능
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf2.format(d));
    }
}
