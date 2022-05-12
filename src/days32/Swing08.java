package days32;

import javax.swing.*;
import java.awt.*;

class JGridLayout extends JFrame {
    JGridLayout() {
        Container con = getContentPane();
        //화면의 배치를 행과 열의 개수로 배치하고 조절한다.
        con.setLayout(new GridLayout(4,4,20,20));
        //3행 5열 가로 세로 간격 20px

        for(int i=1; i<=16; i++) con.add(new JButton("버튼"+i));

        setTitle("그리드 레이아웃 실습");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Swing08 {
    public static void main(String[] args) {
        new JGridLayout();
    }
}
