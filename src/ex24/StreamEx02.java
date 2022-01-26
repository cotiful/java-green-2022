package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        // 한자리의 숫자를 받을 수 있다.
        InputStream in = System.in;
        // 고정된 길이의 문자를 받을 수 있다.
        InputStreamReader ir = new InputStreamReader(in);

        char[] data = new char[3];
        try {
            ir.read(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
// inputStream과 InputStremaReader의 단점만 블로그에 작성해놓자
// 문자로 바꿔준다. 하지만 고정된 길이를 받는다.
