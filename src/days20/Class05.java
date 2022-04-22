package days20;

class Account {
    private double balance; //계좌정보 클래스에 잔액이 저장된 멤버변수

    //클래스의 멤버필드/메소드는 접근지정자(private, protected, public)에 의해서
    //외부에서의 접근을 제어할 수 있다.
    //접근지정자를 사용하지 않는 경우 기본 지정으로 public 이 설정되며,
    //클래스 외부에서 임의의 사용으로 값을 대입하거나 얻을 수 있다.
    //이는 멤버필드의 값이 강제로 수정될 수 있다는 뜻이기도 하다.
    //따라서 이를 방지하고 무분별한 접근을 막기 위해 멤버변수에 private 를 지정한다.
    //private 는 자신의 class 의 멤버메서드만 접근 가능하다.
    //멤버메서드는 대개 public 으로 지정되며, 외부에서 자유로운 접근이 가능하다.

    public void display() {
        System.out.printf("현재 잔액은 %.2f원 입니다.\n",balance);
    }
    public void initBalance(int bal) {
        //initial balance
        balance = bal;
    }
    public void withdraw(int money) {
        balance -= money;
    }
    public void deposit(int money) {
        balance += money;
    }
}
public class Class05 {
    public static void main(String[] args) {
        Account a = new Account();
        a.initBalance(100000);   //잔액 초기화
        a.display();             //화면에 잔액 표시
        a.withdraw(5000); //출금
        a.display();
        a.deposit(20000); //입금
        a.display();
    }
}
