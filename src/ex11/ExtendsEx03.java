package ex11;

class 애완동물 {
    int hp;

    void hp() {

    }

}

class 고양이 extends 애완동물 {
    int hp = 200;

    void hp() {
        System.out.println(hp);
        hp = 150;
        hp = 100;
    }

}

public class ExtendsEx03 {

    static void start(애완동물 u1) {

        u1.hp();
        System.out.println("변경된 고양이 Hp");
        u1.hp();
        u1.hp();

    }

    public static void main(String[] args) {
        애완동물 cat = new 고양이();
        start(cat);

    }
}