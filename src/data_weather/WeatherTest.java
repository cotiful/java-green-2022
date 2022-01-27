package data_weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class WeatherTest {
    public static void main(String[] args) {
        try {

            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=406lrJVRiqLfSp8HVHaLUY%2Bo3a%2F1DtuHUz%2Fs9waJGTnvPuodbdMnS9eCCmMQFvRJUakGRGcnSaYJtm27C8IcjQ%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date=20220126&base_time=1200&nx=57&ny=74");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String responseJson = br.readLine();
            // System.out.println(responseJson);
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);
            // System.out.println("다운 받은 아이템의 개수:" +
            // dto.getResponse().getBody().getTotalCount());
            String resultCode = dto.getResponse().getHeader().getResultCode();
            // System.out.println(resultCode);
            if (resultCode.equals(" 00")) {
                System.out.println("통신이 정상적으로 이루어지지 않습니다");
                return;
            }
            int totalCount = dto.getResponse().getBody().getTotalCount();
            if (totalCount == 0) {
                System.out.println("통신에 결과가 0건입니다.");
                return;
            }
            System.out.println("현재온도:" + dto.getResponse().getBody().getItems().getItem().get(3).getObsrValue());

        } catch (Exception e) {
        }

    }
}
