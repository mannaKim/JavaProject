package days27;

import java.util.Vector;

//☆☆상품과 구매자를 클래스로 만들고 구매, 환불 등의 동작을 메서드로 제작☆☆
class Product {
    int price;
    int bonusPoint; //상품 구매시 구매자에게 부여하는 포인트 액수
    //public Product() { }
    public Product(int price) {
        this.price = price;
        this.bonusPoint = price/10;
    }
}
class Computer extends Product {
    //자식클래스는 부모클래스의 생성자 형식에 맞춰서 호출해야 함
    Computer() { super(150); }
    public String toString() { return "Computer"; }
}
class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}
class Audio extends Product {
    Audio() { super(60); }
    public String toString() { return "Audio"; }
}
class Buyer {
    int money = 1000;           //구매자가 소지한 금액
    int bonusPoint = 0;         //물건을 구매해서 얻은 보너스포인트
    Vector item = new Vector(); //구매목록
    //벡터 : 배열의 확장형 구조(리스트)
    //      사용자가 만든 클래스 객체의 레퍼런스값(주소값)을 저장하는 다형성 객체 저장 리스트
    //      객체들을 저장할 수 있는 배열이라고 이해해도 무방

    public void buy(Product p) {
        //부모클래스의 레퍼런스 변수에는 자식인스턴스의 주소를 저장할 수 있다. (자동캐스팅)
        //p로 전달받은 자식클래스 객체에서 부모클래스에서 물러준
        //멤버변수(price,bonusPoint), 자식클래스에서 오버라이딩한 멤버변수에 접근이 가능

        //전달된 제품을 구매할 정도의 잔액이 충분한가 체크
        if(this.money<p.price) {
            System.out.println("잔액 부족");
            return;
        }
        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;

        //부모클래스의 레퍼런스 변수로 오버라이딩된 toString() 사용 가능
        System.out.println(p+"를 구매하셨습니다.");

        //제품 객체를 item 리스트객체에 추가
        item.add(p);
        //Vector 클래스의 멤버메서드 add : 매개변수가 Object 형
        //public void add(Object obj) { ... }
    }
    public void summary() {
        int sum = 0;            //지출 총액
        String itemList = "";   //구매 목록
        if (item.isEmpty()) {
            //item.isEmpty() : Vector 객체인 item 이 비어있으면 true 를 리턴하는 메서드
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        for (int i=0; i<item.size(); i++) {
            //item.size() : 저장된 요소의 개수를 리턴하는 메서드

            //item 에 저장해뒀던 객체를 읽어서 Product 형 변수에 담는다.
            Product p = (Product)item.get(i);  //강제캐스팅☆
            //item.get(i) : item 에 i 번째로 저장된 객체를 읽는 메서드
            //부모레퍼런스변수에 저장됐던 자식인스턴스의 주소값이, 자식레퍼런스에 전달하려면 강제캐스팅 필요
            sum += p.price; //구입금액 합산
            itemList = itemList+p+" ";
        }
        System.out.println("지출 총액 : "+sum+"\n구매 목록 : "+itemList);
    }
    public void refund(Product p) {
        //item.remove(p) : item 에서 p를 삭제 - 참조값(주소)으로 검색해서 삭제하고,
        //                 삭제가 되었다면 true 를 반환
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p+"의 반품이 완료되었습니다.");
        } else System.out.println("구입하신 물품 중 해당 제품이 없습니다.");
    }
}

public class Extends09_Object05 {
    public static void main(String[] args) {
        Computer c = new Computer();
        Tv t = new Tv();
        Audio a = new Audio();

        //toString()이 오버라이딩되면, 객체명.toString()을 객체명으로만 호출 가능
        System.out.println(c);
        System.out.println(t);
        System.out.println(a);

        Buyer b = new Buyer();
        b.buy(c); b.buy(a); b.buy(t);

        b.summary();

        b.refund(c);
        b.summary();
    }
}
