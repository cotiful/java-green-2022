package ex22;

import java.util.HashSet;
import java.util.Random;

public class CollectionEx04 {
    public static void main(String[] args) {

        Random r = new Random();
        // int n = r.nextInt(2); 2를 적으면 랜덤으로 0~1,
        HashSet<Integer> datas = new HashSet<Integer>();
        // for (int i = 0; i < 6; i++) {
        while (true) {
            int n = r.nextInt(45) + 1;
            System.out.println(n);

            datas.add(n);

            if (datas.size() == 6) {
                break;
            }

        }
    }
    // HashSet 값에 n값을 add해서 저장. 중복되는 값이 들어오면 for문 처럼 쓰면 안된다. 계속해서 돌려지기 때문에 그래서 while
    // 값으로,
}
