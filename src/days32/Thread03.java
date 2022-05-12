package days32;


import javax.swing.*;

class ThreadC1 extends Thread {
    public void run() {
        for (int i=10;i>0;i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

class ThreadC2 extends Thread {
    public void run() {
        String input = JOptionPane.showInputDialog("정답을 입력하세요!");
        //자바에서 만들어지는 윈도우 프로그램을 위한 구성요소로 윈도우 프로그래밍을 할 수 있다.
        //그 클래스들은 javax.swing 패키지에 있고 그 중 대화상자 클래스가 JOptionPane 이다.
        //위 객체의 스태틱 메서드 실행은 화면에 단순 입력을 위한 대화창을 열고 입력을 기다린다.
        //해당 입력을 하고 확인을 누르면 입력한 내용은 변수 input 에 저장되고 대화상자는 닫힌다.
        System.out.println("입력하신 값은 "+input+"입니다.");
    }
}

public class Thread03 {
    public static void main(String[] args) {
        ThreadC1 t1 = new ThreadC1();
        ThreadC2 t2 = new ThreadC2();
        t2.start();
        t1.start();
        //t1.stop(); <-- 사용하지 않음
        //t1의 상태를 보고 종료시 t2도 종료되게 하고싶지만 종료 명령이 다소 복잡하다.
        //기존에 사용하던 Thread 의 stop() 메서드는 사용중이던 자원(변수,메모리 등)의
        //불안정을 초래하기 때문에 지금은 사용하지 않는다.

    }
}
