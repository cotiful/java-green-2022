package ex07;

class Person {
    String name;
    int height;
    int weight;

    // 디폴트 생성자= 3.객체의 초기화를 위해 필요 !, 4. 클래스설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 자동으로 만들어
    // 진다.
    // 클래스명(){}, 1. Class 이름과 같아야한다. 2. 생성자는 void 가 없다
    Person() {
        System.out.println("사람이 생성되었습니다");
        name = "홍길동";
        height = 170;
        weight = 70;

    }
}

/// 생성자
public class OOPEx07 {
    public static void main(String[] args) {
        Person s1 = new Person();
        System.out.println(s1.name);
    }

}
