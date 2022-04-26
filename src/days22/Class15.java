package days22;

// this 변수는 레퍼런스(참조) 변수!

//클래스의 멤버필드들은 new 라는 키워드에 의해서 각각의 객체별로 생성된다. (서로 다른 메모리공간)

//반면, 멤버메서드는 생성된(오버로딩 포함) 메서드별로 하나만 존재하며
//모든 객체들이 그 주소를 공유하고 필요시 호출한다.

//이때 현재 메서드를 호출한 객체가 어떤 객체인지 구분하여 실행될 수 있게
//this 라는 숨겨진 참조변수를 제공한다.


// this 의 용도 #1
//멤버메서드를 호출한 호출객체의 참조변수값(주소값)을 전달받아
//전달된 메서드를 호출한 객체를 식별하는 용도로 사용
//보통 멤버변수를 this 없이 사용해도 이름이 중복된 매개변수가 없다면
//내부적으로 this 가 붙어서 실행된다.

class ThisB {
    private int num;

    public void setNum(int num /*, ThisB this*/) {
        //메서드를 호출한 객체가 매개변수 this 에 저장됨
        this.num = num;
    }
    public void prn(/*ThisB this*/) {
        System.out.println("num = "+this.num);
    }

    public ThisB(/*ThisB this*/) { }
    public ThisB(ThisB b /*ThisB this*/) { //자료형이 ThisB인 매개변수 b
        this.num = b.num;
        //매개변수의 num 값을 현재 만들어지는 객체의 num 에 저장

        //main 메서드에서 This b4 = new ThisB(b2); 이와 같이 호출되었다면,
        //this <-- b4, b <-- b2
    }
    public void copy1(ThisB b /*ThisB this*/) {
        this.num = b.num;
    }
    public ThisB copy2(/*ThisB this*/) {
        //리턴값이 ThisB인 copy2메서드
        //사용법 : ThisB tb6 = tb4.copy2(); <-- tb6은 tb4가 copy2를 호출한 값
        //즉, 위 명령에서 this 는 tb4

        ThisB temp = new ThisB(); //new 로 객체 공간 할당
        temp.num = this.num;      //객체 temp의 num에 매개변수의 num 값을 복사
        return temp;
        //자료형이 ThisB인 temp를 리턴함으로써 tb6은 공간이 있는(주소값을 복사한 것이 아닌) 객체로 정의됨
    }

    //모든 메서드에 매개변수로 ThisB this 이 생략되어 있음!
    //그래서 그 메서드를 호출한 객체를 this 로 참조
}

public class Class15 {
    public static void main(String[] args) {
       //객체 생성
        ThisB tb1 = new ThisB();
        ThisB tb2 = new ThisB();

        //값 할당
        tb1.setNum(1); tb2.setNum(2);

        //출력
        tb1.prn(); tb2.prn();
        System.out.println();

        // 참조값의 복사
        // : 인스턴스는 하나인데 같은 주소를 갖는 참조값이 두 개
        ThisB tb3 = tb1; //tb1이 저장한 주소를 tb3에게 준 것이기 때문에
        tb3.setNum(3); //tb3의 num 을 바꾸면
        tb1.prn(); //같은 값이 나옴
        tb3.prn();
        System.out.println();
        //new 를 이용하여 tb3 객체 공간을 생성한 것이 아니기 때문!

        // 값의 복사 (생성자 오버로딩)
        // : 객체 생성에 전달인수로 객체의 주소를 이용
        ThisB tb4 = new ThisB(tb2);
        tb2.setNum(4);
        tb2.prn();
        tb4.prn();
        System.out.println();

        // 값의 복사 (copy1 메서드 생성)
        ThisB tb5 = new ThisB();
        tb5.copy1(tb2);
        tb2.setNum(5);
        tb2.prn();
        tb5.prn();
        System.out.println();

        //(copy2 메서드 생성)
        ThisB tb6 = tb4.copy2();
        tb2.setNum(5);
        tb2.prn();
        tb5.prn();
    }
}
