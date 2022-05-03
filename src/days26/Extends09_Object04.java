package days26;

// ☆☆equals 오버라이딩☆☆

class Human {
    private String name;
    private int age;
    public Human(String name, int age) {
        this.name = name; this.age = age;
    }
    public String toString() {
        String info ="name = "+this.name+", ";
        info+="age = "+this.age;
        return info;
    }
    public boolean equals(Object obj) {
        //s1.equals(s2) <-- this=s1, obj=s2

        // obj 는 부모클래스의 참조변수이므로, 자식클래스(Human)의 멤버변수인
        // name 과 age 에 접근이 불가능하다.

        //그러므로 부모레퍼런스에 자식인스턴스를 저장할 수 있다는 성질 이용해야 한다.

        // 전달된 obj 가 어떤 인스턴스를 갖고있는지 모르기때문에,
        // instanceof 를 이용해 형변환이 가능한지 확인한다.
        if(!(obj instanceof Human)) return false;
        // 매개변수로 Human 이 아닌 클래스의 객체가 전달되었으면,
        // 바로 false 를 return

        Human target = (Human)obj;
        boolean flag_name = this.name.equals(target.name);
        boolean flag_age = this.age==target.age;
        return flag_name && flag_age;
    }
}

public class Extends09_Object04 {
    public static void main(String[] args) {
        Human s1 = new Human("홍길동",21);
        Human s2 = new Human("홍길동",21);
        Human s3 = new Human("홍길서",22);
        System.out.println("s1의 정보 : "+s1);
        System.out.println("s2의 정보 : "+s2);
        System.out.println("s3의 정보 : "+s3);

        if (s1==s2) System.out.println("s1과 s2 값은 같다.(==)");
        else System.out.println("s1과 s2 값은 다르다.(==)");

        if (s1.equals(s2)) System.out.println("s1과 s2 값은 같다.(equals)");
        else System.out.println("s1과 s2 값은 다르다.(equals)");
    }
}
