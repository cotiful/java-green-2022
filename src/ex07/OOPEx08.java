package ex07;

class Person2 {
    /** 설계도, 실제로는 존재하진 않지만 영역으로만 나눔 */
    String name;
    int height;
    int weight; // heap에들어가는 내용들

    // Constructor 메서드가 아님. 하지만 돌아가는 원리는 똑같다. 만든 이유는? 선언하기 위해서

    // Person2 스택에 들어감.

    Person2(String d1, int d2, int d3/** 타입들 스택에 */
    ) {
        name = d1;
        height = d2;
        weight = d3;
    }
}

public class OOPEx08 {
    public static void main(String[] args) {
        Person2 s1 = new Person2("홍길동", 170, 70/** 아규먼트, 생성자 호출문 */
        );
        Person2 s2 = new Person2("임꺽정", 150, 200);

        System.out.println(s1.name);
        System.out.println(s2.name);
    }

}
