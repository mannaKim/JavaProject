package days22;

//멤버 메서드의 오버로딩
class Sum {
    private int a;
    private int b;

    Sum (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a+b;
    }
    /*
    public int add(int c){
        return add()+c;
    }
    public int add(int c, int d){
        return add()+c+d;
    }
    */
    public int add(int ... c) {
        int tot=0;
        for (int i:c) tot+=i;
        return add()+tot;
    }
}

public class Class13 {
    public static void main(String[] args) {
        Sum s = new Sum(25,36);

        System.out.println("s.add()의 결과 : "+s.add());
        System.out.println("s.add(23)의 결과 : "+s.add(23));
        System.out.println("s.add(59,65)의 결과 : "+s.add(59,65));
        System.out.println("s.add(58,98,78,36,2)의 결과 : "+s.add(58,98,78,36,2));
    }
}
