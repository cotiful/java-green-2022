package exam;

abstract class Customer {
    public String getCustomerName() {
        return "";
    }

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
        System.out.println("커피이름" + coffee.getName());
        System.out.println("커피가격" + coffee.getPrice());
    }
}

class 홍길동 extends Customer {

    String name = "홍길동";

    public String getCustomerName() {
        return name;
    }

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        if (menuItem == null) {
            System.out.println("찾은 메뉴가 없습니다.");
        }
    }
    // 커피를 만들어라
    // Coffee coffee = barista.makeCoffee(menuItem);
}
