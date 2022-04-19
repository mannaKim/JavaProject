package days17;

public class Method07 {
    public static void main(String[] args) {
        int [] a = {56,54,87,89,25,36,57,98};
        //sum(a); 가 실행되면 배열 a 의 합계와 평균을 출력하는 메서드 sum()을 생성
        sum(a);
    }

    public static void sum(int [] a) {
        int sum=0; double avg;
        for(int i : a){
            sum+=i;
        }
        avg=(double)sum/a.length;
        System.out.println("합계 : "+sum+", 평균 : "+avg);
    }
}
