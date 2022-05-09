package days29;

import java.text.DecimalFormat;

public class Formatter03 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0000.00");
        double number = 123.123456;
        System.out.printf("%19s : %f --> %s\n","0000.00",number,df.format(number));

        //양식문자 0 : 표시할 숫자들의 자리표현.
        // 0:숫자한자리, 00:숫자두자리 ...

        //정수 부분에서 표시할 숫자는 많은데 0의 개수가 모자르면 필요한 만큼 0의 개수를 자동으로 추가 적용
        //ex) 숫자 12345, 양식 "000" -> 표시 12345

        //숫자 자리수보다 0의 개수가 더 많으면 많은만큼 0으로 채워서 표시
        //ex) 숫자 123, 양식 "00000" -> 표시 00123

        //소수점 아래에 대해서는 반대로 0의 개수만큼 소수점 아래 자리를 표시
        //0개수로 인해 표시되지 못하는 소수점 자리 중 가장 윗자리에서 반올림
        //남는 자리에 강제로 0을 채우는 방식은 동일
        //ex) 숫자 0.1264, 양식 "0.00" -> 0.13
        //ex) 숫자 0.1, 양식 "0.00" -> 0.10

        number = 123456.71289;
        df = new DecimalFormat("0.000");
        System.out.printf("%19s : %f --> %s\n","0.000",number,df.format(number));

        number = 123456789.0;
        //천단위 구분 기호 표시 패턴 0.000.000
        df = new DecimalFormat("0,000.00");
        System.out.printf("%19s : %f --> %s\n","0,000.00",number,df.format(number));
        //소수점 아래로 표시할 내용이 없는데 양식에 소수점 자리 0이 있다면 강제 0으로 표시

        number = 89.0;
        df = new DecimalFormat("0,000");
        System.out.printf("%19s : %f --> %s\n","0,000",number,df.format(number));

        //무효의 0을 표시하지 않는 #을 0대신 사용
        df = new DecimalFormat("#,###");
        System.out.printf("%19s : %f --> %s\n","#,###",number,df.format(number));
        //10의 자리든 100의 자리든 표시할 숫자가 있을 때만 표시 - 강제 0표시 안함
        //표시할 숫자가 1000을 넘어갈 때만 콤마(,)를 표시
        number = 123456.0;
        System.out.printf("%19s : %f --> %s\n","#,###",number,df.format(number));

        //#을 이용한 소수점 표시 : #의 개수보다 표시할 숫자가 많으면 # 개수만큼 표시
        //#의 개수보다 표시할 숫자가 적으면 숫자가 있는 만큼만 표시
        number = 123456.7128;
        df = new DecimalFormat("#,###.###");
        System.out.printf("%19s : %f --> %s\n","#,###.###",number,df.format(number));
        number = 123456.7;
        System.out.printf("%19s : %f --> %s\n","#,###.###",number,df.format(number));

        number = 1234;
        df = new DecimalFormat("$ #,### 달러"); //단위 또는 기호 첨가
        System.out.printf("%19s : %f --> %s\n","$ #,### 원",number,df.format(number));

        number = 0.8539;
        df = new DecimalFormat("#.#%"); //100을 곱해서 %로 표시
        System.out.printf("%19s : %f --> %s\n","#.#%",number,df.format(number));

        number = 123.172839;
        System.out.println("123.172839 -> "+(int)(number*10)/10.0);
        df = new DecimalFormat("0.0");
        System.out.println("123.172839 -> "+df.format(number));




    }
}
