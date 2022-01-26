package ex11;

class Animal {
    String getName() {
        return "";
    }

    void setHp(int hp) {
    }

    int getHp() {
        return 0;
    }

    int getAttack() {
        return 0;
    }
}

class Tiger extends Animal {
    String name = "호랑이";
    int hp = 100;
    int attack = 20;

    String getName() {
        return name;
    }

    int getHp() {
        return hp;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getAttack() {
        return attack;
    }
}

class Lion extends Animal {
    String name = "사자";
    int hp = 250;
    int attack = 25;

    String getName() {
        return name;
    }

    int getHp() {
        return hp;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getAttack() {
        return attack;
    }
}

class Wolf extends Animal {
    String name = "늑대";
    int hp = 120;
    int attack = 5;

    String getName() {
        return name;
    }

    int getHp() {
        return hp;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getAttack() {
        return attack;
    }
}

public class Extends02 {
    static void attack(Animal unit1, Animal unit2) {
        System.out.println(unit2.getName() + "에게 공격당하고 있습니다");
        unit1.setHp(unit1.getHp() - unit2.getAttack());
        System.out.println(unit1.getName() + "의 피는" + unit1.getHp());
    }

    public static void main(String[] args) {
        Animal a1 = new Tiger();
        Animal a2 = new Lion();
        Animal a3 = new Wolf();

        attack(a1, a2);
        attack(a3, a1);

    }

}
