package JavaExercise;

import java.sql.SQLOutput;

public class Exercise3_6{
    public static void main(String[] args) {
        /*
        아래는 화씨를 섭씨로 변환하는 코드이다. 변환공식이 'C =5/9 x (F-32)'라고 할 때 , 알맞은 코드를 넣으시오.
        단, 변환 결과값은 소수점 셋째자리에서 반올림해야 한다. (Math.round()를 사용하지 않고 처리할 것)
         */

        int fahrenheit = 100;
        float celcius = (5/9F * (fahrenheit-32));

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+String.format("%.2f",celcius));

        // 결과 : Fahrenheit:100 Celcius:37.78
    }
}
