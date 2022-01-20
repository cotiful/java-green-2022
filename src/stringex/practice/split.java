package stringex.practice;

public class split {
    public static void main(String[] args) {
        String str = "A:B:C:D";
        String[] split = str.split(":"); // split는 배열을 이용한다.
        System.out.println(split[1]); // 배열 순서 까먹지 않기 !
    }

}
