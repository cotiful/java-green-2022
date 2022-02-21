package hospital;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class HospitalDto {
    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private String addr;
                    private String mtStaDd;
                    private String pcrPsblYn;
                    private String ratPsblYn;
                    private Integer recuClCd;
                    private String rprtWorpClicFndtTgtYn;
                    private String sgguCdNm;
                    private String telno;
                    private String XPosWgs84;
                    private String YPosWgs84;
                    private String yadmNm;
                    private String ykihoEnc;

                }
            }

            private Integer numOfRows;
            private Integer pageNo;
            private Integer totalCount;
        }
    }

}
