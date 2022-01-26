package ex10;

class Alice {
    private int 목마름;

    Alice(int 목마름) {
        this.목마름 = 목마름;
    }

    public void 물마시기() {
        목마름 = 목마름 - 20;
    }

    public int 갈증확인하기() {
        return 목마름;
    }

}

public class Array07 {
    public static void main(String[] args) {

        Alice alice = new Alice(100); // 생성자를 만들어 주면 값을 입력해야함.
        System.out.println("엘리스의 갈증지수" + alice.갈증확인하기());
        alice.물마시기();
        System.out.println("엘리스의 갈증지수" + alice.갈증확인하기());

    }

}
