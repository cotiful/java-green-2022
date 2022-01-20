package stringex.practice;

public class trim {
    public static void main(String[] args) {

        String str = "  java java java   "; // 앞뒤 공백을 없애줌, 가운데 공백은 안 없애줌!!
        String trim = str.trim();
        System.out.println(trim);
    }

}
