package days14;

public class Array02 {
    public static void main(String[] args) {
        // 배열의 선언과 저장 공간 생성 방법

        // 1. 배열 변수의 선언 후, 실제 배열 공간을 할당 받는 방법
        int [] a1 = null;   //a1을 null 로 초기화
        System.out.println(a1);
            //int [] a1;
            //System.out.println(a1);  <--에러
        //주석의 명령에서 a1은 초기화되지 않았으므로 초기화 전까지 사용(출력 및 연산)이 불가능
        //즉, 변수를 null 로 초기화한 것도 아무것도 초기화하지 않은 것은 다름
        a1 = new int[4];

        // null != ""
        String s1=null;
        String s2="";
        System.out.println(s1+"\t"+s2);
        //----------------------------------------------------------------------


        // 2. 배열 변수의 선언과 배열의 생성을 동시에 진행
        int [] a2 = new int[4];

        // HEAP 메모리의 특징
        //배열은 HEAP 메모리에 new 연산자를 통해서 생성되며, new 에 의해서
        //HEAP 메모리에 생성되는 모든 영역은 0 또는 0.0, null 값으로 초기화 됨

        System.out.println(a1[0]+"\t"+a1[1]+"\t"+a1[2]+"\t"+a1[3]);
        System.out.println(a2[0]+"\t"+a2[1]+"\t"+a2[2]+"\t"+a2[3]);
        //double [] d = new double[5]; <-- 모두 0.0 으로 초기화
        //String [] s = new String[5]; <-- 모두 null 로 초기화
        //----------------------------------------------------------------------


        // 3. 배열을 생성하면서 임의의 값으로 초기화하는 방법
        //(1)
        //크기가 5인 배열을 생성하면서, 각 요소의 값을 1,2,3,4,5로 초기화하는 코드
        int [] a3 = new int[] {1,2,3,4,5};
        System.out.println(a3[0]+"\t"+a3[1]+"\t"+a3[2]+"\t"+a3[3]+"\t"+a3[4]);

        //(2)
        int [] a4 = {5,4,3,2,1};
        System.out.println(a4[0]+"\t"+a4[1]+"\t"+a4[2]+"\t"+a4[3]+"\t"+a4[4]);

        a4[0]=100;
        System.out.println(a3[0]+"\t"+a4[0]);
        //----------------------------------------------------------------------


        // 4. 배열 변수 a5, a6을 동시 선언
        int [] a5,a6;
        a5 = new int[3];
        a6 = new int[3];

        // 5. 배열 변수 a7, a8, 일반 int 형 변수 a9를 생성하는 코드
        int a7[],a8[],a9;
        a7=new int[3];
        a8=new int[3];
        a9=10;

    }
}
