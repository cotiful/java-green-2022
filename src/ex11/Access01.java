package ex11;

class Engine {
    int power = 5000;
}

class Sonata {
    Engine sonataEngine;

    Sonata(Engine sonataEngine) {
        this.sonataEngine = sonataEngine;
    }
}

public class Access01 {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Sonata s1 = new Sonata(e1); // 소나타의 힙 공간에 엔진의 power 가 들어감.
        System.out.println(s1.sonataEngine.power); // 소나타의 힙공간에 있는
    }
}