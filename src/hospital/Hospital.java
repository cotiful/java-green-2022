package hospital;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Hospital {

    private String addr; // 주소
    private String mtStaDd; // 운영시작일자
    private String pcrPsblYn; // 구분코드
    private String ratPsblYn; // Rat가능여부
    private Integer recuClCd; // 요양종별코드
    private String rprtWorpClicFndtTgtYn; // 호흡기전담클리닉여부
    private String sgguCdNm; // 시군구명
    private String telno; // 전화번호부
    private String XPosWgs84; // 세계지구 x좌표
    private String YPosWgs84; // 세계지구 Y좌표
    private String yadmNm; // 요양기관명
    private String ykihoEnc; // 암호화된요양기호
}
