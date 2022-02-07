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

            String resultAcc = dto.getResponse().getBody().getItems().getItem().get(5).getAccExamCnt();
            String resultCre = dto.getResponse().getBody().getItems().getItem().get(5).getCreateDt();
            String resultDeath = dto.getResponse().getBody().getItems().getItem().get(5).getDeathCnt();
            String resultDeci = dto.getResponse().getBody().getItems().getItem().get(5).getDecideCnt();
            String resultSeq = dto.getResponse().getBody().getItems().getItem().get(5).getSeq();
            String resultStatedt = dto.getResponse().getBody().getItems().getItem().get(5).getStateDt();
            String resultTime = dto.getResponse().getBody().getItems().getItem().get(5).getStateTime();
            String resultUpdate = dto.getResponse().getBody().getItems().getItem().get(5).getUpdateDt();

            System.out.println("1월 10일 시작일");
            System.out.println("누적 의심신고 검사자=" + resultAcc);
            System.out.println("등록일시분초=" + resultCre);
            System.out.println("사망자 수=" + resultDeath);
            System.out.println("확진자 수=" + resultDeci);
            System.out.println("감염현황 고유값=" + resultSeq);
            System.out.println("기준일=" + resultStatedt);
            System.out.println("기준시간=" + resultTime);
            System.out.println("수정일시분초=" + resultUpdate);
            String resultAcc1 = dto.getResponse().getBody().getItems().getItem().get(0).getAccExamCnt();
            String resultCre1 = dto.getResponse().getBody().getItems().getItem().get(0).getCreateDt();
            String resultDeath1 = dto.getResponse().getBody().getItems().getItem().get(0).getDeathCnt();
            String resultDeci1 = dto.getResponse().getBody().getItems().getItem().get(0).getDecideCnt();
            String resultSeq1 = dto.getResponse().getBody().getItems().getItem().get(0).getSeq();
            String resultStatedt1 = dto.getResponse().getBody().getItems().getItem().get(0).getStateDt();
            String resultTime1 = dto.getResponse().getBody().getItems().getItem().get(0).getStateTime();
            String resultUpdate1 = dto.getResponse().getBody().getItems().getItem().get(0).getUpdateDt();

            System.out.println("==============");
            System.out.println("1월 15일 종료일");
            System.out.println("누적 의심신고 검사자=" + resultAcc1);
            System.out.println("등록일시분초=" + resultCre1);
            System.out.println("사망자 수=" + resultDeath1);
            System.out.println("확진자 수=" + resultDeci1);
            System.out.println("감염현황 고유값=" + resultSeq1);
            System.out.println("기준일=" + resultStatedt1);
            System.out.println("기준시간=" + resultTime1);
            System.out.println("수정일시분초=" + resultUpdate1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
