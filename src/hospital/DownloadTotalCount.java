package hospital;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

public class DownloadTotalCount {
    public static Integer totalDownload() {
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            HospitalDto responseDto = gson.fromJson(responseJson, HospitalDto.class);
            Integer result = responseDto.getResponse().getBody().getTotalCount();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
