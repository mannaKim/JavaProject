package days30;

//Hashtable, HashMap 클래스
//데이터베이스 내부의 키 값을 검색하기 위해서 만들어진 알고리즘을 기반으로 작성된 클래스
// - 검색을 위해서 사용되는 클래스
// - Key, Value 를 저장할 수 있는 클래스
// - Key 값은 중복을 허용하지 않음
// - Value 값은 중복을 허용
//(저장 예)
//HashMap hm = new HashMap();
//hm.put(1,"One"); hm.put(2,"Two"); hm.put(3,"Three");

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Collection04 {
    public static void main(String[] args) {
        //Key 값은 문자열, Value 값은 정수로 입력받는 Hashtable 객체 생성
        Hashtable<String, Integer> ht = new Hashtable<>();
        //Key 값은 정수, Value 값은 문자열로 입력받는 HashMap 객체 생성
        HashMap<Integer, String> hm = new HashMap<>();

        // Key 값과 Value 값 삽입: put()
        hm.put(1, "One");
        //hm.put("One",1); <-- 에러: 객체 생성시 제약된 제네릭 형식에 어긋남
        hm.put(2, "Two");
        hm.put(3, "Three");

        ht.put("One", 1);
        ht.put("Two", 2);
        ht.put("Three", 3);

        //(확장 사용 예)
        HashMap<Integer, ArrayList<String>> kk = new HashMap<>();
        // key: 1    value: {"abcd", "efg", "hij"}
        // key: 2    value: {"kkkk", "ffff"}
        HashMap<Integer, Object> pp = new HashMap<>();
        // key: 1    value: "abcd"
        // key: 2    value: 1234
        // key: 3    value: 23.56
        // key: 4    value: {"abcd", "efg", "hij"}

        // Value 값 접근: get()
        // Hashtable, HashMap 클래스는 get()에 Key 값을 전달해 Value 를 리턴받는다.
        System.out.printf("\"Three\" = %d\n", ht.get("Three"));
        System.out.printf("3 = \"%s\"\n", hm.get(3));

        //Hashtable, HashMap 클래스 내부의 데이터를 반복문을 통해서 접근하는 예
        // 1. Enumeration 타입을 사용하는 방법
        //  - Enumeration: 열거형 자료형식(인터페이스)
        Enumeration<String> e1 = ht.keys(); //키들의 접근 권한을 저장
        while (e1.hasMoreElements()) {
            String key = e1.nextElement(); //키값 하나를 꺼내서 String 변수에 저장
            int value = ht.get(key); //키값으로 검색한 밸류값을 int 변수에 저장
            System.out.printf("key(%s)=Value(%d)\t", key, value);
        }
        System.out.println();

        // 2. for 문을 활용하여 Key 값 순회하는 방법
        for (String k : ht.keySet()) {
            Integer v = ht.get(k);
            System.out.printf("key(%s)=Value(%d)\t", k, v);
        }
        System.out.println();
        for (Integer k : hm.keySet()) {
            String v = hm.get(k);
            System.out.printf("key(%d)=Value(%s)\t", k, v);
        }
    }
}

