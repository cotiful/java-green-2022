package ex07;

/**
 * 문법: 변수의 초기화를 하지 않는다. 다양성을 위해서 선언만해둔다.
 */

class 사람 {
    String name;
    int height;
    int weight;
}

public class OOPEx06 {
    public static void main(String[] args) {
        사람 s1 = new 사람();
        s1.name = "홍길동";
        s1.height = 50;
        s1.weight = 5;

        사람 s2 = new 사람();
        s2.name = "장보고";
        s2.height = 100;
        s2.weight = 8;

        사람 s3 = new 사람();
        s3.name = "임꺽정";
        s3.height = 70;
        s3.weight = 10;

        System.out.println(s1.name);
        System.out.println(s1.height);
        System.out.println(s1.weight);
        System.out.println(s2.name);
        System.out.println(s2.height);
        System.out.println(s2.weight);
        System.out.println(s3.name);
        System.out.println(s3.weight);
        System.out.println(s3.height);

    }

}
