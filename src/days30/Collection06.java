package days30;

import java.util.ArrayList;

class Point {
    private int x;
    private int y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public String toString() { return "x:"+x+",y:"+y; }
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) return false;
        Point tmp = (Point)obj;
        return this.x == tmp.x && this.y == tmp.y;
    }
}

public class Collection06 {
    public static void main(String[] args) {

        // 객체의 제네릭 타입을 직접 정의한 Class 로 지정할 수 있다.
        ArrayList<Point> list = new ArrayList<>();
        Point p1 = new Point(10,20);
        list.add(p1);
        list.add(new Point(20,30));
        list.add(new Point(30,30));
        for (Point p : list)
            System.out.println(p.toString());

        int index = list.indexOf(new Point(30,30));
        //.indexOf() : ArrayList 의 멤버 메서드,
        //             괄호안에 넣은 객체 내지 값이 몇번째 요소로 있는지 인덱스 값을 반환. 없으면 -1을 반환
        System.out.printf("(30,30)의 위치 : %d\n",index);

        boolean con = list.contains(new Point(30,30));
        System.out.printf("(30,30)의 저장 유무 : %b\n",con);
        // 사용자 정의 클래스에 equals 메소드가 오버라이딩 되지 않은 경우
        // 컬렉션 내부에서 동일한 형태의 객체를 검색 및 비교할 수 없다!
        // 참조값끼리 비교되어 의도와 다른 결과를 얻는다.

    }
}
