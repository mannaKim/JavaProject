package days33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

class Calendars extends JFrame implements ActionListener {

    int year;
    int month;
    JTextField [] jt = new JTextField[42]; //해당 달력의 날짜가 나오는 텍스트 필드

    JTextField y; //직접 입력하여 년도와 월을 선택할 텍스트 필드
    JTextField m;

    Calendars() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        jp1.setLayout(new GridLayout(1,7));     //일~토요일 표시 라벨 또는 버튼용 패널
        jp2.setLayout(new GridLayout(6,7));     //1일~말일을 표시할 텍스트필드용 패널
        jp3.setLayout(new FlowLayout());                  //이전달, 다음달, 현재년도, 현재월 등이 표시될 패널

        jp1.add(new JButton("일")).setForeground(Color.RED);
        jp1.add(new JButton("월"));
        jp1.add(new JButton("화"));
        jp1.add(new JButton("수"));
        jp1.add(new JButton("목"));
        jp1.add(new JButton("금"));
        jp1.add(new JButton("토")).setForeground(Color.BLUE);
        con.add(jp1, BorderLayout.NORTH);

        Font f = new Font("굴림",Font.BOLD,20);
        for(int i=0; i<42; i++){
            jt[i]=new JTextField(); //텍스트필드 객체 생성
            jt[i].setFont(f); //폰트 설정
            jt[i].setHorizontalAlignment(SwingConstants.RIGHT); //정렬 방향 설정
            jt[i].setEditable(false); //편집 불가능 설정
            jt[i].setBackground(Color.WHITE); //배경색 설정

            if(i%7==6) jt[i].setForeground(Color.BLUE); //토요일
            else if(i%7==0) jt[i].setForeground(Color.RED); //일요일
            else jt[i].setForeground(Color.BLACK);// 평일
            jp2.add(jt[i]); //현재 텍스트 필드를 패널에 얹는다.
        }
        con.add(jp2,BorderLayout.CENTER);

        y=new JTextField(5);
        y.setFont(f);
        y.setHorizontalAlignment(SwingConstants.CENTER);
        y.setBackground(Color.WHITE);

        m=new JTextField(3);
        m.setFont(f);
        m.setHorizontalAlignment(SwingConstants.CENTER);
        m.setBackground(Color.WHITE);

        JButton b = new JButton("확인");
        JButton b1 = new JButton("이전달");
        JButton b2 = new JButton("다음달");

        jp3.add(b1);
        jp3.add(y);
        jp3.add(new JLabel("년 "));
        jp3.add(m);
        jp3.add(new JLabel("월 "));
        jp3.add(b);
        jp3.add(b2);
        con.add(jp3,BorderLayout.SOUTH);

        setTitle("스윙 캘린더");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

       Calendar today = Calendar.getInstance(); //오늘날짜 생성
       y.setText(String.valueOf(today.get(Calendar.YEAR))); //년도 추출 -> 텍스트필드에 표시
        int mon=today.get(Calendar.MONTH) + 1;
       m.setText(String.valueOf(mon)); //월 추출 -> 텍스트필드에 표시
       year = Integer.parseInt(y.getText());  //변수에 저장
       month = Integer.parseInt(m.getText()); //변수에 저장

        drawCalendar();
    }

    private void drawCalendar() {
        //해당 년월의 달력을 화면에 표시
        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year,(month-1),1); //오늘 날짜 월의 1일로
        eDay.set(year,month,1);
        eDay.add(Calendar.DATE,-1); //오늘 날짜 월의 말일로

        int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        for(int i=START_WEEK-1; sDay.before(eDay)||sDay.equals(eDay);sDay.add(Calendar.DATE,1)) {
            int day = sDay.get(Calendar.DATE); //날짜의 일만 추출
            jt[i++].setText(String.valueOf(day)); //텍스트 필드에 넣음
        }
        y.setText(String.valueOf(year));
        m.setText(String.valueOf(month));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

public class Swing13 {
    public static void main(String[] args) {
        new Calendars();
    }
}
