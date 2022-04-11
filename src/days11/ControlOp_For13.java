package days11;

public class ControlOp_For13 {
    public static void main(String[] args) {
        //중첩반복문

        int i,j;

        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                System.out.printf("(i=%d,j=%d) ",i,j);
            }
            System.out.printf("%d번째 i\n",i);
        }
    }
}
