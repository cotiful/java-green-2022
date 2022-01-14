package ex00;

/**
 * 메서드 규칙
 * 1. 투입구와 출구가 있다. 단 출구(Return)는 항상 필요하지는 않다.
 * 2. 메서드는 하나의 모듈이 될 수 있다.
 * 3. 출구가 없을 때 void 사용, 출구가 있을 때는 타입을 동일하게 해준다.
 * 4. 메서드 내부(queue)를 몰라도 사용할 수 있다.(캡슐화)
 * 5.메서드는 1급 객체인가? ->아니다. 자바에서는 1급 객체가 class 밖에 없다.
 * 6.메서드 왜만들어? 특정한 역할(목적)을 수행하는 코드 꾸러미를 만들어 두려고
 * -캡슐화, 재사용, 코드관리도 편함, 메모리 관리에도 엄청나게 효과적임
 * 7. static 메서드 내부에서는 heap 에 있는 데이터(상태)를 찾을 수 없다.
 * static void start : sum이 떠있을지 아닐지 확신할 수가 없다.
 * MethEx03 m = new MethEx03();를 start() 위에 적거나 밑에 적거나의 차이가 있는데 니가 어떻게 쓸지 모르니까
 * 그냥 금지시키겠다
 */
public class MethEx03 {

    int sum = 0;

    void start() {
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        sum = result;

    }

    public static void main(String[] args) {
        MethEx03 m = new MethEx03();
        m.start(); // 클래스명 생략 가능,(같은 class에 있기 때문에, MethEx03)

    }

}
