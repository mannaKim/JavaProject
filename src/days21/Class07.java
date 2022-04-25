package days21;

//멤버메서드는 멤버변수의 값을 저장하거나 얻어오려는 목적이 크다.
//때문에 특정멤버메서드(저장하고 얻어오는 메서드)를 별도의 사유가 없어도
//멤버변수에 따라 필요한 만큼 만들고 시작하는 경우가 많다.
//setter 와 getter 라는 이름을 사용하는 두 개의 메서드

class GetSetTest {
    private int intVar;
    private double doubleVar;
    private String stringVar;

    public int getIntVar() {
        return intVar;
    }
    public void setIntVar(int intVar) {
        this.intVar = intVar;
        //멤버변수와 매개변수의 이름이 동일한 경우 멤버변수에 this.을 붙여 구분
    }

    public double getDoubleVar() {
        return doubleVar;
    }
    public void setDoubleVar(double doubleVar) {
        this.doubleVar = doubleVar;
    }

    public String getStringVar() {
        return stringVar;
    }
    public void setStringVar(String stringVar) {
        this.stringVar = stringVar;
    }

    //getter 와 setter 의 자동 생성
    /*
    이클립스
    1. 현위치에서 마우스의 오른쪽 버튼 클릭
    2. Source 메뉴 선택
    3. Generate Getter and Setter 선택
    4. selectAll 클릭
    5. Generate 클릭

    인텔리제이
    1. 현위치에서 마우스의 오른쪽 버튼 클릭
    2. Generate 메뉴 선택
    3. Getter and Setter 선택
     */

}

public class Class07 {
    public static void main(String[] args) {
        GetSetTest gs = new GetSetTest();
        gs.setIntVar(123);
        System.out.println("멤버변수 intVal : "+gs.getIntVar());
    }
}
