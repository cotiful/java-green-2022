package ex11;

class Noodle {
    int kcal = 300;
    String color = "노란색";
    String type = "국물";

}

class FriedNoodle extends Noodle {
    String type = "볶음면";
}

public class Extends01 {
    public static void main(String[] args) {
        Noodle n1 = new FriedNoodle(); // 상태는 오버라이딩 못 한다.
        FriedNoodle n2 = new FriedNoodle(); // 누들의 힙공간을 따로 만들어저야 한다.

        System.out.println(n1.type);
        System.out.println(n2.type);
    }

}
