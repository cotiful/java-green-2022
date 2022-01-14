package ex07;

class Car {
    int speed = 90;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new 는 heap 에 할당해라는 키워드
        // Car 클래스가 가지고 있는 static 이 아닌 모든 것들이 heap 에 뜬다.
        /// sss 는 주소를 만들었다.
        Car s1 = new Car();

        // out 앞에 . 있는건 앞에 static 이 붙여있다는걸 알 수 있음.
        System.out.println(s1.speed);
        Car s2 = new Car();
        System.out.println(s2.speed);

    }

}
