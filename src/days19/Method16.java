package days19;

public class Method16 {
    public static void main(String[] args) {
        //오름차순 정렬 asc
        sort("asc",78,25,56,32,45,78,98);
        System.out.println();
        //내림차순 정렬 desc
        sort("desc",87,75,23,65,45,8,56,98,78,12);
    }

    //같은형의 개수가 정해지지 않은 전달인수와 다른 자료형의 전달인수가 동시에
    //전달되어야 한다면, 반드시 ... 으로 처리할 데이터들 보다 왼쪽에 위치시킴
    public static void sort(String s,int ... num){
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
            //for (int j=0; j<i; j++)로 하고
                // 오름차순:(num[i]<num[j])
                // 내림차순:(num[i]>num[j])
                if (s.equals("asc")) {
                    if (num[i] > num[j]) {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                } else {
                    if (num[i] < num[j]) {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
        }
        for (int i:num) System.out.printf("%d ",i);
    }
}
