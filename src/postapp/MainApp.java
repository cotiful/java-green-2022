package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String s1 = "http://lalacoding.site/init/post";
            URL url = new URL(s1);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream())); //
            String responseJson = br.readLine();
            // System.out.println(responseJson); 한 번에 보여졌기 때문에 while 구문을 돌릴 필요 없다.
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 1. 통신 검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패:" + dto.getMsg());
                return; // 원래있던 큐로 돌아가는걸 의미. 원래 호출 했던 큐로 돌아가는 거다.
            }

            // 2. 프로그램 만들기

            // (1)화면에 회원정보를 출력하겠다.for문 사용!
            // System.out.println(dto.getData().size()); 데이터사이즈 확인 해주기. 19번 도는걸 알 수 있음.
            // 19바퀴면 0부터 18까지,
            for (int i = dto.getData().size() - 1; i >= 0; i--) { // for 문을 거꾸로 도는 방법!!
                System.out.println("회원번호:" + dto.getData().get(1));

                System.out.println("=========");

            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류를 추적할 수 있는 로그를 콘솔에 보여줌 !
        }
    }

}