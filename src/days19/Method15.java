package days19;

public class Method15 {
    public static void main(String[] args) {
        // 전달인수 개수가 일정치 않아서 오버로딩으로 해결할 수 없을 때
        int c;
        c=max(50,60,80,60,54,60);
        System.out.println("입력 값 중 큰 값은 "+c+"입니다.");
        c=max(50,60,80,60,54,60,56,87,69);
        System.out.println("입력 값 중 큰 값은 "+c+"입니다.");
    }

    // 전달인수 개수가 정해지지 않을 때 매개변수 선언 : (자료형 ... 매개변수명)
    //전달되는 전달인수 개수만큼 배열이 생성되고, 그 배열에 전달인수가 저장됨
    public static int max(int ... a) { //배열명은 매개변수 a
        int max=a[0];
        for (int i=1;i<a.length;i++) {
            if (max<a[i]) max = a[i];
        }
        return max;
    }
}
