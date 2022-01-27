package userapp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);
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
                System.out.println("회원번호:" + dto.getData().get(i).getId());
                System.out.println("사용자 이름:" + dto.getData().get(i).getUsername());
                System.out.println("비밀번호:" + dto.getData().get(i).getPassword());
                System.out.println("이메일:" + dto.getData().get(i).getEmail());
                System.out.println("만든시기:" + dto.getData().get(i).getCreated());
                System.out.println("업데이트시기:" + dto.getData().get(i).getUpdated());

                System.out.println("=========");

            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류를 추적할 수 있는 로그를 콘솔에 보여줌 !
        }
    }

}
