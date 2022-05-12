package days32;

import java.text.ParseException;

public class Exception03 {
    public static void main(String[] args) {

        ArithmeticException a = new ArithmeticException("ArithmeticException 고의발생");  //a : 예외(오류) 객체
        try {
            //ArithmeticException 강제 발생
            throw a; //:Exception in thread "main" java.lang.ArithmeticException: ArithmeticException 고의발생
        } catch(ArithmeticException e) {
            System.out.print("ArithmeticException - ");
            System.out.println("에러 메세지: "+e.getMessage());
        } catch(RuntimeException e) {
            System.out.print("RuntimeException - ");
            System.out.println("에러 메세지: "+e.getMessage());
        } catch(Exception e) {
            System.out.print("Exception - ");
            System.out.println("에러 메세지: "+e.getMessage());
        }

        RuntimeException b = new RuntimeException("RuntimeException 고의발생");  //b : 예외(오류) 객체
        try {
            throw b; //RuntimeException 강제 발생
        } catch(ArithmeticException e) {
            System.out.print("ArithmeticException - ");
            System.out.println("에러 메세지: "+e.getMessage());
        } catch(RuntimeException e) {
            System.out.print("RuntimeException - ");
            System.out.println("에러 메세지: "+e.getMessage());
        } catch(Exception e) {
            System.out.print("Exception - ");
            System.out.println("에러 메세지: "+e.getMessage());
        }

        ParseException c = new ParseException("ParseException 고의발생",0);  //c : 예외(오류) 객체
        try {
            throw c; //ParseException 강제 발생
        } catch(ArithmeticException e) {
            System.out.print("ArithmeticException - ");
            System.out.println("에러 메세지: "+e.getMessage());
        } catch(RuntimeException e) {
            System.out.print("RuntimeException - ");
            System.out.println("에러 메세지: "+e.getMessage());
        } catch(ParseException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.print("Exception - ");
            System.out.println("에러 메세지: "+e.getMessage());
        }

    }
}
