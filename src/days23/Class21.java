package days23;

class Student {
    // 동적 멤버변수 (인스턴스 멤버변수)
    private int stdNum;
    private String name;
    private int [] scores;

    // 정적 멤버변수 (스태틱 멤버변수)
    static int count = 0;

    // 생성자
    public Student() {
        this.scores = new int[3];
        stdNum=++count;
    }
    public Student(String name) {
        this();
        this.name = name;
    }
    public Student(String name, int kor, int eng, int mat) {
        this(name);
        this.scores[0]=kor; this.scores[1]=eng; this.scores[2]=mat;
    }
    public Student(Student s) {
        this(s.name, s.scores[0],s.scores[1],s.scores[2]);
    }

    // 멤버메서드
    public void prn() {
        System.out.printf("%d | %s | %d | %d | %d\n",
                this.stdNum,this.name,this.scores[0],this.scores[1],this.scores[2]);
    }
}

public class Class21 {
    public static void main(String[] args) {
        Student s1 = new Student("홍길남",98,69,87);
        Student s2 = new Student("홍길서",77,98,84);
        Student s3 = new Student("홍길동",72,43,55);
        Student s4 = new Student(s3);
        System.out.printf("학생수 : %d\n",Student.count);
        s1.prn(); s2.prn(); s3.prn(); s4.prn();
    }
}
