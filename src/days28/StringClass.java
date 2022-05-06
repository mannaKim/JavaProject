package days28;

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
        System.out.println("1. "+s);
        //String 클래스는 Object 클래스에서 상속받은 toString()과 equals()가
        //자신에게 적합하게 오버라이딩 되어있다.

        // 2.
        //  한글자만을 하나의 데이터로 갖는 char 형 배열
        char [] c = {'H','e','l','l','o'};
        String s2 = new String(c); //배열주소를 초기값으로 문자열 구성
        System.out.println("2. "+s2);

        // 3.
        String n = "Hello";
        char c1=n.charAt(0);
        char c2=n.charAt(1); //괄호안에 정수값 번째의 글자를 얻음(0부터 시작)
        char c3=n.charAt(2);
        char c4=n.charAt(3);
        char c5=n.charAt(4);
        System.out.printf("3. %c%c%c%c%c\n",c1,c2,c3,c4,c5);

        // 4.
        String a1 = new String("ABCD");
        String a2 = new String("CCD");
        String a3 = new String("ABCD");
        System.out.println("4. a1.compareTo(a2) ? "+a1.compareTo(a2));
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
        System.out.println("\n5. "+s1);
        System.out.println("5. "+s);

        // 6.
        s = new String("abcdefg");
        boolean b = s.contains("bc");
        //괄호안의 문자열이 메서드 호출 객체가 갖고있는 문자열의 일부로
        //포함되어있다면 true 를 리런해주는 메서드
        //boolean b = new String("abcdefg").contains("bc");
        System.out.println("6. 문자열 "+s+"에는 \"bc\"가 포함되어 있다? : "+b);

        // 7.
        s = new String("Hello.txt");
        b = s.endsWith("txt");
        //메서드 호출 객체가 갖고 있는 문자열이 괄호안의 문자열로 끝나면 true 리턴
        System.out.printf("7. 문자열 %s는 \"txt\"로 끝난다? : %b\n",s,b);
        b = s.startsWith("Hell");
        System.out.printf("7. 문자열 %s는 \"Hell\"로 시작한다? : %b\n",s,b);
    }
}
