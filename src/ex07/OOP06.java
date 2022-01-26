package ex07;

class Person3 {
    String name;
    int height;
    int weight;

    Person3(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight; // 선언하기 위해서.
    }
}

public class OOP06 {
    public static void main(String[] args) {
        Person3 p1 = new Person3("홍길동", 179, 70);
        Person3 p2 = new Person3("임꺽정", 200, 130);

        System.out.println(p1.name);
        System.out.println(p2.name);
    }

}
