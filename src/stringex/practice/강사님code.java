package stringex.practice;

import java.util.Scanner;

class User {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public User(String name, String tel, char gender, int age) {
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

public class 강사님code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 1. new 한거는 class 이니 생성자가 무조건 있다. 키보드와 연결하기 위해 system.in 필요 !
        // A01-이름:홍길동-전화번호:0102222-성별:남-나이:20
        // 2.String data= sc.nextLine(); // 알아서 형 변환을 해줌. 키보드로 쳐서 들어오는건 무조건 문자열인데. 아주
        // 편안!
        String data = "A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20"; // 3. 2번이 어떤거니 아니깐 2번 주석처리해주고

        String[] tokens = data.split("-"); // 4. split
        /**
         * System.out.println(tokens[0]);
         * System.out.println(tokens[1]);
         * System.out.println(tokens[2]);
         * System.out.println(tokens[3]);
         * System.out.println(tokens[4]); //5. 그 다음 잘 되나 확인해보기
         */

        if (tokens[0].equals("A01")) {
            // 7. 이름:홍길동을 :으로 구분해서 홍길동을 찾자.
            String name = tokens[1].split(":")[1];

            // 8.전화번호:0102222을 : 으로 구분해서 찾자
            String tel = tokens[2].split(":")[1];

            // 9. 성별:남을 :구분해서 남을 찾자.
            String genderTemp = tokens[3].split(":")[1];

            // 10.나이:20 :구분해서 20을 찾자.
            String ageTemp = tokens[4].split(":")[1];

            // 11. char로 담고, int로 담고 하는 형변환 하기.
            char gender = genderTemp.charAt(0); // 명시적 변환은 기본 자료형에서 가능하다. string은 명시적 변환 x
            String ageTemp2 = ageTemp.trim();
            int age = Integer.parseInt(ageTemp2);
            // 12. class로 옮겨담기.
            User user = new User(name, tel, gender, age);

            System.out.println(user);
        } else {
            System.out.println("프로그램 종료");
        } // 6. 문자열 비교는 equals로 해주기

    }

}
