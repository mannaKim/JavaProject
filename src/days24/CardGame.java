package days24;

class CardDeck {
    private Card [] cards = new Card[52]; //카드 52장이 저장될 배열, 참조변수값을 저장하는 배열로 사용
    public CardDeck() {
        //cards[0]=new Card(Card.clover,1); ... cards[51]=new Card(Card.spade,13); 할당
        int cardNum=0;
        for (int kind=1;kind<=4;kind++) {
            for (int num=1;num<=13;num++){
                cards[cardNum] = new Card(kind,num);
                cardNum++;
            }
        }
    }
    public Card cardPick(int i) {
        return cards[i]; //cards[i] 객체(참조값)가 리턴
    }
    public void shuffle() {
        //모든 카드를 한번씩 랜덤한 위치의 카드와 자리 바꿈
        for (int i=0;i<52;i++){
            int r = (int)(Math.random()*52);
            Card temp = cards[i];
            cards[i]=cards[r];
            cards[r]=temp;
        }
    }
}

public class CardGame {
    public static void main(String[] args) {
        CardDeck d = new CardDeck();
        d.shuffle();
        /*
        Card c1 = d.cardPick(0);
        System.out.printf("%s ",c1);
        System.out.printf("%s ",d.cardPick(1));
        System.out.printf("%s ",d.cardPick(2));
        System.out.printf("%s ",d.cardPick(3));
        System.out.printf("%s ",d.cardPick(4));
         */
        Card [] p1 = new Card[5];
        int k=0;
        for (int i=0;i<5;i++){
            p1[i]=d.cardPick(k++);
        }
        for (int i=0;i<5;i++) System.out.printf("%s ",p1[i]);
        /*
        Card c = new Card(Card.clover,11);
        System.out.println(c.toString());
        Card d = new Card(Card.heart,1);
        System.out.println(d.toString());

        System.out.println(c);
        System.out.println(d);
        */
    }
}
// toString 메서드
//toString 메서드가 정의되지 않은! 클래스는 객체참조변수를 출력했을 때 클래스이름과 해시코드가 출력되지만,
//toString 메서드가 정의되어 있는 클래스는 객체참조변수를 출력 했을 때, toString 메서드가 리턴해주는 값으로 출력된다.
//toString 메서드가 정의되어 있는 클래스에서는 System.out.println(d.toString());와 System.out.println(d);가 같은 동작임!