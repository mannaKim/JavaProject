package days29;

//컬렉션 클래스 저장 방식
//모든 컬렉션 클래스들은 기본적으로 Object 타입을 저장/반환 할 수 있다.
//Object 타입을 매개변수로 사용하는 모든 컬렉션클래스들은 타입에 상관없이 저장 가능하다.
//하지만, 저장된 데이터를 반환 받는 과정에서 런타임 에러가 발생할 수 있다.
//Object -> 자식클래스의타입 : 강제형변환 필요

import java.util.ArrayList;

public class Collection02 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        //다양한 타입을 저장할 수 있는 컬렉션 클래스의 객체
        //ArrayList 클래스의 멤버 메서드 public void add(Object obj) { }
        //: add()의 매개변수는 Object
        a.add(10);
        a.add(1.1);
        a.add("Hi");
        Integer i0 = (Integer) a.get(0);
        //컬렉션 내부의 데이터를 추출하는 과정에서 일치하지 않는 타입으로 형변환이 일어나는 경우
        //런타임 에러가 발생되어 프로그램이 강제 종료
        //Integer i1 = (Integer)a.get(1); <-- 에러:형변환결과 자료형이 맞지 않음
        Double i2 = (Double) a.get(1);
        //String i2 = a.get(2); <-- 에러:강제형변환이 진행되지 않음
        String i3 = (String) a.get(2);

        //위와 같이 하나의 ArrayList 에 여러 자료형을 섞어서 저장하여 사용할 수 있다.
        //다만 자료형을 섞어서 저장하고 사용할 경우 위의 에러 내역과 같이
        //요소를 꺼내고, 형변환을 할 때 자료형이 맞지 않아 에러가 발생하거나 형변환을 하지 않아 에러 확율이 높아진다.
        //그래서 보통은 자료형을 하나로 통일해서 저장하는 형식을 사용하고,
        //규칙적으로 만들어 지정한 자료형이 저장되지 못하도록 사용하기도 한다.
        ArrayList<Integer> list = new ArrayList<Integer>();
        //!= ArrayList list = new ArrayList();

        list.add(100);
        //list.add("String"); <-- 에러:정수만 저장 가능
        //get()으로 자료를 꺼낼 때 강제형변환이 없어도 됨!
        Integer i = list.get(0);

        // 제네릭 문법
        //제네릭이 적용이 안된 상태로 동일한 이름의 클래스이지만
        //객체 생성 시점에 자료형을 지정하여 서로 다른 자료형을 지원하는 클래스를 생성할 수 있는
        //문법이다. (메서도 오버로딩과 유사한 문법)

        //제네릭 문법을 사용한 ArrayList 클래스의 객체 생성 예시
        //ArrayList<Integer> list = new ArrayList<Integer>();
        //new 다음의 클래스명에서는 제네릭 타입을 생략할 수 있음
        //ArrayList<Integer> list = new ArrayList<>();
        //list.add(100); Integer i = list.get(0)
    }
}

