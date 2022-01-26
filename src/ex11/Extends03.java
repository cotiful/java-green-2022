package ex11;

class Pet {
    int hp;

    void hp() {
    }
}

class Cat extends Pet {
    int hp = 200;

    void hp() {
        System.out.println(hp);
        hp = 150;
        hp = 100; // 맨 아래의 값을 인식함.
    }
}

public class Extends03 {
    static void start(Pet p1) {
        p1.hp();
        System.out.println("변경된 고양이 hp");
        p1.hp();
        p1.hp();

    }

    public static void main(String[] args) {
        Pet p1 = new Cat();

        start(p1);

    }

}
