package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // User(int id, String username, string password, string email) ~ 넣어줌! String ->
                    // char로 바꾸고 싶어도
// 수정해줄 필요 없이 편안하게 사용 가능
@Data // Getter, Setter, Tostring 자동생성
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;

}
