package ex11;

class 엘리스 {
    private int 목마름;

    엘리스(int 목마름) {
        this.목마름 = 목마름;
    }

    public void 물마시기() {
        목마름 = 목마름 - 20;
    }

    public int 갈증확인하기() {
        return 목마름;
    }

}

public class AccessEx05 {
    public static void main(String[] args) {

        엘리스 e1 = new 엘리스(100);
        System.out.println("엘리스의 갈증지수:" + e1.갈증확인하기());
        e1.물마시기();
        System.out.println("엘리스의 갈증지수" + e1.갈증확인하기());
    }

}
