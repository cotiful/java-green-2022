package ex06;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 2630;
        int restMoney = money;

        while (true) {
            int coin = sc.nextInt();
            System.out.println(coin + "원==");
            System.out.println(restMoney / coin + "개");
            restMoney = restMoney % coin;

            if (coin == 10) {
                break;
            }
        }
    }

}

/**
 * coin = 500;
 * System.out.println(coin + "원==");
 * System.out.println(restMoney / coin + "개");
 * restMoney = restMoney % coin;
 * System.out.println(restMoney);
 * 
 * coin = 100;
 * System.out.println(coin + "원==");
 * System.out.println(restMoney / coin + "개");
 * restMoney = restMoney % coin;
 * System.out.println(restMoney);
 * 
 * coin = 50;
 * System.out.println(coin + "원==");
 * System.out.println(restMoney / coin + "개");
 * restMoney = restMoney % coin;
 * System.out.println(restMoney);
 * 
 * coin = 10;
 * System.out.println(coin + "원==");
 * System.out.println(restMoney / coin + "개");
 * restMoney = restMoney % coin;
 * System.out.println(restMoney);
 * }
 * 
 * }
 */
