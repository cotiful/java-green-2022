package ex10;

import java.util.ArrayList;
import java.util.List;

public class Bubble {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(2);

        // System.out.println(list.get(2)); 출력, get을 해야 원하는 값 받음.
        int tmp;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
        System.out.println(list);
    }
}
