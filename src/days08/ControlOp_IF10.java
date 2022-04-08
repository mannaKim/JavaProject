package days08;

import java.util.Scanner;

public class ControlOp_IF10 {
    public static void main(String[] args) {
        //2022년 1월 1일은 토요일
        //2022년에 한해서 월과 일을 입력받고 요일을 출력

        //1월10일을 입력했다면 1월1일부터 10일까지 10일의 날짜가 계산됨
        //그를 7로 나눈 나머지를 구하면 3이고 1:토요일,2:일요일,3:월요일,,,
        //위와 같이 요일을 계산

        //2월 5일을 입력했다면 1월에 해당하는 31일+입력한일 5->36
        //36을 7로 나눈 나머지 계산하면 1, 해당입력일은 토요일

        // 1. 요일을 계산할 월과 일을 입력받습니다.
        Scanner sc=new Scanner(System.in);
        int month,day;
        System.out.printf("월 : ");
        month=sc.nextInt();
        System.out.printf("일 : ");
        day= sc.nextInt();

        // 2.
        int days=0;
        if(month==1) days=0;
        else if(month==2)days=31;
        else if(month==3)days=31+28;
        else if(month==4)days=31+28+31;
        else if(month==5)days=31+28+31+30;
        else if(month==6)days=31+28+31+30+31;
        else if(month==7)days=31+28+31+30+31+30;
        else if(month==8)days=31+28+31+30+31+30+31;
        else if(month==9)days=31+28+31+30+31+30+31+31;
        else if(month==10)days=31+28+31+30+31+30+31+31+30;
        else if(month==11)days=31+28+31+30+31+30+31+31+30+31;
        else if(month==12)days=31+28+31+30+31+30+31+31+30+31+30;

        // 3. 입력한 날짜의 일을 합산
        days+=day;

        // 4. 최종합산된 날짜들을 7로 나눈 나머지를 구합니다.
        int t=days%7;
        if(t==1)System.out.println("토요일");
        else if(t==2)System.out.println("일요일");
        else if(t==3)System.out.println("월요일");
        else if(t==4)System.out.println("화요일");
        else if(t==5)System.out.println("수요일");
        else if(t==6)System.out.println("목요일");
        else if(t==0)System.out.println("금요일");
    }
}
