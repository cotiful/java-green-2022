package ex00;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (n1 = 5; n1 < 6; n1++) {
            for (n2 = 1; n2 < 10; n2++) {
                System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
            }

        }

        for (n1 = 6; n1 < 7; n1++) {
            for (n2 = 1; n2 < 10; n2++) {
                System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
            }

        }
    } // 메인

}
