package ex00;

class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

public class MethEx02 {
    static void attack(사자 unit1, 호랑이 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp :" + unit2.hp);
    }

    static void attack(호랑이 unit1, 사자 unit2) {
        System.out.println(unit2.name = "가 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp :" + unit2.hp);
    }

    public static void main(String[] args) {
        사자 lion = new 사자();
        호랑이 tiger = new 호랑이();

        attack(lion, tiger);
        attack(tiger, lion);

    }

}
