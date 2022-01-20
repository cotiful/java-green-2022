package ex11;

class Emplyoee {
    public String name = "유승현";
    String address = "부산진구 유명가수";
    protected int salary = 50000;
    private int RRN;

    public String toString() {
        return name + "," + address + "," + RRN + "," + salary;
    }
}

class Manager extends Emplyoee {
    private int bonus = 50;

    public void printSalary() {
        System.out.println(name + "(" + address + "):" + (salary + bonus));
    }

    public void printRRN() {
        // System.out.println(RRN);
    }
}

public class ManagerTest {
    public static void main(String[] args) {
        final int NUM = 5;
        Manager[] m1 = new Manager[NUM];
        for (int i = 0; i < m1.length; i++)
            m1[i] = new Manager();
        for (int i = 0; i < m1.length; i++)
            m1[i].printSalary();
        // for (int i = 0; i < m1.length; i++)
        // System.out.println(m1[i]);

    }

}
