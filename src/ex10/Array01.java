package ex10;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        final int STUDENT = 5;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[STUDENT]; // 배열 생성 총 5개의 원소를 가지는 scores 생성, 선언과 동시에 생성
        for (int i = 0; i < STUDENT; i++) {
            System.out.println("성적을 입력하시오");
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < STUDENT; i++) {
            total += scores[i];
            System.out.println("평균성적은" + total / STUDENT + "입니다");
        }
    }

}
