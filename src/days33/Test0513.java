package days33;

import java.text.SimpleDateFormat;
import java.util.Date;

interface InterSuper1 {
    public abstract void interSuper1Method();
}
interface InterSuper2 {
    void interSuper2Method();
}
interface InterSub extends InterSuper1, InterSuper2 {
        void interSubMethod();
}
class ClassSub1 implements InterSuper1, InterSuper2 {
    @Override
    public void interSuper1Method() {
        System.out.println("interSuper1Method 메소드 실행");
    }
    @Override
    public void interSuper2Method() {
        System.out.println("interSuper2Method 메소드 실행");
    }
}
class ClassSub2 implements InterSub {
    @Override
    public void interSuper1Method() {
        System.out.println("interSuper1Method 메소드 실행");
    }
    @Override
    public void interSuper2Method() {
        System.out.println("interSuper2Method 메소드 실행");
    }
    @Override
    public void interSubMethod() {
        System.out.println("interSubMethod 메소드 실행");
    }
}

public class Test0513 {
    public static void main(String[] args) {
        ClassSub1 cs1 = new ClassSub1();
        ClassSub2 cs2 = new ClassSub2();
        test1(cs1);
        //test1(cs2);
        test2(cs1);
        test2(cs2);

        Date today = new Date();
        System.out.println(today);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
        String file_name = sdf.format(today)+".dat";
        System.out.println(file_name);

        }
    private static void test1(ClassSub1 cs1) {
    }
    private static void test2(InterSuper1 cs2) {
    }
}

