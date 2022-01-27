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
            // System.out.println(responseJson); // 한 번에 보여졌기 때문에 while 구문을 돌릴 필요 없다.
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            System.out.println(dto.getCode());

            // for (int i = dto.getData().size() - 1; i >= 0; i--) { // for 문을 거꾸로 도는 방법!!
            // System.out.println("회원번호:" + dto.getData().get(i).getId());
            // System.out.println("콘텐트:" + dto.getData().get(i).getContent());
            // System.out.println("타이틀:" + dto.getData().get(i).getTitle());

            System.out.println("=========");

            // }
        } catch (Exception e) {
            // e.printStackTrace();
        }

    }
}