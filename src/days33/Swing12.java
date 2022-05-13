package days33;

//계산기 만들기

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//컨테이너의 레이아웃 : 5행 1열의 GridLayout
//1행 : JPanel p1 배치 -> p1에는 FlowLayout 으로 TextField 한 개 배치
//2행 : JPanel p2 배치 -> p2에는 GridLayout 으로 버튼 네개(7,8,9,+)
//3행 : JPanel p3 배치 -> p3에는 GridLayout 으로 버튼 네개(4,5,6,-)
//4행 : JPanel p4 배치 -> p4에는 GridLayout 으로 버튼 네개(1,2,3,x)
//5행 : JPanel p5 배치 -> p5에는 GridLayout 으로 버튼 네개(C,0,=,/)

class Calculator extends JFrame implements ActionListener {
    JTextField jt;
    int firstNumber;
    int secondNumber;
    int result1;
    double result2;
    int operator = 0;

    Calculator() {
        Container con = getContentPane();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        con.setLayout(new GridLayout(5,1));
        p1.setLayout(new FlowLayout(FlowLayout.CENTER)); //텍스트필드가 패널의 가운데에 위치하도록 설정
        p2.setLayout(new GridLayout(1,4));
        p3.setLayout(new GridLayout(1,4));
        p4.setLayout(new GridLayout(1,4));
        p5.setLayout(new GridLayout(1,4));

        jt = new JTextField(15);
        Font f = new Font("굴림",Font.BOLD,20);
        jt.setFont(f); //<-- 버튼도 폰트 적용 가능
        jt.setText("0");
        jt.setHorizontalAlignment(SwingConstants.RIGHT); //텍스트 필드안에 쓰여지는 숫자(글자)들의 오른쪽 정렬
        jt.setEditable(false); //텍스트필드 임의 수정 불가

        JButton b0 = new JButton("0"); JButton b1 = new JButton("1");
        JButton b2 = new JButton("2"); JButton b3 = new JButton("3");
        JButton b4 = new JButton("4"); JButton b5 = new JButton("5");
        JButton b6 = new JButton("6"); JButton b7 = new JButton("7");
        JButton b8 = new JButton("8"); JButton b9 = new JButton("9");
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bMulti = new JButton("×");
        JButton bDivide = new JButton("÷");
        JButton bClear = new JButton("C");
        JButton bEqual = new JButton("=");

        b0.setFont(f); b1.setFont(f); b2.setFont(f); b3.setFont(f); b4.setFont(f);
        b5.setFont(f); b6.setFont(f); b7.setFont(f); b8.setFont(f); b9.setFont(f);
        bPlus.setFont(f); bMinus.setFont(f); bMulti.setFont(f); bDivide.setFont(f);
        bClear.setFont(f); bEqual.setFont(f);

        p1.add(jt);
        p2.add(b7); p2.add(b8); p2.add(b9); p2.add(bPlus);
        p3.add(b4); p3.add(b5); p3.add(b6); p3.add(bMinus);
        p4.add(b1); p4.add(b2); p4.add(b3); p4.add(bMulti);
        p5.add(bClear); p5.add(b0); p5.add(bEqual); p5.add(bDivide);
        con.add(p1); con.add(p2); con.add(p3); con.add(p4); con.add(p5);

        //각 버튼들에 액션리스너를 다 붙이고, 버튼 클릭시 해당 숫자가 텍스트 필드에 표시되도록 코딩
        b0.addActionListener(this); b1.addActionListener(this); b2.addActionListener(this);
        b3.addActionListener(this); b4.addActionListener(this);
        b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this);
        b8.addActionListener(this); b9.addActionListener(this);
        bPlus.addActionListener(this); bMinus.addActionListener(this); bMulti.addActionListener(this);
        bDivide.addActionListener(this); bClear.addActionListener(this); bEqual.addActionListener(this);

        setTitle("계산기");
        setSize(300,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        String oldText = jt.getText();
        if (oldText.equals("0")) oldText="";
        /*switch(s) {
            case "0" : jt.setText(oldText+"0"); break;
            case "1" : jt.setText(oldText+"1"); break;
            case "2" : jt.setText(oldText+"2"); break;
            case "3" : jt.setText(oldText+"3"); break;
            case "4" : jt.setText(oldText+"4"); break;
            case "5" : jt.setText(oldText+"5"); break;
            case "6" : jt.setText(oldText+"6"); break;
            case "7" : jt.setText(oldText+"7"); break;
            case "8" : jt.setText(oldText+"8"); break;
            case "9" : jt.setText(oldText+"9"); break;
        }*/
        switch (s) {
            case "+" :
                operator = 1;
                firstNumber = Integer.parseInt(jt.getText());
                jt.setText("0");
                break;
            case "-" :
                operator = 2;
                firstNumber = Integer.parseInt(jt.getText());
                jt.setText("0");
                break;
            case "×" :
                operator = 3;
                firstNumber = Integer.parseInt(jt.getText());
                jt.setText("0");
                break;
            case "÷" :
                operator = 4;
                firstNumber = Integer.parseInt(jt.getText());
                jt.setText("0");
                break;
            case "C" :
                jt.setText("0");
                break;
            case "=" :
                secondNumber = Integer.parseInt(jt.getText());
                switch (operator) {
                    case 1:
                        result1 = firstNumber+secondNumber;
                        jt.setText(String.valueOf(result1));
                        break;
                    case 2:
                        result1 = firstNumber-secondNumber;
                        jt.setText(String.valueOf(result1));
                        break;
                    case 3:
                        result1 = firstNumber*secondNumber;
                        jt.setText(String.valueOf(result1));
                        break;
                    case 4:
                        result2 = firstNumber/(double)secondNumber;
                        jt.setText(String.valueOf(result2));
                        break;
                }
                break;
            case "0": case "1": case "2": case "3": case "4":
                case "5": case "6": case "7": case "8": case "9":
                    jt.setText(oldText + s);
        }

    }
}

public class Swing12 {
    public static void main(String[] args) {
        new Calculator();
    }
}
