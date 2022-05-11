package days31;

abstract class Unit {
    //모든 캐릭터가 갖는 공통요소
    private int hp;     //현재 체력
    private int max_hp; //최대 체력
    Unit(int p) {
        max_hp = p;  //각 캐릭터마다 다른 전달값으로 최대체력과 현재체력 설정
        hp = (int)(p*0.8);
    }
    public abstract void move(int x, int y); /*{
        System.out.printf("x:%d,y:%d로 이동합니다.\n",x,y);
    }*/
    public void hp_recovery(int h) {
        hp+=h;
    }
}
class GroundUnit extends Unit { //GroundUnit 만의 특정요소
    GroundUnit(int p) {
        super(p);
    }
    @Override
    public void move(int x, int y) {
        System.out.printf("x:%d, y:%d로 뛰어갑니다.\n",x,y);
    }
}
class AirUnit extends Unit { //AirUnit 만의 특정요소
    AirUnit(int p) {
        super(p);
    }
    @Override
    public void move(int x, int y) {
        System.out.printf("x:%d, y:%d로 날아갑니다.\n",x,y);
    }
}
class Tank extends GroundUnit implements Repairable {
    Tank(){
        super(150);
        //max_hp=150; 불가능 max_hp 는 private 멤버변수이기 때문
    }
    public String toString() { return "Tank"; }
}
class DropShip extends AirUnit implements Repairable {
    DropShip(){ super(120); }
    public String toString() { return "DropShip"; }
}
class Marine extends GroundUnit {
    public Marine() { super(40); }
    public String toString() { return "Marine"; }
}
class SCV extends GroundUnit implements Repairable {
    public SCV() { super(40); }
    public String toString() { return "SCV"; }


    // public void repair(Tank t)
    // public void repair(DropShip d)
    // public void repair(SCV s)
    public void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit)r;
            hp_recovery(20);
        }
    }
}
interface Repairable { }

public class Interface03 {
    public static void main(String[] args) {
        Tank t = new Tank();
        DropShip d = new DropShip();
        Marine m = new Marine();
        SCV s1 = new SCV();

        s1.repair(t);
        s1.repair(d);
        //s1.repair(m); <-- 치료불가!
    }
}
