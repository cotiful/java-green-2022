package userapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private int code; // 1은 성공, -1은 실패, 0은 데이터 없음!
    private String msg; // 실패의 원인.
    private List<User> data; // 같은 패키지에 있는건 import 할 필요 없다. list는 같은 패키지에 없기 때문에 import 해줘야 한다.

}
