package days10;

import java.util.Scanner;

public class ControlOp_For08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("년 입력 : ");
        int y = sc.nextInt();
        System.out.printf("월 입력 : ");
        int m = sc.nextInt();
        System.out.printf("일 입력 : ");
        int d = sc.nextInt();

        //1.입력받은 년도의 전년도까지 지나온 날짜수 합산
        //  - 2022년을 입력했다고 가정했을 때 2021년까지 지나온 날짜수 계산
        //  - 365*2021 + 2021까지 발생한 윤년의 횟수
        int days=365*(y-1);
        for (int i=1;i<y;i++){
            if (i%4==0&&i%100!=0||i%400==0) days+=1;
        }
        //2.입력받은 월까지 지나온 날짜를 전체 날짜수에 합산
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
        //3. 입력받은 일을 날짜수에 합산
        days = days + d;
        //4. (서기/1년/1월/1일/일요일)요일 출력
        int t = days % 7;
        switch(t) {
            case 1 :
                System.out.println("월요일"); break;
            case 2 :
                System.out.println("화요일"); break;
            case 3 :
                System.out.println("수요일"); break;
            case 4 :
                System.out.println("목요일"); break;
            case 5 :
                System.out.println("금요일"); break;
            case 6 :
                System.out.println("토요일"); break;
            case 0 :
                System.out.println("일요일"); break;
        }
    }
}
