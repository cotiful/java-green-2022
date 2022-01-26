package ex06;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOP01 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        System.out.println(d1.name);
        System.out.println(d1.sal);
    }

}
