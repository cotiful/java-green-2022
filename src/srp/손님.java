package srp;

//손님 - 종업원(의존성) 손님이 종업원의 reference를 알아야 호출할 수 있다,
public class 손님 {

    // public void 주문하기(){
    // 종업원 manager = new 종업원();} 이렇게 절대 짜면 안됨.

    public void 주문하기(종업원 manager, 요리사 chef) { // heap을 가리키는 주소를 넘겨 받야아함
        // manager.주문받기(); 주문하기 stack 공간이 생기고
        음식 jjajjang = manager.주문받기(chef);
        System.out.println(jjajjang.getName() + "을 먹습니다.");

        // 주문받기();
    }

}
