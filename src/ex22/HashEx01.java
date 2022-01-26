package ex22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashEx01 {
    public static void main(String[] args) {
        // 순차적으로 데이터 저장하고 싶을 때
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        System.out.println(arr1 + ":arr1이 출력됐습니다."); // ToString() 메서드가 호출됨.
        System.out.println(arr1.get(0) + ":add1이 출력됐습니다");
        Set<String> arr2 = new HashSet<>();
        arr2.add("안녕1");
        arr2.add("안녕2");
        arr2.add("안녕2");
        System.out.println(arr2 + ":arr2가 출력됐습니다.");

        // 3.키값으로 데이터를 검색하고 싶을 때
        Map<String, String> arr3 = new HashMap<>();
        arr3.put("name", "유승현");
        arr3.put("gender", "남");
        arr3.put("phone", "0103333");

        System.out.println(arr3.get("phone"));

        System.out.println(arr3.containsKey("gender")); // boolean 역할. 잘 안씀 쓸 떄 필요함
    }

}
