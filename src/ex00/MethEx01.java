package ex00;

public class MethEx01 {
    int sum;

    void start() {
        int n1 = 10;
        int n2 = 20;
        int sum = n1 + n2;
        this.sum = sum;
    }

    public static void main(String[] args) {
        MethEx01 m = new MethEx01();
        System.out.println(m.sum);

    }

}
