package days11;

public class ControlOp_For15 {
    public static void main(String[] args) {
        //#으로 직각삼각형 만들기
        for(int i=1;i<=10; i++){
            for(int j=1;j<=10;j++){
                System.out.printf("#");
                if (j==i) break;
            }
            System.out.println();
        }
    }
}
