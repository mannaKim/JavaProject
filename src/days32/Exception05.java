package days32;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exception05 {
    public static void main(String[] args) /*throws ParseException*/ {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //String d = "2022-05-12";
        //Date today = sdf.parse(d);    // .parse()를 사용하려면 import java.text.ParseException; 불러오고,
                                        // 메인에 throws ParseException 를 추가 해야 한다.

        /* parse 예외처리 방법#1
        String d = "2022/05/12";
        try {
            Date today = sdf.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */

        // parse 예외처리 방법#2
        // 잘못된 포멧으로 입력하면 다시 입력하라고 하는 예외처리
        Scanner sc = new Scanner(System.in);
        String inString = "";
        Date inDate = null;
        System.out.print("날짜를 예시와 같이 입력해주세요. (예시:2015-12-31) : ");
        while(true) {
            try {
                inString = sc.nextLine();
                inDate = sdf.parse(inString);
                break;
            } catch (ParseException e) {
                System.out.print("예시와 같이 다시 입력해주세요. (예시:YYYY-MM-DD) : ");
            }
        }
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf2.format(inDate));

    }
}
