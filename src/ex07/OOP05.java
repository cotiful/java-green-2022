package ex07;

class Person {
    String name;
    int height;
    int weight;

    Person() {
        System.out.println("사랑이 생성되었습니다");
        name = "홍길동";
        height = 170;
        weight = 70;
    }
}

public class OOP05 {
    public static void main(String[] args) {
        Person s1 = new Person();
        System.out.println(s1.name);
    }

}
