package days32;

import javax.swing.*;
import java.awt.*;

class JPanelTest extends JFrame {
    JPanelTest() {
        //전체 컨테이너는 보더레이아웃으로
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        //패널 두 개를 생성 - 새끼 컨테이너
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new GridLayout(5,1));
        jp2.setLayout(new GridLayout(4,1));

        jp1.add(new JButton(("JAVA")));
        jp1.add(new JButton(("C++")));
        jp1.add(new JButton(("ASP")));
        jp1.add(new JButton(("JSP")));
        jp1.add(new JButton(("PHP")));

        jp2.add(new JButton(("JAVA")));
        jp2.add(new JButton(("C++")));
        jp2.add(new JButton(("ASP")));
        jp2.add(new JButton(("JSP")));

        con.add(jp1, BorderLayout.WEST);
        con.add(jp2, BorderLayout.EAST);
        con.add(new JButton(("프로그래밍 언어")), BorderLayout.CENTER);

        setTitle("패널 실습");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Swing09 {
    public static void main(String[] args) {
        new JPanelTest();
    }
}
