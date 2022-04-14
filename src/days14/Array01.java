package days14;

public class Array01 {
    public static void main(String[] args) {
        //변수의 단점 : 한 변수에 하나의 값만 저장할 수 있음

        // 배열
        //동일한 변수이름에 번호(첨자)를 붙여서 다수의 데이터를 한번에 저장
            //1. 다수의 변수를 같은 이름으로 손쉽게 선언하여 사용 가능
            //2. 하나의 이름으로 다수의 변수들을 제어할 수 있음

        //배열 선언법 : 자료형 [] 배열명
        int [] a;   //a라는 int 형 배열 선언
                    //a는 heap 주소를 저장하는 참조변수
                    //참조변수(레퍼런스 변수)생성 - 배열의 이름이 되는 변수를 생성

        //참조변수는 메모리(주기억장치:RAM) 내부의 공간중 HEAP(힙)이라는 영역안에 실제 데이터가
        //저장된 곳을 지정하고 그곳의 위치정보(주소,번지,address)를 저장하는 변수
        //(일반적인 변수들은 STACK(스택)에 저장됨)

        //참조값==레퍼런스값==주소값==어드레스값
        //참조변수(레퍼런스변수)는 참조값을 저장하는 변수
        //a=123; <-- 에러:a는 정수를 저장하는 변수가 아니고, 정수가 저장된 곳의 주소를 저장하는 변수이기 때문

        //현재는 배열에 정수를 몇 개 저장할 수 있는지 개수와 메모리가 정해지지 않은 상태(배열의 선언만 한 상태)
        //배열을 사용하기 전에 저장할 수 있는 개수와 메모리주소를 반드시 정해놓고 사용
        a=new int[3];  //int 3개를 저장하기 위해 할당된 메모리 주소를 a에 저장

        //new int[3] : HEAP 영역에 새로운 공간을 확보하라는 명령 - 정수 3개가 저장될 공간
        //new 연산자 : 동적인 메모리를 생성하는 연산자
        //            프로그램의 구동중에 HEAP 메모리에 공간을 생성하는 연산자로,
        //            생성된 메모리의 참조(주소)값을 반환 전달한다.
        //즉, a=new int[3]; <-- HEAP 메모리에 12Byte(4B*3) 공간을 생성하고, 해당 주소를 a 배열 참조변수에 대입 저장하라는 명령

        //배열 선언과 메모리 할당을 한번에
        int [] b = new int[3];

        //-------------------------------------------------------------------------------------------------------
        //배열의 각 공간에 값을 대입하는 방법 : 배열명[인덱스]=값
            //인덱스(첨자) 사용
            //배열의 인덱스(첨자) : 시작은 0, 끝은 배열크기-1
        a[0]=10;  //배열의 1번째 요소에 값을 대입
        a[1]=20;  //배열의 2번째 요소에 값을 대입
        a[2]=30;  //배열의 3번째 요소에 값을 대입

        int i=0;
        b[i]=40; //인덱스에 해당하는 부분이 변수와 변수의 연산이어도 사용 가능
        i=1;
        b[i]=50;
        b[i+1]=60;

        System.out.println("a[0]="+a[0]);
        System.out.println("a[1]="+a[1]);
        System.out.println("a[2]="+a[2]);
        System.out.println("b[0]="+b[0]);
        System.out.println("b[1]="+b[1]);
        System.out.println("b[2]="+b[2]);


    }
}
