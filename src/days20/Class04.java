package days20;

class Std {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int tot;
    private double ave;

    public void input(int n, String nm, int k, int e, int m) {
        num=n;
        name=nm;
        kor=k; eng=e; mat=m;
        tot=k+e+m;
        ave=tot/3.0;
    }
    public void prn() {
        System.out.printf("%2d\t%3s\t%3d\t%3d\t%3d\t%3d\t%.2f\n",
                num,name,kor,eng,mat,tot,ave);
    }
}
public class Class04 {
    public static void main(String[] args) {
        Std s1 = new Std();
        Std s2 = new Std();

        s1.input(1,"홍길동",88,77,99);
        s2.input(2,"홍길서",89,98,78);
        //private 로 멤버변수들을 선언해서 s2.num=3; 같은 명령이 불가함.

        System.out.println("\t\t   ===성적표===");
        System.out.println("----------------------------------");
        System.out.print("번호\t 성명\t국어\t영어\t수학\t총점\t 평균\n");
        System.out.println("----------------------------------");
        s1.prn();
        s2.prn();
        System.out.println("----------------------------------");

        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt(); <--nextInt()는 Scanner 의 멤버메서드
        //Random rd = new Random();
        //int b = rd.nextInt(); <--nextInt()는 Random 의 멤버메서드
    }
}
