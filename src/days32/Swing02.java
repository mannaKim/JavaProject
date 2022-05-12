package days32;

import javax.swing.*;
import java.awt.*;

class ButtonTest2 extends JFrame {
    ButtonTest2() {
        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        con.add(new JButton("7")); con.add(new JButton("8"));
        con.add(new JButton("9")); con.add(new JButton("＋"));

        con.add(new JButton("4")); con.add(new JButton("5"));
        con.add(new JButton("6")); con.add(new JButton("－"));

        con.add(new JButton("1")); con.add(new JButton("2"));
        con.add(new JButton("3")); con.add(new JButton("×"));

        con.add(new JButton("＝")); con.add(new JButton("0"));
        con.add(new JButton("C")); con.add(new JButton("÷"));

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
