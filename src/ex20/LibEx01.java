package ex20;

//내가 생각한 모든 기능은 Library 에 다 만들어져 있음.
public class LibEx01 {
    public static void main(String[] args) {
        double num = 10.5;
        double result = Math.abs(-10.0);
        double result2 = Math.ceil(num); // 타입과 값을 일치 시켜야함. Math.ceil 클릭해서 무슨 타입인지 확인하기, double result는 메모리 공간을 확보하는거!
        double result3 = Math.floor(num);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println("==========");
        double a = 1234.56789;

        System.out.println(Math.round(a));
    }

}
