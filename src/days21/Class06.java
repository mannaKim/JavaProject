package days21;

// 접근지정자
//모든 클래스의 멤버는 현실에 존재하는 대상의 정보로서,
//직접적인 접근이 허용되는 것과 허용되면 안되는 정보가 있다.
//접근지정자는 클래스의 멤버들에 대한 접근을 제어하는 키워드이다.

// 접근지정자의 종류
// private : 클래스 내부에서만 사용가능한 멤버를 정의하는 키워드
// public : 접근에 제한이 없는 멤버를 정의하는 키워드
// protected : child class 에서만 자유롭게 접근이 가능한 키워드 (이후 상속 챕터에서 더 자세히)
// default : 접근지정자를 지정하지 않으면 자동으로 갖게되는 접근지정자이며, 같은 패키지내에서 자유롭게 접근 가능
//            (즉, 같은 패키지 안에서는 public 과 동일한 접근제한)

import java.util.Scanner;

class Account {
    private double balance;
    //private 멤버에 접근할 수 있는 권한은 내부에 있는 메서드 뿐
    public void init(double n) {
        balance = n;
    } //멤버메서드는 보통 public 으로 지정해서 멤버변수값을 세팅
    public void withdraw(double money) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌 비밀번호 네 자리를 입력하세요.");
        int pass = Integer.parseInt(sc.nextLine());

        if (pass != 1234) {
            System.out.println("비밀번호가 맞지 않습니다.\n");
            return;
        }
        if (money > balance) {
            System.out.println("잔액이 부족합니다.\n");
            return;
        }
        balance -= money;
        System.out.println(money+"원 출금이 완료되었습니다.");
        //System.out.printf("현재 잔액은 %.2f원 입니다.\n\n",balance);
        display();      //멤버메서드 간의 호출이 가능
        //같은 클래스 내부의 멤버메서드끼리는 앞에 객체 이름 없이 서로를 자유롭게 호출 가능
    }
    public void deposit(double money) {
        if (money <= 0){
            System.out.println("입금액 오류. 관리자에게 문의하세요.\n");
            return;
        }
        balance += money;
        System.out.println(money+"원 입금이 완료되었습니다.");
        //System.out.printf("현재 잔액은 %.2f원 입니다.\n\n",balance);
        display();
    }
    public void display() {
        //System.out.printf("현재 잔액은 %.2f원 입니다.\n\n",balance);
        System.out.printf("현재 잔액은 %.2f원 입니다.\n\n",getBalance());
    }
    public double getBalance(){
        return balance;
    }
}

public class Class06 {
    public static void main(String[] args) {
        Account a = new Account();
        //a.balance = 100000; <-- 에러: private 멤버는 클래스 외부에서 객체이름을 통한 접근 불가
        a.init(100000.0);
        a.withdraw(50000.0);
        a.deposit(200000.0);
        a.display();
        System.out.printf("현재 잔액은 %.2f원 입니다.\n\n",a.getBalance());
    }
}
