package exam;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer customer = new 홍길동();
        Barista barista = new 공유();
        MenuItem mi1 = new MenuItem("아메리카노", 1500);
        MenuItem mi2 = new MenuItem("마끼아또", 2500);
        MenuItem mi3 = new MenuItem("카페라떼", 2000);
        MenuItem mi4 = new MenuItem("카페모카", 3500);
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(mi1);
        menuItems.add(mi2);
        menuItems.add(mi3);
        menuItems.add(mi4);
        Menu menu = new Menu(menuItems);

        System.out.println(customer.getCustomerName() + "이 " + barista.getBaristaName() + "가 뽑아준" + mi1.getPrice() + "원"
                + mi1.getName() + "를 받았습니다");
        // System.out.println(menu);

    }
}
