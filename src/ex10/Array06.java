package ex10;

import java.util.Scanner;

class Emplyoee {
    String name;
    String address;
    int salary;
    int tel;

    void getter() {
        name = "받는자";
        address = "부산시";
        salary = 3000;
        tel = 010123;
    }

    void setter() {
        name = "보내는자";
        address = "광주시";
        salary = 2000;
        tel = 010212;
    }

    // public String tosString() {
    // return "이름" + name + "주소" + address + "연봉" + salary + "전화" + tel;
    // }
}

public class Array06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 2;
        Emplyoee[] 직원 = new Emplyoee[num];
        for (int i = 0; i < num; i++) {
            직원[i] = new Emplyoee();
            System.out.println(직원[i]);
        }
    }

}
