package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//sql injection
public class DBEx04 {
    public static void login(String username, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@13.124.112.253:1521:xe", "SCOTT1",
                    "TIGER1");
            System.out.println("DB연결완료");
            String sql = "SELECT * From usertbl WHERE username = " + username + " AND password = " + password;
            Statement pstmt = conn.createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

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
