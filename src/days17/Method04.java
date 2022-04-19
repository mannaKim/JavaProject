package days17;

public class Method04 {
    public static void main(String[] args) {
        //prnScore() 메서드로 성적표 출력
        //이름,국어점수,영어점수,수학점수를 전달인수로 입력받아, 총점과 평균까지 출력하는 메소드
        prnScore("홍길동",89,65,87);
    }
    public static void prnScore(String name, int kor, int eng, int mat){
        System.out.println("\t\t===성적표===");
        System.out.println("------------------------------");
        System.out.println(" 성명\t국어\t영어\t수학\t총점\t 평균");
        System.out.println("------------------------------");
        int total = kor+eng+mat;
        double avg = total/3.0;
        System.out.printf("%3s\t%3d\t%3d\t%3d\t%3d\t%.2f\n",name,kor,eng,mat,total,avg);
        System.out.println("------------------------------");
    }
}
