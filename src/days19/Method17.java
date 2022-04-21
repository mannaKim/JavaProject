package days19;

public class Method17 {
    public static void main(String[] args) {
        //cals 메서드 생성
        //전달된 문자열에 따라 입력된 숫자들의 평균 또는 합계를 출력하는 메서드
        cals("합계",98,78,45,12,23,87,69,59);
        System.out.println();
        cals("평균",98,78,45,12,23,32,98,63,25,87);
    }

    public static void cals(String op, int ... num){
        int total=0;
        for(int i:num) total+=i;
        if (op.equals("합계"))
            System.out.printf("합계 : %d",total);
        else System.out.printf("평균 : %.2f",total/(double)num.length);
    }
}
