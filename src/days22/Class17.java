package days22;

class Student {
    private int stdNum;
    private String name;
    private int [] scores;
    private String [] subjects;
    private int tot;
    private double avg;
    private char grade;

    public Student() {
        scores = new int[3];
        //System.out.println("default 생성자");
    }
    public Student(String name) {
        this();
        this.name = name;
        //System.out.println("String 자료가 전달인수인 생성자");
    }
    public Student(String name,int s1, int s2, int s3) {
        this(name);
        scores[0]=s1;
        scores[1]=s2;
        scores[2]=s3;
        //System.out.println("int 세 개가 전달인수인 생성자");
    }
    public void copy1(Student s) {
        //사용 : Student 객체명 = new Student(); 객체명.copy1(복사할객체명);
        //copy1 메서드에서는 this 가 복사하는객체
        //매개변수 s의 내용을 this 에 카피
        this.name = s.name;
        for (int i=0;i<scores.length;i++) this.scores[i]=s.scores[i];
    }
    public Student copy2() {
        //사용 : Student 객체명 = 복사할객체명.copy2();
        //copy2 메서드에서는 this 가 복사당하는객체
        Student temp = new Student();
        temp.name = this.name;
        for (int i=0;i<scores.length;i++) temp.scores[i]=this.scores[i];
        return temp;
    }
    public void prn() {
        System.out.printf("\t %s ", name);
        for (int i:scores) System.out.printf("%d ", i);
        System.out.println();
    }
}

//디폴트 생성자에서 배열 저장소를 할당하시오 (그 외 동작 없음)
//String 자료를 전달인수로 하는 생성자에서 전달된 이름을 멤버변수에 저장하시오
//디폴트 생성자, String 매개변수 생성자, String 과 정수 세개가 있는 생성자들
//사이에 필요한 형제 생성자를 this 로 호출하시오
//copy1과 copy2 제작하시오

public class Class17 {
    public static void main(String[] args) {
        Student std1 = new Student("홍길서",88,99,66);
        Student std2 = new Student("홍길동",98,87,89);
        Student std3 = new Student("홍길남",100,100,100);
        std1.copy1(std3);
        Student std4 = std3.copy2();

        System.out.print("std1"); std1.prn();
        System.out.print("std2"); std2.prn();
        System.out.print("std3"); std3.prn();
        System.out.print("std4"); std4.prn();
    }
}
