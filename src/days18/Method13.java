package days18;

public class Method13 {
    public static void main(String[] args) {
        int [] a = {56,87,96,59,25,25,48,13,33,65,77,12,49};
        int tot;
        double ave;
        tot=sum(a); //배열의 합계를 계산하여 리턴하는 메서드
        ave=average(a); //배열의 평균을 계산하여 리턴하는 메서드
        prn(a,tot,ave); //배열의 요소와 합계, 평균을 출력하는 메서드
    }
    public static int sum(int [] a){
        int tot=0;
        for (int i : a){
            tot+=i;
        }
        return tot;
    }
    public static double average(int [] a){
        return sum(a)/(double)a.length;
    }
    public static void prn(int [] a, int total, double ave){
        System.out.println("배열 요소 출력");
        for (int i=0;i<a.length;i++){
            System.out.printf("a[%2d]=%2d  ",i,a[i]);
            if ((i+1)%5==0) System.out.println();
        }
        System.out.printf("\n배열 요소의 합계 : %d\n배열 요소의 평균 : %.2f\n",total,ave);
    }
}
