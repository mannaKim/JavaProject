package days32;

//new Thread().start();
//익명 클래스를 활용한 Thread 생성
//익명 클래스 : 메소드를 오버라이딩하면서 객체를 생성하는 방법

public class Thread05 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {

            }
        }.start();
    }
}
