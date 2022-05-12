package days32;

import javax.swing.*;

class ThreadE extends Thread {
    //Thread 를 계속 실행할지를 판단할 변수 생성
    private boolean state = true;

    //state 변수 값을 변경할 수 있는 멤버 메서드 생성
    public void setState(boolean state) {
        this.state = state;
    }

    public void run() {
        //반복실행이 될 때 마다 Thread 실행여부가 검사 된다.
        for (int i=10; (i>0 && state==true); i--) {
            System.out.println(i);
            try { Thread.sleep(1000);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class Thread06 {
    public static void main(String[] args) {

        ThreadE t2 = new ThreadE();
        t2.start();

        String input = JOptionPane.showInputDialog("정답을 입력하세요.");

        //t2 Thread 를 멈추는 위치
        t2.setState(false);

        System.out.println("입력하신 값은 "+input+"입니다.");

    }
}
