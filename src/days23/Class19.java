package days23;

// static 키워드
//멤버변수, 멤버메소드에 적용할 수 있는 키워드
//정적 변수(클래스의 변수), 정적 메소드(클래스의 메소드)를 선언할 때 사용

// 자바프로그램의 구동 과정
//1. JVM(Java Virtual Machine)에 의해서 실행할 모든 클래스 중, static 메서드, static 멤버필드를 수집해서
//  메모리에 로딩, 프로그램의 시작(main 메서드의 실행) 전에 메모리 적재된다.
//2. 메모리에 로딩된 static 메서드 중 main 이름을 검색
//3. main 메서드가 검색되었다면 JVM 이 해당 main 메서드를 호출하여 프로그램을 시작

// static 변수/메서드의 정의
//프로그램의 구동 전부터 메모리를 확보하고 존재하는 멤버변수 및 메서드

class StaticA {
    int num;                    //<-- 인스턴스 멤버변수 (동적 멤버변수)
    static int number = 100;    //<-- 스태틱 멤버변수 (정적 멤버변수)
}

public class Class19 {
    public static void main(String[] args) {
        //동적 멤버변수(인스턴스 멤버변수)는 객체가 생성되어야만 변수가 생성되고, 사용이 가능
        System.out.println("StaticA의 정적 멤버변수 값: "+StaticA.number);

        StaticA a1 = new StaticA();
        a1.num=100;
        System.out.println("객체 a1의 동적 멤버변수 값: "+a1.num);

        //스태틱 변수는 main 메서드 실행 전, 객체 생성 전에 미리 생성되어 있는 변수이다.
        //객체와는 독립적이면서 클래스에는 종속적으로 사용된다.
        //객체를 생성하지 않고도 사용할 수 있는 클래스의 멤버변수이다.

        //동적변수는 객체 생성마다 그 객체 안에 생성되어서 객체의 개수만큼 생성됨
        //정적변수는 프로그램 전체를 통틀어 한 개만 생성됨. 그 값도 일관성있게 유지된다.

        StaticA a2 = new StaticA();
        a2.num = 200;
        System.out.println("StaticA의 정적 멤버변수 값: "+StaticA.number);
        System.out.println("객체 a2의 동적 멤버변수 값: "+a2.num);

        StaticA a3 = new StaticA();
        a3.num = 300;
        System.out.println("StaticA의 정적 멤버변수 값: "+StaticA.number);
        System.out.println("객체 a2의 동적 멤버변수 값: "+a3.num);

        //동적 변수와 마찬가지로 private 로 보호되지 않았다면 임의 접근이 가능
        StaticA.number=10;
        System.out.println("StaticA의 정적 멤버변수 값: "+StaticA.number);
        //private 로 보호된 static 변수는 static 메서드를 사용하여 값을 저장하거나 얻어냄
        //static 이 아닌 멤버메서드에서는 접근이 불가능
    }
}
