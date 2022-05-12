package days32;

//프로그램의 수행 중 동시에 처리하고자 하는 작업이 생겼을 때는 원래 갖고있는 메인 Thread 외에
//Thread 클래스를 추가사용하여 실행시킬 수 있다.
//Thread Class : 프로그램 실행의 흐름을 분기할 수 있는 방법을 제공하는 클래스

// 구현방법
//1. Thread 클래스를 상속받는 방법
//  1-1. Thread 클래스를 상속받아 public void run() 메서드를 오버라이딩 한다.
//      public void run() : Thread 가 생성되어 수행할 작업을 정의하는 메소드
//  1-2. 해당 클래스의 객체를 생성하고, start 메서드를 호출(실행)한다.(Thread 새로 만들어지고, 새로 만들어진 Thread 가 run 을 실행)
//      만약 오버라이딩된 run()을 호출하면, Thread 생성 실행이 아니라,
//      일반 메서드 호출이 되므로 반드시 start()를 통해 run()으로 이어지게 호출한다.
//
//      start 메서드 : Thread 클래스(부모클래스)에 있는 메서드로, 자체적으로 Thread 추가
//                  생성 후 run 메소드를 재호출하는 역할을 한다(상속된 메서드로 메서드가 표면에 보여지지는 않은채 사용된다.)
//2. Runnable 인터페이스를 Implements(구현)하는 방법
//  2-1. Thread 클래스를 상속하는 방법과 같고 효과도 거의 같다.

class ThreadB1 extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.printf("ThreadB1 : i -> %d\n",i);
            try {
                sleep(500); //<-- Thread 에서 상속받은 메서드이므로 Thread.sleep() 호출시 클래스명 생략 가능!
                //sleep()은 프로세서 실행에 관여하는 명령이라서 사용할 때마다 예외처리가 필요하다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadB2 extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.printf("ThreadB2 : i -> %d\n",i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread02 {
    public static void main(String[] args) {
        ThreadB1 b1 = new ThreadB1();
        ThreadB2 b2 = new ThreadB2();
        //b1.run();
        //b2.run();

        //start()로 각각 Thread 생성하고 run() 실행
        b1.start();
        b2.start();

        for(int i=1;i<=10;i++) {
            System.out.printf("main : i -> %d\n",i);
            try {
                Thread.sleep(500); //실행을 잠시(0.5s)동안 멈춤
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
