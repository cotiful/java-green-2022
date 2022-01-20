package ex10;

public class Array02 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };
        // for (int i = 0; i < numbers.length; i++) // 배열은 length라는 필드를 가지고 있다. 배열의 크기를
        // 나타낸다. 배열의 크기만큼 반복할 수 있다.
        for (int value : numbers)
            // System.out.println(numbers[i]);
            System.out.println(value);

    }

}
