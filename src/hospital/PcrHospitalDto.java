package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hospital.HospitalDto.Response.Body.Items.Item;

public class PcrHospitalDto {

    public static void main(String[] args) {
        // 통신이니까 try-catch
        try {
            // 1. connection 연결(세션생성) port, ip, id, password, protocol★
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@13.124.112.253:1521:xe", "SCOTT1",
                    "TIGER1");
            System.out.println("DB 연결완료");
            List<Item> items = HospitalDownload.Download(); // api에서 가져온 아이템들 리스트 ,내용들 들어가 있음
            List<Hospital> hospitalList = new ArrayList<>(); // 자바에서 db로 넘겨주기 위해서 필요한 리스트 아직 아무것도 안 들어가 있음

            // sql에 넣기 위해 칼럼에 맞게 작성
            String sql = "INSERT INTO hospital(addr, mtstadd, pcrpsblyn, ratpsblyn,RECUCLCD,RPRTWORPCLICFNDTTGTYN,SGGUCDNM,TELNO,XPOSWGS84,YPOSWGS84,YADMNM,YKIHOENC) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            // 버퍼를 달아서 통신 준비
            PreparedStatement pstmt = conn.prepareStatement(sql);
            // 버퍼를 달아서 준비가 돼있지만 hospitalList에 데이터가 없는 상태(?)
            // pstmt.setString(); // 칼럼에 맞게 데이터 넣어줘야함!
            ResultSet rs = pstmt.executeQuery(); // SELECT

            System.out.println(rs.next()); // 커서 한 칸 내리기

            while (rs.next()) {
                System.out.println("empno : " + rs.getInt("empno")); // getInt("컬럼명")
                System.out.println("ename : " + rs.getString("ename"));
                System.out.println("================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}