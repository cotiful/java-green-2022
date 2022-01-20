package ex11;

class 가구 {
    String name = "가구"; // 상속은 부모의 디폴트 값을 때림.

    // 가구(){}

    /// 오버로딩으로 똑같은 거 하나 더 만들어주면 가구 실행 할 수 있음.

    가구(int num) {
        System.out.println("나 실행돼?");
    }
    // 1. super는 부모의 heap공간, this 는 자신의 공간
    // 2. 자식을 new하면 자식의 생성자에 super()문장이 생략되어 있음.(상속의 관계)
}

class 침대 extends 가구 {
    String name = "침대";

    침대() {
        super(1); // 1을 넣어주면 디폴트 생성자 아니어도 가능해짐. super() 이 문장이 항상 생략되어 있음.
        System.out.println(super.name);
    }
}

// super 부모. this 자기자신
public class SuperEx01 {
    public static void main(String[] args) {

    }

}