package days25;

class Car { //부모클래스 선언
    int 엔진;
    int 배기량;
    int 도어개수;
}

class K7 extends Car { //자식클래스 선언
    public void printInfo() {
        //자식클래스에서는 상속받은 멤버 사용 가능
        System.out.printf("엔진 : %d\n",this.엔진);
        System.out.printf("배기량 : %d\n",this.배기량);
        System.out.printf("도어개수 : %d\n",this.도어개수);
    }
}

public class Extends02 {
    public static void main(String[] args) {
        K7 k = new K7();
        k.엔진=6; k.배기량=3000; k.도어개수=5;
        k.printInfo();
    }
}
