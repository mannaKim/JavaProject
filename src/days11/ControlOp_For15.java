package days11;

public class ControlOp_For15 {
    public static void main(String[] args) {
        //#으로 직각삼각형 만들기
        for(int i=1;i<=10; i++){
            for(int j=1;j<=i;j++){
                System.out.printf("#");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //#으로 직각삼각형 상하대칭 출력
        for(int i=1;i<=10; i++){
            for(int j=10;j>=i;j--){
                System.out.printf("#");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //#으로 직각삼각형 상하대칭의 좌우대칭 출력
        for(int i=1;i<=10; i++){
            for(int j=1;j<=10;j++){
                if(j>=i) System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //#으로 직각삼각형 좌우대칭 출력
        for(int i=1;i<=10; i++){    //i=10;i>=1;i--
            for(int j=10;j>=1;j--){ //j=1;j<=10;j++
                if(j<=i) System.out.printf("#"); //if(j>=i)
                else System.out.printf(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //#으로 이등변삼각형 만들기
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i+9;j++){
                if(j>=11-i)System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //#으로 마름모 만들기
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i+9;j++){
                if(j>=11-i)System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }
        for(int i=10;i>=1;i--){
            for(int j=1;j<=i+9;j++){
                if(j>=11-i)System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }

    }
}
