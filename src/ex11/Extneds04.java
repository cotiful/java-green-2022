package ex11;

abstract class Protoss {
    abstract void setHp(int hp);

    abstract int getHp();

    abstract int getAttack();
}

class Zealot extends Protoss {

    String name = "질럿";
    int hp = 100;
    int attack = 10;

    @Override
    int getAttack() {
        // TODO Auto-generated method stub
        return attack;
    }

    @Override
    int getHp() {
        // TODO Auto-generated method stub
        return hp;
    }

    @Override
    void setHp(int hp) {
        this.hp = hp;
        // TODO Auto-generated method stub

    }

} // zelot class

class Dragoon extends Protoss {
    String name = "드라군";
    int hp = 80;
    int attack = 8;

    @Override
    int getAttack() {
        // TODO Auto-generated method stub
        return attack;
    }

    @Override
    int getHp() {
        // TODO Auto-generated method stub
        return hp;
    }

    @Override
    void setHp(int hp) {
        this.hp = hp;
        // TODO Auto-generated method stub

    }
}

public class Extneds04 {
    static void attack(Protoss unit1, Protoss unit2) {
        System.out.println(unit1.getHp());
        unit2.setHp(unit2.getHp() - unit1.getAttack());
        System.out.println(unit2.getHp());

    }

    public static void main(String[] args) {
        Protoss p1 = new Zealot();
        Protoss p2 = new Dragoon();

        attack(p1, p2);
        attack(p2, p1);
        // zealot 이 Dragoon을 공격하자, Dragoon의 hp가 줄어듬.

    } // main method

}
