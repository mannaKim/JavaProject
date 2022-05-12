package days32;

import java.io.File;
import java.io.IOException;

public class Exception07 {

    static int cnt=0;

    public static void main(String[] args) {
        File f1 = createFile("");
        File f2 = createFile("abc.txt");
        File f3 = createFile("");
    }

    public static File createFile(String fileName) {
        File f = null;

        //전달받은 파일 이름을 이용하여 파일을 생성 후 파일 객체를 리턴한다.
        try {
            if(fileName==null || fileName.equals(""))
                throw new IOException("파일 이름이 유효하지 않습니다."); //<-- 일부러 예외 만들기
        } catch (IOException e) {
            fileName="제목없음"+ ++cnt + ".txt";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //예외가 생겼든 안생겼든 실행되는 영역
            f = new File(fileName);
            try {
                f.createNewFile(); //파일이 저장장치에 실제로 생성된다. 예외처리 발생
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return f;
    }
}
