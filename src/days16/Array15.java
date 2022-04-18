package days16;

public class Array15 {
    public static void main(String[] args) {
        // 1차원 배열의 복사
        int [] a = {1,2,3,4,5};
        int [] b;

        b=a;

        for(int k:a) System.out.printf("%d ",k);
        System.out.println();
        for(int k:b) System.out.printf("%d ",k);
        System.out.println("\n");

        a[2]=100;

        for(int k:a) System.out.printf("%d ",k);
        System.out.println();
        for(int k:b) System.out.printf("%d ",k);
        System.out.println("\n");
        //b=a는 b에 a가 가리키는 주소를 넣은 것이므로
        //(ex: a==1000번지 --> b=a --> b==1000번지)
        //값을 복사한 것이 아니라 하나의 배열을 공유한 것이라 할 수 있음

        //레퍼런스 변수간의 값의 복사로는 배열의 복사까지 이루어지지 않는다.
        //위의 동작 b=a;는 a가 갖고있는 참조값(주소)를 b 변수에 복사한 것이므로
        //배열공간은 하나, 그 배열 주소를 저장한 변수는 두 개로 설정한 것과 같다.
        //따라서 a[2]값 변경은 b[2]값 변경과 같다.

        // 배열 복사 방법#1
        // : 새로운 공간을 new 로 만들고 각 요소를 일일이 복사
        b=new int[5];
        for (int i=0; i<a.length; i++)
            b[i]=a[i];

        a[4]=300;

        for(int k:a) System.out.printf("%d ",k);
        System.out.println();
        for(int k:b) System.out.printf("%d ",k);
        System.out.println("\n");

        // 배열 복사 방법#2
        // : clone 메소드 사용. 배열명.clone()
        int [] c = a.clone();   //c는 a 배열이 복제된 배열을 참조하는 변수
        //해당 배열변수가 참조하고 있는 장소의 배열을 새로운 공간에 복제
        //힙 영역에 배열의 복사본을 새로 만들고 그 주소를 전달

        a[1]=200;

        for(int k:a) System.out.printf("%d ",k);
        System.out.println();
        for(int k:c) System.out.printf("%d ",k);
        System.out.println("\n");

        // 2차원 배열의 복사
        //이차원배열(다차원배열)은 clone 메소드의 결과로 실제 일차원 배열을
        //관리하고 있는 참조변수들의 배열만 복사
        int [][] d = {{1,2,3},{4,5,6}};
        int [][] e = d.clone();

        d[1][2]=500;

        for(int i=0; i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.printf("%d\t",d[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------");
        for (int[] ints : e) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }
        System.out.println();

        // 2차원 배열은 새로 공간 생성 후 각각의 값을 다시 복사해야 완벽한 복사가 실행됨.
        int [][] f = new int[d.length][d[0].length];
        for(int i=0; i<d.length;i++){
            for(int j=0;j<d[i].length;j++)
                f[i][j]=d[i][j];
        }

        d[0][2]=1000;

        for(int i=0; i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.printf("%d\t",d[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------");
        for (int[] ints : f) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }


    }
}
