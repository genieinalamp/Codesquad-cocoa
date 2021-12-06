package JavaExercise;

public class Exercise3_2 {
    public static void main(String[] args) {
        // 자바의 정석 chapter3 연습문제 (p.95)

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        // System.out.println(y >= 5 || x < 0 && x > 2);

        // System.out.println(y += 10 - x++); // y + 10 - x = 5 + 10 - 2 = 13
        // x++ 은 후위형이기 때문에 값이 참조된 후에 증가시킨다.

        // System.out.println(x += 2); // x + 2 = 2 + 2 = 4
        // System.out.println(!('A' <= c && c <= 'Z')); // !( T && T ) = !T = F = false
        // System.out.println('C' - c); // 'A'의 문자코드는 65이므로 'C'의 문자코드는 67이다. 67 - 65 = 2
        // System.out.println('5' - '0');
        // System.out.println(c + 1);
        // System.out.println(c++);
        // System.out.println(++c);
        // System.out.println(c);

    }
}
