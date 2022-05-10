package days30;

// HashSet 클래스
//데이터의 중복을 허용하지 않고 저장하는 클래스
//- 검색을 위해 사용
//(저장할 때 hash 연산의 결과로 저장하기때문에 검색할때도 hash 연산 결과로 검색하여 빠른 검색이 가능)
//hash 연산 : 클래스 내에서 유일한 값을 없어 낼 수 있는 고유 알고리즘 연산
//- 중복된 값을 제거하면서 데이터를 저장하기 위해 사용

import java.util.*;

public class Collection03 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1); v.add(2); v.add(2);
        System.out.println("v.size()="+v.size()); //중복 허용하므로 3이 출력됨

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(2);
        System.out.println("a.size()="+a.size()); //중복 허용하므로 3이 출력됨

        HashSet<Integer> h = new HashSet<>();
        h.add(1); h.add(2); h.add(2);
        System.out.println("h.size()="+h.size()); //중복 불가이므로 2가 출력됨

        // 로또 번호 발생
        HashSet<Integer> lotto = new HashSet<>();
        while(lotto.size()<6) {
            lotto.add((int)(Math.random()*45)+1);
        }//size 가 6이 될 때 까지 반복

        for(Integer i : lotto) System.out.printf("%d ",i);


        //HashSet 콜렉션에는 sort 메서드가 없다.
        //따라서 LinkedList 의 부모클래스인 List 클래스에 전해줘서
        //리스트 변환 과정을 거치고, Collections.sort 로 정렬해야 한다.
        List<Integer> list = new LinkedList<>(lotto);
        Collections.sort(list);
        //Collection 클래스의 static 메서드인 sort 를 이용하여 정렬
        System.out.println();
        System.out.println(list);


        //HashSet 타입의 객체 내부를 순회하는 방법
        //1. Iterator 객체를 사용하는 방법
        // - Iterator 객체는 컬렉션 내부의 데이터를 순회할 수 있는 객체
        Iterator<Integer> iter = lotto.iterator();
        //lotto(HashSet 타입)의 각 요소 방문 권한을 iter 라는 객체에 전달하여 방문하는 방식

        while (iter.hasNext())
            System.out.printf("%d ",iter.next());
        //Iterator 의 최초 포커스는 첫번째 데이터가 아니라 그보다 앞선 세트의 시작부분이다.
        //iter.next()가 한번 실행이 되야 비로서 첫번째 데이터에 접근하게 된다.
        //그 다음에 실행되는 iter.next()는 그 다음 데이터를 순차적으로 접근한다.

        //2. for 문을 사용하는 방법
        System.out.println();
        for(Integer i : lotto) System.out.printf("%d ",i);
    }
}
