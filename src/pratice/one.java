package pratice;

class Emplyoee {
    public String name = "유승현";
    String address = "백발백중 하는 명사수";
    protected int salary = 50000;
    private int RRN;

    public String toSTring() {
        return name + "," + address + "," + RRN + "," + salary;
    }
}

class Manager extends Emplyoee {
    private int bonus = 50;

    public void printSalary() {
        System.out.println(name + "(" + address + ")" + (salary + bonus));
    }

    public void printRRN() {
        // System.out.println(RRN);
    }

}

public class one {
    public static void main(String[] args) {
        final int num = 3;
        Manager[] m1 = new Manager[num]; // 크기가 3인 Employee배열을 생성!
        for (int i = 0; i < m1.length; i++)
            m1[i] = new Manager(); // 사원 3명의 정보를 받아서 배열에 추가.
        for (int i = 0; i < m1.length; i++)
            m1[i].printSalary(); // 배열에 저장된 데이터 출력
        for (int i = 0; i < m1.length; i++)
            System.out.println(m1[i]);

    }

}
