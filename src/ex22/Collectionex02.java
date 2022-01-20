package ex22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collectionex02 {
    public static void main(String[] args) {
        Set<Integer> datas = new HashSet<>(); // 래퍼클래스 , set으로 해줘야 while 구문 datas.iterator 를 가져올 수 있음
        datas.add(10);
        datas.add(20);
        datas.add(20);
        datas.add(30);
        datas.add(40);

        datas.remove(10);

        System.out.println(datas.size()); // 동일한 값이 들어가서 size가 2임...
        System.out.println(datas);

        Iterator<Integer> its = datas.iterator();
        while (its.hasNext()) // boolean 타입이라서 true, false로 계속해서 뽑아 낼 수 있음. t
        {
            System.out.println(its);

        }
    }

}
