package exam;

class MenuItem {
    String name;
    int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return this.name;
    }
}