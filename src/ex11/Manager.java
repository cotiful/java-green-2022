package ex11;

class Emplyoee {
    public String name = "유승현";
    String address = "부산진구 ";
    protected int salary = 50000;
    private int Rnn;

    public String toString() {
        return name + " , " + address + "," + Rnn + "," + salary;
    }
}

class Manage extends Emplyoee {
    private int bonus = 50;

    public void printSalary() {
        System.out.println(name + "(" + address + ")" + (salary + bonus));
    }

    public void printRnn() {
        // System.out.println(Rnn);
    }
}

public class Manager {
    public static void main(String[] args) {
        final int NUM = 5;
        Manage[] m1 = new Manage[NUM];
        for (int i = 0; i < NUM; i++) {
            m1[i] = new Manage();
        }
        for (int i = 0; i < NUM; i++) {
            m1[i].printSalary();
        }
    }

}
