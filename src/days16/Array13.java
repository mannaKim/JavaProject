package days16;

public class Array13 {
    public static void main(String[] args) {
        // 2차원 배열은 각 행에 속한 열의 개수가 서로 다를 수 있음

        // 2차원 배열 변수 선언
        int [][] a;  //배열을 위한 참조변수만 생성한 상태

        // 각 1차원 배열들의 주소를 저장할 참조변수들의 배열을 만들어 주소 전달
        a = new int[3][];  //실제 데이터 저장 배열들을 아직 생성 전
                           //a[0],a[1],a[2] 주소만 생성

        // 3개의 참조 변수에 세 개의 1차원 배열을 생성하여 주소 전달
        a[0] = new int[3];
        a[1] = new int[5];
        a[2] = new int[2];

        int k=1;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=k++;
            }
        }
        for (int [] rowAddr : a){
            for (int colValue : rowAddr){
                System.out.printf("%d\t",colValue);
            }
            System.out.println();
        }

    }
}
