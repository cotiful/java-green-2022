package ex07;

class Dog {
    int 배고픔 = 100;

    void 밥먹기() {
        배고픔 = 0;
    }
}

public class OOP03 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.배고픔);
        d1.밥먹기();
        System.out.println(d1.배고픔);

    }

}
