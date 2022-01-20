package stringex.practice;

public class format {
    public static void main(String[] args) {
        int i = 123456;
        String str = String.format("%,15d", i); // %d는 10진수 형식을 의미, ","를 넣어주면 3자리 마다 점을 찍어줌, 숫자 15는 길이를 말함(변경가능)
        System.out.println("format" + str);
    }

}
