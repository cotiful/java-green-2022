package ex11;

//데이터를 물려 받으려고 상속을 하지말고, 다형성이 성립하느냐를 봐야함 !!

class 엔진 {
    int power = 5000;

}

class 소나타 { // 상속(is-a) 관계가 아닌 composition 기법: <has-a 관계: 소나타는 engine에 의존적이다. 구체적인게 의존적인걸 강한
            // 결합,
    // 추상적인 것에 의존하고 있는 느슨한 결합

    엔진 engine; // 이상태는 null 상태

    소나타(엔진 engine) { // 특징 생성자에 주입 시켜줌. -> 초기화 라는게 "엔진 engine = ???" 값을 넣는걸 의미?
        this.engine = engine;
    }
}

public class CompositionEx01 {
    public static void main(String[] args) {
        엔진 e = new 엔진(); // has 관게를 만들기 위해서
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power); // , 컴포지션을 안 해주면. power에 접근하기도 전에 engine 에서 null 상태임
    }

}
