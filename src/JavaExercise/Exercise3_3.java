package JavaExercise;

public class Exercise3_3 {
        /* 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 '456'이라면 '400'이 되고,
           '111'이라면 '100'이 된다. 알맞은 코드를 넣으시오.
           Math.round(); : 소수점 첫째 자리에서 반올림
           Math.ceil(); : 소수점 첫째 자리에서 올림
           Math.floor(); : 소수점 첫째 자리에서 버림 <- 이것을 사용해보자!
        */
    public static void main(String[] args) {
        int num = 111;
        int num100 = (int)Math.floor(num/100) * 100;
        System.out.println(num100);


    }
}
