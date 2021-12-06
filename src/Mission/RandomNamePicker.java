package Mission;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

// 지정한 수만큼 코코아 멤버들을 랜덤 출력한다.
public class RandomNamePicker {
    public static void main (String[] args) {

        System.out.println("몇 명인가요?");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        String[] cocoamembers = new String[]
                {"검봉", "노리", "땃쥐", "반스", "피오", "호두마루",
                "Barney", "Bart", "BC", "Dave", "Dike", "Donggi",
                "Hanse", "Hoo", "Jarry", "Jerry", "Jhin", "K",
                "Konda", "Meatsby", "MK", "Mong", "OS", "Phil",
                        "Sonny","Taksu","Tany","Teemo","Yan"};

//        Random r = new Random();
//        int idx = r.nextInt(cocoamembers.length);
        Collections.shuffle(Arrays.asList(cocoamembers));

        for (int i=0; i<num; i++)
            System.out.println(cocoamembers[i]);

    }
}
