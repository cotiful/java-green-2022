package srp;

//종업원-요리사와 관계
public class 종업원 {
    public 음식 주문받기(요리사 chef) { // 종업원은 요리사에 의존적
        // 음식 ss = new 음식("스파게티"); ->종업원이 음식을 만들어서 주는 꼴

        음식 jjajang = chef.음식생성(); // 메시지 전달, c는 heap공간, 요리사는 누구랑도 협력하지 않으니깐 받을게 없다."음식생성(이부분)"

        return jjajang; // null 아무것도 없음
    }

}
