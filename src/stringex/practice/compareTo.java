package stringex.practice;

public class compareTo {
    public static void main(String[] args) {
        String str1 = "A"; // 아스키코드에서 65
        String str2 = "B"; // 아스키코드에서 66 B로 A를 비교하면 -1이 작음!
        int compareTo1 = str1.compareTo(str2);
        if (compareTo1 > 0) {
            System.out.println(str1 + ">" + str2);
        } else if (compareTo1 == 0) {
            System.out.println(str1 + "=" + str2);
        } else {
            System.out.println(str1 + "<" + str2);
        }

    }
}
