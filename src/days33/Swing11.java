package days33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//윈도우에 텍스트필드1, 버튼1, 버튼2, 택스트필드2 순서로 배치한다.
//버튼1의 표현에는 ">", 버튼2의 표면에는 "<" 표시
//버튼1을 클릭하면 텍스트필드1의 글자가 텍스트필드2로 옮겨지게
//버튼2를 클릭하면 텍스트필드2의 글자가 텍스트필드1로 옮겨지게
//글자가 없는 상태에서 클릭하면 아무일도 안일어남
//윈도우클래스 이름은 JTextFieldEx
//사이즈는 적절하게..

class JTextFieldEx extends JFrame implements ActionListener {

    //오버라이드된 actionPerformed 에서도 접근할 수 있도록 텍스트필드 선언은 생성자 밖에서
    JTextField jtf1;
    JTextField jtf2;

    JTextFieldEx() {
        jtf1 = new JTextField(15);
        jtf2 = new JTextField(15);
        JButton bt1 = new JButton(">");
        JButton bt2 = new JButton("<");

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        con.add(jtf1);
        con.add(bt1); con.add(bt2);
        con.add(jtf2);

        setTitle("텍스트필드 테스트");
        setSize(500,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        //String jtf1Text = jtf1.getText();
        //String jtf2Text = jtf2.getText();
        if (s.equals(">")) {
            if(!(jtf1.getText().equals(""))) {
                jtf2.setText(jtf1.getText());
                jtf1.setText("");
            }
        }
        else {
            if(!(jtf2.getText().equals(""))) {
                jtf1.setText(jtf2.getText());
                jtf2.setText("");
            }
        }
    }
}

public class Swing11 {
    public static void main(String[] args) {
        new JTextFieldEx();
    }
}
