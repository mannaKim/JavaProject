package days17;

// 메서드를 사용하는 두 번째 목적
//명령들의 단순 실행이 아닌 소정의 값을 연산하기 위한 명령들의 반복실행
//예 : 사각형의 넓이를 계산하는 메서드, 삼각형의 넓이를 계산하는 메서드,
//    성적표를 양식에 맞게 출력하는 메서드, 달력을 양식에 맞게 출력하는 메서드

// 두 번째 목적에 필요한 함수를 실행하기 위해 필요한 값들이 있음
//사각형의 넓이를 구할 시 밑변의 길이와 높이
//성적표 출력에는 점수
//달력은 년과 월 필요

// 두 번째 목적으로 함수를 만들려면 피요한 값들을 함수에 전달하고 실행되게 해야 함
//호출하는 곳에서 전달하는 값을 전달인수라고 부르고,
//메서드에서 전달된 값을 받아주는 변수를 매개변수락 부른다.

// 매개변수
//메서드 호출시 메서드가 필요로하는 데이터를 전달해줄 수 있는 매개역할의 변수
//메서드 호출시 괄호 안에 넣어주는 데이터 : 전달인수
//메서드의 몸체에서 괄호안에 위차하면서 전달된 값을 받아주는 변수 : 매개변수

public class Method02 {

    // 매개변수의 선언
    //public static void 메서드명(자료형 매개변수명, 자료형 매개변수명 ... ){
    //}
    //괄호 안에 변수를 선언하고 쓰는 형식
    //매개변수는 필요한 개수만큼 선언해서 사용할 수 있음

    public static void main(String[] args) {
                        //main 의 매개변수 : String[] args
                        //프로그램 실행명령과 함께 전달되는 값이 저장

        myPrint(100); //전달인수 100
        myPrintWith2Int(200,300); //전달인수 200, 300
        //전달인수는 반드시 매개변수의 자료형과 일치하는 자료를 전달해줘야 함.
        //다수의 값을 전달할 때는 자료형과 순서도 일치하게 전달해야 함.
        //매개변수 : abc(int x, double y), 전달인수 : abc(300.0, 500) <-- X
        //                               전달인수 : abc(300, 500.0) <-- O

    }

    public static void myPrint(int n) { //int n은 매개변수
        System.out.println("전달받은 매개변수의 값 n -> "+n);
        //함수 호출시에 전달인수로 넣어준 100이 매개변수 int n에 저장되고
        //그 변수는 myPrint 메서드 안에서 활용됨
        //(즉, n은 myPrint 에서만 사용이 가능한 지역변수)
    }
    public static void myPrintWith2Int(int n1, int n2){
        //매개변수가 두 개인 메서드
        //동일한 타입이라도 자료형의 생략은 허용되지 않음
        // (int n1,n2) <-- X, (int n1, int n2) <-- O
        System.out.println("전달받은 매개변수의 값 n1 -> "+n1+", n2 -> "+n2);
    }

}
