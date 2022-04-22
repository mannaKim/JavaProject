package days20;

//같은 패키지 내에서 클래스 명이 겹치면 에러 발생
//Class02에서 정의한 Student Class 가 있으므로 Class03에서 같은 이름의 클래스를 정의 못한다.

// 멤버 메서드
//클래스에 소속되어 클래스 객체에 종속된 메서드
//멤버 메서드는 특별한 경우를 제외하곤 static 을 사용하지 않는다.
//static : 정적멤버를 선언할 때 사용
//정적(static) : '처음부터 만들어지는'이란 뜻
class Animal {
    String name;
    int age;
    public void output() {
        //메서드에 static 없음! <-- Animal 객체가 만들어지지 않으면 해당 메서드도 만들어지지 않음
        //Animal 객체명 = new Animal(); 객체 선언 이후에 만들어져서
        //객체명.output()으로 객체 전용으로 쓰임
        System.out.printf("나의 이름은 %s, 나이는 %d살 입니다.\n",name,age);
    }
    public void input() {
        name="바둑이";
        age=15;
        //output();     //<--클래스 내부에 함께 있는 멤버 메서드들 간에는 서로 호출 가능
    }
    //멤버메서드는 클래스형으로 생성된 객체"전용" 메서드
    //메서드의 실행이 객체전용으로만 사용 됨
    //멤버베서드의 내용에는 객체와 상관없는 명령이 들어갈 수도 있지만,
    //보통은 멤버변수들의 조작,출력,입력을 위한 명령들로 구성된다.
    public void inputWithParam(String n, int a) {
        name = n;
        age = a;
    }
    public String getName(){
        return name;
    }
    int getAge(){
        //현재 프로그램에(패키지 내의 같은 파일)서만
        //사용한다는 가정하에 public 도 생략 가능
        return age;
    }
}

public class Class03 {
    public static void main(String[] args) {
        Animal a1 = new Animal(); //객체 생성
        a1.name="멍멍이"; //멤버변수 값 저장
        a1.age=20;       //멤버변수 값 저장
        a1.output();  //멤버변수 처럼 앞에 소속된 객체 이름을 붙여서 사용

        Animal a2 = new Animal();
        a2.input();
        a2.output();

        Animal a3 = new Animal();
        a3.inputWithParam("댕댕이",10);
        System.out.printf("멤버메서드로 값을 받아 출력 : 이름 %s, 나이 %d\n",a3.getName(),a3.getAge());

        //어떤 멤버메서드를 만들고 사용하는가에 정답은 없음
        //개발자 판단 및 프로그램의 필요성에 의해 설계하고 제작되는 메서드를 잘 만들고 잘 사용하면 됨!
    }
}
