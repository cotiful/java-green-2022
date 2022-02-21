package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBEx02 {
    public static void main(String[] args) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@13.124.112.253:1521:xe", "SCOTT1",
                    "TIGER1");
            System.out.println("DB연결완료");

            // 2.버퍼 달아서 통신(select * from emp)
            String sql = "SELECT deptno, dname, loc From dept"; // 끝에 ; 안달오됨!!
            PreparedStatement pstmt = conn.prepareStatement(sql); // 버퍼를 다는 것
            pstmt.executeQuery();// SELECT 할때 사용, 버퍼전송
            ResultSet rs = pstmt.executeQuery(); // 전송한 결과를 받아옴.

            while (rs.next()) {
                System.out.println("deptno:" + rs.getInt("deptno")); // 뒤에 값이 칼럼을 적어준다.
                System.out.println("dname:" + rs.getString("dname"));
                System.out.println("================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
