package days24;

public class Card {

    final static int spade = 4;
    final static int diamond = 3;
    final static int heart = 2;
    final static int clover = 1;

    private int kind;   //4:Spade  3:Diamond  2:Heart  1:Clover
    private int number; //A:1  2~10  J:11  Q:12  K:13

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public Card() {
        this(spade,1);
        // 매개변수 없이 선언되면 스페이드 A를 초기값으로 가짐
    }

    public String toString() { //무늬와 숫자를 String 으로 리턴해주는 멤버메서드
        //ex) kind:4, number:13 이면 문자열 "[Spade:K]"를 반환하는 메서드
        String [] kinds = {"","♣","♥","\uD83D\uDD36","♠"};
        String [] numbers = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //String result = "["+kinds[kind]+":"+numbers[number]+"]";
        return "["+kinds[kind]+":"+numbers[number]+"]";
    }
}
