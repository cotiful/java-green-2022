package ex10;

import java.util.Scanner;

class Employee {
    String name;
    String address;
    int salary;
    int tel;

    void getter() {
        name = "받는자";
        address = "부산시";
        salary = 3000;
        tel = 0107777777;

    }

    void setter() {
        name = "보내는자";
        address = "광주시";
        salary = 1500;
        tel = 0106666;

    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Es = 3;
        Employee[] 직원 = new Employee[Es];
        for (int i = 0; i < Es; i++) {
            직원[i] = new Employee();
            System.out.println(직원[i]);

        }
    }

}
