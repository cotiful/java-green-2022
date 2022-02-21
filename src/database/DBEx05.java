package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//prepareStatemnet 변수 바인딩 하기
public class DBEx05 {
    public static void login(String username, String password) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@13.124.112.253:1521:xe", "SCOTT1",
                    "TIGER1");
            String sql = "SELECT * deptno, dname, loc From dept"; // 변수 자리에 ?를 넣음
            PreparedStatement pstmt = conn.prepareStatement(sql); // 버퍼를 다는 것
            pstmt.executeQuery();
            ResultSet rs = pstmt.executeQuery();

            List<Dept> depts = new ArrayList<>();

            while (rs.next()) {
                Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
                depts.add(dept);
            }
            // for - each 문
            for (Dept d : depts) { // depts 와 Dept의 타입이 같아야한다. 왼쪽 : List<?> <= 에 들어가는 타입, 오른쪽: List , depts 사이즈에 있는
                                   // 만큼 넣겠다.
                System.out.println(d.getDeptno()); // System.out.println( depts.get(0).getDeptno());
                System.out.println(d.getDname());
                System.out.println(d.getLoc());
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
