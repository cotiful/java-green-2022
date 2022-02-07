package corona;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;

import corona.CoronaDto.Response;
import postapp.ResponseDto;

public class CoronaDownload {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&startCreateDt=20220110&endCreateDt=20220115&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            CoronaDto dto = gson.fromJson(responseJson, CoronaDto.class);

            String resultCode = dto.getResponse().getBody().getItems().getItem().get(5).getDecideCnt();
            String resultCode_1 = dto.getResponse().getBody().getItems().getItem().get(5).getStateDt();
            System.out.println(resultCode_1 + "시작일" + "총확진자수=" + resultCode);
            String resultCode2 = dto.getResponse().getBody().getItems().getItem().get(0).getDecideCnt();
            String resultCode2_1 = dto.getResponse().getBody().getItems().getItem().get(0).getStateDt();
            System.out.println(resultCode2_1 + "종료일" + "총확진자수=" + resultCode2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
