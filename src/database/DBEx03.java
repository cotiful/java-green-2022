package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//prepareStatemnet 변수 바인딩 하기
public class DBEx03 {
    public static void login(String username, String password) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@13.124.112.253:1521:xe", "SCOTT1",
                    "TIGER1");
            System.out.println("DB연결완료");

            // 2.버퍼 달아서 통신(select * from emp)
            String sql = "SELECT * From usertbl WHERE username = ? AND password = ?"; // 변수 자리에 ?를 넣음
            PreparedStatement pstmt = conn.prepareStatement(sql); // 버퍼를 다는 것

            // ?의 시작번지는 1이다.
            pstmt.setString(1, username); // 첫번 째 자리에 Username 을 넣음
            pstmt.setString(2, password); // ? 두번 째 자리에 password를 넣음
            pstmt.executeQuery();
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Session.isLogin = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        login("ssar", "1234");
        System.out.println(Session.isLogin);
    }
}
