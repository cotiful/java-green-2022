package ex10;

import java.util.Scanner;

public class Array03 {
    final static int STUDENT = 3;

    public static void main(String[] args) {
        int[] scores = new int[STUDENT];
        getValue(scores);
        getAverages(scores);
    }

    private static void getValue(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("성적을 입력하시오");
            array[i] = sc.nextInt();
        }
    }

    private static void getAverages(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            System.out.println("평균 성적은" + total / array.length + "입니다.");
        }
    }

}
