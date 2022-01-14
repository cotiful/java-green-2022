package ex00;

// 오버로딩 = over-loading = 과적재

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

class 곰 {
    String name = "곰";
    int hp = 100;
    int attack = 15;
}

public class MethEx04 {

    // 사자 -> 호랑이 공격
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 사자 ->곰 공격
    static void attackLionToBear(사자 unit1, 곰 unit3) {
        System.out.println(unit3.name + "가 공격당하고 있습니다.");
        unit3.hp = unit3.hp - unit1.attack;
        System.out.println(unit3.name + "의 hp : " + unit3.hp);
    }

    // 호랑이 ->사자
    static void attackTigertoLion(호랑이 unit1, 사자 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 곰
    static void attackTigertoBear(호랑이 unit1, 곰 unit3) {
        System.out.println(unit3.name + "가 공격당하고 있습니다.");
        unit3.hp = unit3.hp - unit1.attack;
        System.out.println(unit3.name + "의 hp : " + unit3.hp);
    }

    // 곰 -> 호랑이
    static void attackBeartoTiger(곰 unit3, 호랑이 unit1) {
        System.out.println(unit1.name + "가 공격당하고 있습니다.");
        unit1.hp = unit1.hp - unit3.attack;
        System.out.println(unit1.name + "의 hp : " + unit1.hp);
    }

    // 곰 -> 사자
    static void attackBeartoLion(곰 unit3, 사자 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit3.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    public static void main(String[] args) {
        사자 u1 = new 사자();
        호랑이 u2 = new 호랑이();
        곰 u3 = new 곰();

        attackLionToTiger(u1, u2);
        attackLionToBear(u1, u3);
        attackTigertoLion(u2, u1);
        attackTigertoBear(u2, u3);
        attackBeartoLion(u3, u1);
        attackBeartoTiger(u3, u2);

    }
}
