package JavaExercise;

public class Exercise4_7 {
    /* 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
    만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15가 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.
     Hint: String 클래스의 charAt(int i)을 사용!  */
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            sum += str.charAt(i) - '0';
            // str.charAt(i) 문자열 str에서 i열에 해당하는 문자 빼오기 : 문자열 -> 문자
            // str.charAt(i) - '0' 숫자 0을 빼면 숫자로 변환됨(문자코드) : 문자 -> 숫자
        }


        System.out.println("sum=" + sum);
    }
}
