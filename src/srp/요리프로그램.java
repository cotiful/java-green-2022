package srp;

public class 요리프로그램 {
    public static void main(String[] args) {
        손님 customer = new 손님(); // 손님, 종업원 main 만들어주기
        종업원 manager = new 종업원();
        요리사 chef = new 요리사();

        customer.주문하기(manager, chef); // 시작을 알려줘야 함(개발자가 만들어줌). 사실 관계만을 보면 Customer 와 chef의 관계는 없다. 좋은 방법은 아니다.
        // 하지만 manager, chef 넘겨주지 않으면 계속 new를 하게 된다.

    }

}
