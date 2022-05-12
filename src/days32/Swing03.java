package days32;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1. ActionListener 를 implements 한다.
//2. 적용할 컨트롤에 addActionListener 메서드로 감시 설정을 한다.
//3. 해당 컨트롤에 이벤트가 발생하면 호출된 actionPerformed 메소드를 오버라이드 한다.

class ButtonEvent extends JFrame implements ActionListener {

    JLabel result = new JLabel("");;

    public ButtonEvent() {
        JButton male = new JButton("남자");
        JButton female = new JButton("여자");
        JLabel label = new JLabel("당신의 성별은?");
        //JLabel result = new JLabel("");

        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        con.add(label);
        con.add(male);
        con.add(female);
        con.add(result);

        //이벤트를 설정하고 감시할 리스너를 적용하고자 하는 컨트롤에 붙여둔다.
        //해당 컨트롤에 클릭 등의 이벤트가 발생하면 자동으로 actionPerformed 메서드가 호출된다.
        male.addActionListener(this);
        female.addActionListener(this);

        setTitle("버튼 이벤트 테스트");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //설정해놓은 컨트롤에 클릭되면 실행될 명령이 입력되는 곳
    @Override
    public void actionPerformed(ActionEvent e) {
        //클릭된 객체가 e 변수에 전달된다.
        //객체의 표시된 값을 아래와 같이 추출할 수 있다.
        String s = e.getActionCommand();
        result.setText(s+"를 선택하셨습니다.");
    }
}

public class Swing03 {
    public static void main(String[] args) { new ButtonEvent(); }
}
