/**
 * package data_weather;
 * 
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
 * import java.net.HttpURLConnection;
 * import java.net.URL;
 * import java.util.HashMap;
 * import java.util.List;
 * import java.util.Map;
 * import com.google.gson.Gson;
 * import data_weather.WeatherDto.Response.Body.Items.Item;
 * 
 * public class WeatherDownload {
 * public static Map<String, String> getWeatherList() {
 * Map<String, String> WeatherMap = new HashMap<>(); // 키 값과 벨류값을 구분지어서 받도록 함, 키
 * 값을 적으면 벨류값을 줌.
 * try {
 * 
 * URL url = new URL(
 * "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=406lrJVRiqLfSp8HVHaLUY%2Bo3a%2F1DtuHUz%2Fs9waJGTnvPuodbdMnS9eCCmMQFvRJUakGRGcnSaYJtm27C8IcjQ%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date=20220126&base_time=1200&nx=57&ny=74");
 * 
 * HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // url로
 * 가져온 사이트와 연결 시켜줌.
 * BufferedReader br = new BufferedReader( // br에 읽어질 내용을 가져오게 만듦
 * new InputStreamReader(conn.getInputStream()));
 * String responseJson = br.readLine(); // 데이터가 버퍼를 넘어가면 읽게 만들어줌,
 * 
 * // 1. System.out.println(responseJson);
 * 
 * // 2번 자바 오브젝트로 변경
 * Gson gson = new Gson(); // 라이브러리로 json을 자바로 쉽게 바꿔줌
 * WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class); // Json의 파일을
 * 가져와서, 미리 만들어 논 DtO 에 맞게끔 자료가
 * // 들어가도록 함.
 * 
 * // System.out.println("다운받은 아이템 개수" +
 * // dto.getResponse().getBody().getTotalCount());
 * List<Item> result = dto.getResponse().getBody().getItems().getItem();
 * 
 * // String resultCode = dto.getResponse().getHeader().getResultCode();
 * // if(resultCode != "00"){
 * // return; 스택종료
 * // }
 * 
 * // 3. 현재온도
 * for (int i = 0; i < result.size(); i++) {
 * if ((result.get(i).getCategory()).equals("T1H"))
 * WeatherMap.put("온도", result.get(i).getObsrValue());
 * }
 * 
 * } catch (Exception e) {
 * System.out.println("오류발생" + e.getMessage());
 * }
 * return WeatherMap;
 * 
 * }
 * 
 * public static void main(String[] args) {
 * Map<String, String> weatherMap = WeatherDownload.getWeatherList();
 * System.out.println("광주광역시 광산구 현재시간기준 온도는 " + weatherMap.get("온도") + "도 입니다");
 * 
 * }
 * 
 * }
 */