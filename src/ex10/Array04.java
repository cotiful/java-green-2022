package ex10;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {

        int total = 0; // total 의 초기값 0
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("배열을 입력하시오");
        size = scan.nextInt();
        int[] scores = new int[size];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("성적을 입력하시오:");
            scores[i] = scan.nextInt(); // 내가 넣고 싶은 값 넣을 수 있게 해줌. 작성자 마음대로 숫자 대입 가능
        }
        for (int i = 0; i < scores.length; i++)
            total += scores[i]; // i가 0부터 시작하니 0~4번 까지 총 5명의 작성자가 마음대로 지정한 점수를 다 넣어서 계산해줌..
        System.out.println("평균 성적은" + total / scores.length + "입니다"); // sysout 해주면서 총점수에 학생수를 나누면 평균성적이 나옴!

    }

}
