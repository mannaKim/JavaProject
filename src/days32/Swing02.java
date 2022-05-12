package days32;

import javax.swing.*;
import java.awt.*;

class ButtonTest2 extends JFrame {
    ButtonTest2() {
        JButton b0 = new JButton("0"); JButton b1 = new JButton("1");
        JButton b2 = new JButton("2"); JButton b3 = new JButton("3");
        JButton b4 = new JButton("4"); JButton b5 = new JButton("5");
        JButton b6 = new JButton("6"); JButton b7 = new JButton("7");
        JButton b8 = new JButton("8"); JButton b9 = new JButton("9");

        JButton b10 = new JButton("+");
        JButton b11 = new JButton("-");
        JButton b12 = new JButton("×");
        JButton b13 = new JButton("÷");
        JButton b14 = new JButton("C");
        JButton b15 = new JButton("=");


        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        con.add(b7); con.add(b8);
        con.add(b9); con.add(b10);

        con.add(b4); con.add(b5);
        con.add(b6); con.add(b11);

        con.add(b1); con.add(b2);
        con.add(b3); con.add(b12);

        con.add(b15); con.add(b0);
        con.add(b14); con.add(b13);

        setTitle("버튼 컴퍼넌트 테스트"); //윈도우의 좌측 상단에 표시된 타이틀
        setSize(220,200); //윈도우 크기 설정:단위(픽셀)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //현재 윈도우 종료시 프로그램까지 종료 설정

        setVisible(true); //화면에 윈도우를 출현시키는 메소드
    }
}

public class Swing02 {
    public static void main(String[] args) {
        new ButtonTest2();
    }
}
