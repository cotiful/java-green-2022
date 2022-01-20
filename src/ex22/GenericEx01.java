package ex22;

class 사과 {
    String name = "사과";

}

class 딸기 {
    String name = "딸기";
}

class 오렌지 {
    String name = "오렌지";
}

class ResponseBox<T> {
    /** 사과 */
    T data; // 컴포지션, 사과를 딸기로 바꿔주고 싶음 그러면 T를 작성하고 사과 대신 T로 바꿈.

    public ResponseBox(/** 사과 */
    T data) { // 사과를 T로 바꿔줌 !
        this.data = data;
    }
} // return 값을 제니릭 박스를 만들면 ResponseBox처럼 고정시키기 위해서! (7000원 짜리 랜덤박스에 담기는게 다 다른것 처럼,
  // 랜덤박스만 보내면 되고 안에 내용물만 다르게)

public class GenericEx01 {
    public static void main(String[] args) {

        ResponseBox<사과> rb = new ResponseBox<사과>(new 사과()); // 요 모양대로 사과 해줌
        System.out.println(rb.data.name);
        ResponseBox<딸기> rb2 = new ResponseBox<딸기>(new 딸기());
        System.out.println(rb2.data.name);
        ResponseBox<오렌지> rb3 = new ResponseBox<오렌지>(new 오렌지());
        System.out.println(rb3.data.name);
        // rb 응답 !

    }
}
