package days22;

class ThisA {
    private int num;

    public void init(int num) {
        this.num = num;
        //멤버변수와 지역변수가 이름이 같을 때, 멤버변수를 구분하기 위해 그 앞에 this.을 붙여서 사용
    }
    //this 키워드는 클래스 내부에서 사용되는 모든 멤버변수에 원래 붙어있지만,
    //사용 편의상 생략해서 사용되고 있으며, 위와 같이 매개변수와 이름이 같지 않은 경우도 생략된 this 를 붙여서 사용할 수 있다.
    public void prn() {
        System.out.println("멤버변수 num의 값 : "+this.num);
    }
}

public class Class14 {
    public static void main(String[] args) {
        ThisA t1 = new ThisA();
        t1.init(100);
        t1.prn();
    }
}
