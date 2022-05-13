package days33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JTextFieldTest extends JFrame implements ActionListener {
    //JTextField : 자바 Swing 패키지 내에 있는 글자를 타이핑해서 입력할 수 있는 컨트롤

    JTextField jtf; //jtf 선언(생성)

    JTextFieldTest() {
        jtf = new JTextField(30); //jtf 실제 사용
        //30글자를 써넣을 수 있는 텍스트 상자를 생성
        //JTextField 는 사용자가 직접 내용을 타이핑 해서 써넣을수도 있고,
        //프로그램이 내용을 채워서 사용자에게 보여줄수도 있다.

        JButton bt1 = new JButton("반갑습니다.");
        JButton bt2 = new JButton("안녕하세요.");

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        con.add(bt1); con.add(bt2);
        con.add(jtf);

        setTitle("텍스트필드 테스트");
        setSize(450,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        String oldText = jtf.getText();
        String newText = oldText + s;
        jtf.setText(newText);
    }
}

public class Swing10 {
    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
