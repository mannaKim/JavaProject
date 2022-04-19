package days17;

public class Method06 {
    public static void main(String[] args) {
        int [] a = {111,222,333};

        System.out.println("main 에서 출력 : ");
        for (int i=0;i<a.length;i++){
            System.out.printf("a[%d]=%d\t",i,a[i]);
        }

        updateValue(a); //전달인수로 참조값(주소값)을 전달

        System.out.println("\n\nmain 에서 출력 : ");
        for (int i=0;i<a.length;i++){
            System.out.printf("a[%d]=%d\t",i,a[i]);
        }

    }
    //int [] b <-- 전달인수로 주소(참조값)가 전달되므로,
    //             매개변수도 주소를 저장할 참조변수가 있어야 정상 실행됨
    public static void updateValue(int [] b){
        b[0]=100; b[1]=200; b[2]=300;
        System.out.println("\n\nupdateValue 에서 출력 : ");
        for (int i=0;i<b.length;i++){
            System.out.printf("b[%d]=%d\t",i,b[i]);
        }
    }
    // 메서드의 매개변수로 참조변수 값(주소값)을 넘겨주는 방식
    // (배열이름변수, String 참조변수, Class 참조변수 등)
    //호출된 메서드에서 참조값을 사용해 값을 변경하게 되면 호출한 곳이 가리키는 곳의
    //메모리에 직접 반영되어 값이 바뀌게 됨. <-- Call by Reference

}
