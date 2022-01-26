package exam;

abstract class Barista {
    public String getBaristaName() {
        return "";
    }

    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}

class 공유 extends Barista {
    String name = "공유";

    public String getBaristaName() {
        return name;
    }

    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

}