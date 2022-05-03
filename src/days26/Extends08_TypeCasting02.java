package days26;
class SuperF {
    int superNum;
    void abc() { System.out.println("부모클래스의 메서드"); }
}
class SubF extends SuperF {
    int subNum;
    void abc() { System.out.println("자식클래스의 오버라이딩 메서드"); }
}

public class Extends08_TypeCasting02 {
    public static void main(String[] args) {
        //부모클래스의 객체 생성
        SuperF super1 = new SuperF();
        //자식클래스의 객체 생성
        SubF sub1 = new SubF();

        // 1. 자식클래스의 인스턴스 주소값을 부모클래스의 레퍼런스변수에 저장 가능
        //    부모참조변수 <- 자식인스턴스의 주소 : OK
        super1 = sub1;
        super1 = new SubF();

        // 2. 부모클래스의 인스턴스 주소값을 자식클래스에 레퍼런스변수에 저장 불가능
        //    자식참조변수 <- 부모인스턴스의 주소 : NOT OK
        super1 = new SuperF();
        //sub1 = super1; <-- 에러
        //sub1 = new SuperF(); <-- 에러

        // 3. 부모클래스의 레퍼런스변수가 갖고있던 주소를 자식클래스의 레퍼런스 변수에 저장하고 싶다면,
        //    강제캐스팅 연산을 이용해 저장 가능
        SuperF super2 = new SuperF();
        //SubF sub3 = (SubF)super2; <-- 문법상 에러는 없지만 실행시 런타임에러 발생
        //결국 자식클래스의 레퍼런스변수는 저장된 주소를 찾아갔을 때, 부모클래스의 인스턴스면 런타임에러 발생

        //SubF sub3 = (SubF)super2; 가 문법상 오류로 인식되지 않는 이유?

        //부모클래스의 레퍼런스 변수가 갖고 있던 주소값을 자식클래스의 레퍼런스 변수에 넣을 수 있는 경우를 선별해야 하는데
        //현재의 부모레퍼런스변수가 저장한 주소에 자식 인스턴스가 저장된 경우로 제한한다.
        SuperF super3 = new SubF();     //부모레퍼런스변수에 자식 인스턴스 저장
        SubF subF = (SubF)super3;       //부모레퍼런스 값을 자식레퍼런스변수에 저장
        // 자식레퍼런스 <- (타입캐스팅)부모레퍼런스 <- 자식인스턴스주소 : 정상실행
        // 자식레퍼런스 <- (타입캐스팅)부모레퍼런스 <- 부모인스턴스주소 : 런타임에러

        // 4. 강제 캐스팅을 사용한 형변환 시 에러를 방지하는 방법 : instanceof 연산자
        //SuperF super4 = new SuperF();
        SuperF super4 = new SubF();
        if (super4 instanceof SubF) {
            //SubF 클래스로의 형변환 가능성을 true/false 로 판단
            SubF sub5 = (SubF)super4;
            System.out.println("형변환 성공");
        } else System.out.println("형변환 실패");

        // 5. 자식인스턴스를 저장하고있는 부모레퍼런스는 부모가 상속해준 멤버변수에만 접근이 가능
        SuperF super5 = new SubF();
        super5.superNum =100;
        //super5.subNum=100;  <-- 에러: SubF의 subNum 에 접근 불가능

        super5.abc();
        //다만, 메서드가 오버라이딩 되어있다면 부모클래스의 레퍼런스로 실행한 메서드는
        //자식클래스에서 오버라이딩 된 메서드가 우선 실행된다.
    }}
