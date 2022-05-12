package days32;

import javax.swing.*;
import java.awt.*;

class JBorderLayout extends JFrame {
    JBorderLayout() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout(10,10));
        //각 지역(동,서,남,북,중앙)간의 간격 가로 세로 10px

        JButton b0 = new JButton("동쪽 버튼"); JButton b1 = new JButton("서쪽 버튼");
        JButton b2 = new JButton("남쪽 버튼"); JButton b3 = new JButton("북쪽 버튼");
        JButton b4 = new JButton("중앙 버튼");

        con.add(b0,BorderLayout.EAST);
        con.add(b1,BorderLayout.WEST);
        con.add(b2,BorderLayout.SOUTH);
        con.add(b3,BorderLayout.NORTH);
        con.add(b4,BorderLayout.CENTER);
        //CENTER 는 정의하지 않으면 자리가 남지만 이외의 영역은 정의하지 ㅇ낳으면 다른 영역으로 포함되어져 표시된다.

        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Swing07 {
    public static void main(String[] args) {
        new JBorderLayout();
    }
}
