package ex22;

import java.util.ArrayList;

public class Collectionex01 {
    public static void main(String[] args) {
        ArrayList<String> datas = new ArrayList<String>(); // Arraylist 여러개의 데이터가 저장되는 제네릭 박스.
        datas.add("데이터1");
        datas.add("데이터2");
        datas.add("데이터3");
        datas.add("데이터4");

        datas.set(1, "data2"); // 특정한 위치에 있는 원소를 바꾸려면 set()메소드 사용.
        datas.remove(3);

        System.out.println(datas.get(0));
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));
        // System.out.println(datas.get(3));
    }

}
