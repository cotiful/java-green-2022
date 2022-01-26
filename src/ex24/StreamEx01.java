package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 Stream이 연결된다.
        InputStream s = System.in;

        try {
            int n = s.read();
            System.out.println((char) n);
        } catch (IOException e) {
            System.out.println("에러");
        }
    }
}

// 단점 한자씩 받는다.문자로 바꿔주지도 않는다
