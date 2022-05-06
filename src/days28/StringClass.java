package days28;

import java.util.Date;

public class StringClass {
    public static void main(String[] args) {
        // 0.
        //  가용한 HEAP 공간에 "Hello"를 저장하고 그 주소를 s에 전달
        String s = "Hello";
        String s1 = "Hello";
        //이미 저장된 "Hello"가 있다면 그 주소를 전달하여 s1에 저장한다.
        System.out.println("0. "+s);
        //단점 : 같은 문자열 "Hello"를 다른 변수에 저장하려 한다면, 새로운 공간이 할당되지 않는다.

        // 1.
        //  new 에 의해 새로운 HEAP 공간에 "Hello"를 저장, 그 주소를 s에 전달
        s = new String("Hello");
        s1 = new String("Hello");
        //new 에 의해 새로운 HEAP 공간에 "Hello"를 저장, 그 주소를 s1에 전달
        System.out.println("\n1. "+s);
        //String 클래스는 Object 클래스에서 상속받은 toString()과 equals()가
        //자신에게 적합하게 오버라이딩 되어있다.

        // 2.
        //  한글자만을 하나의 데이터로 갖는 char 형 배열
        char [] c = {'H','e','l','l','o'};
        String s2 = new String(c); //배열주소를 초기값으로 문자열 구성
        System.out.println("\n2. "+s2);

        // 3.
        String n = "Hello";
        char c1=n.charAt(0);
        char c2=n.charAt(1); //괄호안에 정수값 번째의 글자를 얻음(0부터 시작)
        char c3=n.charAt(2);
        char c4=n.charAt(3);
        char c5=n.charAt(4);
        System.out.printf("\n3. %c%c%c%c%c\n",c1,c2,c3,c4,c5);

        // 4.
        String a1 = new String("ABCD");
        String a2 = new String("CCD");
        String a3 = new String("ABCD");
        System.out.println("\n4. a1.compareTo(a2) ? "+a1.compareTo(a2));
        System.out.println("4. a2.compareTo(a3) ? "+a2.compareTo(a3));
        System.out.println("4. a1.compareTo(a3) ? "+a1.compareTo(a3));
        //첫글자부터 차례로 같은 자리의 글자와 비교
        //크기를 결정하는 방법은 비교되는 두글자들의 뺄셈을 연산하여,
        //결과가 음수이면 두번째 글자가 크다고 하고, 양수이면 앞쪽 글자가 크다고 한다.
        //ex) 'A' - 'B' => -1 : B가 더 크다
        //앞쪽부터 비교해서 같은 글자는 지나치는 방식으로 크기가 결정되면 뒤 글자들은 비교하지 않는다.

        String [] k = {"korea","japan","canada","china","kenya","jamaica"};
        // k 배열의 내용들을 알파벳 오름차순으로 정렬 후 출력
        for (int i=1; i<k.length; i++){
            for (int j=0;j<i;j++) {
                String temp;
                if (k[i].compareTo(k[j])<0) {
                    temp=k[i]; k[i]=k[j]; k[j]=temp;
                }
            }
        }
        /* ==
        for (int i=0; i<k.length; i++){
            for (int j=i+1;j<k.length;j++) {
                String temp;
                if (k[i].compareTo(k[j])>0) {
                    temp=k[i]; k[i]=k[j]; k[j]=temp;
                }
            }
        }
         */
        System.out.print("정렬 : ");
        for (String i : k) System.out.printf("%s ",i);

        // 5.
        s1=s.concat(" World"); //s:Hello
        //s.concat(" World")은 원본 s에 있는 문자열에 World 를 이어 붙이고
        //새로운 문자열 객체를 만들어 새로운 레퍼런스 변수에 저장할 수 있게 리턴해준다.
        //(s는 업데이트되지 않고, 원본이 보호되고 있음)
        System.out.println("\n\n5. "+s1);
        System.out.println("5. "+s);

        // 6.
        s = new String("abcdefg");
        boolean b = s.contains("bc");
        //괄호안의 문자열이 메서드 호출 객체가 갖고있는 문자열의 일부로
        //포함되어있다면 true 를 리런해주는 메서드
        //boolean b = new String("abcdefg").contains("bc");
        System.out.println("\n6. 문자열 "+s+"에는 \"bc\"가 포함되어 있다? : "+b);

        // 7.
        s = new String("Hello.txt");
        b = s.endsWith("txt");
        //메서드 호출 객체가 갖고 있는 문자열이 괄호안의 문자열로 끝나면 true 리턴
        System.out.printf("\n7. 문자열 %s는 \"txt\"로 끝난다? : %b\n",s,b);
        b = s.startsWith("Hell");
        System.out.printf("7. 문자열 %s는 \"Hell\"로 시작한다? : %b\n",s,b);

        // 8.
        s = "Hello";
        System.out.println("\n8. "+s+"+는 \"Hello\"와 같다 ? "+s.equals("Hello"));
        System.out.println("8. "+s+"+는 \"hello\"와 같다 ? "+s.equals("hello"));
        //대소문자를 구분하지 않고 비교
        System.out.println("8. "+s+"+는 \"Hello\"와 같다 ? "+s.equalsIgnoreCase("Hello"));
        System.out.println("8. "+s+"+는 \"hello\"와 같다 ? "+s.equalsIgnoreCase("hello"));

        // 9.
        System.out.printf("\n9. %s의 문자중 \'o\'의 위치 %d\n",s,s.indexOf('o'));
        System.out.printf("9. %s의 문자중 \'k\'의 위치 %d\n",s,s.indexOf('k'));
        //메서드 호출 객체의 문자열중에 괄호안에 있는 문자가 몇번째로 위치하는지 반환
        //있으면 위치인덱스(0부터), 없으면 -1
        System.out.printf("9. %s s.indexOf(\'e\',1) -> %d\n",s,s.indexOf('e',1));
        System.out.printf("9. %s s.indexOf(\'o\',3) -> %d\n",s,s.indexOf('o',3));
        System.out.printf("9. %s s.indexOf(\'e\',2) -> %d\n",s,s.indexOf('e',2));
        //찾고자하는 문자가 지정한 정수(0부터시작)번째부터 시작해서 몇번째 글자로
        //위치하는지를 구해준다
        //첫번째 사용 예 : 알파벳 e가 문자열 s의 0번째 부터 찾아서 전체 글자의 몇번째 글자인지 구함
        //세번째 사용 예 : 알파벳 e가 문자열 s의 2번째부터 찾아서 몇번째 글자인지 구함 없으므로 -1 리턴

        // 10.
        System.out.printf("\n10. %s s.replace(\'H\',\'C\') -> %s\n",s,s.replace('H','C'));
        s2=s.replace('H','C');
        System.out.printf("10. %s %s\n",s,s2);
        System.out.printf("10. %s s.replace(\'ll\',\'LL\') -> %s\n",s,s.replace("ll","LL"));
        s2=s.replace("ll","LL");
        System.out.printf("10. %s %s\n",s,s2);
        //String 클래스는 보관하고 있는 문자열을 이용하여 변화를 주는 메서드들에서
        //변화된 내용이 업데이트되듯 저장되는 것이 아니고 대부분 새로운 변화된 문자열 객체로
        //만들어 리턴한다. 다른 메서드와 마찬가지로 원본이 보호됨
        //따라서 다양한 메서드들이 있지만 실행결과가 원본 s 문자열을 변경시키지는 못한다.

        // 11.
        String animal = "dog-cat-bear";
        String [] a = animal.split("-");
        //'-'를 기준으로 문자열을 분리하고 배열로 만듦
        System.out.print("\n11. "+animal+" -> ");
        for (int i=0;i<a.length;i++) System.out.printf("%s ",a[i]);

        // 12.
        s = "java.lang.Object";
        s2 = s.substring(5,9);
        //원본 문자열에서 5번째 글자부터 8번째 까지 추출
        //인덱스는 0번부터 시작
        System.out.println("\n\n12. "+s2);
        s2 =s.substring(10); //원본에서 열번째글자부터 끝까지 추출
        System.out.println("12. "+s2);

        // 13.
        System.out.println("\n13. "+String.valueOf(true));
        s=String.valueOf("13. "+100);
        System.out.println(s);
        s=String.valueOf(100.123);
        System.out.println("13. "+s);
        Date dd = new Date(); //java.util.Date
        //== java.util.Date dd = new java.util.Date();
        s=String.valueOf(dd);
        System.out.println("13. "+s);
    }
}
