package days30;

import java.util.HashMap;

class Rect {
    private int x;
    private int y;
    public Rect(int x, int y) { this.x = x; this.y = y; }
    public String toString() { return "x:"+x+",y:"+y; }
    public boolean equals(Object obj) {
        if (!(obj instanceof Rect)) return false;
        Rect target = (Rect)obj;
        return (this.x == target.x) && (this.y == target.y);
    }
    public int hashCode() {
        System.out.println("Rect 클래스의 hashCode 실행");
        return this.x+this.y;
    }
    //hashCode 메서드의 오버라이딩은 특별한 경우를 제외하고는 권장하지 않는다.
    //이미 중복값이 발생되지 않도록 철저히 준비된 연산을 다른 연산으로 바꿔서
    //실행하는 것 자체가 자바의 코딩규칙을 무너뜨릴 가능성이 있기 때문.
    //다만 오버라이딩은 불가능한 동작이 아니므로 가능은 하다라고 이해하면 된다~!
}

public class Collection07 {
    public static void main(String[] args) {

        HashMap<Rect, Integer> map = new HashMap<>();
        map.put(new Rect(10, 10), 10);
        map.put(new Rect(20, 20), 20);
        map.put(new Rect(30, 30), 30);
        for (Rect k : map.keySet())
            System.out.printf("(%s)->%d\n", k.toString(), map.get(k)); //k.toString==k

        System.out.printf("키값 중 (30,30)의 유무: %b\n",
                map.containsKey(new Rect(30, 30)));
        // Hash 알고리즘: 여러 데이터를 대상으로 그 값들이 일정 연산에 의해
        //              서로 절대 같은 위치에 저장되는 일이 없도록 고유값을 결과로 얻는 연산

        // !! HashMap 에서 key 값들의 비교는 equals 로 연산하지 않음 !!
        // 그래서 원하는 연산 결과를 얻기 위해서는 Object 클래스의 hashCode 메서드를 오버라이딩 해야한다.
        // (권장하지는 않음)

        // Hash 기반의 클래스에서 키 값의 중복을 제거하기 위해서 실행되는 과정
        // (키 값이 사용자 정의 클래스 객체일때)
        //1. 입력된(검색할) 객체의 hashCode 메서드 실행
        //2. 반환받은 hashCode 메서드의 결과를 현재 저장되어 있는 모든 객체들의
        //   hashCode 메서드의 반환값과 비교
        //3. 만약 동일한 hashCode 메서드의 결과가 존재한다면 equals 메서드를
        //   실행하여 두 객체가 동일한지 비교

    }
}
