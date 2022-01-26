package ex07;

class Magician {
    int hp = 30;
    int mp = 100;

    void drink() {
        System.out.println("에너지 마시기");
        hp = 100;
    }
}

public class OOP02 {
    public static void main(String[] args) {
        Magician m1 = new Magician();
        System.out.println("마법사가 생성됐습니다.");
        System.out.println("체력:" + m1.hp);
        System.out.println("마나:" + m1.mp);

        m1.drink();

        System.out.println("체력변경:" + m1.hp);

    }

}
