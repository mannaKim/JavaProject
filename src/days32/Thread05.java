package days32;

//new Thread().start();
//익명 클래스를 활용한 Thread 생성
//익명 클래스 : 메소드를 오버라이딩하면서 객체를 생성하는 방법
// new Thread() { public void run() { run 메소드 내용 } }.start();

public class Thread05 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i=1; i<=10; i++) {
                    System.out.printf("익명클래스 : i -> %d\n",i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        for (int i=1; i<=10; i++) {
            System.out.printf("main : i -> %d\n",i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
