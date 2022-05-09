package days29;

// HashSet 클래스
//데이터의 중복을 허용하지 않고 저장하는 클래스
//- 검색을 위해 사용
//(저장할 때 hash 연산의 결과로 저장하기때문에 검색할때도 hash 연산 결과로 검색하여 빠른 검색이 가능)
//hash 연산 : 클래스 내에서 유일한 값을 없어 낼 수 있는 고유 알고리즘 연산
//- 중복된 값을 제거하면서 데이터를 저장하기 위해 사용

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

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
    }
}
