package days32;

import javax.swing.*;
import java.awt.*;

//액션리스너를 사용하지 않고 버튼 자체에 존재하는 이벤트 메서드를 사용
class JButtonEvent extends JFrame {
    JButtonEvent() {
        ImageIcon korea = new ImageIcon("images/korea1.gif");
        ImageIcon usa = new ImageIcon("images/usa.gif");
        ImageIcon germany = new ImageIcon("images/germany.gif");

        JButton eventButton = new JButton(korea);

        eventButton.setRolloverIcon(usa);    //마우스가 올라갔을 때
        eventButton.setPressedIcon(germany); //마우스 버튼을 눌렀을 때

        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        con.add(eventButton);

        setTitle("버튼 자체 이벤트 처리 실습");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Swing05 {
    public static void main(String[] args) {
        new JButtonEvent();
    }
}
