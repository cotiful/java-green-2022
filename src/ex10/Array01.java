package ex10;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        final int STUDENTS = 5; // 학생 숫자 5명
        int total = 0; // toal 의 초기값 0
        Scanner scan = new Scanner(System.in); // 배열도 객체이므로 반드시 new 연산자 사용 생성
        int[] scores = new int[STUDENTS]; // 배열 생성 총 5개의 원소를 가지는 scores 생성, 선언과 동시에 생성
        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("성적을 입력하시오:");
            scores[i] = scan.nextInt(); // 내가 넣고 싶은 값 넣을 수 있게 해줌. 작성자 마음대로 숫자 대입 가능
        }
        for (int i = 0; i < STUDENTS; i++)
            total += scores[i]; // i가 0부터 시작하니 0~4번 까지 총 5명의 작성자가 마음대로 지정한 점수를 다 넣어서 계산해줌..
        System.out.println("평균 성적은" + total / STUDENTS + "입니다"); // sysout 해주면서 총점수에 학생수를 나누면 평균성적이 나옴!

    }

}
