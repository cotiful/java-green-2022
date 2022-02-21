package hospital;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import hospital.HospitalDto.Response.Body.Items.Item;

public class HospitalDownload {

        public static List<Item> Download() {
                Integer totalCount = DownloadTotalCount.totalDownload();

                try {
                        URL url = new URL(
                                        "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows="
                                                        + totalCount + "+&_type=json");

                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        BufferedReader br = new BufferedReader(
                                        new InputStreamReader(conn.getInputStream()));

                        String responseJson = br.readLine();
                        Gson gson = new Gson();
                        HospitalDto responseDto = gson.fromJson(responseJson, HospitalDto.class);
                        List<Item> result = responseDto.getResponse().getBody().getItems().getItem();
                        return result;

                } catch (Exception e) {
                        e.printStackTrace();
                }
                return null;
        }
}
