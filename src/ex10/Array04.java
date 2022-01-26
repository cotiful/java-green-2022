package ex10;

public class Array04 {
    public static void main(String[] args) {
        int[][] array = { { 10, 20, 30, 40 }, { 10, 30, 40, 50 } };

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                System.out.println("행" + r + "열" + c + "그리고" + array[r][c]);
            }
        }
    }

}
