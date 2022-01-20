package stringex.practice;

import java.util.Scanner;

class 내용 {

    private String name;
    private String tel;
    private char gender;
    private int age;

    public 내용(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class 연습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        System.out.println("전송된 데이터:" + data);

        String[] tokens = data.split("-"); // 데이터 에 저장된 값을 - 기준으로 나눈다.
        for (int i = 0; i < tokens.length; i++) {
            // System.out.println(tokens[i]); // tokens[i]번째 index를 화면에 출력한다.
        }
        if (tokens[0].equals("A01")) {

            // 나:진용 = divname[0] :me divname [1] jin
            String[] divname = tokens[1].split(":");
            String[] divtel = tokens[2].split(":");
            String[] divgender = tokens[3].split(":");
            String[] divage = tokens[4].split(":");

            String name = divname[1];
            String tel = divtel[1];
            String gender = divgender[1];
            char charAt = gender.charAt(0);
            String age = divage[1]; // 20 int형으로 바꿀수 x 스페이스를 제거해야한다. 스페이스를 제거하는 방법은 string class가 있다. 1.trim을 이용하여
                                    // 스페이스를 제거 2.제거한 값을 int형으로 변환하여 int형타입에 넣는다.
            String age1 = age.trim();
            int age2 = Integer.parseInt(age1);

            내용 doc = new 내용(name, tel, charAt, age2);

            System.out.println("제 이름은:" + doc.getName());
            System.out.println("제 번호는:" + doc.getTel());
            System.out.println("제 성별은:" + doc.getGender());
            System.out.println("제 나이는:" + doc.getAge());

        } else {
            System.out.println("종료");
        }

    }

}
